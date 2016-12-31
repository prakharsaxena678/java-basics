class Test5 
{
	public static void main(String[] args) 
	{
		//String to stringbuffer
		String str = "ratan";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	
	   //StringBuffer to String
	   StringBuffer sb1 = new StringBuffer("durga");
       String ss = sb1.toString();
	   System.out.println(ss);
	}
}
