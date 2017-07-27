package _13异常;

/**
 * Created by E430 on 2017/7/27.
 */
public class _07ExceptionAnnotation {
    public static void main(String[] args) {
        try {
            doWork("tom");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param tom
     * @return 0
     * @throws Exception
     */
    private static int doWork(String tom) throws Exception {
        return 0;
    }
}
