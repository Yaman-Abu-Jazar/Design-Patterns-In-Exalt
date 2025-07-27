package exalt.company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mail ground = new GroundMail();
        ground.send(TransportType.TRUCK);

        ground.send(TransportType.TRAIN);

        Mail unGround = new UnGroundMail();
        unGround.send(TransportType.SHIP);

        unGround.send(TransportType.PLANE);
    }
}
