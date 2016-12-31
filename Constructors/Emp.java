class Emp 
{
	int eid;
	String ename;
	float esal;

    Emp(int eid, String ename, float esal) //Local variables
	{ // conversion of local values to instance values
	  this.eid = eid;
	  this.ename = ename;
	  this.esal = esal;
	}
	void disp()
	{
		System.out.println("emp id="+eid);
		System.out.println("emp name="+ename);
		System.out.println("emp sal="+esal);
}
    public static void main(String[] args)
	{
	   Emp e1 = new Emp(111, "abc", 10000);
	   e1.disp();
	   Emp e2 = new Emp(222, "def", 20000);
	   e2.disp();


     }
}



