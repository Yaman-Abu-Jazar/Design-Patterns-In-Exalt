package exalt.company;

public class Truck implements Transport{
    
    @Override
    public void deliver(){
        System.out.println("Transport by land through truck..");
    }
}
