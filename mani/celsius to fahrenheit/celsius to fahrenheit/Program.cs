using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace celsius_to_fahrenheit
{
    class Program
    {
        static void Main(string[] args)
        {
            double answer;
            Console.WriteLine("{0}={1}", 37,
            answer = ConvertTemp.ConvertCelsiusToFahrenheit(37));
            Console.ReadLine();
        }
        static class ConvertTemp
        {
            public static double ConvertCelsiusToFahrenheit(double c)
            {
                return ((9 / 5) * c) + 32;
            }
        }
    }
}
