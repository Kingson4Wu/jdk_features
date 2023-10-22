package java9;

public class StackWalkerTest {

    public static void main(String[] args) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stack){
            System.out.println(element);
        }
    }

}
