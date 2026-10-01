import java.util.Scanner;

// import javax.sound.midi.SysexMessage;

public class Patterns {

    public static void Square_pattern(int a) {

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a; j++) {
                if (i == 0 || j == 0 || i == a - 1 || j == a - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Num_Triangle(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {

                // for (j = 1; j < i; j++) {

                System.out.print(i + " ");
                // }
            }
            System.out.println();
        }
    }

    public static void RightAng_Tri(int a) { // 1

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void RevRit_Ang(int a) {

        for (int i = a; i >= 1; i--) {
            for (int j = i; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Tri_trt(int a) { // 2
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            a--;
        }
        System.out.println();
    }

    public static void Square_fillpattern(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // System.out.println();
    }

    public static void Pyramid(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = a - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < a; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void K_Pattern(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (i + j % 2 == 0) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    public static void pattern34(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern35(int n) {
        int end = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                end = i;
            } else {
                end = 2 * n - i;
            }
            for (int j = 1; j <= end; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void pattern36(int n) {
        int end = 0;
        int space = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                end = i;
                space = n - i;
            } else {
                space = i - n;
                end = 2 * n - i;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= end; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern37(int n) {
        int end = 0;
        int space = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                end = i;
                space = n - i;
            } else {
                space = i - n;
                end = 2 * n - i;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= end; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern38(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(num + n - j + " ");
                    if (j == n)
                        num += n;
                }
            }
            System.out.println("");
        }
    }

    public static void pattern39(int n) {

        int star = 1;
        int space = 2 * n - 2;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(j + " ");
            }
            if (i < n) {
                star++;
                space -= 2;
            } else {
                space += 2;
                star--;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size=");
        int a = s.nextInt();

        // RightAng_Tri(a);
        // Num_Triangle(a);
        // Square_fillpattern(a);
        // Pyramid(a);
        // K_Pattern(a);
        // pattern11(a);
        pattern38(a);
        // pattern34(a);
        // pattern34(a);

        /*
         * System.out.println("TYPES OF PATTERNS");
         * System.out.println("=================");
         * System.out.println("1.Tri Triangle");
         * System.out.println("2.Square pattern");
         * System.out.println("3.Num Triangle");
         * System.out.println("4.RightAng Triangle");
         * System.out.println("5.Rev RightAng Triangle");
         * System.out.println("6.Square fill");
         * System.out.println("K Pattern");
         * 
         * System.out.println("Enter Size=");
         * int a = s.nextInt();
         * 
         * System.out.println("Enter your option :");
         * int option = s.nextInt();
         * 
         * switch(option)
         * {
         * case 1:
         * Tri_trt(a);
         * break;
         * 
         * case 2:
         * Square_pattern(a);
         * break;
         * 
         * case 3:
         * Num_Triangle(a);
         * break;
         * 
         * case 4:
         * RightAng_Tri(a);
         * break;
         * 
         * case 5:
         * RevRit_Ang(a);
         * break;
         * 
         * case 6:
         * Square_fillpattern(a);
         * break;
         * 
         * case 7:
         * K_Pattern(a);
         * break;
         * 
         * default:
         * System.out.println("oops!!! Invalid option");
         * }
         */

        s.close();
    }
}
