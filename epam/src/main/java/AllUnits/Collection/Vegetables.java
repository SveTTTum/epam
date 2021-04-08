package AllUnits.Collection;

public enum Vegetables {
    ONION(1.7, 0.2, 9.5, 43),
    BROCCOLI(3.3, 0.2, 1.7, 23),
    CARROT(1.3, 0.1, 7.0, 33),
    LETTUCE(1.5, 0.2, 2.2, 14),
    TOMATO(0.6, 0.0, 2.9, 23),
    CUCUMBER(0.7, 0.1, 1.8, 10),
    PEPPER(1.3, 0.1, 5.7, 27),
    POTATO(2, 0.4, 19.7, 83);

    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;

    Vegetables(double proteins, double fats, double carbohydrates, double calories) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCalories() {
        return calories;
    }
}
