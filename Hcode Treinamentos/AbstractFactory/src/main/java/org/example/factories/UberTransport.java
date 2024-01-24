package org.example.factories;

import org.example.aircrafts.Airplane;
import org.example.aircrafts.IAircraft;
import org.example.landvehicles.Car;
import org.example.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
