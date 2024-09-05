package com.example.CaseStudies;

public class ParkingLot {
    /*

    Description:
        A parking lot is a dedicated area for parking vehicles. A user can park his/her vehicle based on
        available space. Upon checkout the user can pay a parking fee based on time spent.

    System Requirements:
        - A parking lot should have multiple entry and exit points
        - A parking lot has dedicated spots for 2 and 4 wheeler
        - Customers can park their vehicle only in the vacant spots and based on their vehicle type
        - A display board should show the number of spots available for each vehicle type
        - Customers can get a parking ticket on check-in and pay a parking fee on exit.
        - The parking fee should be based on the amount of time spent in parking lot
            (10 Rs per hour for 2 vehicle and 20 Rs per hour for 4-vehicle ).
        - The customers can pay with either cash, credit/debit card or UPI

    Users:
        - Parking attendant
        - Admin

    Use cases:
        - Add/Remove/Edit/Get for parking spot: Admin
        - Add/Remove/Edit/Get for parking attendant: Admin
        - Vehicle checkin: Attendant can check-in vehicle and give a parking ticket
        - Get parking fee: Get parking fee based on checkin time
        - Vehicle checkout: Checkout vehicle after receiving payment

    Class diagram:
        ParkingLot
            -code: String
            -parkingSpots: List<ParkingSpot>

        ParkingSpot
            -code: String
            -vehicleType: VehicleType
            -vacant: Boolean

        Vehicle
            -number: String
            -vehicleType: VehicleType

        VehicleType
            TWO_WHEELER
            FOUR_WHEELER

        Ticket
            -code: String
            -parkingSpot: ParkingSpot
            -vehicle: Vehicle
            -checkinTime: Date
            -parkingFeeCalculator: ParkingFeeCalculator

        # Apply strategy pattern here
       ParkingFeeCalculator -> Interface
            +getParkingFee(): Double


     */
}
