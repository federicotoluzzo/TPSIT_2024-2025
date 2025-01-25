package threads2

import java.util.Vector

class PrimeCalculatorKotlin(val start:Int, val end: Int) : Runnable{
    var primes:Vector<Int> = Vector()

    override fun run() {
        computePrimes()
    }

    fun isPrime(num:Int):Boolean{
        for (i in 2..num / 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    fun computePrimes(){
        for (i in start..end){
            Thread({if (isPrime(i)){
                primes.add(i)
            }}).start()
        }
    }
}