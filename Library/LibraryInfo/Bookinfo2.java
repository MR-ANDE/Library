package LibraryInfo;
import java.util.Scanner;
import java.sql.*;
	public class Bookinfo2
	     {
		  public static void addBook() throws SQLException
		  {
			  String query="insert into jspiders.bookinfo values(?,?,?,?,?)";
			  
			  String url="jdbc:mysql://localhost:3306?user=root&password=12345";
			  
			  Connection connection = DriverManager.getConnection(url);
				
				PreparedStatement preparedstatement=connection.prepareStatement(query);
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the Book-id to be inserted:\n");
				 
				int id=sc.nextInt();
				
				//assign values for placeholder
				
				preparedstatement.setInt(1,id);
				
				System.out.println("Enter the Bookname");
				 
				String id1=sc.next();
				
				preparedstatement.setString(2,id1);
				
				System.out.println("Enter the AuthorName of the Book:");
				 
				String id2=sc.next();
				
				preparedstatement.setString(3,id2);
				
				System.out.println("Enter Number of pages :");
				 
			      long id3=sc.nextLong();
				
				preparedstatement.setLong(4,id3);
				
				System.out.println("Enter the Price of the Book");
				 
				long id4=sc.nextLong();
				
				preparedstatement.setLong(5,id4);
				
				preparedstatement.executeUpdate();
				
				System.out.println("Data Inserted Successfully");
				
				System.out.println("\nTHANK YOU !");
				
		         connection.close();
				
				
		  }

}
