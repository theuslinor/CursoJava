package theus.designpattern.facatory;

import theus.designpattern.facatory.vehicle.IVehicle;

public abstract class Transport {

    void starTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
