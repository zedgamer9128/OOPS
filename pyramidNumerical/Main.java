import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
