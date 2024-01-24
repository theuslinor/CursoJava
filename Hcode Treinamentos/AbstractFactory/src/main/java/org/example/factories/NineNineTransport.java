package org.example.factories;

import org.example.aircrafts.Helicopter;
import org.example.aircrafts.IAircraft;
import org.example.landvehicles.ILandVehicle;
import org.example.landvehicles.Motorcicle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcicle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
