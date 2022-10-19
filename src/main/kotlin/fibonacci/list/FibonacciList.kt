package fibonacci.list

class FibonacciList {
    fun fib(input: Long): List<Long> {
        if(input < 1) return emptyList()

        val list = mutableListOf<Long>()
        for (num in 0 until input){
            list += if(num < 2) num
            else list.takeLast(2).sum()
        }

        return  list
    }
}