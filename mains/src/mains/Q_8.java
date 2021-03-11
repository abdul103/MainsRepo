package mains;

public class Q_8 {

	public static void main(String[] args) {

		int Given = 145;
		int noContain = 4;

		int largestNumber = 0;

		
		for(int i=Given;i>0;i--)
		{
			String s= Integer.toString(i);
			int size = s.length();
			
			
			for (int j = 0; j < size; j++) {
				
				int given = i;
				int k =0;
				int check = given % 10;
				if(check==noContain) 
				{
				k++;
				}
				else {
					
				}
				
				Given = Given / 10;
			}
			
			
			System.out.println(i);
		}
		
		
		int numSize= 4;
		//System.out.println(numSize);
		

	}

}
