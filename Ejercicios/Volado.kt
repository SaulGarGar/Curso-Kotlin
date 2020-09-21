//1.- Generamos una variable cuyo valor sea aleatorio, pero solo entre 1 y 2
val moneda = (1..2).shuffled().first()

//3.- Generamos la función main y mandamos a llamar nuestra función tirarVolado
fun main(){
    tirarVolado()
}

//2.- Construimos la función que muestre el resultado. Para esto asumiremos que 1 es sol y 2 es águila
fun tirarVolado(){
    if(moneda == 1){
        println("Cayó sol")
    }
    else if(moneda == 2){
        println("Cayó aguila")
    }
}


