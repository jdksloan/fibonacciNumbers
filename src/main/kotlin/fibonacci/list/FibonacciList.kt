package fibonacci.list

class FibonacciList {
    fun fib(input: Int): List<Int> {
        if(input < 1) return emptyList();

        var list = mutableListOf<Int>()
        for (num in 0 until input){
            list += if(num < 2) num
            else list.takeLast(2).sum()
        }

        return  list;
    }
}