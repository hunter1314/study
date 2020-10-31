package com.imooc.hi.hi.hash;

import java.util.HashSet;
import java.util.Set;

/**java中重写equals方法时为什么要重写hashCode
 * 
 * 在我们给set集合中插入数据的时候，每次插入都要和集合中的元素对比equals不可重复。
 * 但是当集合中元素过多的时候，性能较慢。为此我们引入hashCode。
 * 在比较相等之前先计算出元素的内存区间作为它的hashCode，然后在集合中找到该内存区间内的所有元素调用equals方法来对比
 * 
 * 所以，我们要调用equals方法的前提是hashCode相等。若是hashCode不等就不会调用equals方法了。
 * @author Administrator
 *
 */
public class HashEquals {

	public static void main(String[] args) {
		HashDemo1  d1 = new HashDemo1("hh");
		HashDemo1  d2 = new HashDemo1("hh");
		
		Set<Object> set = new HashSet<Object>(); 
		set.add(d1);
		set.add(d2);
		
		System.out.println(set.size());
	}
}
