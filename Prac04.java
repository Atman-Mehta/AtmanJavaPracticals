//  Write a Java program to create class Student. The class should have attributes student ID, student name, marks for 3 subjects and the member functions are setdata() and displaydata(). Calculate the average marks for student.

package JavaPracticals;

import java.util.Scanner;

public class Prac04 {
	int studentID;
	String studentName;
	double marksSub1, marksSub2, marksSub3;
	public void getData()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter Student ID: ");
		studentID = sc.nextInt();
		System.out.print("\nEnter Student Name: ");
		studentName = sc.next();
		System.out.println("\nEnter Student Marks: ");
		System.out.println("\nEnter Subject-1 Marks: ");
		marksSub1 = sc.nextInt();
		System.out.println("\nEnter Subject-2 Marks: ");
		marksSub2 = sc.nextInt();
		System.out.println("\nEnter Subject-3 Marks: ");
		marksSub3 = sc.nextInt(); 
	}
	public void displayData()
	{
		System.out.println("Student ID: " +studentID);
		System.out.println("Student Name: " +studentName);
		System.out.println("Subject-1 Marks: " +marksSub1);
		System.out.println("Subject-2 Marks: " +marksSub2);
		System.out.println("Subject-3 marks: " +marksSub3);
	}
	public void average()
	{
		System.out.println("Average of Marks: " +(marksSub1 + marksSub2 + marksSub3)/3);
	}
	public static void main(String[]args)
	{
		Prac04 s1 = new Prac04();
		System.out.println("Enter Student Data: ");
		s1.getData();
		System.out.println("The Student Data you entered: ");
		s1.displayData();
		s1.average();
	}
}
