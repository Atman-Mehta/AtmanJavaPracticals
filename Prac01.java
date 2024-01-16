//  Write a java program to find sum of two numbers using class & object.

package JavaPracticals;

import java.util.Scanner; 

public class Prac01 {
	int a,b,c;
	public static void main (String[] args)
	{
		Prac01 o1=new Prac01();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		o1.a=sc.nextInt();
		System.out.println("Enter number 2: ");
		o1.b=sc.nextInt();
		o1.c=o1.a+o1.b;
		System.out.println(o1.a+"+"+o1.b+"="+o1.c);
	}

}
  