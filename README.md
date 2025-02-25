# Ejercicio 5 Lista de Tareas con LinkedHashSet


Este programa en Java permite gestionar una lista de tareas utilizando `LinkedHashMap<Integer, String>`, almacenando cada tarea con un identificador único y permitiendo su eliminación.

## Características

- Permite registrar múltiples tareas con un número identificador.
- Almacena las tareas en un `LinkedHashMap<Integer, String>`, manteniendo el orden de inserción.
- Ofrece un menú interactivo con opciones para:
  - Agregar nuevas tareas.
  - Eliminar una tarea existente por su número identificador.
  - Mostrar todas las tareas registradas en orden de inserción.
- Manejo básico de excepciones para evitar fallos inesperados.

## Tecnologías utilizadas

- Java 8 o superior
- Librerías utilizadas: `java.util.LinkedHashMap`, `java.util.Scanner`

## Cómo ejecutar el programa

1. Compila el archivo con el siguiente comando:
   ```bash
   javac Main.java
   ```
2. Ejecuta el programa con:
   ```bash
   java lista_de_tarea_con_linkehashset.Main
   ```

## Explicación del código

1. Se utiliza un `Scanner` para capturar la entrada del usuario.
2. Se solicita la cantidad de tareas a registrar.
3. Se ingresa cada tarea con su número identificador y su descripción.
4. Se ofrece la opción de eliminar una tarea mediante su número identificador.
5. Se muestra la lista de tareas en el orden en que fueron ingresadas.
6. Se repite el proceso hasta que el usuario decida salir.

## Autor

Este código fue desarrollado como práctica en Java para manejar estructuras de datos y entrada de usuario.

**Autor:** Jedier Stivenson Correa Amariz
