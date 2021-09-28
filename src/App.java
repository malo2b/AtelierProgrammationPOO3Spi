import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<FormeGeometrique> FG = new ArrayList<FormeGeometrique>();
        ArrayList<FormeGeometrique> FGbigger = new ArrayList<FormeGeometrique>();
        // Test toString et methodes de calcul //
        FG.add(new Ellipse(15, 10, "Elllllipse"));
        FG.add(new Cercle(50, "cd"));
        FG.add(new Rectangle(20, 10, "parpain"));
        FG.add(new Sphere("la_bouleee", 50));
        FG.add(new Cylindre("le_verre", 30, 150));
        FG.forEach(forme -> System.out.println(forme));

        // Test is bigger -> False //
        FGbigger.add(new Ellipse(20, 15, "Elllllipse"));
        FGbigger.add(new Cercle(60, "cd"));
        FGbigger.add(new Rectangle(30, 10, "parpain"));
        FGbigger.add(new Sphere("la_bouleee", 60));
        FGbigger.add(new Cylindre("le_verre", 50, 150));
        FGbigger.forEach(forme -> System.out.println(forme.isBigger(FG.get(FGbigger.indexOf(forme)))));
        // Test is bigger -> True //
        FGbigger.forEach(forme -> System.out.println(!forme.isBigger(FG.get(FGbigger.indexOf(forme)))));


    }
}
