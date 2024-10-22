package com.example.CaseStudies;

public class CabBookingSystem {
    /*
        Low-level design for Ola (Cab booking system)

        Description:
            Cab booking system enables users to book cabs for a given source and destination. The system
            must be able to manage users, drivers, book cabs, track ride and make payments.

        System Requirements:
            Functional:
            User platform
                - A user must be able to signup/login to the platform
                - User must be able to book a ride for given source and destination.
                - While booking, user must be given option which will contain
                    -- vehicle type (bike, auto, hatchback car, sedan, suv)
                    -- price
                - User must be able to track the current ride
                - User must be able to make payment - UPI, wallet, cash
                - User must be able to view past rides

            Driver platform
                - Driver must be able to signup/login to the platform
                - Driver must be able to accept a ride
                - Driver must be able to start and end a ride
                - Driver must be able to track his daily earnings

            High level modules
                - User management
                - Driver management
                - Ride management
                - Payment processing

            Extended requirements:
                - User favourite places

            Non-functional requirements:
                - System must have smooth user experience, with minimum latency
                - System must be able to handle concurrent requests and handle data consistency
                - System must be able to gracefully handle failure scenarios


        System interface:
            - User CRUD : User
            - getRideOptions(source, dest)
            - bookRide(source, dest, rideOption) : User
            - trackRide(rideId) : User
            - makePayment(rideId) : User
            - getRideHistory() : User

            - Driver CRUD : Driver
            - acceptRideRequest(ride) : Driver
            - startRide() : Driver
            - endRide() : Driver
            - getTodaysEarnings() : Driver



     */
}
