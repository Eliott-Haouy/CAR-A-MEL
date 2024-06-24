package test;

import test.utils.StringNormalizer;

public enum BrandEnum {

	RENAULT, CITROEN, PEUGEOT, OPEL;

	static BrandEnum findByValue(String brand) {
		brand = StringNormalizer.removeAccents(brand.trim().toUpperCase());

		if (BrandEnum.CITROEN.name().equals(brand.toUpperCase())) {
			return BrandEnum.CITROEN;
		}
		if (BrandEnum.RENAULT.name().equals(brand.toUpperCase())) {
			return BrandEnum.RENAULT;
		}

		if (BrandEnum.PEUGEOT.name().equals(brand.toUpperCase())) {
			return BrandEnum.PEUGEOT;
		}
		if (BrandEnum.OPEL.name().equals(brand.toUpperCase())) {
			return BrandEnum.OPEL;
		}
		return null;
	}

}
