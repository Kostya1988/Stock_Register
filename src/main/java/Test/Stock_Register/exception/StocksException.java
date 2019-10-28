package Test.Stock_Register.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StocksException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(MyResourceNotFoundException.class)
    protected ResponseEntity<Object> handleNotFoundException(Exception ex) {
        logger.info("Start thinking", ex);
        return new ResponseEntity<>(ex, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    public static class MyResourceNotFoundException extends RuntimeException {
        public MyResourceNotFoundException(String message) {
            super(message);
        }
    }
}