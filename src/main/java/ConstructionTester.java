package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double taxRate = scan.nextDouble();
        System.out.println("How many boards do you need?");
        int numBoards = scan.nextInt();
        System.out.println("How many windows do you need?");
        int numWindows = scan.nextInt();


        Construction construct = new Construction(8, 11, taxRate);
        double total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);
        System.out.println("Total:" + total);
        double Gtotal = construct.grandTotal(total);
        System.out.println("Grand Total:" + Gtotal);





    }
}
