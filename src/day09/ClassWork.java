package day09;

public class ClassWork {
    public static void main(String[] args) {
        int speed = 150;
        System.out.println("Vasha skorost bila " + speed +"km/h");
        if (speed <=50) {
            System.out.println("Narushenii net");
        }else if(speed <=65){
            System.out.println("Ustnoe porizanie");
        }else if (speed <=100){
            System.out.println("Straf 40");
        }else if (speed <= 130){
            System.out.println("straf 500");
        }else {
            System.out.println( "Lischenie prav");
        }

    }

}
