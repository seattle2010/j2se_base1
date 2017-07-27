package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */

public class LogicException extends Exception {
        public LogicException() {
        }

        public LogicException(String message) {
            super(message);
        }
        /**
         *
         * @param message 表示当前异常的原因/信息
         * @param cause  当前异常的根本原因
         */
        public LogicException(String message, Throwable cause) {
            super(message, cause);
        }
    }

