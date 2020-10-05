package day19;

public class TilesApplication {
    public static void startApplication(double tilesWidth, double tilesLength, double roomWidth,
                                        double roomlength, double tilesPrice, double masterPrice) {
        double square = roomWidth * roomlength;
        System.out.println("Ploshad" + square);
        int tilesQuantity = getMyTilesQuntity(roomlength, roomWidth, tilesLength, tilesWidth);
        System.out.println("Technicheskaya raspechatka vsech plitok" + tilesQuantity);
        double sumWorkHour = getMySumWorkHour(square, masterPrice);
        System.out.println("Technicheskaya raspechatka cena za rabotu" + sumWorkHour);

        double sumMaterialCost = getMySumMaterialCost(tilesPrice, tilesQuantity);
        double totalSum = sumMaterialCost * sumWorkHour;

        // Kak poschitat polomanie
        int wholeTiles = getMeWholeTilesQuantity(roomlength, roomWidth, tilesLength, tilesWidth);// ne nado rezat
        System.out.println("Technicheskaya raspechatka zelich plitok" + wholeTiles);
        int brokenTiles = tilesQuantity - wholeTiles;
        System.out.println("Technicheskaya raspechatka rezanich plitok" + brokenTiles);

        // Teper schitaem poperek
        int tilesQuntitySecond = getMeWholeTilesQuantity(roomWidth, roomlength, tilesLength, tilesWidth);
        int wholeTilesSecond = getMeWholeTilesQuantity(roomWidth, roomlength, tilesLength, tilesWidth);
        int brokenTilesSecond = tilesQuntitySecond - wholeTilesSecond;
        System.out.println( "Poperek kolichestvo zelich plitok" + wholeTilesSecond);
        System.out.println("Poperek kolichestvo vsech plitok" + tilesQuntitySecond);
        System.out.println("poperek Kolichestvo rezanich plitok" + brokenTilesSecond);





    }

    private static int getMeWholeTilesQuantity(double roomlength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength/100;
        tilesWidth = tilesWidth / 100;
        int countTilesInOneLineLength = (int) Math.floor(roomlength/ tilesLength);
        int countTilesInOneLineWidth = (int) Math.floor(roomWidth/ tilesWidth);
        int result = countTilesInOneLineLength * countTilesInOneLineWidth;
        return result;
    }

    private static double getMySumMaterialCost(double tilesPrice, int tilesQuantity) {
        return tilesPrice * tilesQuantity;
    }

    private static double getMySumWorkHour(double square, double masterPrice) {
        return square * masterPrice;
    }

    private static int getMyTilesQuntity(double roomlength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100; // pravilno sozdat novyyu peremennyyu
        tilesWidth = tilesWidth / 100;
        int countTilesInOneLength = (int) Math.ceil(roomlength / tilesLength);
        int countTilesInOneWidth = (int) Math.ceil(roomWidth / tilesWidth);
        int result = countTilesInOneLength * countTilesInOneWidth;
        return result;
    }
}
