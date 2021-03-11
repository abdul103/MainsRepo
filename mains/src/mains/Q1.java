package mains;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {

		int[] array1 = { 1,3,4 };

		int[] array2 = {45,2,3,5,6,2,89};
		
		int size1 = array1.length;
		int size2 = array2.length;
		
		int big =0;
		int small= 0;
		
		if(size1>size2)
		{big=size1;
		small =size2;
		} else {big=size2;
		small=size1;
		}
		
				int j=0;
		for(int i=0;i<big;)
		{
			if(array2[i]==array1[j])
			{
				System.out.println(array1[i]);
			}
			
			j++;
			
			if(j==small-1)
			{
				i++;
				j=0;
			}
			
		}

		
		
		
//		for(int i=0;i<array1.length;i++)
//		{
//			for(int j=0;j<array2.length;j++)
//			{
//				if(array1[i]==array2[j]) {
//					System.out.println(array2[j]);
//				}
//			}
//			
//		}
		
		
//		for (int i = 0; i < array2.length; i++) {
//			
//			int a = Arrays.binarySearch(array1, array2[i]);
//			if (a > 0) {
//				//System.out.println(a);
//				
//				System.out.println(array1[a]);
//			}
//		}
	}
}
