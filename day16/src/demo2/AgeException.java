package demo2;
/*
*
* 年龄异常（自定义异常）
* Class extends RuntimeExcpetion 定义为我们自己使用的运行时异常
*
* */
public class AgeException extends RuntimeException {
    private static final long serialVersionUID=1L;
    public AgeException(String message) {
        super(message);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeException(Throwable cause) {
        super(cause);
    }

    protected AgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AgeException() {
        super();
    }
}
