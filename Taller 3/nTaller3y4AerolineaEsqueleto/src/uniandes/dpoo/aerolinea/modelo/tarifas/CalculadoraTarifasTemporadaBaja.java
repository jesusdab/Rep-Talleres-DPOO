package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class CalculadoraTarifasTemporadaBaja{
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.02;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTOS_GRANDES = 0.2;
	

	public CalculadoraTarifasTemporadaBaja(){
		
	}
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
	}
}