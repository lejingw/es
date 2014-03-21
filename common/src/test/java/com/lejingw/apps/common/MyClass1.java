package com.lejingw.apps.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class MyClass1
//extends Student
//extends MyClass<Student> 
{

	public MyClass1() {
		Class c = getClass();
		Type t = c.getGenericSuperclass();

		if (t instanceof ParameterizedType) {
			Type[] p = ((ParameterizedType) t).getActualTypeArguments();
			Class entityClass = (Class) p[0];
			System.out.print(p[0]);
		} else {
			System.out.println("类型不匹配1...");
		}
	}
	
	public static void main(String[] s) {
		MyClass1 obj = new MyClass1();
	//	obj.findById();
	}
}