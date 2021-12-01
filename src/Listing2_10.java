import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Listing2_10 {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        greetFolks(whom -> concat.apply("Hello, ",whom));
    }

    public static void greetFolks(Function<String, String> greeter) {
        for (String name : Arrays.asList("Alice", "Bob", "Cathy")) {
            System.out.println(greeter.apply(name));
        }
    }
}

