package transport;

import java.util.Queue;

public class ServiceStation {

    private Transport transport;
    private Queue <Transport> queue;

    public ServiceStation ( Transport transport){
        this.transport = transport;
    }
    //region Getters-Setters

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }


    // endregion

    public void addCarQueue ( Transport transport){
        if (transport.getClass() != Bus.class) {
            queue.add(transport);
        }
    }

    public void gotoCarInspection() {
        queue.remove();
    }

}
