package uce.edu.api.bodega;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

//DECLARACION DEL INTERCEPTOR

//Le indicamos que va aa ser una anotacion de interceptor, para que pueda ser utilizada en los metodos que queremos medir su tiempo de ejecucion
@InterceptorBinding
//Para indicar que esta anotacion se puede aplicar a metodos
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MedirTiempo {




}
