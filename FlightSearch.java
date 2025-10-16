package flight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;

public class FlightSearch {
   private String  departureDate = "01/01/2001";
   private String  departureAirportCode = "ERROR";
   private boolean emergencyRowSeating = false;
   private String  returnDate = "01/01/2001";
   private String  destinationAirportCode = "ERROR"; 
   private String  returnAirportCode = "ERROR";
   private String  seatingClass = "ERROR";
   private int     adultPassengerCount = -1;
   private int     childPassengerCount = -1;
   private int     infantPassengerCount = -1;
   
   public String getDepartureDate() {
	   return this.departureDate;
   }
   public String getDepartureAirport() {
	   return this.departureAirportCode;
   }
   public String getReturnDate() {
	   return this.returnDate;
   }
   public String getDestinationAirport() {
	   return  this.destinationAirportCode;
   }
   public String getReturnAirport() {
	   return this.returnAirportCode;
   }
   public String getSeatingClass() {
	   return this.seatingClass;
   }
   public int getAdultPax() {
	   return this.adultPassengerCount;
   }
   public int getChildPax() {
	   return this.childPassengerCount;
   }
   public int getInfantPax() {
	   return this.infantPassengerCount;
   }
   public boolean getEmergency() {
	   return this.emergencyRowSeating;
   }

   public boolean runFlightSearch(String departureDate,    String departureAirportCode,   boolean emergencyRowSeating, 
                                  String returnDate,       String destinationAirportCode, String returnAirportCode, String seatingClass, 
                                  int adultPassengerCount, int childPassengerCount,       int infantPassengerCount) {
     boolean valid = false;

 	 DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
 	 LocalDate depDate;
 	 LocalDate retDate;
 	 List<String>seatingClasses = new ArrayList<>();
 	 seatingClasses.add("economy");
 	 seatingClasses.add("premium economy");
 	 seatingClasses.add("first");
 	 seatingClasses.add("business");
 	 List<String>airportCodes = new ArrayList<>();
 	 airportCodes.add("syd");
 	 airportCodes.add("mel");
 	 airportCodes.add("lax");
 	 airportCodes.add("cdg");
 	 airportCodes.add("del");
 	 airportCodes.add("pvg");
 	 airportCodes.add("doh");
 	
 	 if(adultPassengerCount < 0 || childPassengerCount < 0 || infantPassengerCount < 0) {
 		 return false;
 	 }
     
 	 int totalPassenger = adultPassengerCount + childPassengerCount + infantPassengerCount;
  
      
      if(totalPassenger < 1 || totalPassenger > 9) {
    	  System.out.println("Invalid Passenger Count");
    	  return false;
      }
      
	 if(childPassengerCount > 0 && emergencyRowSeating) {
		 System.out.println("Invalid Child Seating (emergency row)");
		 return false;  
	      }
	 
	 if(childPassengerCount > 0 && seatingClass.toLowerCase().equals("first")) {
		 System.out.println("Invalid Child Seating (first class)");
		  return false;
	 }
	 
	 if(infantPassengerCount > 0 && emergencyRowSeating) {
		 System.out.println("Invalid Infant Seating (emergency row)");
		  return false;
	 }
	 
	 if(infantPassengerCount > 0 && seatingClass.toLowerCase().equals("business")) {
		 System.out.println("Invalid Infant Seating (business class)");
		  return false;
	 }
	 
	 if(adultPassengerCount*2 < childPassengerCount) {
		 System.out.println("Invalid Child to Adult ratio");

		  return false;
	 }
	 
	 if(infantPassengerCount > adultPassengerCount) {
		 System.out.println("Invalid Infant to Adult ratio");
		 return false;
	 }
	 
	 if(!departureAirportCode.equals(returnAirportCode)) {
		 System.out.println("Invalid Return Airport Code");
		 return false;
	 }


	 try {
		    depDate = LocalDate.parse(departureDate, format);
		    //System.out.println("date parses");
		    //return true;
		} catch (DateTimeParseException e) {
			System.out.println("Departure Invalid date format");
		    return false;
		}
	 try {
		    retDate = LocalDate.parse(returnDate, format);
		    //System.out.println("date parses");
		    //return true;
		} catch (DateTimeParseException e) {
			System.out.println("Return Invalid date format");
		    return false;
		}
	 
	 if(depDate.isBefore(LocalDate.now())) {
		 System.out.println("Invalid Date (past date)");
		 return false;
	 }
	 
	 if(retDate.isBefore(depDate)) {
		 System.out.println("Invalid date (return before departure)");
		 return false;
	 }
	 
	 if(!seatingClasses.contains(seatingClass.toLowerCase())) {
		 System.out.println("Invalid seating selected");
		 return false;
		 
	 }
	 if(!airportCodes.contains(destinationAirportCode.toLowerCase())) {
		 System.out.println("Invalid Destination Airport Code");
		 return false;
	 }
	 if(!airportCodes.contains(departureAirportCode.toLowerCase())) {
		 System.out.println("Invalid Departure Airport Code");
		 return false;
	 }
	 if(!departureAirportCode.toLowerCase().equals(returnAirportCode.toLowerCase())) {
		 System.out.println("Invalid Return Trip");
		 return false;
	 }
	 if(departureAirportCode.toLowerCase().equals(destinationAirportCode.toLowerCase())){
		 System.out.println("Invalid Departure and Destination Airport Code");
		 return false;
	 }
	 if(!seatingClass.toLowerCase().equals("economy") && !seatingClass.toLowerCase().equals("premium economy")
			 && !seatingClass.toLowerCase().equals("business") && !seatingClass.toLowerCase().equals("first")) {
		 System.out.println("seating class does not match anything");
		 return false;
	 }
	 if(!seatingClass.toLowerCase().equals("economy") && emergencyRowSeating) {
		 System.out.println("seating class does not match econ and Emer seating");
		 return false;
	 }
	 
	 
	 
	 this.departureDate = departureDate;
	 this.departureAirportCode = departureAirportCode;
	 this.emergencyRowSeating = emergencyRowSeating;
	 this.returnDate = returnDate;
	 this.destinationAirportCode = destinationAirportCode; 
	 this.seatingClass = seatingClass;
	 this.adultPassengerCount = adultPassengerCount;
	 this.childPassengerCount = childPassengerCount;
	 this.infantPassengerCount = infantPassengerCount;
	 this.returnAirportCode = returnAirportCode;
      
      return valid;
   }
}