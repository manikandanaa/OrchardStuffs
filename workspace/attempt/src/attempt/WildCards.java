package attempt;

import java.util.ArrayList;
import java.util.List;

public class WildCards
{

		public static void main(String[] args) 
		{
			List<Integer> i = new ArrayList<>();
			i.add(3); 
			i.add(5); 
			i.add(10);
		    int sum=sum(i);
			System.out.println("Sum"+sum);
		}

		public static int sum(List<? extends Number>list)
		{
			int sum = 0;
			for(Number n : list){
				sum += n.intValue();
			}
			return sum;
		}
	}
