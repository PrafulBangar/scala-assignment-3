object Fibonacci extends  App{
Fibonacci.printFib(7)

def printFib(num:Int) ={
  for (i <- 0 until num) {
    print(" ")
    print(fibbonacci(i))
  }
}


  def fibbonacci(n: Int): Int = {
    def tailRecursion(n: Int, a: Int=0, b: Int=1): Int = {
      n match {
        case 0 => a
       case 1=>b
        case _ => tailRecursion(n - 1, b, a + b)
      }
    }
    tailRecursion(n, 0 , 1)
  }
}
//0 1 1 2 3 5