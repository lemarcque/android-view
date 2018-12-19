package test;

@FunctionalInterface
public interface BirdFunction<T, R> {

    R apply(T t);
}
