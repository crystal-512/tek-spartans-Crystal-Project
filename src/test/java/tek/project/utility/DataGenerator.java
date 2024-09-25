package tek.project.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataGenerator {

    private static final Logger LOGGER = LogManager.getLogger(DataGenerator.class);

    public static String generateRandomEmail(String prefix) {
        int random = (int) (Math.random() * 100000);
        String email = prefix + random + "@gmail.com";
        LOGGER.debug("Generated random email {}", email);
        return email;
    }

    public static String generateRandomUserName(String prefix) {
        int random = (int) (Math.random() * 100000);
        String userName = prefix + random;
        LOGGER.debug("Generated random username {}", userName);
        return userName;
    }
}
