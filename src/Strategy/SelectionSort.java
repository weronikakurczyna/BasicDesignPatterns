package Strategy;

public class SelectionSort extends SortingMethod {

    @Override
    protected int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
