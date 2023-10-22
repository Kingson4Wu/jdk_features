package java9;

public interface TestApi {

    /**
     * 在 Java 8 接口引入了一些新功能——默认方法和静态方法。我们可以在Java SE 8的接口中编写方法实现，仅仅需要使用 default 关键字来定义它们。
     *
     * Java 9 不仅像 Java 8 一样支持接口默认方法，同时还支持私有方法。
     */

    private void test(){
        System.out.println("");
    }
}
