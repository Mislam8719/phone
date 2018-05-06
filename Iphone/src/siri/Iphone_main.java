package siri;


import java.util.Scanner;


public class Iphone_main extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What can i help you with");
		Scanner input=new Scanner(System.in);
		String mess=input.nextLine();
		if (mess.equalsIgnoreCase("message"))
		{
			//Message1 m=new Message1();
			//m.sent();
			sent();
		}
		else if(mess.equalsIgnoreCase("webpage"))
		{
			//System.out.println("entering webpage fn");
			
			//Webpage w=new Webpage();
		    //w.web();
			web();
			
		}
		else if(mess.equalsIgnoreCase("calculator"))
		{
			//Calculator c=new Calculator();
			//c.op();
			op();
		}
		else if(mess.equalsIgnoreCase("currentdate"))
		{
			//DateTime dt=new DateTime();
			//dt.current();
			current();
		}
	}

}
