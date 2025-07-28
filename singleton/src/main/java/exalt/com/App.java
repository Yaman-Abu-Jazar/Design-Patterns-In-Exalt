    package exalt.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database db = Database.getInstance();
        db.setId(10);
        db.setName("Anwar");
        System.out.println(db);

        Database u = Database.getInstance();
        System.out.println(u);
    }
}
