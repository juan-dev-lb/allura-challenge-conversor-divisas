Alura - solución reto: Conversor de monedas.

# Challenge - Conversor de monedas
<br>
<p align="left">
  <img src="https://img.shields.io/badge/FINALIZADO-green">
</p>

La solución planteada al desafío relacionado, hace parte de la ruta de aprendizaje en el programa <strong>Java Orientado a Objetos G9 - ONE</strong>.
El proyecto fue construido aplicando principios básicos de arquitectura backend como separación de responsabilidades, uso de Collection, record para mapeo de JSON y consumo de API con HttpClient.
 
Herramienta para la gestión del proyecto (Trello): https://trello.com/b/RU41cvaQ/conversor-de-moneda-challenge-one-java-back-end



<h4>Características</h4> 

:paperclip: Menú interactivo en consola.

:paperclip: Validación robusta de entradas del usuario..

:paperclip: Consumo de API externa en tiempo real.

:paperclip: Uso de Map para manejo dinámico de conversiones.

:paperclip: Uso de record para mapear la respuesta JSON.

:paperclip: Manejo de errores HTTP.



<br>

:chart_with_upwards_trend: Estructura del proyecto

<img width="510" height="184" alt="image" src="https://github.com/user-attachments/assets/518b9c75-61c8-4a04-91aa-a85e27f4e217" />


<h3>Main</h3>

:speech_balloon: Controla el flujo de ejecución y el menú principal.



<h3>ValidacionService</h3>

:speech_balloon: Validar que la opción sea un número entre 1 y 7

:speech_balloon: Validar que el monto sea un número mayor a 0


<h3>ConversionService</h3>

:speech_balloon: Contiene un Map<Integer, String[]> para gestionar las conversiones.

:speech_balloon: Consume la API usando HttpClient.

:speech_balloon: Calcula el resultado de la conversión.

<br>


<h3>ExchangeResponse [record]</h3>

:speech_balloon: Mapea la respuesta JSON recibida desde la API:

<img width="515" height="155" alt="image" src="https://github.com/user-attachments/assets/5a60a16a-68b2-4ecd-bb2f-388504ab8dc1" />
<br>




<h3>API Utilizada</h3>:earth_americas:


:speech_balloon: ExchangeRate-API

:speech_balloon: Endpoint base:

https://v6.exchangerate-api.com/v6/{API_KEY}/latest/{BASE}



<h3> Tecnologías utilizadas </h3> :computer: 


:wrench: Java 21.

:wrench: HttpClient (Java)

:wrench: Gson 2.13

:wrench: Collection (Map, HashMap)

:wrench: Records (Java)
