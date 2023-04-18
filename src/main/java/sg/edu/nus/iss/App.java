package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        mountainBike mountainBike = new mountainBike(5, 10, 20);
        System.out.println(mountainBike);

        mountainBike mountainBike2 = new mountainBike(10, 0, 25);
        mountainBike mountainBike3 = new mountainBike(11, 5, 23);
        roadBike roadBike = new roadBike(3, 4, 0);

        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        System.out.println(bicycles);

        for (Bicycle bicycle:bicycles) {
            if (bicycle instanceof mountainBike) {
                System.out.println(bicycle.hashCode() + "is a mountain bike.");
            } else if (bicycle instanceof roadBike) {
                System.out.println(bicycle.hashCode() + "is a road bike.");
            }
        }
    }
}
