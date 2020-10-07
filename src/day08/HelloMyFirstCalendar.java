package day08;

public class HelloMyFirstCalendar {
    public static void main(String[] args) {
        String myVeryLovelyMonth = "Mai";
        System.out.println("Gegeben " + myVeryLovelyMonth
                + " bekommen " + getMeMonthNumber(myVeryLovelyMonth));
    }
    public static int getMeMonthNumber(String month){
        int result = 0;
        switch (month){
            case "Januar":
                result = 1;
                break;
            case "Februar":
                result = 2;
                break;
            case "März":
                result = 3;
                break;
            case "April":
                result=4;
                break;
            case "Mai":
                result=5;
                break;
            case "Juni":
                result=6;
                break;
            case "Juli":
                result=7;
                break;
            case"August":
                result=8;
                break;
            case "September":
                result=9;
                break;
            case"Oktober":
                result=10;
                break;
            case"November":
                result =11;
                break;
            case"Dezember":
                result=12;
                break;
            default:
                result=-1;
                break;

        }




        return result;
    }
}
