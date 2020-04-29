import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Point3d {
    private double xCoord = 0.0;
    private double yCoord = 0.0;
    private double zCoord = 0.0;

    public double distanceTo(Point3d point3d){
        double x = xCoord - point3d.getXCoord();
        double y = yCoord - point3d.getYCoord();
        double z = zCoord - point3d.getZCoord();
        return Math.sqrt(x * x + y * y + z * z);
    }
}
