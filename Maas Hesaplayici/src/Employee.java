public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;



    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        if (this.salary < 1000) {
            System.out.println("Maasiniz 1000 dolarin altinda oldugu icin vergiden muafsiniz ");

        } else {
             tax =  (this.salary * 0.03);


        }return tax;

    }

    public double bonus() {
        if (this.workHours >= 40) {
            bonus = ((this.workHours-40) * 30);
            return bonus;
        } else {
            return 0;
        }


    }

    public double raiseSalary() {
        double raise;
        int defYear = 2021;
        int workYear = (2021 - this.hireYear);

        if (workYear < 10) {
            raise= (this.salary * 0.05);
            return raise;
        } else if (workYear > 9 && workYear < 20) {
            raise= (this.salary * 0.1);
            return raise;
        } else if (workYear > 19) {
            raise= (this.salary * 0.15);
            return raise;
        }return 0;
    }

    void toStrings(){
        double taxSalary=salary+bonus()-tax();
        double toplammaas=salary+bonus()+raiseSalary()-tax();
        System.out.println("Adi : "+this.name);
        System.out.println("Maasi  : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic yili : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maas Artisi : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+taxSalary);
        System.out.println("Toplam Maas : "+toplammaas);


    }
}