import task1.Names;
import task2.Sorting;
import task3.NestedArray;

import java.util.Arrays;

public class Controller {
    private final String[] names = new String[]{"Ivan", "Bob", "Semen", "Alex", "Max"};

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
}
