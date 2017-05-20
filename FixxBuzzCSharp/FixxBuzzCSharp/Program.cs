using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FixxBuzzCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            // the for loop do manage the denominator decisions
            for(int num = 1; num <= 100; num++)
            {
                if (num % 5 == 0 && num % 3 == 0)
                {
                    Console.WriteLine("FizzBuzz");
                }
                else if (num % 3 == 0)
                {
                    Console.WriteLine("Fizz");
                }
                else if (num % 5 == 0)
                {
                    Console.WriteLine("Buzz");
                }
                else
                {
                    Console.WriteLine(num);
                }
            }
            Console.ReadLine();
        }
    }
}
