package Task_4.Clean_code;
public class GetHouseType {

	public TotalAmount getPlan(String houseType)
	{  
        if(houseType == null){  
         return null;  
        }  
      if(houseType.equalsIgnoreCase("s material")) {  
             return new SMaterial();  
           }   
       else if(houseType.equalsIgnoreCase("  AStanadardmaterial")){  
            return new AStandardMaterial();  
        }   
      else if(houseType.equalsIgnoreCase("Highstandard material")) {  
            return new HMaterial();  
      }
      else if(houseType.equalsIgnoreCase("Fullautomatic")) {  
    	  return new FullAutomatic();
      }
  return null;  
}  
}
