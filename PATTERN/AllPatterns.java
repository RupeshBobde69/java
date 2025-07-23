package PATTERN;

public class AllPatterns {
    public void Square(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Triangle(int size, int num) {
        for (int i = 1 + num; i <= size; i++) {
            for (int j = 1; j <= size + i - 1; j++) {
                if (j <= size - i) {
                    System.out.print(" ");
                }else if ((j - (size - i)) % 2 == 1) {
                    System.out.print("* ");
                }
                // }else {
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }

    public void Rectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void InvertedTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size + i - 1; j++) {
                if (j <= size - i) {
                    System.out.print(" ");
                } else if ((j - (size - i)) % 2 == 1) {
                    System.out.print("* ");
                }
                // }else {
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }

    public void Hourglass(int size) {
        InvertedTriangle(size);
        Triangle(size, 1);
    }
}
