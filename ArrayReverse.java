import java.util.*;
class ArrayReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base array size");
		int a=sc.nextInt();
		int []m=new int[a];
		//int [][]mT=new int[b][a];
		for (int i=0;i<a ;i++ )
		{
			m[i]=sc.nextInt();
		}
	System.out.println(Arrays.toString(m));
	int i=0,j=a-1,temp;
	while (i<=j)
	{
		temp=m[i];
		m[i]=m[j];
		m[j]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(m));
	}
	
}