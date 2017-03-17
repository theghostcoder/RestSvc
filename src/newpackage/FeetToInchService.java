package newpackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ConversionService")
public class FeetToInchService {
	
	@GET   //defining the operation
	@Path("/FeetToInch/{num}")
	@Produces(MediaType.TEXT_XML)
		public String ConvFeetToInch(@PathParam("num")int num){
		int feet = num;
		int inch = 0;
		inch = feet*12;
		
		return"<FeetToInchService>"
				+"<Feet>"+feet+"</Feet>"
				+"<Inch>"+inch+"</Inch>"
				+"</FeetToInchService>";
			}
	
	@GET //defining the operation
	@Path("/InchToFeet/{dig}")
	@Produces(MediaType.TEXT_XML)
	public String ConvInchToFeet(@PathParam("dig")int dig){
		int inch = dig;
		int feet=0;
		feet = inch/12;
		
		return"<InchToFeetService>"
				+ "<Inch>"+inch+"</Inch>"
				+"<Feet>"+feet+"</Feet>"
				+"</InchToFeetService>";
		
					}

}
