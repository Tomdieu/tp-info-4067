package com.strategy;

import java.util.List;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(List<Integer> list) {

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - 1; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }
}
