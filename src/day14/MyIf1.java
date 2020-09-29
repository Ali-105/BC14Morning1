package day14;

public class MyIf1 {
    public static void main(String[] args) {
        var min= 18;
        if (min>=0 && min <= 14){
            System.out.println("Pervaya polovina chasa");
        }
        if (min>=15 && min <= 30){
            System.out.println("vtoraya polovina chasa");
        }if (min>=31 && min <= 45){
            System.out.println("tretya polovina chasa");
        }if (min >= 46 && min < 59 ){
            System.out.println("chetvertaya polovina dnya");
        }
    }
}
