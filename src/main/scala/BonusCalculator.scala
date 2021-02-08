import scala.io.StdIn.readLine

object BonusCalculator extends App {
  //TO do Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name?")
  println(s"Nice to talk to you $employee!")
  val yearsWorked = readLine("How many years have you worked in the company?").toInt
  val monthlyPay = readLine("How much do you earn per month?").toInt
  if (yearsWorked > 2) {
    val bonus = (yearsWorked-2)*(monthlyPay*0.15)
    println(s"Your bonus this year is going to be $bonus.")
  } else {
    println("You have worked less than 2 years, so no bonus yet")
  }


  //val bonus= if (yearsWorked >= 2) ((yearsWorked-2)*(monthlyPay*0.15)) else "You have worked less than 2 years, so no bonus yet"

  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus
}
