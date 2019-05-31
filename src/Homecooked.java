
public class Homecooked extends Food{
	public static void main(String[] args) {
		
	Food bucky [] = new Food [2];
	bucky[0] = new Burger ();
	bucky[1] = new Taco ();
	
		for (int x= 0; x<2;++x){
			bucky[x].eat();
		}
		
		
}
}
