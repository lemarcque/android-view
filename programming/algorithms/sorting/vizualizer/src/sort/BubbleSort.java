package sort;

import java.util.ArrayList;
import java.util.List;

public abstract class BubbleSort {

    public static List<Integer> sort(final List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        boolean swapped;

        do {

            swapped = false;

            // n - 1 for optimizing the process
            for (int i = 0; i < sortedList.size() - 1; i++) {
                if(i != sortedList.size() - 1) {
                    if(sortedList.get(i) > sortedList.get(i + 1)) {

                        // Permutation using XOR
                        sortedList.set(i, sortedList.get(i) ^ sortedList.get(i + 1));
                        sortedList.set(i + 1, sortedList.get(i) ^ sortedList.get(i + 1));
                        sortedList.set(i, sortedList.get(i) ^ sortedList.get(i + 1));

                        swapped = true;
                    }
                }
            }
        }while (swapped);

        return sortedList;
    }
}
