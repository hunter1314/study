package com.imooc.hi.hi.test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		
		Integer[] ii = {1,4,6,8,2,4,3,6};
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i = ii.length-1; i >= 0; i--) {
			while(l1.indexOf(ii[i]) == -1) {
				l1.add(ii[i]);
			}
		}
		for(Integer l : l1) {
			System.out.println(l);
		}
	}
}
