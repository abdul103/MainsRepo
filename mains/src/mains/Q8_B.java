package mains;

public class Q8_B {

	public static void main(String[] args) {
		
		int given = 145;
		
		String Sgiven = Integer.toString(given);
		int contain = 4;
		String Scontain = Integer.toString(contain);
		
		//System.out.println(Sgiven.equals(Scontain));
		
		for(int i=given ;i>0;i--)
		{
			String num = Integer.toString(i-1);
			if(num.contains(Scontain)) {
				
			}else
			{
				System.out.println(num);
				break;
			}
				
			//System.out.println(i);
			
			
		}
		
	}
}
