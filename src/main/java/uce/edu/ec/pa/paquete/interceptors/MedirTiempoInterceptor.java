package uce.edu.ec.pa.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.pa.paquete.Pedido;

@MedirTiempo
@Interceptor
@Priority(2)
public class MedirTiempoInterceptor {

    @Inject
    Pedido pedido;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
     System.out.println("|InterceptorMedirTiempo|Se ha interceptado el metodo:"+context.getMethod());
        long ini = System.currentTimeMillis();
        try {
            Object resultado = context.proceed();

            return resultado;
        } finally {
            long fin = System.currentTimeMillis();
            System.out.println("DURACION: " + pedido.getCodigo() + "|" + (ini - fin) + " MS");
        }

    }
}
