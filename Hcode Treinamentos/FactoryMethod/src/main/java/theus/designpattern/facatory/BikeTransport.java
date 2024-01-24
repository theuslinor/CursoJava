package theus.designpattern.facatory;

import theus.designpattern.facatory.vehicle.Bike;
import theus.designpattern.facatory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
