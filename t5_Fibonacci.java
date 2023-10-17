package com.day03_递归.ditui;
/**
 * fib：斐波那契数列的第n项
 * 找重复：n为fib(n-1)和fib(n-2)的和
 * 找变化：n-1和n-2
 * 找边界：n=1和n=2时，其值都为1；
 *
 * 斐波那契数列：1，1，2，3，5，8，13
 */
public class t5_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
        
    }
    static int fib(int n)
    {
        if(n==1|n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }

}
