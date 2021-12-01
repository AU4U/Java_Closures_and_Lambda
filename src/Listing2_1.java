import java.util.function.Function;

public class Listing2_1 {
    public static <V> Function<V, V> identityFunction() {
        return value -> value;
    }

    public static void main(String[] args) {

    }
}
