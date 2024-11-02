package com.company.factory;

import static com.company.factory.Model.*;

public class Main {
    public static void main(String[] args) {
        var vehicleFactory = createVehicleFactoryByModel(BMW);
        var vehicle = vehicleFactory.createVehicle();
        vehicle.start();
    }

    private static VehicleFactory createVehicleFactoryByModel(Model model) {
        return switch (model) {
            case BMW -> new BMWFactory();
            case MERCEDES -> new MercedesFactory();
        };
    }
}
