import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập chiều dài hình chữ nhật: ");
        int length = scanner.nextInt();
        System.out.println("mời bạn nhập chiều rộng hình chữ nhật");
        int width = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i = length; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}