/** HourlyEmployee.java
 * inherits from Employee class  */

public class HourlyEmployee extends Employee{

   private double hours;  // the hours worked
   private double wage;  // the wages per hour

   public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage){

      super(firstName, lastName, socialSecurityNumber);

      if (wage < 0.0)
         throw new IllegalArgumentException("The wage must be >= 0.0");

      if (hours < 0.0 || hours > 168.0)
         throw new IllegalArgumentException("The hours must be >= 0.0 and <= 168.0");

      this.wage = wage;
      this.hours = hours;
   }

   public void setWage(double wage){

      if (wage < 0.0)
         throw new IllegalArgumentException("The wage must be >= 0.0");

      this.wage = wage;
   }
   public double getWage(){

      return wage;
   }
   public void setHours(double hours){

      if (hours < 0.0 || hours > 168.0)
         throw new IllegalArgumentException("The hours must be >= 0.0 and <= 168.0");

      this.hours = hours;
   }
   public double getHours(){

      return hours;
   }
   public double earnings(){
      return getHours() * getWage();
   }
   @Override
   public String toString(){

      return String.format("%s %s%n%s: %.2f%n%s: %.2f", "hourly employee: ", super.toString(), "hours worked", getHours(), "wage per hour", getWage());
   }
}
