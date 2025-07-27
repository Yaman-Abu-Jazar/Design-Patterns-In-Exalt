package exalt.company;

public class UnGroundMail extends Mail {
    @Override
    public Transport createTransport(TransportType type){
        switch (type) {
            case PLANE -> {
                return new Plane();
            }
            case SHIP -> {
                return new Ship();
            }
            default -> throw new IllegalArgumentException("Unknown Transport Type : " + type);
        }
    }
}
