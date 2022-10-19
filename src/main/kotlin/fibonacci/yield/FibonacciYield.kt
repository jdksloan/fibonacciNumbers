package fibonacci.yield

class FibonacciYield {
    fun fib(input: Int): List<Int> {
        return yieldFib().take(input).toList()
    }

    private fun yieldFib() = sequence {
        var terms = Pair(0, 1)

        while (true){
            yield(terms.first)
            terms = Pair(terms.second, terms.first + terms.second)
        }
    }
}