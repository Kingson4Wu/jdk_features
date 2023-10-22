package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {

    public static void main(String[] args) throws IOException {
        Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty())
            .forEach(System.out::print);
        //abc
        System.out.println();
        System.out.println("---");
        Stream.of("a", "b", "c", "", "e", "f").dropWhile(s -> !s.isEmpty())
            .forEach(System.out::print);
        //ef
        System.out.println();
        System.out.println("---");
        Stream.of("a", "b", "c", "", "e", "f", "", "g").dropWhile(s -> !s.isEmpty())
            .forEach(System.out::print);
        //efg
        System.out.println();
        System.out.println("---");
        Stream.of("a", "b", "c", "=", "e", "f", "=", "g").dropWhile(s -> !"=".equals(s))
            .forEach(System.out::print);
        //=ef=g

        System.out.println();

        IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);
        //同
        for (int x = 3; x < 10; x += 3) {
            System.out.println(x);
        }

        long count = Stream.ofNullable(100).count();
        System.out.println(count);

        count = Stream.ofNullable(null).count();
        System.out.println(count);

        Optional.of(100).stream().count();

        System.out.println(Stream.ofNullable(List.of("11","33")).count());



        Reader inputString = new StringReader("message");
        BufferedReader br = new BufferedReader(inputString);
        try (BufferedReader br1 = br) {
             br1.readLine();
        }


    }
}
