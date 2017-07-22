package Log;

import java.io.*;
import java.util.logging.*;


public class Log {

	public Log(String uname,String pw) 
	{
		
		
	    
	    	try
	    	{
	    		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    		String filename="Default.txt";
	    		String workdir =System.getProperty("user.dir");
	    		File workingDirFile = new File(workdir); 
	    		File testfile = new File(workingDirFile, filename);
	    		if(testfile.exists())
	    		{
	    			System.out.println("Log exists");
	    			String myLine=null;
	    			FileReader input = new FileReader("Default.txt");
					BufferedReader bufRead = new BufferedReader(input);
	    			while ( (myLine = bufRead.readLine()) != null) 
					{    
					    //System.out.println(myLine);
						String[] arr = myLine.split("\\s+");
						if(arr[1].toString().equals(pw))
						{
							System.out.println("LOGIN SUCCESSFULL");
						}
						else
						{
							System.out.println("WRONG PASSWORD");
						}
						
					}
	    			
	    			
	    		}
	    		else
	    		{
	    			System.out.println("Log do not exists");
	    			System.out.println("Using default log");
	    			File f = new File("Default.txt");
	    			if(f.createNewFile())
	    			{
	    				System.out.println("Log created");
	    				
						PrintWriter out = new PrintWriter(f);
	    				
	    				
	    				if(uname.equals("user") && pw.equals("1234"))
	    				{
	    					System.out.println("Log in Successfull");
	    					System.out.println("**First time user**");
	    						System.out.println("Enter new password");
	    						String npw = br.readLine();
	    						FileReader input = new FileReader("Default.txt");
	    						BufferedReader bufRead = new BufferedReader(input);
	    						String myLine ="user "+npw;
	    						out.println(myLine);
    							out.close();
    							System.out.println("Password Changed");
	    					
	    					
	    				}
	    				else
	    				{
	    					System.out.println("Log in failed");
	    				}
	    				
	    				
	    			}
	    			
	    		}
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
		
		
		
	}

	

}
