package fibonacci.recursion


import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class FibonacciRecursionTest {
    private lateinit var fibonacci: FibonacciRecursion

    @BeforeTest
    fun before(){
        fibonacci = FibonacciRecursion()
    }

//    @Test
//    fun `check 0 returns empty list`(){
//        assertEquals(emptyList(), fibonacci.fib(0))
//    }
//
//    @Test
//    fun `check 1 returns 0`(){
//        assertEquals(mutableListOf<Long>(0), fibonacci.fib(1))
//    }
//
//    @Test
//    fun `check 2 returns 0,1`(){
//        assertEquals(mutableListOf<Long>(0,1), fibonacci.fib(2))
//    }
//
//    @Test
//    fun `check 5 returns 0,1,1,2,3`(){
//        assertEquals(mutableListOf<Long>(0,1,1,2,3), fibonacci.fib(5))
//    }
//
//
//    @Test
//    fun `check 10 returns 0,1,1,2,3,5,8,13,21,34 list`(){
//        assertEquals(mutableListOf<Long>(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), fibonacci.fib(10))
//    }
//
//    @Test
//    fun `check last record of 1 000 000 equals`(){
//        assertEquals(7006191581884273890, fibonacci.fib(1000000).last())
//    }
}