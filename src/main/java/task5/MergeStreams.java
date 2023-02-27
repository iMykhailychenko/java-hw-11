package task5;

import java.util.Iterator;
import java.util.stream.Stream;

public class MergeStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorOne = first.iterator();
        Iterator<T> iteratorTwo = second.iterator();
        Stream.Builder<T> builder =  Stream.builder();

        while (iteratorOne.hasNext() && iteratorTwo.hasNext()) {
            builder.add(iteratorOne.next());
            builder.add(iteratorTwo.next());
        }

        return builder.build();
    }
}
