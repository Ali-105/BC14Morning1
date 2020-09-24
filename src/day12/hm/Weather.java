package day12.hm;

public class Weather {
    public static void main(String[] args) {
        System.out.println(citiWeather("Moscow"));
    }

    public static int citiWeather(String citiName) {
        int temperaturOnMonday = getMyTempOnMonday(citiName);
        return temperaturOnMonday + 6;

        }

    public static int getMyTempOnMonday(String citiName) {
        int output = 0;
        switch (citiName){
            case "Minsk":
                output = 18;
                break;
            case "Berlin":
                output = 20;
                break;
            case "London":
                output = 12;
                break;
            case " Moscow":
                output = 13;
                break;
            case " Saratov":
                output = 16;
                break;
            case "Paris":
                output = 19;
                break;
            default:
                output = 274;
                break;
        }


        return output;
    }
}
