package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Line Points");
        System.out.println("Enter a Point x1");
        int x1= sc.nextInt();
        System.out.println("Enter a Point y1");
        int y1= sc.nextInt();
        System.out.println("Enter a Point x2");
        int x2= sc.nextInt();
        System.out.println("Enter a Point y2");
        int y2= sc.nextInt();

        Double length1=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("Length of 1st Line is "+length1);

        System.out.println("Enter Second Line Points");
        System.out.println("Enter a Point x3");
        int x3= sc.nextInt();
        System.out.println("Enter a Point y3");
        int y3= sc.nextInt();
        System.out.println("Enter a Point x4");
        int x4= sc.nextInt();
        System.out.println("Enter a Point y4");
        int y4= sc.nextInt();

        Double length2=Math.sqrt((Math.pow((x4-x3),2))+(Math.pow((y4-y3),2)));
        System.out.println("Length of 2nd Line is "+length2);

        boolean result=length2.equals(length1);
        if(result==true){
            System.out.println("Lines are Equal !");
        }
         else {
            System.out.println("Lines are Not Equal!");
        }
    }
}
