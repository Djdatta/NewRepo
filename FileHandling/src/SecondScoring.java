import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondScoring {

public static void main(String[] args) throws IOException {
		
	
		String ch;
		System.out.println("Hello let us start....");
		
	    try 
        { 
               BufferedReader br = new BufferedReader(new FileReader("D:\\output.txt")); 
               PrintWriter bw = new PrintWriter(new FileWriter("D:\\Newoutput.txt")); 
              
               
               while ((ch=br.readLine())!=null) 
                       {   

            		String output[]=ch.split(" ");
            		for(String temp:output)
            			{
            			          			
            			
            			bw.println("Name: "+temp);
            			
            			}
            		
            			bw.println("*****************************************");

            			
            			br.readLine();
            	   		            	                                       
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
