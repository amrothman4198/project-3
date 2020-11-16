import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    String[] names = new String[15];

    for (int i = 0; i < names.length; i++) {
      System.out.println("whats your name");
      names[i] = scan.next();
    }
    int i = 0;
    while (i < names.length)
    {
      System.out.println(names[i] + "sit in seat #" + seats[i]);
      i++;
    }
  }
}