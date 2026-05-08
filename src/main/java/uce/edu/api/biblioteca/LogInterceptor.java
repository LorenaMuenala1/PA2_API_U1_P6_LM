package uce.edu.api.biblioteca;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Monitoreo
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object interceptar(
            InvocationContext context)
            throws Exception {

        System.out.println("Inicio cálculo multa");

        Object resultado = context.proceed();

        System.out.println("Fin cálculo multa");

        return resultado;
    }
}