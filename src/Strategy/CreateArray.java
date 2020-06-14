package Strategy;

import java.util.Random;

public class CreateArray {
    Random random = new Random();

    public int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int element : array) {
            element = random.nextInt();
        }
        return array;
    }

}
