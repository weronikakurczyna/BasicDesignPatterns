package Strategy;

public class MainClass {

    final static int SMALL_ARRAY_SIZE = 50;
    final static int MEDIUM_ARRAY_SIZE = 500;
    final static int LARGE_ARRAY_SIZE = 5000;
    CreateArray createArray = new CreateArray();

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.printSortingTimesForArrays(new BubbleSort());
        mainClass.printSortingTimesForArrays(new SelectionSort());
        mainClass.printSortingTimesForArrays(new QuickSort());
        mainClass.printSortingTimesForArrays(new JavaSort());
    }

    public void printSortingTimesForArrays(SortingMethod sortingMethod) {

        System.out.println(sortingMethod.getClass().getName());
        System.out.println("Mała: " + this.countSortingTime(sortingMethod, 10, SMALL_ARRAY_SIZE) + " ns");
        System.out.println("Średnia: " + this.countSortingTime(sortingMethod, 10, MEDIUM_ARRAY_SIZE) + " ns");
        System.out.println("Duża: " + this.countSortingTime(sortingMethod, 10, LARGE_ARRAY_SIZE) + " ns");
    }

    private long countSortingTime(SortingMethod sortingMethod, Integer repetitions, int arraySize) {
        final long startTime = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            sortingMethod.sort(createArray.createArray(arraySize));
        }
        return (System.nanoTime() - startTime) / repetitions;
    }


}
