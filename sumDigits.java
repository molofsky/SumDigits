/** Recursive function to compute the sum of digits for
* any given number. 
*
*@author Adrian Molofsky
*@version 12/26/22
*/


import java.util.Scanner;
class sumDigits
{
    sumDigits()          // default constructor
    {
    }
    /** The purpose of this method is to use recursive calls to return the rightmost digit of
    * a number, i.e. by taking the mod of that number and if the mod of the number. Returns
    * the number if that number is a single digit.
    *
    */
    
    public int sum(int n) {
       if (n % 10 == n) return n;
  
    return n % 10 + sumDigits(n/10);
  }

     
    
}

//tester class of the sumDigits and getting the user's input on n.
public class digitsTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        sumDigits rMethods = new sumDigits();

        System.out.print("What n do you want to compute the sum of digits? ");
        int nNumber = input.nextInt();
        if (nNumber < 0)
        {
            System.out.println("Invalid n entered.");
            return;
        }

        // Call sum with an n value
        System.out.println("The sum of digits for the number n = " + nNumber + ": " + rMethods.sum(nNumber));
        System.out.println();

    }
