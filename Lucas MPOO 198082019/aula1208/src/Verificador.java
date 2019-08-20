package src;

public class Verificador {
	
	public boolean verificarTipoFruta(Fruta fruta) {
		
		if (fruta.isClimaterica())
			
			return true;
		return false;
	}
	
	public static boolean verificarDataColheita(Fruta fruta) {
		//modificar o corpo para date.
		if (fruta.getData() > 3)
			return true;
		return false;
	}

}
