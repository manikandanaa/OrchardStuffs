import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Prime 
{
	  public static void main(String args[])
	    {
	        int i,k,j;
	        for(i=1;i<1000;i++)
	        {
	            k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	                }
	            }
	            if(k==0)
	            {
	                System.out.println(i);
	            }
	        }
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        list.add(i);
	        Iterator itr = list.iterator();
			while (itr.hasNext()) 
			{
				System.out.println(itr.next());
			}
	    }
	}

