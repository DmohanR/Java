import java.util.*;
class Arraysnake
{
	public static void main(String[] args) 
	{
	int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	for (int i=0;i<5 ;i++ )
	{
	   for (int j=0;j<5 ;j++ ) 
	   {
	   	if(i%2==0)
	   	{
	   		System.out.print(a[i][j]+" ");
	   	}
	   	else
	   	{
	   		a[i]=ArrayReverse(a[i]);
	   		System.out.print(a[i][j]+" ");
	   	}
	   	
	   }System.out.println("");
     }
		
  }
	public static int[] ArrayReverse(int []m)
	{
	 int i=0,j=m.length-1,temp;
	 while (i<=j)
	 {
		temp=m[i];
		m[i]=m[j];
		m[j]=temp;
		i++;
		j--;
	 }
	 return m;
	}
}