package JunitTesting;


import java.util.Scanner;

public class CountDigits {


    public int count(int num) // Count No. of digits in a Number
    {
        int count = 0;
        while (num != 0) {
            num = num/10;
            ++count;
        }
        return count;
    }
    public boolean isOdd(int num)  // Check if No. of digits in a Number is Odd or Not
    {
        boolean isOdd=false;
        CountDigits vc=new CountDigits();
        int c=vc.count(num);
        if(c % 2 != 0)
        {
            isOdd=true;
        }
        return isOdd;
    }
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            CountDigits vc=new CountDigits();
            vc.count(n);
        }
    }

