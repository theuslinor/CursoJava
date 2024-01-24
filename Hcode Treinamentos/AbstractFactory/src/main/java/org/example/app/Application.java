package org.example.app;

import org.example.aircrafts.IAircraft;
import org.example.factories.ITransportFactory;
import org.example.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
