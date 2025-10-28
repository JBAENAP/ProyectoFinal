package models; 
public class Size implements DimensionCalculation {
	
	private double alto;
	private double ancho;
	private double largo; //cm
	private double peso; //kilos 
	@Override
	public String calcularVolumen(){
        double volumen = alto * ancho * largo;
        double peso;

        if (volumen <= 1000 && peso <=2) {
            return "Categoría 1";//moto
        } else if (volumen > 1000 && volumen <= 8000 && peso >2 && peso<=4 ) {
            return "Categoría 2";//moto
        } else if (volumen > 8000 && volumen <= 64000 && peso >4 && peso<=30 ) {
            return "Categoría 3";//moto
        }else if (volumen > 64000 && volumen <= 1250000 && peso >30 && peso<=50 ) {
            return "Categoría 4";//en carro
        }else if (volumen > 125000 && volumen <= 3430000 && peso >50 && peso<=70 ) {
            return "Categoría 5";//en camion
        }
        else if (volumen > 343000 && volumen <= 1000000 && peso >70 && peso<=100 ) {
            return "Categoría 5";//en camion
        }
        else {
            return "Categoría 3";
	}
	
	

}