package uce.edu.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2) //Indica la prioridad del interceptor, en caso de que haya varios interceptores, se ejecutaran en orden de prioridad
public class MedirTiempoInterceptor {

    @AroundInvoke 
    //Indica que este metodo se ejecutara alrededor de la ejecucion del metodo interceptado, 
    // permitiendo medir el tiempo de ejecucion

    public Object medir(InvocationContext context) throws Exception {

        System.out.println("\n " +"Se ejecuta antes del metodo");
        System.out.println("metodo interceptado: " + context.getMethod().getName());
        long inicio = System.currentTimeMillis();

        //Permite continuar con la ejecucion del metodo interceptado
        //Inicia la ejecucion del metodo
        Object resultado =context.proceed();
        //pasa a la linea 20 una vez que se terine de ejecutar el metodo de negocio

        long fin = System.currentTimeMillis();

        long tiempoTrancurrido = fin - inicio;

        System.out.println("\n " +"Tiempo transcurrido "+ ": " + tiempoTrancurrido + " ms");
        return resultado;
        }     
    }



