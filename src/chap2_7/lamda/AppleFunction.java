package chap2_7.lamda;

public interface AppleFunction<X, Y> {
    Y apply(X x);
}