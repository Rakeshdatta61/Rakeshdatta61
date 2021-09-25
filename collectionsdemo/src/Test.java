public class Test 
{
	public static void main(String[] args) throws Exception
	{
      Stack<Integer> s1 = new Stack<Integer>(new Integer[10]);
      for(int i=1;i<=10;i++)
    	  s1.push(i);
      for(int i=1;i<=10;i++)
    	  System.out.println(s1.pop());
      
      Stack<String> s2 = new Stack<String>(new String[10]);
      for(int i=1;i<=10;i++)
    	  s2.push("Welcome "+i);
      for(int i=1;i<=10;i++)
    	  System.out.println(s2.pop());
      
      Stack<Double> s3 = new Stack<Double>(new Double[10]);
      for(int i=1;i<=10;i++)
    	  s3.push(i*2.5);
      for(int i=1;i<=10;i++)
    	  System.out.println(s3.pop());
	}
}
