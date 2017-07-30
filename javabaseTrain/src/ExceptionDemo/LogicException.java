package ExceptionDemo;

/**
 * Created by shi on 2017/7/27.
 */
public class LogicException extends RuntimeException{
    /**
     *
     * @param message  错误信息
     * @param cause   产生原因
     */
    public LogicException() {
        super();
    }
    /**
     *
     * @param message  错误信息
     * @param cause   产生原因
     */
    public LogicException(String message) {
        super(message);
    }

    /**
     *
     * @param message  错误信息
     * @param cause   产生原因
     */
    public LogicException(String message, Throwable cause) {
        super(message, cause);
    }
}
