package SOLID;

public class IslemFabrikası {
	
	public static IslemYapabilir getInstance() {
		return new Toplama();
	}

}
