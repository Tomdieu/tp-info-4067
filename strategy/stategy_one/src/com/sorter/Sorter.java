package com.sorter;

import java.util.List;

import com.strategy.SortStrategy;

public class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list) {
        strategy.sort(list);
    }
}
