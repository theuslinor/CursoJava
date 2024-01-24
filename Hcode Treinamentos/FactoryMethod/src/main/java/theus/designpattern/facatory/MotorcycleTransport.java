package theus.designpattern.facatory;

import theus.designpattern.facatory.vehicle.IVehicle;
import theus.designpattern.facatory.vehicle.Motorcicle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcicle();
    }
}
