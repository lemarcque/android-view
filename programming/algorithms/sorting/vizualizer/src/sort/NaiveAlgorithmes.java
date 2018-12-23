package sort;

import java.util.ArrayList;
import java.util.List;

public abstract class NaiveAlgorithmes{

    public static List<Integer> sort(final List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        boolean isListSorted = false;
        while(!isListSorted) {

            isListSorted = true;

            for (int i = 0; i < sortedList.size(); i++) {
                if(i != sortedList.size() - 1) {
                    if(sortedList.get(i) > sortedList.get(i + 1)) {

                        // Permutation using XOR
                        sortedList.set(i, sortedList.get(i) ^ sortedList.get(i + 1));
                        sortedList.set(i + 1, sortedList.get(i) ^ sortedList.get(i + 1));
                        sortedList.set(i, sortedList.get(i) ^ sortedList.get(i + 1));

                        isListSorted = false;
                    }
                }
            }
        }

        return sortedList;
    }
}
