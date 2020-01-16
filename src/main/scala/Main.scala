object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil:List[T]) {
      (b, a) =>
        if (f(a)) a :: b
        else b
    }.reverse
  }
}
