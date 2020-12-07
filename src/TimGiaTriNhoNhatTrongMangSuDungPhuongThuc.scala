object TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](7)
    arr = Array(4, 12, 7, 8, 1, 6, 9)
    val index: Int = minValue(arr);
    System.out.println("The smallest element in the array is: " + arr(index) + " At position " + (index + 1));
  }

  def minValue(array: Array[Int]): Int = {
    val min = array(0)
    var indexMin = 0
    for (i <- array.indices) {
      if (min > array(i)) indexMin = i
    }
    indexMin
  }
}
