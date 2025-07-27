package exalt.company;

public class Train implements Transport {
    
    @Override
    public void deliver(){
        System.out.println("Transport by rail through train..");
    }
}
