package java9;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

    public static void main(String[] args) {

        /**
         * stream() stream 方法的作用就是将 Optional 转为一个 Stream，如果该 Optional 中包含值，那么就返回包含这个值的 Stream，否则返回一个空的 Stream（Stream.empty()）
         * ifPresentOrElse()
         * or() 如果值存在，返回 Optional 指定的值，否则返回一个预设的值。
         */

        Optional<Integer> optional = Optional.of(1);

        optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() ->
            System.out.println("Not Present."));

        optional = Optional.empty();

        optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() ->
            System.out.println("Not Present."));


        Optional<String> optional1 = Optional.of("Mahesh");
        Supplier<Optional<String>> supplierString = () -> Optional.of("Not Present");
        optional1 = optional1.or( supplierString);
        optional1.ifPresent( x -> System.out.println("Value: " + x));
        optional1 = Optional.empty();
        optional1 = optional1.or( supplierString);
        optional1.ifPresent( x -> System.out.println("Value: " + x));
    }



}
