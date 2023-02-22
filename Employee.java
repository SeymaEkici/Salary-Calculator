public class Employee {

    String workerName;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double increaseSalary;
    double initialSalary = salary;

    public Employee(String workerName, double salary, int workHours, int hireYear){

        this.workerName = workerName;
        this.salary = salary;
        this.initialSalary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        
        if(this.salary > 1000){
            this.salary -= this.salary * (3 / 100);
        }
    }

    void bonus(){

        if(workHours > 40){
            this.salary += (workHours - 40) * 30;
        }
    }

    void raiseSalary(){
        
        int workYear = 2021 - hireYear;
        if(workYear < 10){
            this.salary += this.salary * (5 / 100);

        } else if (workYear >= 10 && workYear < 20){
            this.salary += this.salary * (10 / 100);

        } else if (workYear >= 20) {
            this.salary += this.salary * (15 / 100);
        }
    }

    public void toPrint(){

        this.tax();
        this.bonus();
        this.raiseSalary();

        System.out.println("===================" + "\n"
                        + "Worker's name: " + this.workerName + "\n"
                        + "Initial salary: " + this.initialSalary + "\n"
                        + "Work hours: " + this.workHours + "\n"
                        + "Starting year: " + this.hireYear + "\n"
                        + "Total salary: " + this.salary + "\n");
    }
}
