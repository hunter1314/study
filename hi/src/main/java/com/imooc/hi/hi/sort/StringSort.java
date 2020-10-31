package com.imooc.hi.hi.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a4","a2","a3");
		
		/*原始方法
		 * Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});*/
		
		//lambda表达式
		Collections.sort(list, (String a,String b) -> {
			return b.compareTo(a);
		});
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
