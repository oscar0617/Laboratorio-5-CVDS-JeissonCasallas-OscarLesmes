# *Laboratorio #4 Ciclos de Vida de Software*
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

Utilice ahora el parámetro -v y con el parámetro -i:

''$ curl -v www.httpbin.org''
''$ curl -i www.httpbin.org''

¿Cuáles son las diferencias con los diferentes parámetros?


 
