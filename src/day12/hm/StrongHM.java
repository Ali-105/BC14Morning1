package day12.hm;

public class StrongHM {
    public static void main(String[] args) {
        System.out.println(citiWeather("Moscow", "Freitag"));
    }

    private static int citiWeather(String citiName, String weekday) {
        int temperaturOnMonday = getMyTempOnMonday(citiName);
        int tempK = getMeK(weekday);
        return tempK + temperaturOnMonday;



    }

    private static int getMeK(String weekday) {
        int output = 0;
        switch (weekday){
            case "Montag":
                output = 0;
                break;
            case "Dienstag":
                output = 1;
                break;
            case "Mitwoch":
                output = 2;
                break;
            case "Donnerstag":
                output = 3;
                break;
            case "Freitag":
                output = 4;
                break;
            case "Samstag":
                output = 5;
                break;
            case "Sonntag":
                output = 6;
                break;
            default:
                output = -1;
                break;
        }

        return output;
    }


    public static int getMyTempOnMonday(String citiName) {
        int output = 0;
        switch (citiName) {
            case "Minsk":
                output = 19;
                break;
            case "Berlin":
                output = 20;
                break;
            case "London":
                output = 12;
                break;
            case "Moscow":
                output = 13;
                break;
            case "Saratov":
                output = 16;
                break;
            case " Paris":
                output = 19;
                break;
            default:
                output = 274;
                break;

        }

        return output;
    }
}


