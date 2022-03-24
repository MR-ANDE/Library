 package LibraryInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bookinfo5 
{
	public static void removeBook() throws SQLException
	  {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		  String query6="delete from jspiders.bookinfo where name=?";
		  
		  String query7="delete from jspiders.bookinfo where bookid=?";
		  
		  Connection connection =DriverManager.getConnection(url);
			
			PreparedStatement ps1=connection.prepareStatement(query6);
			
			PreparedStatement ps2=connection.prepareStatement(query7);
			
			Scanner sc=new Scanner(System.in);
			
			 System.out.println("How do you want to Delete Record By:");
			  
			  System.out.println("Enter 1 to Delete Record By using Book-Name");
			  
			  System.out.println("Enter 2 to Delete Record By using Book-ID");
			  
			  int choice=sc.nextInt();
			  
			  if(choice==1)
			  {
			System.out.println("Enter the Book Name");
			
			ps1.setString(1,sc.next());
			
			int record=ps1.executeUpdate();
			
			if(record>0)
			{
				System.out.println("Deleted your Request..!");
			}
			else
			{
				System.err.println("Invalid Delete Request");
			}
			  }
			  else
			  {
            System.out.println("Enter the Book-Id");
			
			ps2.setInt(1,sc.nextInt());
			  
			 int record= ps2.executeUpdate();
			  
			  if(record>0)
				{
					System.out.println("Deleted your Request..!");
					System.out.println("\nThank you!");
				}
				else 
				{
					System.err.println("Invalid Delete Request");
				}
			  }
			connection.close();
	  }

}
