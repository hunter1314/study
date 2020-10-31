package com.imooc.hi.hi.sort;

/**
 * 快速排序
 * 1.设置中轴分段，每次返回数组中轴在整体数组中的排序，
 * 	  并且将小于中轴的数放在中轴左边，大于的放在右边
 * 2.递归调用上面的方法，
 * @author Administrator
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		Integer[] in = {3,5,2,15,23,1,25};
		
		quick(in, 0, in.length-1);
		for(Integer i=0; i<in.length; i++) {
			System.out.println(in[i]);
		}
		//System.out.println(getMiddle(in, 1, 4));
	}
	
	public static void quick(Integer[] in,int start,int end) {
		if(start < end) {			
			int mid = getMiddle(in, start, end);
			quick(in, start, mid-1);
			quick(in, mid+1, end);
		}
	}
	
	//设置in[statr]为中轴，并且返回中轴元素在 整体数组中从start到end的位置信息加上start的结果集位置数据
	//并将小于中轴的数放在中轴左边，大于的放在右边
	public static int getMiddle(Integer[] in,int start,int end) {
		int temp = in[start];//设置开始为中轴
		
		while(start < end) {
			while(start < end && in[end] >= temp) {
				end--;
			}
			in[start] = in[end];
			while(start < end && in[start] <= temp) {
				start++;
			}
			in[end] = in[start];
		}
		in[start] = temp;
		return start;
	}
	
	public static void testWhile() {
		int temp = 5;//设置开始为中轴
		
		while(temp > 3) {
			while(temp > 0) {
				temp--;
				System.out.println(temp);
			}
			System.out.println("temp: "+temp);
		}
	}
}
