package com.imooc.hi.hi.single;

/**单例模式
 * 1、在一个jvm虚拟机（服务器）范围内，单例类只有一个实例对象；
 * 2、单例类的实例对象只能是自己创建的（private对象的构造函数，让其他对象不能new该对象创建实例）
 * 3、单例类会对外暴露自己的实例对象
 * @author Administrator
 *
 */
public class SingleTep {

	private static SingleTep st1 = null;//懒汉式
	private static SingleTep st2 = new SingleTep();//饿汉式
	
	private String name;

	private SingleTep() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//懒汉式
	public static SingleTep getInstance1() {
		if(null == st1) {//有了这个判断，下面的同步锁就只有在第一次创建对象实例的时候会执行，对性能影响小
			synchronized (SingleTep.class) {//加上同步锁，防止第一次创建实例的时候出现并发导致创建多个实例。
				if(null == st1) {
					st1 = new SingleTep();
				}
			}
		}
		return st1;
	} 
	
	//饿汉式
	public static SingleTep getInstance2() {
		return st2;
	}
}
