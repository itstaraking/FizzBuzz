/** this program uses a for loop to determine if numbers are divisible by 3 or 5
 * and identifies the number accordingly.
 */

package com.company;

public class Main {

    public static void main(String[] args) {
	// call fizzbuzz method
        FizzBuzz();
    }

    /**
     * The FizzBuzz method displays 'fizz' or 'buzz'
     * if number between 1-100 is divisible by 3, 5, or both
     */
    public static void FizzBuzz()
    {
        int maxValue = 100; // variable to hold the max value
        for(int num = 1; num <=100; num++)
        {
            // variables that hold denominators
            int div3 = num % 3;
            int div5 = num % 5;

            // if decision for num
            if(div5 == 0 && div3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (div3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(div5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(num);
            }
        }
    }
}
