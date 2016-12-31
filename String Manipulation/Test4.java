class Test4 
{
	Test4(String str)
	{
	}
	public static void main(String[] args) 
	{
		Test4 t1 = new Test4("anu");
		Test4 t2 = new Test4("anu");
		System.out.println(t1.equals(t2));
		String s1 = "ratan";
		String s2 = "ratan";
		System.out.println(s1.equals(s2));

		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb1.equals(sb2));
    }
}
