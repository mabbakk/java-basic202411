package chap2_7.lamda;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean test(T t);
}