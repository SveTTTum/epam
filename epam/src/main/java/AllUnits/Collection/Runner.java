package AllUnits.Collection;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Salads saladSummer = new Salads ();
        saladSummer.addVegetable(Vegetables.ONION, 24.0);
        saladSummer.addVegetable(Vegetables.CARROT, 48.0);
        saladSummer.addVegetable(Vegetables.CUCUMBER, 56.0);
        saladSummer.addVegetable(Vegetables.POTATO, 50.0);
        Salads saladWinter = new Salads();
        saladWinter.addVegetable(Vegetables.POTATO, 102.0);
        saladWinter.addVegetable(Vegetables.ONION, 24.0);
        saladWinter.addVegetable(Vegetables.PEPPER, 48.0);
        saladWinter.addVegetable(Vegetables.BROCCOLI, 80.0);
        Salads saladMix = new Salads();
        saladMix.addVegetable(Vegetables.LETTUCE, 156.0);
        saladMix.addVegetable(Vegetables.BROCCOLI, 120.0);
        saladMix.addVegetable(Vegetables.PEPPER, 111.0);
        saladMix.addVegetable(Vegetables.TOMATO, 181.0);
        System.out.println("salad Summer " + saladSummer);
        System.out.println("Colories of salad Summer = " + String.format("%.2f",saladSummer.sumOfCaloriesSalad()) + " kkal");
        System.out.println("salad Winter " + saladWinter);
        System.out.println("Colories of salad Winter = " + String.format("%.2f",saladWinter.sumOfCaloriesSalad()) + " kkal");
        System.out.println("salad Mix " + saladMix);
        System.out.println("Colories of salad Mix = " + String.format("%.2f",saladMix.sumOfCaloriesSalad()) + " kkal");
        System.out.println("salad Mix сomposition:   " + saladMix.saladСomposition());
        System.out.println("salad Mix sort:   " + saladMix.sortByFats());
        System.out.println("salad Mix range:   " + saladMix.rangeByCalories());

    }
}
