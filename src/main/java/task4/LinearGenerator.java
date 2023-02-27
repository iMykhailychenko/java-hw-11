package task4;

import java.util.stream.Stream;

public class LinearGenerator {
    private final long a, c, m;

    public LinearGenerator(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Stream<Long> getStream(long x) {
        return Stream.iterate(x, n -> (a * n + c) % m);
    }
}
