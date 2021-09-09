package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val lokeshEmployee: Employee = Employee("Chiru","Kumar",21,15000,"Intern","knoldus","chiru.kumar@knoldus.com")
  val rahulEmployee: Employee = Employee("sanjay","Gupta",28,15000,"Software Engineer","Philips","sanjay.gupta@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Chiru" -> lokeshEmployee, "sanjay" -> rahulEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
