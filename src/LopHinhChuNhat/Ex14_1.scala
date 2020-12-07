package LopHinhChuNhat

import java.util.Scanner

object Ex14_1 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    System.out.println("Enter the width: ")
    val width = scanner.nextDouble
    System.out.println("Enter the height: ")
    val height = scanner.nextDouble
    val rect = new Rectangle(width, height)
    System.out.println("Your Rectangle \n" + rect.display)
    System.out.println("Perimeter of the Rectangle: " + rect.getPerimeter)
    System.out.println("Area of the Rectangle: " + rect.getArea)
  }
}
