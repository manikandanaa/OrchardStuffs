using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace odd_number_program
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, n;
            Console.WriteLine("enter the value of n:");
            n = Convert.ToInt32(Console.ReadLine());
            for(i=0;i<n;i++)
            {
                if(i%2==1)
                {
                    Console.WriteLine("result:" + i);
                }
                else
                {
                    continue;
                }
                
            }
            Console.ReadLine();
        }

    }
}
