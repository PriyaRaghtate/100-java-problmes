package problems100;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// swap numbers using 3rd variable
		int a,b,temp;
		System.out.println("Enter two variables");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("before swapping a="+a);
		System.out.println(" b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.print("after swapping a="+a);
		System.out.println(" b="+b);
	}

}
