package siri;

import java.awt.Desktop;
import java.net.URI;

public class Webpage {

	public static void main(String[] args) 
	{
		web();
	}
	
	public static void web() 
	{
		// TODO Auto-generated method stub
		Desktop d = Desktop.getDesktop();
		//d.browse(new URI("http://google.com"));
		try
		{
		d.browse(new URI("http://google.com"));
		}
		catch(Exception e)
		{
			System.out.println("not match");
		}

	}

}
