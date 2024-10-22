package com.example.CaseStudies;

public class ParkingLot {
    /*

    Description:
        A parking lot is a dedicated area for parking vehicles. A user can park his/her vehicle based on
        available space. Upon checkout the user can pay a parking fee based on time spent.

    System Requirements:
        - The parking lot should have multiple levels, each level with a certain number of parking spots.
        - The parking lot should support different types of vehicles, such as cars, motorcycles, and trucks.
        - Each parking spot should be able to accommodate a specific type of vehicle.
        - The system should assign a parking spot to a vehicle upon entry and release it when the vehicle exits.
        - The system should track the availability of parking spots and provide real-time information to customers.
        - The system should handle multiple entry and exit points and support concurrent access.

    Users:
        - Parking attendant
        - Admin

    System Interface:
        - parkingLevel CRUD
        - parkingSpot CRUD
        - checkIn()
        - checkOut()
        - getParkingLotDetails()

    Class diagram (mermaid):

    classDiagram
	class ParkingLot {
		-id
		-name
		-parkingLevels
		+parkVehicle()
		+exitVehicle()
	}

	class ParkingLevel {
		-id
		-code
		-parkingSpots
		+getAvailableParkingSpots()
	}

	class ParkingSpot {
		-id
		-code
		-spotType
		-parkingStatus
		+reserveParkingSpot()
		+releaseParkingSpot()
	}

	class ParkingStatus {
		<<enumeration>>
		VACANT
		OCCUPIED
	}

	class Vehicle {
		-id
		-licenseNumber
		+getParkingTariff()
	}

	class TwoWheelerVehicle {
	}

	class FourWheelerVehicle {
	}

	class ParkingTicket {
		-id
		-vehicle
		-parkingSpot
		-checkinTime
		-checkoutTime
		-cost
	}

	class ParkingService {
		+getParkingDisplay()
		+checkIn()
		+checkOut()
	}

	class PaymentService {
		+calculateCharges()
		+makePaymrnt()
	}

	ParkingLot *-- ParkingLevel
	ParkingLevel *-- ParkingSpot
	ParkingSpot --> ParkingStatus
	Vehicle <|-- TwoWheelerVehicle
	Vehicle <|-- FourWheelerVehicle
	ParkingTicket --> Vehicle
	ParkingTicket --> ParkingSpot



     */
}
