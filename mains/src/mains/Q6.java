package mains;

public class Q6 {

	public static void main(String[] args)
	{
		String s1= "abdul is mssmy z name";
		String s2 = "z";
		
		
		int counter1=0;
		
		for(int i =0;i<s1.length();i++)
		{
			//for(int j=0;j<s1.length();j++)
			//{
				boolean is =s1.regionMatches(i, s2, 0, s2.length());
				//System.out.println(is);
				
				if(is==true) {
					counter1++;
				}
			//}
		}
		if(counter1>0) 
		{
			System.out.println(true);
		}else
			System.out.println(false);
	
		//System.out.println(s1.contains(s2));
	}
}
