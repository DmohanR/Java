class Calculator
{
	static String name_ofthe_Calculator;
	static String name_ofthe_user;
	Calculator(String string,String string2)
	{
     this.name_ofthe_Calculator=string;
	 if(this.name_ofthe_Calculator.equals("CASIO"))
	 {
	 this.name_ofthe_user=string2;
	 //System.out.println(this.name);
	 }
	 else
	 {
	 System.out.println("name should be CASIO:"+this.name_ofthe_Calculator);	
	 }
	}
	public int addition(int a,int b)
	{
		int addition=a+b;
		return addition;
	}
	public int substraction(int a,int b)
	{
		int substraction=a-b;
		return substraction;
	}
	public int multiplication(int a,int b)
	{
		int multiplication=a*b;
		return multiplication;
	}

	// 
	public float division(float a,float b)
	{
		float division=a/b;
		return division;
	}
    //


	public boolean iseven(int a)
	{
     if (a%2==0)
     {
     	return true;
     }
     else
     {
     	return false;
     }
	}
	public boolean isodd(int a)
	{
	 if(a%2==0)
     {
     	return false;
     }
     else
     {
     	return true;
     }

	}
	public static void main(String[] args)
	{
	 //Calculator c=new Calculator("CASIO","mas");
	// System.out.println(c.name_ofthe_user);
	 //System.out.println(c.division(5,0));

	 Calculator cs=new Calculator("CASIO","sharan");
	 cs.name_ofthe_Calculator="AMRUTH";
	 System.out.println(cs.name_ofthe_Calculator);
	 //System.out.println(c.name_ofthe_Calculator);
     Calculator c=new Calculator("CASIO","SHARAN");
		System.out.println(c.addition(5,2));
		System.out.println(c.substraction(10,2));
		System.out.println(c.iseven(3));
		System.out.println(c.division(5,2));
		System.out.println(c.name_ofthe_Calculator);
		System.out.println(c.name_ofthe_user);
	    Calculator cc=new Calculator("CASIO","SHARAN");
	    System.out.println(cc.name_ofthe_Calculator="getout");
	    System.out.println(c.name_ofthe_Calculator);
	} 
}