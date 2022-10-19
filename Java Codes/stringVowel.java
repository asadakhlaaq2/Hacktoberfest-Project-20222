import java.util.Scanner;

public class stringVowel {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String n=sc.next();
		
		int mincost=0;
		int fora=0;
		int fore=0;
		int fori=0;
				int foro=0;
		int foru=0;
		
		
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			
			 fora+=Math.abs(ch-'a');
			 fore+=Math.abs(ch-'e');
			 fori+=Math.abs(ch-'i');
			 foro+=Math.abs(ch-'o');
			 foru+=Math.abs(ch-'u');
		}
		mincost=Math.min(Math.min(fora, fore),Math.min(fori, foro));
		mincost=Math.min(foru, mincost);
		System.out.println(mincost);
		
		
		sc.close();
	}

}
