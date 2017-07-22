import Log.*;
import java.io.*;

public class Call {

	
		public static void main(String str[])
		{
			try
			{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter username");
			String uname=br.readLine();
			System.out.println("Enter password");
			String pw=br.readLine();
			Log l = new Log(uname, pw);
			
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
			
		}
	

}
