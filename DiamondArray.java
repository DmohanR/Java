import java.util.*;
class DiamondArray
{
	public static void main(String[] args) {
		int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<5 ;j++)
		    {
		    	System.out.print(a[i][j]);
		    	if(i%2==0)
		    	{ 
		    		System.out.print(a[i][j]);
		    		int k=i+2;
		    		if(k<j)
		    		{	
		    			System.out.println(a[i][k]);
		    		}
		    	 	
		    	}
		    	
			}
			
	  	}
	}
}
 
	
