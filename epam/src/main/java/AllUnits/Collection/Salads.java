package AllUnits.Collection;
import java.util.*;
import java.util.stream.Collectors;

public class Salads {
    private Map<Vegetables, Double> salad;

    public Salads(Map<Vegetables, Double> salad) {
        this.salad = salad;
    }
    public Salads() {
        salad = new EnumMap<Vegetables, Double>(Vegetables.class);

    }

    public Map<Vegetables, Double> getSalad() {
        return salad;
    }

    public void setSalad(Map<Vegetables, Double> salad) {
        this.salad = salad;
    }

    public void addVegetable (Vegetables vegetable, double weight) {
        if(salad.containsKey(vegetable)) {
            weight += salad.get(vegetable) + weight;
        }
        salad.put(vegetable, weight);
    }

    public double sumOfCaloriesSalad() {
        double sumCalories  = 0;
        for (Vegetables vegetable: salad.keySet()) {
            sumCalories  += vegetable.getCalories()*salad.get(vegetable)/100;
        }
        return sumCalories;
    }

    public Set<Vegetables> saladСomposition() {
        for (Vegetables vegetable: salad.keySet()) {
            return salad.keySet();
        }
        return null;
    }
    public List<Vegetables> sortByFats() {
        return salad.keySet()
                .stream()
                .sorted(Comparator.comparing(Vegetables::getFats))
                .collect(Collectors.toList());
    }

    public List<Vegetables> rangeByCalories() {
        return salad.keySet()
                .stream()
                .filter(vegetables -> vegetables.getCalories() > 10 && vegetables.getCalories() < 25)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Salads{" +
                "salad=" + salad +
                '}';
    }

}
