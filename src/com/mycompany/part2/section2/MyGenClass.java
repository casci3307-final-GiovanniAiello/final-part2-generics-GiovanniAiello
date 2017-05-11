/**
 * 
 */
package com.mycompany.part2.section2;
import 	com.mycompany.part2.section2.MyGenInterface;
/**
 * @author Gio
 *
 */
public class MyGenClass <K,V> implements MyGenInterface<K,V>{
	
	private K Key;
	private V Value;
	
	public MyGenClass(K _getKey,V _getValue) {
		Key = _getKey;
		Value= _getValue;
		
	}
	public K getKey(){
		return Key;
	}
	public V getValue(){
			return Value;
	}
	public static class MyClass {}
	
	
}
