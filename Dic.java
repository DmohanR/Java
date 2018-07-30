import java.util.*;
class Dic
{
	public static void main(String[] args) {
		int a[]=new int[256];
		String s="abac";
		for (int i=0;i<s.length();i++)
		{
			for(int j=0;j<256;j++)
			{
			if ((int)s.charAt(i)==j){
				a[j]++;
			}
		}
	}
		//for (int i=0;i<s.length();i++ ) {


	String answer="";
	//System.out.println(answer);
		   //System.out.print("{");
		   for (int j=0;j<256;j++) {
			if(a[j]!=0)
			{
				if(answer.equals(""))
				{
					answer=answer+"{"+(char)j+"="+a[j];

				}
				else
				{
				   answer=answer+","+(char)j+"="+a[j];	
				}
				

			}	

		}
		answer=answer+"}";

		System.out.println(answer);

	}
}