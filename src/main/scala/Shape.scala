object  Shape extends App {

  println(Shape.area("rectangle",10,2,findRectangleArea))
  println(Shape.area("rhombus",10,2,findRhombusArea))
  println(Shape.area("parallelogram",10,2,findParallelogramArea))
  println(Shape.area("square",10,2,findParallelogramArea))
  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {

    shape match {
      case "rectangle" => val rectArea = f(first,second)
       // "Area of Rectangle="+rectArea
        s"Area of Rectangle = ${f(first, second)}"
      case "rhombus" => val rhomArea=f(first,second)
        s"Area of Rhombus= ${f(first,second)}"
      case "parallelogram" => val paraArea=f(first,second)
        s"Area of Parallelogram = ${f(first, second)}"
      case _ =>  "area function not defined for " +shape

    }
  }

  def findRectangleArea(length: Int, breadth: Int): Int = {
    length * breadth
  }

  def findRhombusArea(diagonal1: Int, diagonal2: Int): Int = {
    (diagonal1 * diagonal2) / 2
  }

  def findParallelogramArea(base: Int, height: Int): Int = {
    base * height
  }

}