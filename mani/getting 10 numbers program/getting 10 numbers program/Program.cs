using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace getting_10_numbers_program
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n;
            Console.WriteLine("enter the first number");
            n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the second number");
            n2 = Convert.ToInt32(Console.ReadLine()); 
            Console.WriteLine("enter the third number");
            n3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the fourth number");
            n4 = Convert.ToInt32(Console.ReadLine()); 
            Console.WriteLine("enter the fiveth number");
            n5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the sixth number");
            n6 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the seventh number");
            n7 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the eighth number");
            n8 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the nineth number");
            n9 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the tenth number");
            n10 = Convert.ToInt32(Console.ReadLine());
            n = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
            Console.WriteLine("average:" + n);
            Console.ReadLine();
        }
    }
}
