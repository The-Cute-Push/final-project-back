package cutepush.beanorganized.logs;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/v1/logs-test")
@RequiredArgsConstructor
@Tag(name = "Logs Test Controller", description = "Controller for testing logging functionality")
public class LogsTestController {

    private final LogsService logsService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String logLevels() {
        logsService.logLevel();
        return "Logs test endpoint is working!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String logException() {
        logsService.logException();
        return "Error logs test endpoint is working!";
    }
}
