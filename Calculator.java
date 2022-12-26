package week1.day1;


public class Calculator { 
	
    public void subracttwoNumber() {
    	int a= 10 ;
    	int b= 8 ;
    	System.out.println(a-b);
		
	}
    public int  multiplyTwonumber(int a,int b) {
    	int c = a*b ;
    	return c ;
		
	}

    	
	
	
       public static void main(String[] args) {
               Calculator obj = new Calculator();
               obj.subracttwoNumber();
               obj.multiplyTwonumber(7, 8);
               System.out.println(obj.multiplyTwonumber(7,8));
       }
}
		

		
	    
		
		
		
		


