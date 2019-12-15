package com.strings.pages;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacterInString {
public static void main(String[] args) {
	String sentence="my name is prasanth";
	char array[]=sentence.toCharArray();
	Map<Character,Integer>count=new HashMap<Character, Integer>();
	for(Character c:array)
	{
		if(count.containsKey(c))
		{
			count.put(c,count.get(c)+1);
		}
		else
			count.put(c, 1);
	}
	for(Map.Entry<Character, Integer> entry:count.entrySet())
	{
		System.out.println(" "+entry.getKey()+"   character occured times is  "+entry.getValue());
	}
}
}

