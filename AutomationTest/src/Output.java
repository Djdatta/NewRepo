import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * Java program to take input file containing some contacts numbers --> second file for backlisted numbers(those we have to delete)
 * And the we have to send message for the remaining contacts.
 * */

public class Output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		PrintWriter pw=new PrintWriter("D:\\file\\output.txt");
		
		File file=new File("D:\\file\\input.txt");
		
		BufferedReader br= new BufferedReader(new FileReader(file));
		
		String line=br.readLine();
		
		while(line!=null){
			
			Boolean available=false;
			
			BufferedReader br1=new BufferedReader(new FileReader("D:\\file\\delete.txt"));
			
			String target=br1.readLine();
			
			while(target!=null){
				
				if(line.equals(target)){
					
					available=true;
					break;
				}
				target=br1.readLine();
			}
			if(available==false){
				pw.println(line);
			}
			line=br.readLine();		
		}
		
		pw.flush();
		System.out.println("Operation done!!!!");
		
	}

}
