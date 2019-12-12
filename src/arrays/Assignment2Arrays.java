/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author k00245120
 */
public class Assignment2Arrays
{

    public static void main(String[] args)
    {

        int[] numberArray1 = new int[5];

        Question6PrintArrayInColumnsOf5(numberArray1);
        for (int i : numberArray1)
        {
            System.out.print(i + ",");
        }
        System.out.println();

        Question4EvenOddSum(numberArray1);

        Question6PrintArrayInColumnsOf5(numberArray1);
    }
    final static int rowColumns = 5;

    private static int Question6PrintArrayInColumnsOf5_Row(int[] numberArray, int index)
    {
        for (int columnNumber = 0; index < numberArray.length && columnNumber < rowColumns; columnNumber++, index++)
        {
            System.out.print(numberArray[index] + "\t");

        }
        return index;
    }

    private static void Question6PrintArrayInColumnsOf5(int[] numberArray)
    {

        for (int index = 0; index < numberArray.length;)
        {
            index += Question6PrintArrayInColumnsOf5_Row(numberArray, index);
            System.out.println();
        }
    }

    private static void Question4EvenOddSum(int[] numberArray)
    {
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        for (int index = 0; index < numberArray.length; index++)
        {
            if (index % 2 == 0)//is even
            {
                sumOfEvenNumbers += numberArray[index];
            } else//is odd
            {
                sumOfOddNumbers += numberArray[index];//
            }
        }
        System.out.println("Sum of even numbers:" + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers:" + sumOfOddNumbers);
    }

    public static int generateRandomIntIntRange(int index, int min, int max)
    {
        Random r = new Random();

        if (index % 2 == 0)//is even
        {
            return ((r.nextInt((max - min) + 1) + min) / 2) * 2;
        } else//is odd
        {
            return ((r.nextInt((max - min) + 1) + min) / 2) * 2;

        }

    }

}
