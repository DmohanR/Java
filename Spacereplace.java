import java.util.*;
class Spacereplace
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		int flag=0;
		for (int i=0;i<s.length() ;i++ )
		{
			if((int)s.charAt(i)==32)
			{
				flag=1;
			}
			else
			{
				if(flag==1)
				{
					if(res.length()==0)
					{
						res=res+s.charAt(i);
						flag=0;
					}
					else 
					{
						res=res+"%20"+s.charAt(i);
						flag=0;
					}
				}
				else 
				{
					res=res+s.charAt(i);
				}

			}	
		}
		System.out.println(res);

		// 	if(s.charAt(0)==32 || s.charAt(s.length()-1)==32)
		// 	{
		// 		if (i!=0&& i!=s.length()-1 && (int)s.charAt(i)==32) 
		// 		{
		// 		 res=res+"%20";
		// 		}
		// 	   else
		// 	   {
		// 		res=res+s.charAt(i);
		// 	   }
		// 	}
		// 	else
		// 	{
		// 	 if ((int)s.charAt(i)==32) 
		// 	 {
		// 		res=res+"%20";
		// 	 }
		// 	 else
		// 	 {
		// 		res=res+s.charAt(i);
		// 	 }
		// 	}
		// 	//System.out.println(i);
		// }
		// System.out.println(res);
	}
}