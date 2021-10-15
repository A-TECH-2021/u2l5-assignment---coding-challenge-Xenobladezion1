package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the latitude of the starting location:");
        double Slati = scan.nextDouble();
        System.out.println("Enter the longitude of the starting location:");
        double Slong = scan.nextDouble();
        System.out.println("Enter the latitude of the ending location:");
        double Elati = scan.nextDouble();
        System.out.println("Enter the longitude of the ending location:");
        double Elong = scan.nextDouble();

        GeoLocation first = new GeoLocation(Slati,Slong);
        GeoLocation second = new GeoLocation(Elati,Elong);

        double distance = first.distanceFrom(second);
        System.out.println("The distance is " + distance + " miles.");

    }
}
