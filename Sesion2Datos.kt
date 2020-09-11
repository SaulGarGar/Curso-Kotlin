//Comentarios
//Los comentarios sirven para agregar anotaciones en el codigo

//Existen comentarios de una sola linea. Como este

/*
Existen 
comentarios de multiples lineas. 
Como este
 */


 
//Declaración de una variable
//Existen variables y constantes
//Las variables se declaran usando la palabra reservada "var" y pueden cambiar su valor n veces durante el tiempo de ejecución.
    var nombreVariable = "Hector"

//Las constantes se declaran usando la palabra reservada "val" y el primer valor que se le asigna será su valor definitivo. NO PUEDE SER CAMBIADO
    val nombreConstante = "Carlos"


 
//Nomenclatura de variables
//Las variables deben declararse con nombres descriptivos, deben estar escritas en camel case. 
//Es decir, con todas las iniciales de palabra en mayúsculas, excepto la primera.
    val variableEnCamelCase



//Tipos de datos
//String   conjunto de caracteres
    var direccion: String = "Av Centenario 3008"

//Int  númerico entero
    var edad: Int = 27

//Float  numero con máximo 6 decimales
    var estatura: Float = 1.74

//Double numero con máximo 15 decimales 
    val pi: Double = 3.14159265359

//Boolean  afirmación o negación
    val laTvEstaPrendida = false


//Funciones
//Es un subalgoritmo que resuelve una tarea específica
    fun imprimirDireccion(){
        println(direccion)
    }

//Estructura de una funcion
    //fun1 imprimirDireccion2(){
        //println(direccion)3
    //}

    //1 Palabra reservada para anunciar una función
    //2 Nombre de la función. Debe usarse camel case para nombrarla
    //3 Cuerpo de la función. Es donde se realiza la acción requerida
