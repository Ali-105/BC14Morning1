package day07;

public class HelloBoolean {
    public static void main(String[] args) {
        introductionBoolean();
        introductionBoolean2();
        introductionBoolean3();

    }
    public static void introductionBoolean3(){
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        System.out.println(a);
        boolean b = (2 * 3) + 21 != 7 + 4 * 5;
        System.out.println(b);
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        System.out.println(c);
        boolean d = 16/ 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        System.out.println(d);
        boolean e = !(3 * 5 < 4 + 8);
        System.out.println(e);
        split();
    }
    public static void split(){
        System.out.println("------");
    }

    public static void introductionBoolean2(){
        boolean a = true;
        boolean b, c;
        b = false;
        c = a && b ;
        System.out.println("a & b: " + c);
        c = a || b;
        System.out.println("a | b:" + c);
        c = a ^ b;
        System.out.println("a ^ b:" + c);
        c = a != b;
        System.out.println("a != b:" +c);

        split();
    }
    public static void introductionBoolean(){
        int a = 1;
        int b = 2;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a != b);
        System.out.println(a==b);
    }


}
