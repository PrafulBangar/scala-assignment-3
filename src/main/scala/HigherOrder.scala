object HigherOrder extends App{

  println(HigherOrder.sum(sumOfInt,4,3))
  println(HigherOrder.sum(sumOfSquare,4,3))
  println(HigherOrder.sum(sumOfCube,4,3))


  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int={
    f(a,b)
  }
def sumOfInt(a:Int,b:Int ):Int={
  a+b
}
  def sumOfSquare(a:Int,b:Int ):Int={
    a*a+b*b
  }

  def sumOfCube(a:Int,b:Int ):Int={
    a*a*a+b*b*b
  }





}