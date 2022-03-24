package LibraryInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

public class Bookinfo4 
{
	 public static void searchBook() throws SQLException
	  {
		  String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		 
		 // String query3="select * from jspiders.bookinfo where name=?";
		  
		//  String query4="select * from jspiders.bookinfo where price=?";
		  
		 // String query5="select * from jspiders.bookinfo where author=?";
		  
		  Connection connection = DriverManager.getConnection(url);
		  
		  Scanner sc1=new Scanner(System.in);
		  
          System.out.println("How do you want to Select Record By:\n---------------------------------");
		  
		  System.out.println("Enter 1 to Select record with Book-Name");
		  
		  System.out.println("Enter 2 to Select record with Book-Price");
		  
		  System.out.println("Enter 3 to Select record with Book-Author");
		 
		 int choice=sc1.nextInt();
		  
		  if(choice==1)
		  {
			  String query3="select * from jspiders.bookinfo where name=?";
			  
		   System.out.println("Enter Book Name :");
		   
		   PreparedStatement ps1=connection.prepareStatement(query3);
			 
			ps1.setString(1,sc1.next());
			 
			ResultSet resultset=ps1.executeQuery();
             
			//if(record)
			//{
			while(resultset.next()) 
			{
			System.out.println("BOOK-ID :"+resultset.getInt("bookid")+"\nBOOK-NAME :"+resultset.getString("name") + "\nAUTHOR: "+resultset.getString("author") +"\nPAGES : "+resultset.getInt("pages")+"\nPRICE : "+resultset.getInt("price"));
			
			System.out.println("Thank you!");
			
			}
			
			//}
			//else
			//{
				//System.err.println("Invalid Retrive request");
			//}
		  }
		  else if(choice==2)
		  {
			  
			  String query4="select * from jspiders.bookinfo where price=?";
			
			 PreparedStatement ps2=connection.prepareStatement(query4);
			 
			 System.out.println("Enter BookPrice :");
			 
			ps2.setInt(1, sc1.nextInt());
			
			ResultSet resultset2=ps2.executeQuery();
			
			//if(resultset2.next())
			//{
			while(resultset2.next())
			{
			System.out.println("BOOK-ID :"+resultset2.getInt("bookid")+"\nBOOK-NAME :"+resultset2.getString("name") + "\nAUTHOR: "+resultset2.getString("author") +"\nPAGES : "+resultset2.getInt("pages")+"\nPRICE : "+resultset2.getInt("price"));
			
			System.out.println("Thank you!");
			
			}
			//}
			//else
			//{
				//System.err.println("Invalid Retrive request");
			//}
			
			}
		  else
		  {
			  String query5="select * from jspiders.bookinfo where author=?";
			  
            System.out.println("Enter AuthorName :");
            
  		  PreparedStatement ps3=connection.prepareStatement(query5);
			
			ps3.setString(1, sc1.next());
			
			ResultSet resultset3=ps3.executeQuery();
			
			//if(resultset3.next())
			//{
			while(resultset3.next())
			{
			
			System.out.println("BOOK-ID :"+resultset3.getInt("bookid")+"\nBOOK-NAME :"+resultset3.getString("name") + "\nAUTHOR: "+resultset3.getString("author") +"\nPAGES : "+resultset3.getInt("pages")+"\nPRICE : "+resultset3.getInt("price"));
		 
			System.out.println("Thank you!");
			}
			//}
			//else
			//{
				//System.err.println("Invalid Retrive request");
		//	}
				
		  }
}
}
