public class Stack<T>
{
  private T[] a = null;
  private int index = -1;
  public Stack(T[] a)
  {
	  this.a = a;
  }
  private boolean isEmpty()
  {
	  return index == -1;
  }
  private boolean isFull()
  {
	 return index == 9;
  }
  public void push(T element) throws Exception
  {
	if(isFull())
		throw new Exception("Stack is full");
	else
		a[++index] = element;
  }
  public T pop() throws Exception
  {
	  if(isEmpty())
		  throw new Exception("Stack is Empty");
	  else
		  return a[index--];
  }
}
