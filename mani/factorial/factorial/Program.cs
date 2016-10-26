using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            int num, fact, i;
            Console.WriteLine("enter the num:");
            num = Convert.ToInt32(Console.ReadLine());
            fact = num;
            for (i = num - 1; i >= 1; i--)
            {
                fact = fact * i;
            }
            Console.WriteLine("result is:" + fact);
            Console.ReadLine();
        }
    }
}
