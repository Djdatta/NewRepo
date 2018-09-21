import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class LstTry {

	
	public static void main(String[] args) throws Exception{
		
		File file=new File("D:\\a.txt");
		PrintWriter pw=new PrintWriter("D:\\b.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line=br.readLine();
		while(line!=null){
			
			pw.write(line);
			br.readLine();
		}
		
		pw.close();
		br.close();
	}
	
}
