package exalt.company;

public class Plane implements Transport {
    
    @Override
    public void deliver(){
        System.out.println("Transport by air through plane..");
    }
}
