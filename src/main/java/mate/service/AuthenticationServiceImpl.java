package mate.service;

import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Login method was called. Params: login = {}", login);
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            logger.info("Successful login!");
            return driver.get();
        }
        logger.error("Incorrect login or password");
        throw new AuthenticationException("Incorrect login or password");
    }
}
