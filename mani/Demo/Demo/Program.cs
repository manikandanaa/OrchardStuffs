using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hai");
            int n1, n2, n3;
            Console.WriteLine("Enter 1st number:");
            n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter 2nd number:");
            n2 = Convert.ToInt32(Console.ReadLine());
            n3 = n1 + n2;
            Console.WriteLine("RESULT :" + n3);
            Console.ReadLine();
        }
    }
}
