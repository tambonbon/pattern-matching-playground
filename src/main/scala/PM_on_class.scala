object PM_on_class {
  
  // we want to do PM on this class
  class Employees (val name: String, val age: Int, val id: Int)

  // we need first to declare an object with any name
  // i.e. not the same with the class name
  object Employee {
    // then we use `unapply` method instantiating the object
    def unapply(employees: Employees): Option[(String, Int, Int)] = 
      Some((employees.name, employees.age, employees.id))
  }

  def main(args: Array[String]): Unit = {
    val Employee1 = new Employees("Tammy", 22, 1997)

    Employee1 match {
      case Employee(name, age, id) => print(s"name is ${name}")
    }
  }
}
