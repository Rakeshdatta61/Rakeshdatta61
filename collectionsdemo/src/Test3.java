import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Test3 {

	public static void main(String[] args) 
	{
	   TreeSet<> set = new TreeSet<>(new EmployeeEmpidComparator());
	   set.add(new Employee(104,"Chandhu",1000));
	   set.add();
	   set.add(49);
	   set.add(79);
	   set.add(84);
	   
	   for(int s : set)
		   System.out.println(s);
	   
	   Iterator<Integer> itr = set.iterator();
	   while(itr.hasNext())
		   System.out.println(itr.next());
	}

}
