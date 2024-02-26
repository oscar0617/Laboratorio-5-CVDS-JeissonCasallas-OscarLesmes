# *Laboratorio #5 Ciclos de Vida de Software*
## Integrantes
**Jeisson Casallas & Oscar Lesmes**  

**PARTE I. - JUGANDO A SER UN CLIENTE HTTP**

## Respuestas

Revise el resultado obtenido.

**¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.**

![image](https://github.com/oscar0617/Laboratorio-5-CVDS-JeissonCasallas-OscarLesmes/assets/157759010/a68b927f-2631-4fed-8efe-d0db7f0d083d)

El error "400 Bad Request" es un código de HTTP que nos dice que el servidor no pudo entender o procesar la solicitud del cliente debido a un error en la sintaxis de la solicitud.
puede deberse a problemas como: parámetros de solicitud incorrectos, formato de solicitud incorrecto o datos de solicitud incompletos.

**¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?**

Cuando hablamos de los codigos de error tenemos tanto los 400 que vienen siendo los de cliente, como los 500 que son los de servidor, entre los que mas destacan son:
  
  1. 400 Bad Request: Indica que la solicitud del cliente no se pudo entender o procesar debido a un error en la sintaxis de la solicitud.

  2. 401 Unauthorized: Indica que se requiere autenticación para acceder al recurso, pero el cliente no ha proporcionado credenciales válidas.

  3. 403 Forbidden: Indica que el servidor comprende la solicitud del cliente, pero se niega a autorizarla.

  4. 404 Not Found: Indica que el servidor no puede encontrar el recurso solicitado.

  6. 500 Internal Server Error: Indica que se produjo un error interno en el servidor al procesar la solicitud del cliente.

  7. 501 Not Implemented: Indica que el servidor no puede cumplir con la solicitud del cliente porque no reconoce o admite la funcionalidad solicitada.

  8. 502 Bad Gateway: Indica que el servidor, mientras actuaba como proxy o puerta de enlace, recibió una respuesta no válida del servidor ascendente al que intentaba acceder, lo que indica     que el servidor ascendente está caído o no está configurado correctamente.

  9. 503 Service Unavailable: Indica que el servidor no está listo para manejar la solicitud del cliente debido a una sobrecarga temporal o mantenimiento del servidor.

Responder en el README.md según lo indicado en la última sección de este laboratorio (ENTREGA).

**Realice una nueva conexión con telnet, esta vez a:**
_Host: www.httpbin.org_
_Puerto: 80_
_Versión HTTP: 1.1_

**Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?**

![image](https://github.com/oscar0617/Laboratorio-5-CVDS-JeissonCasallas-OscarLesmes/assets/157759010/e579d0fa-48a3-4d97-a4f5-dca8f352911c)

Nuevamente obtenemos error 400, es decir, el servidor no fue capaz de procesar la solicitud.


**Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:**

_$ wc -c_


¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?

Get se encarga de obtener un recurso especifico, mientras que post se utiliza para enviar recursos a la URL.
También encontramos los comandos HEAD, PUT y DELETE.

Utilice ahora el parámetro -v y con el parámetro -i:

''$ curl -v www.httpbin.org''
![image](https://github.com/oscar0617/Laboratorio-5-CVDS-JeissonCasallas-OscarLesmes/assets/111905740/87c4a5d3-a439-48a0-8cd2-3e6292bcd3e6)

''$ curl -i www.httpbin.org''
![image](https://github.com/oscar0617/Laboratorio-5-CVDS-JeissonCasallas-OscarLesmes/assets/111905740/f40bd92b-33d3-4fbc-a0f3-2e55fe2731b4)


¿Cuáles son las diferencias con los diferentes parámetros?
El comando -v nos muestra la peticion completa GET, mientras que -i muestra informacion del estado de la petición.

**PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC**

Después de terminar el aprendizaje analice: - 

**¿Por qué MVC obtiene ese nombre?**  
MVC, o tambien conocido como patrón Modelo-Vista-Controlador, generalmente usado en el desarrollo web esta compuesto por tres partes fundamentales: el Modelo, encargado de gestionar los datos y la lógica de la aplicación; la Vista, encargada de la presentación visual de la información al usuario y la interacción con la interfaz de usuario; y el Controlador, que funciona como intermediario entre el Modelo y la Vista, procesando las solicitudes del usuario y actualizando la Vista en base a los resultados obtenidos.

**¿Cuáles son las ventajas de usar MVC?** 

El patrón MVC tiene ventajas como: separar las responsabilidades en diferentes componentes, como el Modelo, la Vista y el Controlador, tambien simplifica el desarrollo, depuración y mantenimiento del código. Además, la modularidad facilita la reutilización de componentes en diferentes partes de la aplicación. La organización clara del código también simplifica la realización de cambios y actualizaciones sin afectar otras partes del sistema, mientras que la separación de las capas facilita la realización de pruebas unitarias en cada componente por separado. Por último, la capacidad de escalar cada componente individualmente permite gestionar de manera eficiente el crecimiento de la aplicación según sea necesario.

**¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?**


La diferencia en la estructura de directorios entre este proyecto y los proyectos anteriores como maven y java EE va principalmente en el enfoque basado en el patrón de arquitectura MVC (Modelo-Vista-Controlador). En el caso de los otros proyectos, la estructura tiene un modelo basado en capas (como la capa de presentación, la capa de negocio y la capa de acceso a datos), donde los componentes se organizan según su función y responsabilidad. El que un Proyecto MVC este organizado en Modelo,vista,controlador  conlleva una distribución diferente de los archivos y directorios para reflejar la separación de responsabilidades. Además, en un proyecto MVC es común encontrar directorios adicionales para otros componentes de la aplicación, como servicios, utilidades o recursos estáticos, lo que lo diferencia de las otras dos.

**¿Qué anotaciones usaste y cuál es la diferencia entre ellas?**

@Controller: Indica que una clase es un controlador de Spring MVC. Los métodos de esta clase pueden manejar peticiones HTTP.

@Autowired: Se utiliza para inyectar dependencias automáticamente en los beans gestionados por Spring. Spring buscará un bean compatible y lo inyectará en el lugar apropiado.

@RequestMapping: Se utiliza para asignar una URL específica o un patrón de URL a un método de controlador. Indica qué método de controlador debe manejar las peticiones HTTP que coincidan con la URL especificada.

 @GetMapping: Se utiliza para asignar un método de controlador a las solicitudes HTTP GET. el método de controlador será invocado cuando se reciba una solicitud GET que coincida con la URL especificada en la anotación.

@PostMapping: se utiliza para asignar un método de controlador a las solicitudes HTTP POST. el método de controlador será invocado cuando se reciba una solicitud POST que coincida con la URL especificada en la anotación.

 @ModelAttribute:se utiliza para enlazar métodos o parámetros de métodos a atributos del modelo. Esto permite pasar datos entre el controlador y la vista de manera eficiente.


**PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful**


**¿Qué es RESTful?**

RESTful se refiere a un estilo arquitectónico para el diseño de servicios web que sigue los principios de REST (Representational State Transfer). En un servicio web RESTful, los recursos son identificados por URLs únicas y las operaciones sobre estos recursos se realizan utilizando los métodos estándar del protocolo HTTP, lo que proporciona una comunicación uniforme y predecible entre clientes y servidores.

**Si utilizo un framework como Boostrap CSS para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?**

En este caso al usar un framework para mejorar el aspecto visual, su hizo se haria en la capa de vista.

**PARTE IV. - APLICACIÓN MVC JUEGO**

Analice las siguientes situaciones: 

- **¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?**

Cada jugador tiene un juego totalmente independiente al otro, es decir, cada navegador tiene una instancia.
  
![image](https://github.com/oscar0617/Laboratorio-5-CVDS-JeissonCasallas-OscarLesmes/assets/111905740/a8fdd3d6-4dc2-40b8-b2f3-d0c19b19db40)

-**Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos.¿Qué habría que hacer?**

Se deberia usar una base de datos que almacene esos valores para cada jugador.


  
