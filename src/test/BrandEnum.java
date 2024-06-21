package test;

public enum BrandEnum {

	Renault, Citroen, Peugeot, Opel;

	static BrandEnum findByValue(String brand) {
		
		if(BrandEnum.Citroen.name().equals(brand)) {
			return BrandEnum.Citroen;
		} 
		if(BrandEnum.Renault.name().equals(brand)) {
			return BrandEnum.Renault;
		} 
	
		if(BrandEnum.Peugeot.name().equals(brand)) {
			return BrandEnum.Peugeot;
		} 
		if(BrandEnum.Opel.name().equals(brand)) {
			return BrandEnum.Opel;
		} return null;
	}
	
	
}
