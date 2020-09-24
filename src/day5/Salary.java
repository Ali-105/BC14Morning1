package day5;

public class Salary {
    public static void main(String[] args) {
        salary01dWay();
        System.out.println( salaryNewWay(1000 , 1.3));
    }
    public static double salaryNewWay(double hours, double k){
        double minimalEuroPerHour = 9.26;
        double result = hours * k * minimalEuroPerHour;
        return result;
    }
    public static void salary01dWay(){
        // Данны часы и коэфициент и мин. зарплата
        //Sidorov
        double hourSidorov = 100.5;
        double kSidorov = 1.9;

        // Petrov
        double hourPetrov = 155.5;
        double kPetrov = 1.1;

        //sidorov
        findMySalary(hourSidorov, kSidorov);
        // petrov
        findMySalary(hourSidorov, kSidorov);
        //vasya
        findMySalary(120, 1.4);

    }
    public static void findMySalary(double hours, double k){
        double minimalEuroPerHour = 9.26;
        double result = hours * k * minimalEuroPerHour;
        System.out.println("зарплата за месяц " + result
                        + "при выработке" + hours
                + " при коэфициенте" + k );
    }
}
