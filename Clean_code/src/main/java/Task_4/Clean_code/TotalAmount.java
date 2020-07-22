package Task_4.Clean_code;      
abstract public class TotalAmount{  
         protected double rate;  
         abstract void getRate();  
   

		public double calculateBill(double sqrfoot) {
			return sqrfoot*rate;
		}  
}