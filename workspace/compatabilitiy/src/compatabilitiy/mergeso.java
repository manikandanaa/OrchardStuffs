package compatabilitiy;

public class mergeso 
{
public static void main(String args[])
{
	String[] one={"aishu","mani","harsha"};
	String[] two={"divya","sind"};
	String[] names=new String[one.length + two.length];
	mergeSort(one);
	mergeSort(two);
	merge(names,one,two);
	mergeSort(names);
	for(String c:names)
	{
		System.out.println(c);
	}
}
public static void mergeSort(String[] names)
{
	if(names.length>2)
	{
		String[] left=new String [names.length/2];
		String[] right=new String[names.length-names.length/2];
		for(int i=0;i<left.length;i++)
		{
			left[i]=names[i];
		}
		for(int i=0;i<right.length;i++)
		{
			right[i]=names[i+names.length/2];
		}
		mergeSort(left);
		mergeSort(right);
		merge(names,left,right);
	}
}
public static void merge(String[] names,String[] left,String[] right)
{
	int a=0,b=0;
	for(int i=0;i<names.length;i++)
	{
		if(b>=right.length ||( a<left.length && left[a].compareToIgnoreCase(right[b])<0))
		{
			names[i]=left[a];
			a++;
		}
		else
		{
			names[i]=right[b];
			b++;
		}
	}
}
}
