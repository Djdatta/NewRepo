import java.io.*;
public class FileDemo {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      File f=null;
      Reader r=null;
      Writer w=null;
      FileReader fr=null;
      FileWriter fw=null;
      BufferedReader br=null;
      BufferedWriter bw=null;
      PrintWriter pw=null;
      
      try {
    	  f=new File("D:\\a.txt");
    	  
    	  System.out.println(f.exists());	//here file is not exist physically-false
    	  
    	   Boolean f1= f.createNewFile();				// created file
    	  
    	  System.out.println(f1);		//created--true
    	  
    	 fw=new FileWriter("D:\\c.txt");
    	 
    	 fw.write("My name is datta");
    	 
    	 fw.write(100);		//add unicod evalue i.e D
    	 fw.flush();
    	 fw.close();
    	 
    	  fr=new FileReader("D:\\a.tx");
    	  
    	  FileWriter fw2=new FileWriter("D:\\d.txt");
    	  
    	  while(fr!=null){fr.read();}
    			  
         in = new FileInputStream("D:\\a.txt");
         out = new FileOutputStream("D:\\b.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
            
            System.out.println("done!!!");
         }
      }
   }
}