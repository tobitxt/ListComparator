package com.example.ListComparator;

import java.util.List;

public class ListComparator {

        public int comparator(List<Character> firstList, List<Character> secondList) {
            firstList.retainAll(secondList);
            return firstList.size();
        }
}
