package Strategy;

public class QuickSort extends SortingMethod {

    @Override
    protected int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int index = partition(array, start, end);

            quickSort(array, start, index - 1);
            quickSort(array, index + 1, end);
        }

    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }


}
