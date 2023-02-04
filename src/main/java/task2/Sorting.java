package task2;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public String[] sort(final String[] value) {
        return Arrays
                .stream(value)
                .sorted(Collections.reverseOrder(String::compareTo))
                .toArray(String[]::new);
    }
}
