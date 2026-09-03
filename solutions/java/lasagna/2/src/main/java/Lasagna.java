public class Lasagna {


    
    
private static int layersTime = 2;
    public static int expectedMinutesInOven() {
        return 40;
    }


    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }


    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * layersTime;
    }


    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}
