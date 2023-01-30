package task1;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names {
    public String format(final String[] names) {
        return IntStream.range(0, names.length)
               .filter(i -> (i + 1) % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + names[i])
                .collect(Collectors.joining(", "));
    }
}
