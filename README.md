# GestionEnergia

## Hecho por Daniel Andrés Moreno Rey , Rodrigo Rojas Redondo , Arturo Lopez Castaño y Roberto Quilez

# Link al repositorio

https://github.com/Wakanda-DRAR/GestionEnergia.git

# Video de instalación y muestra de un microservicio

https://www.youtube.com/watch?v=t7rg-MPO-gQ

## Descripción
GestionEnergia es un microservicio desarrollado con Spring Boot que gestiona el consumo de energía de los usuarios. Este proyecto utiliza Eureka para el registro y descubrimiento de servicios, y Actuator para el monitoreo.

## Requisitos
- Java 17
- Maven
- MySQL

## Configuración

### `application.properties`
El archivo `application.properties` contiene la configuración del microservicio, incluyendo el nombre de la aplicación, el puerto del servidor, y la configuración de Eureka y Actuator.

### Dependencias
El archivo `pom.xml` incluye las dependencias necesarias para el proyecto, como Spring Boot, Eureka Client, Actuator, Lombok, y MySQL Connector.


## Modelo de Datos
La clase `Medidor` representa el modelo de datos del consumo de energía de un usuario.


### `Medidor`
Esta clase representa un medidor de consumo energético. Contiene dos atributos: `usuario` (un identificador del usuario) y `consumo` (el consumo energético del usuario en kWh). Utiliza las anotaciones de Lombok para generar automáticamente los métodos getters, setters y un constructor con todos los argumentos.

### `IluminacionService`
Este servicio proporciona métodos para ajustar la iluminación en diferentes zonas. Tiene un método `ajustarIluminacion` que ajusta la iluminación en función de la presencia detectada en una zona específica.

### `SmartGridService`
Este servicio ofrece funcionalidades relacionadas con la gestión de la red eléctrica inteligente. Incluye métodos para monitorear el estado de la red (`monitorearRed`) y para integrar energías renovables (`integrarEnergiasRenovables`), especificando los porcentajes de energía solar y eólica.

### `MedidoresService`
Este servicio gestiona las operaciones relacionadas con los medidores de consumo energético. Proporciona métodos para obtener el consumo actual de un usuario (`obtenerConsumo`) y para sugerir medidas de ahorro energético (`sugerirAhorro`).

### `EnergiaController`
Este controlador expone varios endpoints REST para interactuar con los servicios de iluminación, medidores y red inteligente. Permite ajustar la iluminación, obtener el consumo de energía de un usuario, monitorear el estado de la red y obtener una lista de medidores con sus consumos respectivos.


## Endpoints
El microservicio expone varios endpoints para el monitoreo a través de Actuator. Puedes acceder a ellos en `http://localhost:8081/actuator`.
