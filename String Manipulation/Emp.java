class Emp 
{
	int eid;
	String ename;
	Emp(int eid, String ename)
	{  this.eid=eid;
	   this.ename=ename;
	}
	//overriding toString()
	public String toString()
	{
	    return "emp id="+eid+"   emp name="+ename;
	}
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111,"ratan");
		System.out.println(e1);
		System.out.println(e1.toString());

	}
}
