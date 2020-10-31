package com.imooc.hi.hi.hash;

public class HashDemo1 {

	private String name;
	
	public HashDemo1(String st) {
		this.name = st;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;*/
		return 123;
	}

	@Override
	public boolean equals(Object obj) {//这里的传参对象必须是Object，不然在set集合的add方法添加元素的时候就不会调用该equals了。我们要重写Object的equals
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashDemo1 other = (HashDemo1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;*/
		System.out.println("equals out");
		return true;
	}
	
	
}
