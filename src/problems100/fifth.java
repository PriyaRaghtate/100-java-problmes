package problems100;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		//convert fahrenheit to celcius
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temprature in fahrenheit");
		temp=sc.nextFloat();
		temp=((temp-32)*5)/9;
		System.out.println("temprature in celsius="+temp);
	}
}
