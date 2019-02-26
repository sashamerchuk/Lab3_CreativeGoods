package ua.lviv.iot.shipment.managers;

import java.io.Serializable;

import ua.lviv.iot.shipment.models.Port;

public class TransportationManagerImpl implements TransportationManager, Serializable {

    @Override
    public double calculatePrice(Port start, Port destination, String good, double goodAmount) {
        return 0;
    }

}
