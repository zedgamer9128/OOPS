import java.util.Scanner;

public class Main {
  static int[] sortEvenAndOdd(int[] a) {
    int i = 0, j = a.length - 1;
    while (i < j) {
      if (a[i] % 2 == 1 && a[j] % 2 == 0) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
      if (a[i] % 2 == 0)
        i++;
      if (a[j] % 2 == 1)
        j--;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Elements: ");
    int n = sc.nextInt();
    System.out.print("Enter Array Elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    a = sortEvenAndOdd(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
