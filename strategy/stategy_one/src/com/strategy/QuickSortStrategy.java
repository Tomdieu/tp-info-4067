package com.strategy;

import java.util.List;

public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(List<Integer> list, int left, int right) {
        if(left < right) {
            int pivot = partition(list, left, right);
            quickSort(list, left, pivot - 1);
            quickSort(list, pivot + 1, right);
        }
    }

    private int partition(List<Integer> list, int left, int right) {
        int pivot = list.get(right);
        int i = left - 1;

        for(int j = left; j < right; j++) {
            if(list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(right));
        list.set(right, temp);

        return i + 1;
    }
}
