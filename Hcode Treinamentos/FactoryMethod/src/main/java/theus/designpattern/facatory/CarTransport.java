package theus.designpattern.facatory;

import theus.designpattern.facatory.vehicle.Car;
import theus.designpattern.facatory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
