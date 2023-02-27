package task2;

import java.util.Collections;
import java.util.List;

public class Sorting {
    public String[] sort(List<String> value) {
        return value.stream()
                .sorted(Collections.reverseOrder(String::compareTo))
                .toArray(String[]::new);
    }
}
