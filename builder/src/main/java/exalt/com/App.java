package exalt.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Task task = new TaskBuilder(5)
                .setDescription("Hello")
                .setDone(true).build();
        System.out.println(task.toString());
    }
}
