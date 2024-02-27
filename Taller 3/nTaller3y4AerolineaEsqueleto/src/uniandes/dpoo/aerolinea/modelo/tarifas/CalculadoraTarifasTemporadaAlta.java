package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class CalculadoraTarifasTemporadaAlta{
	protected int COSTO_POR_KM = 1000;
	public CalculadoraTarifasTemporadaAlta(){
		
	}
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}