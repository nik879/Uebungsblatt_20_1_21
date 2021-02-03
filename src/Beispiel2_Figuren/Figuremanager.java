package Beispiel2_Figuren;

import java.util.ArrayList;
import java.util.HashMap;

public class Figuremanager {
    ArrayList<Figure> Figures = new ArrayList<>();

    public Figuremanager(ArrayList<Figure> figures) {
        Figures = figures;
    }

    public void add(Figure f) {
        Figures.add(f);
    }

    public double getMaxPerimeter() {
        double maxPerimeter=0.0;
        for (Figure figure : Figures) {
            if (figure.getPerimeter() > maxPerimeter) {
                maxPerimeter= figure.getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public double getAverageAreaSize() {
        double avgareasize=0;
        double count=0;
        for (Figure figure : Figures) {
            avgareasize += figure.getArea();
            count++;
        }
        avgareasize = avgareasize / count;
        return avgareasize;
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> Map = new HashMap<>();
        double size=0;
        for (Figure figure : Figures) {
            size += figure.getArea();
        }
        if (size < 1000) {
            Map.put("Klein", size);
        }
        if (size < 5000 && size >= 1000) {
            Map.put("Mittel", size);
        }
        if (size >= 5000) {
            Map.put("Groß", size);
        }
        return Map;

    }

    @Override
    public String toString() {
        return "Figuremanager{" +
                "Figures=" + Figures +
                '}';
    }
}
