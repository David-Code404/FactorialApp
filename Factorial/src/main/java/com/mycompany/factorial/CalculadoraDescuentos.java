package com.mycompany.factorial;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDescuentos {

    /**
     * Calcula el precio final después de aplicar un descuento.
     *
     * @param precioOriginal     El precio del producto antes del descuento.
     * @param porcentajeDescuento El porcentaje de descuento (ej. 20 para 20%).
     * @return El precio final con dos decimales.
     */
    public double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {
        
        // Regla 2: Validar precio original
        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }

        // Regla 1: Validar porcentaje de descuento
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }

        // Calcular el descuento
        double descuento = precioOriginal * (porcentajeDescuento / 100.0);
        double precioFinal = precioOriginal - descuento;

        // Regla 3: Redondear a dos decimales
        // Usamos BigDecimal para precisión financiera, que es una mejor práctica.
        BigDecimal bd = new BigDecimal(Double.toString(precioFinal));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
