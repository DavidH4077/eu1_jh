package uce.edu.ec.pa.paquete.extensions;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.pa.paquete.Pedido;

@ApplicationScoped
public class DescuentoVIP implements DescuentoExtension {

    @Override
    public double calcularDescuento(Pedido precio) {
        double descuento = 0.0;
        if (precio.getTipoCliente().equalsIgnoreCase("VIP")) {
            descuento = precio.getValorOriginal() * 0.15;
        }
        return descuento;
    }

}
