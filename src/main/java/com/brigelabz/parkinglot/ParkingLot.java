package com.brigelabz.parkinglot;

public class ParkingLot {
    private Object vehicle;
    private final int capacity;
    private int currentCapacity = 0;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public void CheckParkVehicle(Object vehicle) throws ParkingLotException {
        if (this.capacity == currentCapacity)
            throw new ParkingLotException("PARKING CAPACITY IS FULL", ParkingLotException.ExceptionType.OCCUPIED);
        this.vehicle = vehicle;
        currentCapacity++;

    }

    public boolean isVehiclePark() throws ParkingLotException {
        if (this.vehicle != null)
            return true;
        throw new ParkingLotException("VEHICLE NOT FOUND", ParkingLotException.ExceptionType.VEHICLE_NOT_FOUND);
    }

    public boolean unParkVehicle(Object vehicle) throws ParkingLotException {
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        throw new ParkingLotException("VEHICLE IS DIFFERENT", ParkingLotException.ExceptionType.VEHICLE_NOT_FOUND);    }
}

