package fibonacci.recursion

class FibonacciRecursion {
    fun fib(input: Long): List<Long> {
        if(input < 1) return emptyList()

        val list = mutableListOf<Long>()
        list.add(fibRecursive(input))


        return  list
    }

   private fun fibRecursive(num: Long): Long {
       if(num < 2) return num
       val num1 =  fibRecursive(num -1)
       println("num1 $num1")

       val num2 = fibRecursive(num -2)
       println("num2 $num2")
       val total = num1 + num2
       println("total $total")
       return total
    }
}