package inspiron;

public class typeCasteNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			byte b=10; 
			 
			int i=b;// will accept - automatic type promotion
			 
			byte c=(byte)i;// will not accept - because lower type cannot be put in higher
			 
			byte d=(byte)i;// Type casting makes it possible to store compatible types.
			 
			byte x=10; 
			byte y=20; 
			 
			int sum= (x*y); // Error is thrown because when two bytes are used in a 

	}

}
