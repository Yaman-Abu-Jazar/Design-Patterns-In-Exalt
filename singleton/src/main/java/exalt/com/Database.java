package exalt.com;

public class Database {

    private static Database db;
    private String name;
    private int id;

    private Database(){

    }

    public static Database getInstance(){
        if(Database.db == null){
            Database.db = new Database();
        }
        return Database.db;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Database name : " + this.name + " Database Id : " + this.id + ".";
    }
    
}
