package attempt;

public class GenicClass<T>
{
		   private T t;

		   public void add(T t) 
		   {
		      this.t = t;
		   }

		   public T get() 
		   {
		      return t;
		   }

		   public static void main(String[] args) 
		   {
			   GenicClass<Integer> integer = new GenicClass<Integer>();
			   GenicClass<String> string = new GenicClass<String>();
		    
		      integer.add(new Integer(10));
		      string.add(new String("Hello World"));

		      System.out.printf("Integer Value :%d\n\n", integer.get());
		      System.out.printf("String Value :%s\n", string.get());
		   }
}
