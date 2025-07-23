package Alphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        do {
            AllAlphabets Alphabet = new AllAlphabets();
            System.out.println("enter the alphabet(A,B,C,D,.....) u want to create:");
            String alphabet = sc.nextLine().toUpperCase().trim();
            if (!(alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0)))) {
                System.out.println("Please enter a single alphabet character:");
            }
            System.out.println("enter alphabet size:");
            int size = sc.nextInt();
            switch (alphabet) {
                case "A":
                    Alphabet.A(size);
                    break;
                case "B":
                    Alphabet.B(size);
                    break;
                default:
                    break;
            }
            System.out.println("do u want to continue making alphabets(yes/no):");
            ans = sc.nextLine().toLowerCase().trim();
        } while (ans.equals("yes"));
        sc.close();
    }
}
