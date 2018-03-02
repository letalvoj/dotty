object Test {

  def main(args: Array[String]): Unit = {
    fun({ println("x1"); boo })({ println("x2"); boo })

    new Fun({ println("y1"); boo })({ println("y2"); boo })

    (new Fun2().fun)({ println("z1"); boo })({ println("z2"); boo })
  }

  def fun(ghost x1: Int)(ghost x2: Int) = {
    println("fun")
  }

  class Fun(ghost y1: Int)(ghost y2: Int) {
    println("Fun")
  }

  class Fun2 {
    println("Fun2")
    def fun(ghost z1: Int)(ghost z2: Int) = {
      println("Fun2fun")
    }
  }

  def boo: Int = {
    println("boo")
    42
  }

}