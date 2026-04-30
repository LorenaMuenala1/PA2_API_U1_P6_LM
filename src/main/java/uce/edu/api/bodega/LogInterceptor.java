package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Logs
@Interceptor
@Priority(3) //Indica la prioridad del interceptor, en caso de que haya varios interceptores, se ejecutaran en orden de prioridad
public class LogInterceptor {

     @AroundInvoke 
 
    public Object medir(InvocationContext context) throws Exception {

        System.out.println("\n " +"Se ejecuto log antes del metodo ");
        System.out.println("Interceptando el metodo: " + context.getMethod().getName());

        Object[] args = context.getParameters();
        for ( int i =0; i< args.length; i++) {
            System.out.println("Argumento " + ": " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());
    
        }

        Object resultado = context.proceed();
   

        return resultado;
        }     

}
