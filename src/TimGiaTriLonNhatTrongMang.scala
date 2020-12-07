import java.util.Scanner

object TimGiaTriLonNhatTrongMang {
  def main(args: Array[String]): Unit = {
    var size = 0
    var array = new Array[Int](size)
    val scanner = new Scanner(System.in)
    do {
      System.out.print("Enter a size:")
      size = scanner.nextInt
      if (size > 20) System.out.println("Size should not exceed 20")
    } while ( {
      size > 20
    })

    array = new Array[Int](size)
    var i = 0
    while ( {
      i < array.length
    }) {
      System.out.print("Enter element" + (i + 1) + " : ")
      array(i) = scanner.nextInt
      i += 1
    }
    System.out.print("Property list: ")
    for (j <- 0 until array.length) {
      System.out.print(array(j) + "\t")
    }
    var max = array(0)
    var index = 1
    for (j <- 0 until array.length) {
      if (array(j) > max) {
        max = array(j)
        index = j + 1
      }
    }
    System.out.println("The largest property value in the list is " + max + " ,at position " + index)
  }
}
