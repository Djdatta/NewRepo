import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SeparateLine {

	
	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(new File("D:\\output.txt"));
		ArrayList<String> names = new ArrayList();

		// Skip column headings.

		// Read each line, ensuring correct format.
		while (s.hasNext())
		{
		    s.nextInt();         // read and skip 'id'
		    names.add(s.next()); // read and store 'name'
		    s.nextInt();         // read and skip 'age'
		}

		for (String name: names)
		{
		    System.out.println(name);
		}
		
		
	}
}
