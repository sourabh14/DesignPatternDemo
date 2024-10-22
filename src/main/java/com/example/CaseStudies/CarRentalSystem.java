package com.example.CaseStudies;

public class CarRentalSystem {
    /*
        Car Rental System

Description
A car rental system allows users to rent vehicles for a short duration of time. The system supports multiple types of vehicles such as two-wheeler, four-wheeler. It allows administrators to manage car inventory, track bookings and handle customer information.


System Requirements
	Functional
		- User must be able to signup/login
		- User must be able to browse vehicles
			Input
				pickup location
				date range
			Filters
				Price
					hourly rentals (100 - 500 Rs per hr)
				Wheel Type
					Two wheeler types
						City Bike
						Sports Bike
					Four wheeler types
						Hatchback
						Sedan
						SUV
				Transmission Type
					Manual
					Automatic
				Fuel Type
					Diesel
					Petrol
					Electric
				User Rating
					1 - 5 stars
		- User must be able to book reservation for a time period and vehicle
		- User must be able to modify/cancel reservation
		- User must be able to view reservation details and past reservations
		- System must keep track of availability of vehicles
		- System must be able to accept payments for reservations

	Non-functional
		- System must be able to handle concurrent requests and ensure data consistency
		- System must be able to handle failure scenarios gracefully
		- System must be able to handle changing requirements


	Modules
		- User management
		- Vehicle inventory management
		- Vehicle booking management
		- Payment processing


classDiagram

	class User {
		-id
		-email
		-name
		-mobile
		-location
		-drivingLicense
	}

	class Location {
		-id
		-latitude
		-longitude
	}

	%% Bridge pattern

	class Vehicle {
		-id
		-code
		-name
		-vehicleType
		-transmissionType
		-fuelType
		-seatType
		-rating
		+getBaseRental()
	}

	class VehicleType {
		<<interface>>
	}

	class TwoWheeler {}
	class CityBike {}
	class SportsBike {}

	class FourWheeler {}
	class HatchbackCar {}
	class SedanCar {}
	class SuvCar {}

	class TransmissionType {
		<<interface>>
	}
	class Manual {}
	class Automatic {}

	class FuelType {
		<<interface>>
		+getBaseTariff()
	}
	class Petrol {}
	class Diesel {}
	class Electric {}

	class VehicleAvailability {
		-id
		-vehicle
		-location
		-startTime
		-endTime
		-
	}


     */
}
