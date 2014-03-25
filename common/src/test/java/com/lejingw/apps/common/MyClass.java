package com.lejingw.apps.common;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.lang.reflect.ParameterizedType;

public class MyClass<T extends Serializable> implements MyInterface<T> {
	// 实体类类型(由构造方法自动赋值)
	private Class<T> entityClass;

	// 构造方法，根据实例类自动获取实体类类型
	public MyClass() {
		this.entityClass = null;
		Class c = getClass();
		Type t = c.getGenericSuperclass();

		if (t instanceof ParameterizedType) {
			Type[] p = ((ParameterizedType) t).getActualTypeArguments();
			this.entityClass = (Class<T>) p[0];
			System.out.print(p[0]);
		} else {
			System.out.println("类型不匹配1...");
		}

		// 如下：
		// getGenericSuperclass 返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
		// Type 是 Java 编程语言中所有类型的公共高级接口。它们包括原始类型、参数化类型、数组类型、类型变量和基本类型。
		// ParameterizedType 表示参数化类型
		// getActualTypeArguments() 返回表示此类型实际类型参数的 Type 对象的数组。
		// entityClass =
		// (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public List<T> findByAll() {
		System.out.print("list...");
		return null;
	}

	public T findById() {
		return null;
	}

}