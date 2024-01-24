package org.example.factories;

import org.example.aircrafts.IAircraft;
import org.example.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
