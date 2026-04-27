# TAREA 3 : Ámbitos y Contextos 

En el contexto de CDI (Contexts and Dependency Injection), los ámbitos (scopes) definen el ciclo de vida de los beans, es decir, cuánto tiempo existen y cómo se comparten dentro de la aplicación.

Ámbito: Tiempo que vive el bean/objeto en todo el sistema
Contexto: Entorno en el que existe y es gestionado por el contenedor

## @ApplicationScoped
Se usa para servicios que implementan lógica de negocio que debe vivir durante toda la aplicación. El mismmo bean vive durante toda la aplicación.

Ejemplos:
- Servicio de conciertos (Manejar lista de eventos disponibles)
- Motor de recomendaciones (Sugerir productos/contenido según comportamiento del usuario)
- Matrículas estudiantiles (Gestionar la inscripción de cada estudiantes en materias)
- Cálculo de impuestos (Aplica reglas fiscales a todas las transacciones)
- Gestor de inventario (Controlar el stock global de los productos de una empresa)
- Sistema de votaciones (Llevar el conteo total de votos)
- Administrador de reservas (Gestionar disponibilidad de habitaciones o asientos)


## @Singleton
Similar al ApplicationScoped, el mismo bean durante toda la aplicación, sim embargo, se usa para lógica utilitaria del negocio.

Ejemplos:
- Formateador de fechas 
- Generador de códigos únicos
- Utilidad de encriptación
- Validador de formatos
- Generador de documentos PDFs
- Helper de logs
- Envío de correos, notificaciones


## @Dependent
Se usa para servicios que implementan lógica de negocio, se crea una nueva instancia cada vez que se inyecta.
No tiene un ciclo de vida propio: vive y muere con el bean que lo inyecta.

Ejemplos:
- Transferencia bancaria (Cada transferencia es única de cada usuario)
- Producto en carrito (Cada item es independiente)
- Ubicación capturada (Cada lectura GPS es distinta)
- Error de validación (Se crea según cada fallo)
- Motor de Cotización de Seguros (Cotización por cada cliente)
- Ubicación GPS capturada (Cada lectura de ubicación representa un dato independiente en un momento específico)
- Solicitud de reembolso (Cada solicitud tiene datos propios según la compra y el motivo)
- Comprobante de pago (Se genera un comprobante diferente por cada transacción realizada)
