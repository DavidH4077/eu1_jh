package uce.edu.ec.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.pa.paquete.extensions.NotificacionMail;
import uce.edu.ec.pa.paquete.interceptors.MedirTiempo;
import uce.edu.ec.pa.paquete.interceptors.NotificacionI;

@ApplicationScoped
public class PedidoService {

    @MedirTiempo
    @NotificacionI
    public void procesarPedido(Pedido pedido, NotificacionMail notificacionMail) {
        System.out.println("Procesando Pedido......");
        System.out.println("Pedido con codigo: " + pedido.getCodigo());
        System.out.println("El producto es:" + pedido.getProducto());
        System.out.println("Su valor es de:" + pedido.getValorOriginal());
        System.out.println("Usted es un cliente" + pedido.getTipoCliente());

        System.out.println("El pedido fue procesado con exito.");

    }
}
