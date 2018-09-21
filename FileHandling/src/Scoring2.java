import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scoring2 {

	public static void main(String[] args) throws IOException {
		
		String ch;
		System.out.println("Hello let us start....");
		
	    try 
        { 
               BufferedReader br = new BufferedReader(new FileReader("D:\\Player1_Assassin.txt")); 
               PrintWriter bw = new PrintWriter(new FileWriter("D:\\output.txt")); 
              
               while ((ch=br.readLine())!=null) 
                       {   
            	   			if(ch.startsWith("[Scoring]"))
                                    bw.println(ch);
            	   		            	                                       
                       } 
               
               
                             br.close(); 
                             bw.close(); 
        } 
                            catch(Exception e) { 
                            	 e.printStackTrace();
                            	
                             
                             } 
    
	System.out.println("done");
	} 
}
