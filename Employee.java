public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

   public double tax(){
        double tax;
        if(salary>0 && salary<1000){
           tax=0.0;
        }else {
            tax = salary *3/100;
        }
       return tax;
   }


   public double bonus(){
        double bonus;
        if(workHours>40){
            bonus=workHours*30.0;
        }else {
           bonus=0;
        }
        return bonus;
   }
   public double raiseSalary(){
        int year=2023;
        double raiseSalary;
        if((year-hireYear)>19){
            raiseSalary=salary*15/100;
        }else if((year-hireYear)<20 && (year-hireYear)>9){
            raiseSalary= this.salary*10/100;
        }else  {
            raiseSalary=this.salary*5/100;
       }
        return raiseSalary;
   }
    void toStringEmployee() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Work Hours :" + workHours);
        System.out.println("Hire Year :" + hireYear);
        System.out.println("Tax :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Salary raise : " + raiseSalary());
        double salaryWithBonusAndTax=(salary + bonus()) - tax();
        System.out.println("Salary with tax and bonus : " + salaryWithBonusAndTax);
        System.out.println("Total salary : " +(salaryWithBonusAndTax+bonus()));
        System.out.println("=========");

    }
}
