package Strategy;

import java.util.Arrays;

public class JavaSort extends SortingMethod {

    @Override
    protected int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
