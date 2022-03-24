package LibraryInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bookinfo3 {

	 public static void updateBook() throws SQLException
	  {
		 String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		 
		  String query1="update jspiders.bookinfo set name=? where bookid=?";
		  
		  String query2="update jspiders.bookinfo set author=? where name=?";
		  
		  Connection connection = DriverManager.getConnection(url);
		  
		  PreparedStatement ps1=connection.prepareStatement(query1);
		  
		  PreparedStatement ps2=connection.prepareStatement(query2);
		  
		  System.out.println("How do you want to update By:\n--------------------------");
		  
		  System.out.println("Enter 1 to Name  with Book-Id");
		  
		  System.out.println("Enter 2 to Update author with Book-Name");
		  
		  
		  Scanner sc1=new Scanner(System.in);
		  int choice=sc1.nextInt();
		  if(choice==1)
		  {
			 System.out.println("Enter the Book-Id Number:");
				
			ps1.setInt(2,sc1.nextInt());
				
			System.out.println("Enter the name to be updated:");
			
			ps1.setString(1,sc1.next());
			
			int record=ps1.executeUpdate();
			
			if(record>0)
			{
				System.out.println("Updated Record...");
				
				System.out.println("Thank you");
			}
			else
			{
				System.err.println("Invalid update request");
			}
			
		
		  }
			else
			{     
				 System.out.println("Enter the BookName:");
					
					ps2.setString(2,sc1.next());
			
		    	System.out.println("Enter the AuthorName :");
				
				ps2.setString(1,sc1.next());
			
				int record=ps2.executeUpdate();
				
				if(record>0)
				{
					System.out.println("Updated Record...");
					
					 System.out.println("Thank you");
				}
				else
				{
					System.err.println("Invalid Update Request");
				}
				
			}
		  }
}

