package design.patterns;

import java.util.Iterator;

import examples.MySingleton;
import examples.Rainbow;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hellow!");
		System.out.println("======================");
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				MySingleton s1 = MySingleton.getInstance();
//				System.out.println(s1);
//			}
//		});
//		t1.start();
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				MySingleton s2 = MySingleton.getInstance();
//				System.out.println(s2);
//			}
//		});
//		t2.start();
		
		Rainbow rainbow = new Rainbow();
		
		for(Iterator<String> iterator = rainbow.iterator(); iterator.hasNext();) {
			String c = iterator.next();
			System.out.println(c);
		}
		
		System.out.println("======================");
		
		for (String string : rainbow) {
			System.out.println(string);
		}
	}

}
