using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace swapping
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1, n2, temp;
            Console.WriteLine("enter the 1st number:");
            n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("enter the 2nd number:");
            n2 = Convert.ToInt32(Console.ReadLine());
            temp = n1;
            n1 = n2;
            n2 = temp;
            Console.WriteLine("after swapping");
            Console.WriteLine("\nFirst Number : " + n1);
            Console.WriteLine("\nSecond Number : " + n2);
            Console.Read();
        }
    }
}
