package test;

public enum BrandEnum {

	RENAULT, CITROEN, PEUGEOT, OPEL;

	static BrandEnum findByValue(String brand) {

		if (BrandEnum.CITROEN.name().equals(brand)) {
			return BrandEnum.CITROEN;
		}
		if (BrandEnum.RENAULT.name().equals(brand)) {
			return BrandEnum.RENAULT;
		}

		if (BrandEnum.PEUGEOT.name().equals(brand)) {
			return BrandEnum.PEUGEOT;
		}
		if (BrandEnum.OPEL.name().equals(brand)) {
			return BrandEnum.OPEL;
		}
		return null;
	}

	public static void main(String args[]) {

		String str = "RENAULT";

		String strlow = str.toLowerCase();

		System.out.println(strlow);

		String str1 = "OPEL";

		String str1low = str1.toLowerCase();

		System.out.println(str1low);
		String str2 = "PEUGEOT";

		String str2low = str2.toLowerCase();

		System.out.println(str2low);
		String str3 = "CITROEN";

		String str3low = str3.toLowerCase();

		System.out.println(str3low);
	}

}
