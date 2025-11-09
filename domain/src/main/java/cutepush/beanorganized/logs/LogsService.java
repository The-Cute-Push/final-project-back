package cutepush.beanorganized.logs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogsService {

    public void logLevel() {
        log.info("This is an info log for testing purposes.");
        log.warn("This is a warning log for testing purposes.");
        log.error("This is an error log for testing purposes.");
    }

    public void logException() {
        try {
            throw new RuntimeException("This is a test exception for error logging.");
        } catch (RuntimeException e) {
            log.error("An exception occurred during logs test.", e);
        }
    }
}
