package com.hubberspot.utility;
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
import com.hubberspot.model.Customer;
 
public class CustomerService {
 
    public static void write(Customer customer, String filePath) {
 try {
 
  File file = new File(filePath);
  FileWriter writer = new FileWriter(file);
  PrintWriter out = new PrintWriter(writer);
    
  String firstName = customer.getFirstName();
  String lastName = customer.getLastName();
  String emailAddress = customer.getEmailAddress();
    
  out.println("First Name : "+ firstName+"" );
  out.println("Last Name : "+ lastName+"" );
  out.println("Email Address : "+ emailAddress+"" );
out.close();

} catch (IOException e) {   
	  e.printStackTrace();
	 }
	   }
	}