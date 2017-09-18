// HourlyEmployeeTest.java
// HourlyEmployee class test program.

public class HourlyEmployeeTest
{
   public static void main(String[] args)   {

      HourlyEmployee employee = new HourlyEmployee(
         "Anna", "Grey", "555-55-5555", 158, 18.20);

      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is",
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is",
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "The hours worked are",
         employee.getHours());
      System.out.printf("%s %.2f%n", "The wage per hour is",
         employee.getWage());

      employee.setHours(168);
      employee.setWage(20.00);

      System.out.printf("%n%s:%n%n%s%n",
         "Updated employee information obtained by toString", employee);
   }
}