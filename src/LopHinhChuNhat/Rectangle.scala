package LopHinhChuNhat

class Rectangle(var width: Double, var height: Double) {
  def getArea: Double = this.width * this.height

  def getPerimeter: Double = (this.width + this.height) * 2

  def display: String = "Retangle {" + "width = " + width + " height= " + height + "}"
}
