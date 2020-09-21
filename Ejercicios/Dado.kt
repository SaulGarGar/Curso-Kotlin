//1.- Generamos una variable cuyo valor sea aleatorio, pero solo entre 1 y 6
val dado = (1..6).shuffled().first()

//3.- Generamos la función main y mandamos a llamar nuestra función tirarDado
fun main(){
    tirarDado()
}

//2.- Construimos la función que muestre el resultado
fun tirarDado(){
    if(dado == 1){
        println("Cayó 1")
    }
    else if(dado == 2){
        println("Cayó 2")
    }
    else if(dado == 3){
        println("Cayó 3")
    }
    else if(dado == 4){
        println("Cayó 4")
    }
    else if(dado == 5){
        println("Cayó 5")
    }
    else{
        println("Cayó 6")
    }
}

