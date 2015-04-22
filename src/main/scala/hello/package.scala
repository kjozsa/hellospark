
package object hello {
  def benchmark[T](block: => T): T = {
    val start = System.currentTimeMillis()
    try {
      block
    } finally {
      val end = System.currentTimeMillis()
      println("## executed in " + (end - start) + "ms")
    }
  }
}
