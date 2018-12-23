package sort;

import java.util.List;

public abstract class IntegerSortingAlgorithm<Integer> extends SortingAlgorithm {

    @Override
    abstract List<Integer> apply(List list);

}
