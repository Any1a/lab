import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        List<Point3d> point3ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Point3d:");
            point3ds.add(new Point3d(scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble()));
        }

        try {
            System.out.println(computeArea(point3ds));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static double computeArea(List<Point3d> point3ds) {
        if (point3ds.size() != 3){
            throw new IllegalArgumentException("It's not a triangle!");
        }
        if (point3ds.size() != point3ds.stream().distinct().count()){
            throw new IllegalArgumentException("2 or more points are equal!");
        }

        double ab = point3ds.get(0).distanceTo(point3ds.get(1));
        double bc = point3ds.get(1).distanceTo(point3ds.get(2));
        double ac = point3ds.get(0).distanceTo(point3ds.get(2));
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p-ab) * (p-bc) * (p-ac));
    }
}
