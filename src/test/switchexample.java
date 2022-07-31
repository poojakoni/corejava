package test;

public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World AND ";
		int count =0;

		
		for(int i=0;i<str.length(); i++) {
char ch = str.charAt(i);
			
			switch(ch) {
							case 'a':case 'e':case 'i':	case 'o':case 'u': case 'A':case 'E':case 'I': case 'O':case'U':
								count++;
					break;

			
		}}
		System.out.println("Total vowels are " + count);


	}

}
