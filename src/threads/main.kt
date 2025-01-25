package threads

fun main(){
    for (i in 1
            ..16){
        var thread = CountThread("nome")
        thread.start()
    }
}