package siri;


		import java.util.Scanner;

		public class Message1 extends Webpage {

		

			public static void main(String[] args) {
								// TODO Auto-generated method stub
				sent();
			}
				public static void sent()
				{
				//System.out.println("What can i help you with");
				Scanner input=new Scanner(System.in);
				//String mess=input.nextLine();
				System.out.println("To Whom should i send your message");
				String Towhom=input.nextLine();
				//System.out.println(Towhom);
				System.out.println("What you want to send");
				String Send=input.nextLine();
				//System.out.println(Send);
				System.out.println("can i send a msg");
				String ok=input.nextLine();
				
				if(ok.equalsIgnoreCase("yes"))
				{
					System.out.println("Message " + Send + " sent");
				}
				else if(ok.equalsIgnoreCase("no"))
				{
					System.out.println("Ok. I won't send it");
				}
				
				else
				{
					System.out.println("not match");
				}
					
	
	}

}
