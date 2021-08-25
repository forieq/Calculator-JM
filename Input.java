import java.util.Scanner;

public class Input {

  public static String[] getInput() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    return line.split(" ");
  }

  public static void checkInput(String[] ss) {
    if (ss.length < 3) {
      throw new IllegalArgumentException("Invalid input. Spaces missed.");
    }
    if (ss.length > 3) {
      throw new IllegalArgumentException("Invalid input. Too many spaces.");
    }
  }

  public static String getOperation(String[] ss) {
    String s = ss[1];
    String[] operations = {"+", "-", "*", "/"};
    for (String op : operations) {
      if (s.equals(op)) {
        return op;
      }
    }
    throw new UnsupportedOperationException("Unsupported operation.");
  }

  public static String getNum1(String[] ss) {
    return ss[0];
  }

  public static String getNum2(String[] ss) {
    return ss[2];
  }

}
