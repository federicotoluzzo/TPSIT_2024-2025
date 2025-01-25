package threads

import kotlin.math.sqrt

class CountThread(name:String) : Thread() {
    var num = 0
    override fun run(){
        while(true){
            num++;
            println("Il numero del thread " + name + " è diventato " + num);
        }
    }
}