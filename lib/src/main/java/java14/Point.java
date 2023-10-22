package java14;


public record Point(int x, int y) {

    public Point {
        System.out.println(String.format("(%d,%d)", x, y));
    }

    public Point(int value) {
        this(value, value);
    }

    public static Point of(int value) {
        return new Point(value, value);
    }
}

/**
 *
 * javap反编译如下
 * javac --enable-preview -source 14 Point.java
 * javap -verbose Point.class
 * Compiled from "Point.java"
 * public final class com.example.domain.Point extends java.lang.Record {
 *   public com.example.domain.Point(int, int);
 *   public static com.example.domain.Point of(int);
 *   public java.lang.String toString();
 *   public final int hashCode();
 *   public final boolean equals(java.lang.Object);
 *   public int x();
 *   public int y();
 * }
 * 可以看见Point继承了java.lang.Record，而且通过invokedynamic提供了final的hashCode及equals
 */