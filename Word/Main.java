package Word;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        do {
            Alphabets Alphabet = new Alphabets();
            System.out.println("enter any word:");
            String word = sc.nextLine().toUpperCase().trim();
            char[] charArray = word.toCharArray();
             System.out.println("enter size:");
            int size = sc.nextInt();
            sc.nextLine();
            for (char c : charArray) {
                switch (c) {
                case 'A':
                    Alphabet.A(size);
                    break;
                case 'B':
                    Alphabet.B(size);
                    break;
                case 'C':
                    Alphabet.C(size);
                    break;
                case 'D':
                    Alphabet.D(size);
                    break;
                case 'E':
                    Alphabet.E(size);
                    break;
                case 'F':
                    Alphabet.F(size);
                    break;
                case 'G':
                    Alphabet.G(size);
                    break;
                case 'H':
                    Alphabet.H(size);
                    break;
                case 'I':
                    Alphabet.I(size);
                    break;
                case 'J':
                    Alphabet.J(size);
                    break;
                case 'K':
                    Alphabet.K(size);
                    break;
                case 'L':
                    Alphabet.L(size);
                    break;
                case 'M':
                    Alphabet.M(size);
                    break;
                case 'N':
                    Alphabet.N(size);
                    break;
                case 'O':
                    Alphabet.O(size);
                    break;
                case 'P':
                    Alphabet.P(size);
                    break;
                case 'Q':
                    Alphabet.Q(size);
                    break;
                case 'R':
                    Alphabet.R(size);
                    break;
                case 'S':
                    Alphabet.S(size);
                    break;
                case 'T':
                    Alphabet.T(size);
                    break;
                case 'U':
                    Alphabet.U(size);
                    break;
                case 'V':
                    Alphabet.V(size);
                    break;
                case 'W':
                    Alphabet.W(size);
                    break;
                case 'X':
                    Alphabet.X(size);
                    break;
                case 'Y':
                    Alphabet.Y(size);
                    break;
                case 'Z':
                    Alphabet.Z(size);
                    break;
                default:
                    System.out.println("Pattern not available for this letter yet.");
                    break;
            }
            System.out.println();
            }
           

        System.out.println("do u want to continue(yes/no):");
            ans = sc.nextLine().toLowerCase();
        } while (ans.equals("yes"));
        sc.close();
    } 
} 