package com.example.ListComparator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListComparatorTest {
//List comparator
    //You have two arrays in this kata, every array contains only unique elements.
    //Your task is to calculate the number of elements in the first array which are also in the second array.
    //does not matter the position of element
    //if first/second list is empty value is zero

    //Error states
    ListComparator listComparator = new ListComparator();

    @Test
    public void comparatorShouldReturnValueOfZeroWhenFirstListIsEmpty() {
        List<Character> firstList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();
        secondList.add('a');
        secondList.add('1');
        secondList.add('/');

        assertEquals(0,listComparator.comparator(firstList,secondList));
    }

    @Test
    public void comparatorShouldReturnValueOfZeroWhenSecondListIsEmpty() {
        List<Character> firstList = new ArrayList<>();
        firstList.add('a');
        firstList.add('1');
        firstList.add('/');
        List<Character> secondList = new ArrayList<>();

        assertEquals(0,listComparator.comparator(firstList,secondList));
    }

    @Test
    public void comparatorShouldReturnValueOfOneWhenListsShareOneValue() {
        List<Character> firstList = new ArrayList<>();
        firstList.add('a');
        firstList.add('1');
        firstList.add('/');
        List<Character> secondList = new ArrayList<>();
        secondList.add('1');
        secondList.add('b');
        secondList.add('?');

        System.out.println("Number of shared elements:" + listComparator.comparator(firstList,secondList));
        assertEquals(1,listComparator.comparator(firstList,secondList));
    }

    @Test
    public void comparatorShouldReturnValueOfTwoWhenListsShareTwoValue() {
        List<Character> firstList = new ArrayList<>();
        firstList.add('a');
        firstList.add('1');
        firstList.add('/');
        List<Character> secondList = new ArrayList<>();
        secondList.add('1');
        secondList.add('a');
        secondList.add('?');

        System.out.println("Number of shared elements:" + listComparator.comparator(firstList,secondList));
        assertEquals(2,listComparator.comparator(firstList,secondList));
    }
}