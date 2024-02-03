package br.com.wrapper;

public class ConversaoWrapper {

	public static void main(String[] args) {
		int a = 10;
		
		System.out.println("int = " + a);
		
		Integer i = Integer.valueOf(a);
		
		System.out.println("Integer = " + i);
	}
}
