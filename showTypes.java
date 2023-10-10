import java.util.Scanner;

public class showTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        while (a != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh chu nhat");
            System.out.println("2. Ve tam giac vuong canh o botton-left");
            System.out.println("3. Ve tam giac vuong canh o top-left");
            System.out.println("4. Ve tam giac can");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Hinh chu nhat");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Tam giac vuong canh o botton-left");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Tam giac vuong canh o top-left");
                    for (int i = 7; i >= 1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;
                case 4 :
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i ; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i ; k++) {
                                System.out.print("# ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co!");
            }
        }
    }
}
