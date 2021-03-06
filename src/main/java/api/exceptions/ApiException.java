package api.exceptions;

public class ApiException extends RuntimeException {

    public ApiException() {
        super("No se pudo procesar la solicitud, intente mas tarde.");
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(Throwable cause) {
        super("No se pudo procesar la solicitud, intente mas tarde.", cause);
    }

    public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
