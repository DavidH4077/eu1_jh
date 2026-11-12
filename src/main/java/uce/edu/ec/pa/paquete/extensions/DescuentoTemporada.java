package uce.edu.ec.pa.paquete.extensions;

import uce.edu.ec.pa.paquete.Pedido;

public class DescuentoTemporada implements DescuentoExtension {

    @Override
    public double calcularDescuento(Pedido precio) {
        double descuento = 0.0;
        if (precio.getTipoCliente().equalsIgnoreCase("TEMP")) {
            descuento = precio.getValorOriginal() * 0.25;
        }
        return descuento;
    }

}
