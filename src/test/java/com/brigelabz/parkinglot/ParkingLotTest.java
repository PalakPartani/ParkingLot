package com.brigelabz.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

    ParkingLot parkingLot = null;
    Object vehicle = null;

    @Before
    public void setUp() throws Exception {
        parkingLot = new ParkingLot();
        vehicle= new Object();
    }


    //test for initial status of parking lot
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        ParkingLot parkingLotSystem = new ParkingLot();
        boolean isParked = parkingLotSystem.CheckParkVehicle(vehicle);
        Assert.assertTrue(isParked);
    }

    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() {
        parkingLot.CheckParkVehicle(vehicle);
        boolean isUnParked = parkingLot.unParkVehicle(vehicle);
        Assert.assertTrue(isUnParked);
    }
}
