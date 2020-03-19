package com.brigelabz.parkinglot;

public class ParkingLot {
    private Object vehicle;

    public boolean CheckParkVehicle(Object vehicle) {
        this.vehicle = vehicle;
        return true;
    }
    public boolean unParkVehicle(Object vehicle) {
        if (this.vehicle.equals(vehicle))
            return true;
        return false;
    }
}
