/**
 * 
 */
package com.mycompany.expgit2.chapter1;

/**
 * @author Miles
 *
 */
public class MainClass 
{
	private String name;
	private String lastName;
	
	public MainClass(String name)
	{
		this.name = name;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("BEGIN");
		staticMethod("Miles");
		System.err.println("END");
	}
	
	public static void staticMethod(String inp)
	{
		System.out.println("Hello your name is " + inp);
		System.out.println("Bye");
	}
}
