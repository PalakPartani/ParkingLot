package com.brigelabz.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

    ParkingLot parkingLot = null;
    Object vehicle = null;

    @Before
    public void setUp() throws Exception {
        parkingLot = new ParkingLot(1);
        vehicle = new Object();
    }


    //test for if driver can park
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        try {
            parkingLot.CheckParkVehicle(vehicle);
            boolean isParked = parkingLot.isVehiclePark();
            Assert.assertTrue(isParked);
        }catch (ParkingLotException e ){

        }
    }

    //check for if driver can un park
    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() {

        boolean isUnParked =false;
        try{
            parkingLot.CheckParkVehicle(vehicle);
            isUnParked=parkingLot.unParkVehicle(vehicle);
            Assert.assertTrue(isUnParked);
        }
        catch (ParkingLotException e){

        }
    }

    //check the object of vehicle if not same should return false
    @Test
    public void givenVehicleParked_WhenUnParkedAsAnotherVehicle_ShouldThrowException() {

        try {
            parkingLot.CheckParkVehicle(vehicle);
            boolean isUnParked = parkingLot.unParkVehicle(new Object());
            Assert.assertFalse(isUnParked);
        } catch (ParkingLotException e) {
            Assert.assertEquals("VEHICLE IS DIFFERENT", e.getMessage());
        }
    }
    @Test
    public void givenVehicleParked_WhenVehicleIsNotPresent_ShouldThrowException() {
        try {
            parkingLot.CheckParkVehicle(null);
            boolean isParked = parkingLot.isVehiclePark();
            Assert.assertTrue(isParked);
        } catch (ParkingLotException e) {
            Assert.assertEquals("VEHICLE NOT FOUND", e.getMessage());
        }
    }

    @Test
    public void givenVehicle_WhenParkingLotIsFull_ShouldThrowException() {
        try {
            parkingLot.CheckParkVehicle(vehicle);
            parkingLot.CheckParkVehicle(new Object());
           // System.out.println("car entered");
        } catch (ParkingLotException e) {
            Assert.assertEquals("PARKING CAPACITY IS FULL", e.getMessage());
        }
    }
}
