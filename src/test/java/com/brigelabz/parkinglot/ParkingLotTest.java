package com.brigelabz.parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    //test for initial status of parking lot
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        ParkingLot parkingLotSystem = new ParkingLot();
        boolean isParked = parkingLotSystem.CheckParkVehicle();
        Assert.assertTrue(isParked);
    }
}
