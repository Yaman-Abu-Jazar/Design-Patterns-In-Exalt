package exalt.company;

public class Ship implements Transport {

    @Override
    public void deliver(){
        System.out.println("Transport by sea through ship..");
    }
}
