import java.util.*;
class Arrayinnerelmtswap
{
	public static void main(String[] args) 
	{
	int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	for (int i=0;i<5 ;i++ )
	{
	   for (int j=0;j<5 ;j++ ) 
	   {
	   	if(i==0 ||i==4 )	
		{
			System.out.print(a[i][j]+" ");
		}

		else if(i==1 ||i==2||i==3)
		{
			//System.out.println("");
			a[i]=Arrayswap(a[i]);
			if(j==2)
			{
			  System.out.print("* ");
			}
			else{
			 System.out.print(a[i][j]+" ");
			}
			
		}	
	   }
	   System.out.println("");	
	}
  }

	public static int[] Arrayswap(int[] a)
	{
		int i=1,j=3;
		
		while (i<j) 
		{
	     int temp;
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i++;
		 j--;
        }
       return a;
	}
} 
