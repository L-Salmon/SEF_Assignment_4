package flight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Test_Suite {
	//Test Case 1.2
	@Test
	void tooManyPassengers() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
               "02/02/2026", "syd", "mel", "economy", 5, 2, 3);
		
		assertFalse(result, "Flight search should return false for >9 passenger");
		
		 // Verify that object state has not changed
	    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
	    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
	    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
	    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
	    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
	    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
	    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
	    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
	    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
	    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 1.1
	@Test
	void too_few_passengers() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
               "02/02/2026", "syd", "mel", "economy", 0, 0, 0);
		
		assertFalse(result, "Flight search should return false for 0 passengers");
		
		 // Verify that object state has not changed
	    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
	    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
	    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
	    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
	    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
	    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
	    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
	    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
	    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
	    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 1.3
	@Test
	void negative_passengers() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
               "02/02/2026", "syd", "mel", "economy", 5, -2, 0);
		
		assertFalse(result, "Flight search should return false for -x passengers");
		
		 // Verify that object state has not changed
	    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
	    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
	    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
	    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
	    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
	    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
	    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
	    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
	    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
	    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 2.1
	@Test
	void child_in_emergency_row() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "economy", 2, 1, 0);
			
			assertFalse(result, "Flight search should return false for child in emergency");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 2.2
	@Test
	void child_in_first_class() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "first", 1, 1, 0);
			
			assertFalse(result, "Flight search should return false for child in first class");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 3.1
	@Test
	void infant_in_emegency() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "economy", 1, 0, 1);
			
			assertFalse(result, "Flight search should return false for infant in emergency");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 3.2
	@Test
	void infant_in_business() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "business", 1, 0, 1);
			
			assertFalse(result, "Flight search should return false for infant in business class");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 4.1
	@Test
	void invalid_child_to_adult() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "economy", 1, 3, 0);
			
			assertFalse(result, "More than 2:1 child to adult should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 5.1
	@Test
	void invalid_infant_to_adult() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "economy", 1, 0, 2);
			
			assertFalse(result, "More than 1:1 infant to adult should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 6.1
	@Test
	void past_date() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2025",  "mel", false, 
	               "02/02/2026", "syd", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Date in the past should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 6.2
	@Test
	void return_before_departure() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/01/2026", "syd", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Return before departure should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 6.3
	@Test
	void invalid_leap_year_date_used() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("29/02/2026",  "mel", false, 
	               "02/03/2026", "syd", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Date in the past should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 7.1
	@Test
	void invalid_date_format() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/Jan/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Date not in dd/mm/yyyy should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 7.2
	@Test
	void usa_date_format() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("01/30/2026",  "mel", false, 
	               "02/02/2026", "syd", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Date not in dd/mm/yyyy should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}

	@Test
	void valid_leap_year_date_used() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("29/02/2028",  "mel", false, 
	               "02/03/2028", "syd", "mel", "economy", 1, 0, 0);
			
			assertTrue(result, "Date in the past should return false");
			
			// Verify that object state has been updated
		    assertNotEquals(default_departureDate, flight.getDepartureDate(), "Departure date should be updated");
		    assertNotEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should be updated");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency seating flag should be updated");
		    assertNotEquals(default_returnDate, flight.getReturnDate(), "Return date should be updated");
		    assertNotEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should be updated");
		    assertNotEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should be updated");
		    assertNotEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should be updated");
		    assertNotEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should be updated");
		    assertNotEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should be updated");
		    assertNotEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should be updated");
		
	}
	//Test Case 8.1
	@Test
	void destination_is_departure() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2025",  "mel", false, 
	               "02/02/2026", "mel", "mel", "economy", 1, 0, 0);
			
			assertFalse(result, "Destination = departure should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 8.2
	@Test
	void return_not_departure() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", false, 
	               "02/02/2026", "syd", "lax", "economy", 1, 0, 0);
			
			assertFalse(result, "Return airport != departure should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 9.1
	@Test
	void too_many_seating_classes() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "economy first", 1, 0, 0);
			
			assertFalse(result, "first class and emergency should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 9.2
	@Test
	void non_existant_seating_class() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "priority", 1, 0, 0);
			
			assertFalse(result, "first class and emergency should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 10.1
	@Test
	void first_class_emergency_row() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "first", 1, 0, 0);
			
			assertFalse(result, "first class and emergency should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 10.2
	@Test
	void business_class_emergency_row() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "mel", true, 
	               "02/02/2026", "syd", "mel", "business", 1, 0, 0);
			
			assertFalse(result, "first class and emergency should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 11.1
	@Test
	void invalid_airport_code() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("26/01/2026",  "adl", false, 
	               "02/02/2026", "syd", "adl", "economy", 1, 0, 0);
			
			assertFalse(result, "adl is not a recognised airport should return false");
			
			 // Verify that object state has not changed
		    assertEquals(default_departureDate, flight.getDepartureDate(), "Departure date should remain unchanged");
		    assertEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should remain unchanged");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency row seating flag should remain unchanged");
		    assertEquals(default_returnDate, flight.getReturnDate(), "Return date should remain unchanged");
		    assertEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should remain unchanged");
		    assertEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should remain unchanged");
		    assertEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should remain unchanged");
		    assertEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should remain unchanged");
		    assertEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should remain unchanged");
		    assertEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should remain unchanged");
		
	}
	//Test Case 12.1
	@Test
	void max_child_ratio_business_leapyear() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("29/02/2028",  "mel", false, 
	               "02/03/2028", "syd", "mel", "business", 3, 6, 0);
			
			assertTrue(result, "12.1 should be a valid test case");
			
			// Verify that object state has been updated
		    assertNotEquals(default_departureDate, flight.getDepartureDate(), "Departure date should be updated");
		    assertNotEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should be updated");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency seating flag should be updated");
		    assertNotEquals(default_returnDate, flight.getReturnDate(), "Return date should be updated");
		    assertNotEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should be updated");
		    assertNotEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should be updated");
		    assertNotEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should be updated");
		    assertNotEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should be updated");
		    assertNotEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should be updated");
		    assertNotEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should be updated");
		
	}
	//Test Case 12.2
	@Test
	void max_number_infants() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("28/01/2026",  "mel", false, 
	               "02/03/2026", "syd", "mel", "economy", 4, 0, 4);
			
			assertTrue(result, "12.2 should be a valid test case");
			
			// Verify that object state has been updated
		    assertNotEquals(default_departureDate, flight.getDepartureDate(), "Departure date should be updated");
		    assertNotEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should be updated");
		    assertEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency seating flag should be updated");
		    assertNotEquals(default_returnDate, flight.getReturnDate(), "Return date should be updated");
		    assertNotEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should be updated");
		    assertNotEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should be updated");
		    assertNotEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should be updated");
		    assertNotEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should be updated");
		    assertNotEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should be updated");
		    assertNotEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should be updated");
		
	}
	//Test Case 12.3
	@Test
	void min_pax_emergency_todays_date() {
		FlightSearch flight = new FlightSearch();
		//Default Values: 
		 String  default_departureDate = flight.getDepartureDate();
		 String  default_departureAirportCode = flight.getDepartureAirport();
		 boolean default_emergencyRowSeating = flight.getEmergency();
		 String  default_returnDate = flight.getReturnDate();
		 String  default_destinationAirportCode = flight.getDestinationAirport(); 
		 String  default_returnAirportCode = flight.getReturnAirport();
		 String  default_seatingClass = flight.getSeatingClass();
		 int     default_adultPassengerCount = flight.getAdultPax();
		 int     default_childPassengerCount = flight.getChildPax();
		 int     default_infantPassengerCount = flight.getInfantPax();
		 
		boolean result = flight.runFlightSearch("16/10/2025",  "mel", true, 
	               "16/10/2025", "syd", "mel", "economy", 1, 0, 0);
			
			assertTrue(result, "12.3 should be a valid test case");
			
			// Verify that object state has been updated
		    assertNotEquals(default_departureDate, flight.getDepartureDate(), "Departure date should be updated");
		    assertNotEquals(default_departureAirportCode, flight.getDepartureAirport(), "Departure airport should be updated");
		    assertNotEquals(default_emergencyRowSeating, flight.getEmergency(), "Emergency seating flag should be updated");
		    assertNotEquals(default_returnDate, flight.getReturnDate(), "Return date should be updated");
		    assertNotEquals(default_destinationAirportCode, flight.getDestinationAirport(), "Destination airport should be updated");
		    assertNotEquals(default_returnAirportCode, flight.getReturnAirport(), "Return airport should be updated");
		    assertNotEquals(default_seatingClass, flight.getSeatingClass(), "Seating class should be updated");
		    assertNotEquals(default_adultPassengerCount, flight.getAdultPax(), "Adult passenger count should be updated");
		    assertNotEquals(default_childPassengerCount, flight.getChildPax(), "Child passenger count should be updated");
		    assertNotEquals(default_infantPassengerCount, flight.getInfantPax(), "Infant passenger count should be updated");
		
	}


}
