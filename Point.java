package org.tek.scape;

public class Point {
    final Integer value;

    public Point(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Point plus(Point p) {
        return new Point(value+p.getValue());
    }
}
