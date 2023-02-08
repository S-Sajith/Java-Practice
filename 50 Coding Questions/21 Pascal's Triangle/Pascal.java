  //      1
  //     1 1
  //    1 2 1
  //   1 3 3 1
  //  1 4 6 4 1
  // 1 5 10 10 5 1

public class Pascal{

public static int factorial(int i) {
    if (i == 0) {
        return 1;
    }
    return i * factorial(i - 1);
}
public static void printUseRecursion(int n) {
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
        }

        System.out.println();
    }
}

public static void main(String[] args) {
    printUseRecursion(5);
}
}