package com.company.factory;

public class MercedesFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Mercedes();
    }
}
