package theus.designpattern.facatory.vehicle;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida");
    }
}
