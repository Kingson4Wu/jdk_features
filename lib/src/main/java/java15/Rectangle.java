package java15;

public sealed class Rectangle extends Shape
        permits TransparentRectangle, FilledRectangle {}