public class Main {

  public static void main(String[] args) {
    while (true) {
      String[] input = Input.getInput();
      Input.checkInput(input);
      String operation = Input.getOperation(input);
      String num1 = Input.getNum1(input);
      String num2 = Input.getNum2(input);
      Number number1 = new Number(num1);
      Number number2 = new Number(num2);
      Number result = new Number();
      switch (operation) {
        case "+":
          result = number1.add(number2);
          break;
        case "-":
          result = number1.subtract(number2);
          break;
        case "*":
          result = number1.multiply(number2);
          break;
        case "/":
          result = number1.divide(number2);
          break;
        default:
          ;
      }
      System.out.println(result.getNumber());
    }
  }

}
