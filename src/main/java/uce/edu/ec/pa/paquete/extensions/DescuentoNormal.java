package uce.edu.ec.pa.paquete.extensions;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.pa.paquete.Pedido;

@ApplicationScoped
public class DescuentoNormal implements DescuentoExtension {

    @Override
    public double calcularDescuento(Pedido precio) {
        double descuento = 0.0;
        return descuento;
    }

}
