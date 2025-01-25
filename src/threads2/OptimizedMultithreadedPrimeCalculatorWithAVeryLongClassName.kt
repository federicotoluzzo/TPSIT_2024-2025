package threads2

import java.util.Vector

class OptimizedMultithreadedPrimeCalculatorWithAVeryLongClassName(val start:Int, val end: Int) : Runnable{
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
        for (i in 0..(end - start) / 100000){
            Thread({
                val p = PrimeCalculator(start + i * 100000, end + i * 100000)
                p.run()
                primes.addAll(p.primes)
            }).start()
        }
    }
}