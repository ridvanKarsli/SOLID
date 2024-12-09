package SOLID;


class Toplama implements IslemYapabilir {

	public double islemyap(double sayi1, double sayi2) {
		return sayi1 + sayi2;
	}
}

class Cikartma implements IslemYapabilir {

	public double islemyap(double sayi1, double sayi2) {
		return sayi1 - sayi2;
	}
}

class Carpma implements IslemYapabilir {

	public double islemyap(double sayi1, double sayi2) {
		return sayi1 * sayi2;
	}
}

class Bolme implements IslemYapabilir {

	public double islemyap(double sayi1, double sayi2) {
		return sayi1 / sayi2;
	}
}

