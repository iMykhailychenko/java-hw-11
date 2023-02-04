package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NestedArray {
    public String run(final String[] values) {
        return Arrays
                .stream(values)
                .map(a -> a.split(", "))
                .flatMap(Arrays::stream)
                .sorted(String::compareTo)
                .collect(Collectors.joining(", "));
    }
}
