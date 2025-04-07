# Tasca S1.03 - Java Collections

## 📄 Descripción - Enunciado del ejercicio

Este repositorio contiene los ejercicios correspondientes al proyecto **Tasca S1.03 - Java Collections**. En este proyecto se busca practicar el uso de colecciones en Java tales como `ArrayList`, `HashSet`, `HashMap` y otros aspectos relacionados con el manejo de listas y estructuras de datos. Además, el proyecto incluye ejercicios de manipulación de iteradores, ordenación de objetos y lectura/escritura de archivos.

### Enunciados de los ejercicios

#### **Nivel 1**
1. **Ejercicio 1**:
    - Crear una clase `Month` con un atributo `name` (que almacene el nombre del mes).
    - Añadir objetos `Month` en un `ArrayList`, insertar el mes "Agost" en la posición adecuada y verificar el orden.
    - Convertir el `ArrayList` a un `HashSet` para garantizar que no se permiten duplicados.
    - Recorrer ambas estructuras con `for` y un iterador.

2. **Ejercicio 2**:
    - Crear y rellenar un `List<Integer>`.
    - Crear un segundo `List<Integer>` e insertar los elementos en orden inverso desde la primera lista utilizando `ListIterator`.

3. **Ejercicio 3**:
    - Leer un archivo `countries.txt` que contiene países y capitales, guardar los datos en un `HashMap<String, String>`.
    - Proponer al usuario el nombre de un país de forma aleatoria y verificar si introduce correctamente su capital. Mostrar la puntuación final y guardarla en un archivo `classificacio.txt`.

#### **Nivel 2**
1. **Ejercicio 1**:
    - Crear una clase `Restaurante` con atributos `nombre` (String) y `puntuación` (int). Prevenir la duplicación de objetos con el mismo nombre y puntuación en un `HashSet`.
    - Permitir restaurantes con el mismo nombre pero distinta puntuación.

2. **Ejercicio 2**:
    - Ordenar los objetos de la clase `Restaurante` por nombre y puntuación en orden descendente, implementando las interfaces necesarias.

#### **Nivel 3**
1. **Ejercicio 1**:
    - Crear una aplicación que lea un archivo CSV con los campos `nombre`, `apellido` y `DNI`. Ordenar los datos por nombre, apellido o DNI según el menú proporcionado, permitiendo visualizar las personas organizadas.

   **Menú:**
   ```
   1.- Introducir persona.  
   2.- Mostrar a las personas ordenadas por nombre (AZ).  
   3.- Mostrar a las personas ordenadas por nombre (ZA).  
   4.- Mostrar a las personas ordenadas por apellidos (AZ).  
   5.- Mostrar a las personas ordenadas por apellidos (ZA).  
   6.- Mostrar a las personas ordenadas por DNI (1-9).  
   7.- Mostrar a las personas ordenadas por DNI (9-1).  
   0.- Salir.
   ```

---

## 💻 Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal utilizado.
- **JDK**: Versión 17 (o superior).
- **IntelliJ IDEA** / **Eclipse**: IDEs recomendados para desarrollo.
- **Colecciones de Java**: Uso de `ArrayList`, `HashSet`, `HashMap`, entre otras.
- **Manejo de archivos**: Lectura y escritura en archivos `.txt` y `.csv`.
- **Iteradores**: Uso de `Iterator` y `ListIterator` para manipular listas.
- **Java I/O**: Entrada/salida para los menús y manejo de archivos.

---

## 📋 Requisitos

- **Java Development Kit (JDK)** 17 o superior.
- IDE como **IntelliJ IDEA** o **Eclipse** (opcional).
- Archivo `countries.txt` con datos de países y capitales.
- Archivo CSV para pruebas del ejercicio correspondiente al Nivel 3.
- Familiaridad con conceptos básicos de programación en Java y uso de colecciones.

---

## 🛠️ Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/usuario/tasca-s1.03-java-collections.git
   ```
2. Importa el proyecto en tu IDE favorito:
    - Para **IntelliJ IDEA**: Selecciona la opción `"Open or Import"` y selecciona la carpeta raíz del proyecto.
    - Para **Eclipse**: Usa la opción `"Existing Java Project"` e importa la carpeta raíz del repositorio.
3. Asegúrate de tener configurada una instalación de **JDK 17** o superior.

---

## ▶️ Ejecución

1. Compila el proyecto dentro del IDE.
2. Ejecuta el archivo `Main.java` que se encuentra en la carpeta `src/Level3`.
3. Sigue las opciones mostradas en el menú para interactuar con las funcionalidades.

---

## 🌐 Despliegue

Este proyecto está diseñado principalmente para fines educativos y no requiere un entorno de producción formal. Sin embargo, se puede empaquetar como un archivo `.jar` utilizando una herramienta como Maven o Gradle (opcional). Para crear un ejecutable `.jar`:

1. Empaqueta el proyecto:
   ```bash
   mvn package
   ```
2. Ejecuta el archivo `.jar`:
   ```bash
   java -jar nombre-del-proyecto.jar
   ```

---

## 🤝 Contribuciones

¡Gracias por tu interés en contribuir a este proyecto! Para colaborar, sigue los pasos:

1. Haz un fork del repositorio.
2. Crea una rama con una descripción relevante de tu funcionalidad o corrección:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza tus cambios y asegúrate de que todo esté funcionando correctamente.
4. Envía un pull request con una descripción detallada.# Tarea-S1.03.-Java-Collections