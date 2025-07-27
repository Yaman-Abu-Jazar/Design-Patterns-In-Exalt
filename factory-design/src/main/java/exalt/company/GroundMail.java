package exalt.company;

public class GroundMail extends Mail {
    @Override
    public Transport createTransport(TransportType type){
        switch (type) {
            case TRUCK -> {
                return new Truck();
            }
            case TRAIN -> {
                return new Train();
            }
            default -> throw new IllegalArgumentException("Unknown Transport Type : " + type);
        }
    }
}
