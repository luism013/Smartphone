/*
 * Exercise where you will be given various smart phones from different
 * brands, models and pricepoints. Your job is to carefully read the
 * methods to be completed in order to help the customer meet his 
 * standards and have a successful purchase. 
 */
public class Smartphone {

	private String brand;
	private String model;
	private int price;
	private boolean isAvailable;
	
	public Smartphone(String brand, String model, int price, boolean isAvailable) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	@Override
	public boolean equals(Object c2) {
		if (!(c2 instanceof Smartphone)) {
			throw new RuntimeException("Illegal argument to Smarthphone.equals()");
		}
		Smartphone phone2 = (Smartphone) c2;
		return ((this.getBrand().equals(phone2.getBrand())) &&
				(this.getModel().equals(phone2.getModel())) &&
				(this.getPrice() == phone2.getPrice()));
	}

	@Override
	public String toString() {
		return "[" + brand  + "," + model + "," + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
	
	public boolean getAvailability() {
		return isAvailable;
	}
	
	// returns the amount of smartphones of a specific brand in the array
	public int countByPhoneBrand(Smartphone[] stock, Smartphone target) {
		int counter = 0;
		for (int i = 0; i < stock.length; i++) {
			if(stock[i].getBrand().equals(target.getBrand()))
				counter++;
		}
		return counter;
	}
	
	// returns true if the specific desired phone is available in stock
	public boolean findSpecificPhone(Smartphone[] stock, Smartphone target) {
		if(getAvailability()) {
			for (int i = 0; i < stock.length; i++) {
				if(stock[i].equals(target))
					return true;
			}
		}
		return false;
	}
	
	// returns the phone in stock with the highest.
	public Smartphone highestPrice(Smartphone[] stock) {
		int maxPrice = stock[0].getPrice();
		Smartphone target = stock[0];
		for (int i = 1; i < stock.length; i++) {
			if(maxPrice < stock[i].getPrice()) {
				maxPrice = stock[i].getPrice();
				target = stock[i];
			}
		}
		return target;
	}
	
	//returns an array of phones who's price is below the given budget. 
	//the array to return must have valid contiguous positions(there cannot be void
	// spaces in between).
	public Smartphone[] phonesInBudget(Smartphone[] stock, int budget) {
		int k = 0;
		Smartphone[] phones = new Smartphone[stock.length];
		
		for (int i = 0; i < stock.length; i++) {
			if(stock[i].getPrice() < budget) {
				phones[k] = stock[i];
				k++;
			}
		}
		return phones;
	}
	
	// returns the specific model from a specific brand that the customer is looking for.
	// returns null if the desired model does not exist. Must stop looking as soon as the model is found
	public Smartphone findModel(Smartphone[] stock, Smartphone target) {
		Smartphone model = null;
		if(getAvailability()) {
			for (int i = 0; i < stock.length; i++) {
				if(stock[i].getBrand().equals(target.getBrand())
						&& stock[i].getModel().equals(target.getModel())) {
					model = stock[i];
					break;
				}
			}
		}
		return model;
	}
	
	//returns true iff there are two variants of the same model in stock. Must stop as soon as the pair is found.
	public boolean twoSameModelsExist(Smartphone stock[]) {
		boolean condition = false;
		for (int i = 0; i < stock.length; i++) {
			for (int j = 0; j < stock.length; j++) {
				if(stock[i].getModel().equals(stock[j])) {
					condition = true;
					break;
				}
			}
		}
		return condition;
	}
	
	// returns the phone to be bought by the customer. 
//	public Smartphone bought(Smartphone[] stock, Smartphone target) {
//		Smartphone customerPhone = null;
//		int index = 0;
//		
//		if(getAvailability()) {
//			for (int i = 0; i < stock.length; i++) {
//				if(stock[i].equals(target)) {
//					customerPhone = stock[i];
//					break;
//				}
//			}
//		}
//		
//		debating if I should make this a given method or not.
//		for (int i = index; i < stock.length; i++) {
//			stock[i] = stock[i+1];
//		}
//		
//		return customerPhone;
//	}
	
}
