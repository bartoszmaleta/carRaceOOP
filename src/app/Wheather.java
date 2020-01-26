package app;

class Weather {
    private static boolean isRaining = false;

    static void setRaining() {
        isRaining = Helpers.probability(30);
    }

    static boolean isRaining() {
        return isRaining;
    }
}