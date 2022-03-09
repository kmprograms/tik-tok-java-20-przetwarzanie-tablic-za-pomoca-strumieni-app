import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManager {
    private int[] arr;

    public ArrayManager(int size, int min, int max) {
        arr = init(size, min, max);
    }

    public double average() {
        return Arrays
                .stream(arr)
                .average()
                .orElseThrow(() -> new IllegalStateException("Average method exception"));
    }

    public int min() {
        return Arrays
                .stream(arr)
                .min()
                .orElseThrow(() -> new IllegalStateException("Min method exception"));
    }

    public int max() {
        return Arrays
                .stream(arr)
                .max()
                .orElseThrow(() -> new IllegalStateException("Max method exception"));
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayManager that = (ArrayManager) o;

        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    private static int[] init(int size, int min, int max) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size is not correct");
        }

        if (min > max) {
            throw new IllegalArgumentException("Draw range is not correct");
        }

        return IntStream
                .range(0, size - 1)
                .map(idx -> RandomManager.intValue(min, max))
                .toArray();

    }
}