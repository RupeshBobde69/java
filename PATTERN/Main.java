package PATTERN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        do{
        System.out.println("enter any pattern(squre,rectrangle,triangle,inverted triangle,hourglass):");
        String pattern = sc.nextLine().toLowerCase();
        int size;
        AllPatterns Pattern = new AllPatterns();
        switch (pattern) {
            case "square":
                System.out.println("enter size:");
                size = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                Pattern.Square(size);
                break;
            case "rectangle":
                System.out.println("enter height:");
                int height = sc.nextInt();
                System.out.println("enter width:");
                int width = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                Pattern.Rectangle(height,width);
                break;
            case "triangle":
                System.out.println("enter size:");
                size = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                Pattern.Triangle(size,0);
                break;
            case "inverted triangle":
                System.out.println("enter size:");
                size = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                Pattern.InvertedTriangle(size);
                break;
            case "hourglass":
                System.out.println("enter size:");
                size = sc.nextInt();
                sc.nextLine(); // consume leftover newline
                Pattern.Hourglass(size);
                break;
            default:
                System.err.println("shape not available or spelling is incorrect.");
                break;
        }
        System.out.print("want to make more patterns (yes/no):");
        ans = sc.nextLine().toLowerCase();
    }while (ans.equals("yes"));
    sc.close(); 
    }
}
