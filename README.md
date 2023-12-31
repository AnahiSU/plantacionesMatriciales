_El siguiente problema fue redactado y resuelto por los autores y entregado como tarea final de la materia de introducción a la programación, primer semestre, en la Universidad Mayor de San Simón dictado por la lic. Maria Leticia Blanco Coca._
***
# Plantaciones matriciales.
## El Huerto POO.
### _Autores: Anahí Sanabria Ugarte, Leonel Zeballos Aldunate, Mateo Merino Vidal_

Lisandro es un chico muy inteligente y que le encantan los juegos de mesa y estrategia. Su tío le dejó como herencia antes de su muerte la granja en la que había trabajado por mucho tiempo, El Huerto POO. Esta contenía corrales para animales, plantaciones, pero esencialmente un lugar especial dedicado a la plantación de semillas excéntricas de plantas que vendía a muy buen precio.

Lisandro está en un buen momento económico donde la granja dio buenas ganancias y quiere viajar a Buenos Aires de turismo. Sin embargo, el cuidado de estas plantas especiales es muy riguroso y necesita parar la producción de ellas mientras se encuentra fuera del país. Para ello, se enfrenta a un gran reto. Dependiendo del tipo de planta, estas tienen distintos tiempos de regado. Algunas solo necesitan dos regadas y otras cuatro. 

Cuando Lisandro inspecciona el huerto, nota que existen plantas recién plantadas con un ciclo de riego en 0 posicionadas de forma aleatoria como se ve en la imagen. Necesita vaciar el huerto de alguna forma, pero la limitante que tiene es que las regaderas son únicamente verticales 
u horizontales, es decir que solo riegan una fila o una columna entera. Si Lisandro riega un lugar vacío, una semilla aparecerá y comenzará con su ciclo de riego. Las semillas que cumplan su ciclo de riego serán recolectadas y vendidas en el momento. 

El hermano de Lisandro le ofrece una pequeña ayuda sí y solo si Lisandro vende 90 bs o más de plantas. Esta ayuda consiste en regar una sola planta en cualquier posición. En el caso de que Lisandro no quiera usar ese movimiento, puede reservarlo para más tarde y acumularlo.
Las plantas que cultiva Lisandro son las siguientes:
- _Ramiper => 3 regadas, 25 bs cada una._
- _Betometas => 2 regadas, 15 bs cada una._
- _Rezagametas => 4 regadas, 30 bs cada una._

El huerto de tiene un tamaño de 3x3 y él solo cuenta con 18 riegos debido a que no pagará su servicio de agua durante el tiempo que esté de viaje.
Se te pide:
1. Crear las clases Huerto, Monedero, Planta.
2. Implementar el método regar horizontal y verticalmente.
3. Implementar el método para controlar los bonus que recibe Lisandro por parte de su hermano y regar una sola planta.
4. Diseñar la herencia de cada tipo de planta.
5. Controlar que Lisandro no exceda las 18 regadas e implementa el método para verificar el estado luego de cada regada.
 ***
# Resolución propuesta

Las destrezas usadas son el temario aprendido en clases de todo el semetres: manejo de variables y operadores, POO, ciclos, bucles, arrays, matrices y herencia.

Se deben identificar las clases necesarias de acuerdo a lo que pide el problema. Para ello se ha diseñado un diagrama de clases:

![Diagrama de clases resultante](https://github.com/AnahiSU/plantacionesMatriciales/blob/main/Diagrama%20de%20clases%20resultante.png)

Una vez claras las ideas, se procede con la codificación. El código que se diseñó se encuentra [en este apartado](https://github.com/AnahiSU/plantacionesMatriciales/tree/main/code). Está comentado para facilidad del lector.
