import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scoring {

	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Hello");
		
	    try 
        { 
               BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt")); 
               BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\b.txt")); 
               int ch; 
               while ((ch = br.read()) != -1) 
                       {   
                             if (Character.isLowerCase((char) ch)) 
                                bw.write(Character.toUpperCase((char) ch)); 
                             else 
                                     bw.write((char) ch); 
                       } 
                             br.close(); 
                             bw.close(); 
        } 
                             catch(Exception e) { e.printStackTrace();} 
    } 
}