package Generics;

public class Box<T> {
    private T t;

    public Box() {}

    public Box(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
