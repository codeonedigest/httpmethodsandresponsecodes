package codeonedigest.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DemoControllerAdvice {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  // 409
    @ExceptionHandler(RuntimeException.class)
    public void handleConflict() {
        // Nothing to do
    }
}
