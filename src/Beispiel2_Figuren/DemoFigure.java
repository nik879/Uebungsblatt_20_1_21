package Beispiel2_Figuren;

import java.util.ArrayList;

public class DemoFigure {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 2);
        Circle cic = new Circle(7);
        ArrayList<Figure> Figures = new ArrayList<>();
        Figures.add(rec);
        Figures.add(cic);
        Figuremanager fm = new Figuremanager(Figures);
        System.out.println(fm.getMaxPerimeter());
        System.out.println(fm.getAverageAreaSize());

        System.out.println(fm.getAreaBySizeCategories());

    }
}
