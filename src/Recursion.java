//Programmer: Sofia Lacki
//Class: CS145
//Professor: Darrell Criss
//Purpose: Practice reading and applying recursive methods using Pascal's Triangle
//  and other exercises.

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) throws Exception {
        
        //Test out the exercises 1 and 2 from Lab 6
        FixedMethods fixed = new FixedMethods();
        System.out.println(fixed.mystery(4, 5));
        
        System.out.println(fixed.sum(4));

        //Implement the Pascal's Triangle program
        PascalsTriangle triangle = new PascalsTriangle();
        Scanner input = new Scanner(System.in);
        int[] start = {1};

        System.out.println("How many rows of Pascal's Triangle would you like to see?");
        System.out.println("Please give a number greater than 0. ");
        int rows = input.nextInt();
        triangle.pascal(rows, 1, start);
    }
}
