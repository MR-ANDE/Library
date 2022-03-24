package LibraryInfo;
import java.util.Scanner;
import java.sql.*;

public class Bookinfo
{
	public static void main(String[] args) throws SQLException {
		
      Scanner sc=new Scanner(System.in);
      
      int option=1;
      
	do {
      System.out.println("Enter your choice");
      
      System.out.println("Enter 1 to InsertBook Details");
      
      System.out.println("Enter 2 to UpdateBook Details");
      
      System.out.println("Enter 3 to SearchBook Details");
      
      System.out.println("Enter 4 to RemoveBook Details");
      
       int choice1 =sc.nextInt();
       
       switch(choice1)
       {
      case 1: Bookinfo2.addBook();
      break;
      case 2: Bookinfo3.updateBook();
      break;
      case 3: Bookinfo4.searchBook();
      break;
      case 4:Bookinfo5.removeBook();
      break;
     default:System.err.println("Invalid Option..!");
       }
     
     System.out.println("Enter 1 to Continue :\nEnter 2 to Stop :");
     
     int option1=sc.nextInt();
     
     if(option1==1) 
     {
    	 continue;
     }
     else
    	 break;
      }
      while(option==1);
	}
 }
       

	

