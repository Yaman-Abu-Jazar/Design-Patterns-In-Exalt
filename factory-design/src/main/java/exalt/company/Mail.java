package exalt.company;

public abstract  class Mail {

    public abstract Transport createTransport(TransportType type);

    public void send(TransportType type) {
        Transport transport = createTransport(type);
        transport.deliver();
    }
}
