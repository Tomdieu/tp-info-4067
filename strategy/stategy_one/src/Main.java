import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sorter.Sorter;
import com.strategy.BubbleSortStrategy;
import com.strategy.QuickSortStrategy;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSortStrategy());

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);

        sorter.sort(list);

        System.out.println(list);

        sorter = new Sorter(new QuickSortStrategy());
        List<Integer> list2 = Arrays.asList(8,10,58,6,-8,1, 2, 3, 4, 5);
        sorter.sort(list2);

        System.out.println(list2);

    }
}
