package com.gmail.ptimofejev;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> createdList = new ArrayList<String>();
		
		createdList.add("one");
		createdList.add("two");
		createdList.add("three");
		createdList.add("four");
		createdList.add("five");
		createdList.add("six");
		createdList.add("seven");
		createdList.add("eight");
		createdList.add("nine");
		createdList.add("ten");
		
		createdList.remove(0);
		createdList.remove(0);
		createdList.remove(createdList.size()-1);
		
		System.out.println(createdList);
	}

}
