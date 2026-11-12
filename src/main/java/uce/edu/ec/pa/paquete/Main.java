package uce.edu.ec.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ec.pa.paquete.extensions.DescuentoNormal;
import uce.edu.ec.pa.paquete.extensions.DescuentoVIP;
import uce.edu.ec.pa.paquete.extensions.NotificacionMail;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    PedidoService pedidoService;

    @Inject
    NotificacionMail notificacionMail;

    @Inject
    DescuentoNormal descuentoNormal;

    @Inject
    DescuentoVIP descuentoVIP;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Inicio_Evaluacion");
        Pedido p1 = new Pedido("P001", "Laptop", 1000.00, "VIP");
        Pedido p2 = new Pedido("P002", "Mouse", 100.00, "Normal");
        Pedido p3 = new Pedido("P003", "Teclado", 200.00, "VIP");
        this.pedidoService.procesarPedido(p1, this.notificacionMail);
        this.pedidoService.procesarPedido(p2, this.notificacionMail);
        this.pedidoService.procesarPedido(p3, this.notificacionMail);

        System.out.println("172219-jh");

        return 0;
    }

}
