package uce.edu.ec.pa.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@NotificacionI
@Interceptor
@Priority(1)
public class NotificacionInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        System.out.println("|InterceptorNotificacion|Se ha interceptado el metodo:" + context.getMethod());

        return resultado;
    }
}
