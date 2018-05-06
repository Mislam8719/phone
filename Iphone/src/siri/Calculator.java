package siri;

import java.util.Scanner;



public class Calculator extends DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String operationtype;
		op();
	
	}
	public static void op()
	{
		
		System.out.println("What operation you want to");
		Scanner inputop=new Scanner(System.in);
		String operationtype = inputop.nextLine();
		
		//Calculate operations=new Calculate();
		Mathoperations mymath=new Mathoperations();
		Scanner input=new Scanner(System.in);
		int x= input.nextInt();
		
		int y=input.nextInt();
		
		if(operationtype.equalsIgnoreCase("add"))
		{
			System.out.println(mymath.add(x, y));
		}
		else if(operationtype.equalsIgnoreCase("sub"))
		{
			System.out.println(mymath.sub(x, y));
		}
		else if(operationtype.equalsIgnoreCase("multiple"))
		{
			System.out.println(mymath.mul(x, y));
			
		}
		else if(operationtype.equalsIgnoreCase("div"))
		{
			System.out.println(mymath.div(x, y));
		}
		else
		{
			System.out.println("It is not clear ");
		}
	}

}
