package task1;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names {
    public String format(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .map(i -> i + 1)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
