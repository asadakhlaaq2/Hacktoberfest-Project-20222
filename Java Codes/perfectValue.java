public class perfectValue {
static int flag=0;
	public static void main(String[] args) {
		String h="amile";
		String w="emile";
		String b="mike";
		String s= h+w;
		StringBuilder str=new StringBuilder(s);
permutation(str,0,b);
if(flag==1)
{
	System.out.println("yes");
}
else System.out.println("No");
	}
	
static void permutation(StringBuilder s,int index ,String c)
{
if(index>=s.length())
{
	String cs="";
	for(int i=0;i<s.length();i++)
	{
		cs=cs+s.charAt(i);

	}
	
	if(cs.contains(c))
	{
		flag=1;
		return ;
	}
}
	for(int i=index;i<s.length();i++)
	{
		swap(s,i,index);
		permutation(s,index+1,c);
		swap(s,i,index);
	}
	
	
	
}
static void swap(StringBuilder s,int i,int j) {
	char c=s.charAt(i);
    s.setCharAt(i,s.charAt(j) );
    s.setCharAt(j,c );
}
}
