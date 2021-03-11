package mains;

public class CompareLexicographically {

	public static void main(String[] args) 
	
	{

	String s1= "abdul is my name".toLowerCase();
	String s2 = "ahat is your name".toLowerCase();
	
	//System.out.println(s1+" "+s2);
	
	
	
	char ab [] =s1.toCharArray();
	char ab2 [] = s2.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		if(ab[i]==ab2[i])
		{
			System.out.println("checked");
		}
		else {
			int h1 = ab[i];
			int h2=ab2[i];
			
			System.out.println(h2-h1);
			break;
		}
		
		
	}
	System.out.println("Default method= "+s2.compareToIgnoreCase(s1));
	
	
	}

}
