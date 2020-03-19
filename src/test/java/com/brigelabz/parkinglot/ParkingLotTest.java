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
        vehicle = new Object();
    }


    //test for if driver can park
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        ParkingLot parkingLotSystem = new ParkingLot();
        boolean isParked = parkingLotSystem.CheckParkVehicle(vehicle);
        Assert.assertTrue(isParked);
    }

    //check for if driver can un park
    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() {
        parkingLot.CheckParkVehicle(vehicle);
        boolean isUnParked =false;
        try{
            isUnParked=parkingLot.unParkVehicle(vehicle);
        }
        catch (ParkingLotException e){

        }
        Assert.assertTrue(isUnParked);
    }

    //check the object of vehicle if not same should return false
    @Test
    public void givenVehicleParked_WhenUnParkedAsAnotherVehicle_ShouldThrowException() {
        parkingLot.CheckParkVehicle(vehicle);
        try {
            boolean isUnParked = parkingLot.unParkVehicle(new Object());
            Assert.assertFalse(isUnParked);
        } catch (ParkingLotException e) {
            Assert.assertEquals("VEHICLE IS NOT AVAILABLE", e.getMessage());
        }
    }
}
