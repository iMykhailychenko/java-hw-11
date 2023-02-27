import task1.Names;
import task2.Sorting;
import task3.NestedArray;
import task4.LinearGenerator;
import task5.MergeStreams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Controller {
    private final List<String> names = List.of("Ivan", "Bob", "Semen", "Alex", "Max");

    public Controller taskOne() {
        String task1 = new Names().format(names);
        System.out.println(task1);

        return this;
    }

    public Controller taskTwo() {
        String[] task2 = new Sorting().sort(names);
        System.out.println(Arrays.toString(task2));

        return this;
    }

    public Controller taskThree() {
        String[] values = new String[]{"1, 2, 0", "4, 5", "3, 6"};
        String list = new NestedArray().run(values);
        System.out.println(list);

        return this;
    }

    public Controller taskFour() {
        long seed = new Date().getTime() / 1_000;
        List<Long> list = new LinearGenerator(25_214_903_917L, 11L, (long) Math.pow(2, 48))
                .getStream(seed)
                .limit(5)
                .toList();

        System.out.println(list);

        return this;
    }

    public Controller taskFive() {
        List<Integer> list = MergeStreams
                .zip(Stream.of(1, 2, 3, 4), Stream.of(5, 6, 7, 8, 9))
                .toList();

        System.out.println(list);
        return this;
    }
}
