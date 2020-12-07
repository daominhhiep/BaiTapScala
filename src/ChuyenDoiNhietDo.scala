import java.util.Scanner

object ChuyenDoiNhietDo {
  def main(args: Array[String]): Unit = {
    val input = new Scanner(System.in)
    var fahrenheit: Double = 0
    var celsius: Double = 0
    var choice: Int = 0

    do {
      System.out.println("Menu.");
      System.out.println("1. Fahrenheit to Celsius");
      System.out.println("2. Celsius to Fahrenheit");
      System.out.println("0. Exit");
      System.out.println("Enter your choice: ");
      choice = input.nextInt();

      choice match {
        case 1 =>
          System.out.println("Enter fahrenheit: ");
          fahrenheit = input.nextDouble();
          System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit))
        case 2 =>
          System.out.println("Enter Celsius: ");
          celsius = input.nextDouble();
          System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius))
        case 0 =>
          System.exit(0);
      }
    } while (choice != 0);
  }

  def celsiusToFahrenheit(celsius: Double): Double = {
    val fahrenheit: Double = (9.0 / 5) * celsius + 32
    fahrenheit
  }

  def fahrenheitToCelsius(fahrenheit: Double): Double = {
    val celsius: Double = (5.0 / 9) * (fahrenheit - 32)
    celsius
  }
}
