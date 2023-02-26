package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MergeStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorOne = first.iterator();
        Iterator<T> iteratorTwo = second.iterator();
        List<T> list = new ArrayList<>();

        while (iteratorOne.hasNext() && iteratorTwo.hasNext()) {
            list.add(iteratorOne.next());
            list.add(iteratorTwo.next());
        }

        return list.stream();
    }
}
