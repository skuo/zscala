object worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Upper {
    def upper(strings: String*): Seq[String] = {
      strings.map((s: String) => s.toUpperCase())
    }
  }

  val up = new Upper                              //> up  : worksheet.Upper = worksheet$$anonfun$main$1$Upper$1@b684286
  println(up.upper("Hello", "World!"))            //> ArrayBuffer(HELLO, WORLD!)
  
}