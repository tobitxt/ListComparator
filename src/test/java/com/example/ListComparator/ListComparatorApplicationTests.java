package com.example.ListComparator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ListComparatorApplicationTests {
//List comparator
	//You have two arrays in this kata, every array contains only unique elements.
	//Your task is to calculate the number of elements in the first array which are also in the second array.
	//does not matter the position of element
	//if first/second list is empty value is zero

	//Error states
	//should throw exception when first list is empty
	//when second list is empty
	@Test
	void contextLoads() {
	}
//	@Test
//	public void comparatorShouldReturnValueOfTwoWhenListsShareTwoValueIrrespectiveOfRepeatsInSecondList() {
//		List<Character> firstList = new ArrayList<>();
//		firstList.add('a');
//		firstList.add('1');
//		firstList.add('/');
//		List<Character> secondList = new ArrayList<>();
//		secondList.add('1');
//		secondList.add('1');
//		secondList.add('a');
//		secondList.add('a');
//		secondList.add('?');
//
//		System.out.println("Number of shared elements:" + listComparator.comparator(firstList,secondList));
//		assertEquals(2,listComparator.comparator(firstList,secondList));
//	}
//
//	@Test
//	public void comparatorShouldReturnValueOfTwoWhenListsShareTwoValueIrrespectiveOfRepeatsInFirstAndSecondList() {
//		List<Character> firstList = new ArrayList<>();
//		firstList.add('a');
//		firstList.add('a');
//		firstList.add('1');
//		firstList.add('1');
//		firstList.add('/');
//		List<Character> secondList = new ArrayList<>();
//		secondList.add('1');
//		secondList.add('1');
//		secondList.add('a');
//		secondList.add('a');
//		secondList.add('?');
//
//		System.out.println("Number of shared elements:" + listComparator.comparator(firstList,secondList));
//		assertEquals(2,listComparator.comparator(firstList,secondList));
//	}
//

}
