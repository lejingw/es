package com.lejingw.apps.common;

import java.io.Serializable;
import java.util.List;

public interface MyInterface<T extends Serializable> {
	
	public T findById();

	public List<T> findByAll();
}