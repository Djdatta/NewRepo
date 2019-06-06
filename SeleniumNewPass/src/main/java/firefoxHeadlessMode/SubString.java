package firefoxHeadlessMode;

public class SubString {

	public static void main(String[] args) {
		System.out.println("hello");
		String s="sjdaj|hello";
		String s2="";
		
		for (int i = 0; i < s.length(); i++) {
			
			s2=s2+s.charAt(i);
			if (s.charAt(i)=='|') {
				System.out.println(s2);
				break;
			}
		}
		System.out.println(s2);
	
		if (s2.charAt(s2.length()-1)=='|'){
	        s2 = s2.replace(s2.substring(s2.length()-1), "");
		}
		System.out.println(s2);
	}
}
