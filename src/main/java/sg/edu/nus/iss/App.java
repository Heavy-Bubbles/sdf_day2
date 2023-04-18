package sg.edu.nus.iss;

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
        System.out.println(mountainBike.toString());
    }
}
