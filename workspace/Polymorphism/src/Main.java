import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int i, flag = 0;
		String name = null;
		double perc = 0;
		String name1 = null;
		int np = 0;
		int booksPublished = 0;
		Person[] p = new Person[20];
		do {
			System.out.println("enter the number of students:");
			Scanner k = new Scanner(System.in);
			try {
				int ns = k.nextInt();

				flag = 1;

				/*
				 * try { ns=k.nextInt(); if(ns>5||ns<0) { Exception exception =
				 * null; throw exception; } } catch(Exception e) {
				 * System.out.println("Enter the no between 0 and 5"); flag=1;
				 * }k.nextLine(); }while(flag!=0);
				 */
				System.out.println("STUDENTS DETAILS:");
				for (i = 0; i < ns; i++) 
				{
					System.out.println("enter the name:");
					try 
					{
						name = k.next();
					}
					catch (InputMismatchException e) 
					{
						System.out.println("ENTER THE NAME ONLY ");
					}
					System.out.println("enter the percentage:");
					try 
					{
						perc = k.nextDouble();
					}
					catch (InputMismatchException e) 
					{
						System.out.println("ENTER THE PERCENTAGE");
					}
					p[i] = new Student(perc, name);
				}
				System.out.println("enter the number of professor");
				np=k.nextInt();
				System.out.println("PROFESSOR DETAILS:");
				for (i=ns; i<ns+np; i++) 
				{
					System.out.println("enter the name:");
					try 
					{
						name1 = k.next();
					}
					catch (InputMismatchException e) 
					{
						System.out.println("ENTER THE NAME ONLY ");
					}
					System.out.println("enter the booksPublished:");
					try 
					{
						 booksPublished = k.nextInt();
					}
					catch (InputMismatchException e) 
					{
						System.out.println("ENTER THE NUMBER OF BOOKS PUBLISHED");
					}
				
					
					p[i] = new Professor(booksPublished, name1);
				}

				/*
				 * Person p1=new Student(98.0,"  manikandan"); Person p2=new
				 * Student(86.0,"  sai");
				 *  Person p3=new Student(88.0,"  mani");
				 * Person p4=new Professor(5,"   JOE"); Person p5=new
				 * Professor(8,"   AISHU");
				 * 
				 * 
				 * p1.isOutstanding(); p2.isOutstanding(); p3.isOutstanding();
				 * p4.isOutstanding(); p5.isOutstanding();
				 */
				for(i=0;i<ns+np;i++)
				{
					if(p[i].isOutstanding())
					{
						if(i<ns)
						{
						p[i].display();	
						}
						else
						{
						p[i].print();
						}
					}
				}
			} catch (Exception e) {
				System.out.println("enter the valid data");
				flag = 0;
			}
		} while (flag == 0);
	}
}
