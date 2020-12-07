object TimGiaTriTrongMang {
  def main(args: Array[String]): Unit = {
    val students = Array("Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily")
    val scanner = new java.util.Scanner(System.in)
    System.out.print("Enter a name’s student:")
    val input_name = scanner.nextLine
    var isExist = false
    for (i <- students.indices) {
      if (students(i) == input_name) {
        System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1))
        isExist = true
      }
    }
    if (!isExist) System.out.println("Not found" + input_name + " in the list.")
  }
}
