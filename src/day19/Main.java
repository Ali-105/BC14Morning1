package day19;

public class Main {
    public static void main(String[] args) {
        final double masterPrice = 27.0;
        double tilesWidth = 20.0;
        double tilesLength = 30.0;
        double roomWidth = 4.6;
        double roomlength = 6.5;
        double tilesPrice = 3.0;
        TilesApplication.startApplication(tilesWidth,tilesLength, roomWidth,
                roomlength, tilesPrice, masterPrice );
    }
}