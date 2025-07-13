import java.util.Scanner;

public class TABLE {
    public static void multi(int num) {
        if (num >= 1 && num <= 100) {
            System.out.println("-------------------");
            for (int i = 1; i <= 10; i++) {
                if (num < 10 && i < 10 && num * i < 10) {
                    System.out.println("| " + num + "   X " + i + "  | " + num * i + "    |");
                    System.out.println("-------------------");
                } else if (num < 10 && i < 10 && num * i < 100) {
                    System.out.println("| " + num + "   X " + i + "  | " + num * i + "   |");
                    System.out.println("-------------------");
                } else if (num < 10 && i == 10 && num * i < 100) {
                    System.out.println("| " + num + "   X " + i + " | " + num * i + "   |");
                    System.out.println("-------------------");
                } else if (num == 10 && i < 10 && num * i < 100) {
                    System.out.println("| " + num + "  X " + i + "  | " + num * i + "   |");
                    System.out.println("-------------------");
                } else if (num == 10 && i == 10 && num * i == 100) {
                    System.out.println("| " + num + "  X " + i + " | " + num * i + "  |");
                    System.out.println("-------------------");
                } else if (num < 100 && i < 10 && num * i < 100) {
                    System.out.println("| " + num + "  X " + i + "  | " + num * i + "   |");
                    System.out.println("-------------------");
                } else if (num < 100 && i < 10 && num * i < 1000) {
                    System.out.println("| " + num + "  X " + i + "  | " + num * i + "  |");
                    System.out.println("-------------------");
                } else if (num < 100 && i == 10 && num * i < 1000) {
                    System.out.println("| " + num + "  X " + i + " | " + num * i + "  |");
                    System.out.println("-------------------");
                } else if (num == 100 && i < 10 && num * i < 1000) {
                    System.out.println("| " + num + " X " + i + "  | " + num * i + "  |");
                    System.out.println("-------------------");
                } else if (num == 100 && i == 10 && num * i == 1000) {
                    System.out.println("| " + num + " X " + i + " | " + num * i + " |");
                    System.out.println("-------------------");
                }
            }
        } else {
            System.out.println("not a vailed number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans;
        do {
            System.out.println("enter the number between 1 to 100:");
            int num = scanner.nextInt();
            scanner.nextLine();
            multi(num);
            System.out.println("do you want to keep going:(yes/no)");
            ans = scanner.nextLine().trim().toLowerCase();
        } while (ans.equals("yes"));
        System.out.println("system is closed....");
        scanner.close();
    }
}