package mate.controller.driver;

import mate.lib.Injector;
import mate.model.Car;
import mate.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class GetMyCurrentCarsController extends HttpServlet {
    public static final String DRIVER_ID = "driver_id";
    private static final Injector injector = Injector.getInstance("mate");
    private final CarService carService = (CarService) injector
            .getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        Long driverId = (Long) session.getAttribute(DRIVER_ID);
        List<Car> allCarsByDriver = carService.getAllByDriver(driverId);
        req.setAttribute("cars", allCarsByDriver);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp").forward(req, resp);
    }
}
