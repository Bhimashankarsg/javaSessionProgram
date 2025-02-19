package practice;

public class sentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi this is java";

		String[] a = s1.split(" ");
		String rev = "";
		String ch="";
		for (int i = a.length-1; i >=0 ; i--) {
			//System.out.print(a[i]);
			
			for(int j=a[i].length()-1;j>=0;j--)
			{
				ch=ch+a[i].charAt(j);
			}
			
			//System.out.print(" ");
			//rev = rev + ch+" ";
		//	System.out.println("==>"+a[i]);
			
				
			
			
		}

		System.out.println(ch);
	}

}
