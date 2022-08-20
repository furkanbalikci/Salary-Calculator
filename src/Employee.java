public class Employee {

    /*name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı*/

    String name;
    double salary,totalSalary;
    int workHours, hireYear, presentYear = 2021;;


    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
    }
    public double tax(){
        if (this.salary > 1000) {
            return this.salary*0.03;
        }
        return 0.0;

    }
    public double bonus(){
        if (this.workHours > 40) {
            return (workHours - 40)*30;
        }
        return 0;

    }
    public double raiseSalary(){
        int year = presentYear - hireYear;
        if (year < 10) {
            return this.salary*0.05;
        } else if (year > 9 & year < 20) {
            return  this.salary*0.10;
        } else if (year > 19) {
            return this.salary*0.15;
        }
        return 0;

    }

    public double getSalary() {
        return this.salary - tax() + bonus();
    }

    public double getTotalSalary() {
        return getSalary() + raiseSalary();
    }

    public String toString(){
        String s = new String();
        s += "Adı : " + this.name +"\n";
        s += "Maaşı : " + this.salary +"\n";
        s += "Çalışma Saati : " + this.workHours +"\n";
        s += "Başlangıç Yılı : " + this.hireYear +"\n";
        s += "Vergi : " + this.tax() +"\n";
        s += "Bonus : " + this.bonus() +"\n";
        s += "Maaş artışı : " + this.raiseSalary() +"\n";
        s += "Vergi ve Bonuslar ile birlikte maaş: " +getSalary() +"\n";
        s += "Toplam maaş : " + getTotalSalary() + "\n";
        return s;

    }



}
