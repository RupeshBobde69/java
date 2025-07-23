package Alphabet;

public class AllAlphabets {
    public void A(int size) {
        int width = size * 2 - 1;
        int mid = size / 2 + 1; // middle row for crossbar

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= width; j++) {
                if (j == size - i + 1 || j == size + i - 1) {
                    // Slanting sides
                    System.out.print("*");
                } else if (i == mid && j > size - i + 1 && j < size + i - 1) {
                    // Horizontal crossbar (short, inside the triangle)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void B(int size) {
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
            // Print * for first column (vertical bar)
            if (j == 1) {
                System.out.print("*");
            }
            // Print * for top, middle, bottom horizontal lines
            else if ((i == 1 || i == size || i == size / 2 + 1) && j < size) {
                System.out.print("*");
            }
            // Print * for last column of top and bottom half
            else if ((i < size / 2 + 1 && j == size) || (i > size / 2 + 1 && j == size)) {
                System.out.print("*");
            }
            // Else print space
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

}
