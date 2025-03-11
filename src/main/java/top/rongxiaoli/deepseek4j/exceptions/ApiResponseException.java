package top.rongxiaoli.deepseek4j.exceptions;

/**
 * This method is used for indicating API not responding code 200.
 */
public class ApiResponseException extends Exception {
    public ApiResponseException() {
        super();
    }

    public ApiResponseException(String message) {
        super(message);
    }

    public ApiResponseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiResponseException(Throwable cause) {
        super(cause);
    }
}
