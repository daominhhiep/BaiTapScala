import java.util.Scanner

object TimGiaTriLonNhatTrongMangHaiChieu {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    System.out.println("Enter size arr1:")
    val row = scanner.nextInt
    System.out.println("Enter size arr2:")
    val col = scanner.nextInt
    val arr = Array.ofDim[Int](row, col)
    System.out.println("Array is:")
    for (i <- arr.indices) {
      for (j <- arr(i).indices) {
        arr(i)(j) = (Math.random * 9).toInt
        System.out.print(arr(i)(j) + " ")
      }
      System.out.println("")
    }
    System.out.println("Max: ")
    System.out.println(findMaxValue(arr))
  }

  def findMaxValue(arr: Array[Array[Int]]): Int = {
    var max = arr(0)(0)
    for (i <- arr.indices) {
      for (j <- arr(i).indices) {
        if (max < arr(i)(j)) max = arr(i)(j)
      }
    }
    max
  }
}
