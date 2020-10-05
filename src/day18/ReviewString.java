package day18;

public class ReviewString {
    public static void main(String[] args) {
        firstReview();


    }

    private static void firstReview() {
        String hm = "Vasilia";
        System.out.println(hm.indexOf(1103));
        System.out.println(hm.indexOf('s'));
        System.out.println(hm.codePointAt(5));
        System.out.println('ö' + 0);
    }
}
