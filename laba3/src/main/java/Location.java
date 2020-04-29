import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord = 0;

    /** Y coordinate of this location. **/
    public int yCoord = 0;
}