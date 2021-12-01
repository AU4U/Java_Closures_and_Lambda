import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Listing2_12 {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        Function<String, Function<String, String>> curriedConcat = curry(concat);
        for (String greetings : Arrays.asList("Hello", "Guten Tag", "Bonjour")) {
            greetFolks(curriedConcat.apply(greetings + ", "));
        }
    }

    public static <T, U, V> Function<T, Function<U, V>> curry(BiFunction<T, U, V> bif) {
        return t -> (u -> bif.apply(t, u));
    }

    public static void greetFolks(Function<String, String> greeter) {
        for (String name : Arrays.asList("Alice", "Bob", "Cathy"))
            System.out.println(greeter.apply(name));
    }
}
