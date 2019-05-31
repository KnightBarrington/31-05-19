
	class Product{
		
		//Attributes
	//private int pid;
		int pid;
	String name;
	 int price;
		
		// constructor
		Product(){
			System.out.println(">>....Product Object Constructed");
		}
	

	// methods
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println("..>>>> Data written in Product Object");
	}
	
		
	void showProductDetails() {
		System.out.println("-------Product ID: " +pid+ "--------");
		System.out.println("Name :\t" + name);
		System.out.println("Price:\t" + price);
	
		System.out.println("---------------------");
	
	}
	
	void setPid(int pid) {
	
	this.pid = pid ;
	
	}
	
	
	int getPid() {
		return pid;
	}
}
	
	class Mobile extends Product{
		//Additional Attributes of Mobile other than the product
		String os;
		int ram;
		int sdCardsize;
		
		
		Mobile(){
			System.out.println("........>>>>>..Mobile Object Constructed <<<<<<");
		}
		
		//we have redefined the same method from the parent into the child with different inputs
		//now i have 2 methods in the child, ! from the parent and ! of Child
		// both are different as in based on inputs(even though name is the same)
		//Method Overloading : same method name with different inputs
		void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardsize) {
			this.pid = pid;
			this.name = name;
			this.price = price;
			this.os = os;
			this.ram = ram;
			this.sdCardsize = sdCardsize;
			System.out.println("..>>>> Data written in Mobile Object");
		}
		
		// I redefined show product details as well
		//but here we have the same inputs
		// 2 methods, 1 from parent 1 in child and have same signatures
		//child methods will be executed and not the parent method
		
		//Overriding
		void showProductDetails() {
			System.out.println("-------Product ID: " +pid+ "--------");
			System.out.println("Name:\t" + name);
			System.out.println("Price:\t" + price);
			System.out.println("OS: \t" + os);
			System.out.println("RAM: \t" + ram);
			System.out.println("SDCard:\t" +sdCardsize);
		
		
			System.out.println("---------------------");
		
	}
}
	
	public class InheritanceApp {
		
		public static void main(String [] args) {
			
//			// create an object : product
//			Product product1 = new Product();
//			// product is not an object its a reference variable which holds the hashcode of the object 
//			
//			//System.out.println("Product is: "+ product);// output is 15db9742 as hash code, product is a ref var not an object
//			
//			// writing data in object
//			product1.setProductDetails(101, "Samsung J2 Pro" , 9500);
//			
//			// reading data from product
//			product1.showProductDetails();
//			System.out.println();
//			
//			
//			//lets write the data directly
//			Product product2 = new Product();
//			//product2.pid = 201;// error since attributes are set to private
//			product2.setPid(201);
//			product2.name = "Jordan 1 Cactus Jack Shoes";
//			product2.price = 500;
//			product2.showProductDetails();
			
			// requesting to get mobile object constructed 
			Mobile mobile = new Mobile();
			// product object get constructed before the mobile object !!
			
			//mobile.setProductDetails(301, "iPhoneX", 4500);
			//mobile.showProductDetails();
			
			mobile.setProductDetails(301, "iPhone X", 4500, "iOS", 38, 32);
			mobile.showProductDetails();
			
			
		}
		
		
	}

	
	
	
	
	
	
	
		

	



