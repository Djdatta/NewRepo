import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondPro {

public static void main(String[] args) throws IOException {
		
		String ch;
		System.out.println("Hello let us start....");
		
	    try 
        { 
               BufferedReader br = new BufferedReader(new FileReader("D:\\output.txt")); 
               PrintWriter bw = new PrintWriter(new FileWriter("D:\\output2.txt")); 
              String output[]=null;
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
