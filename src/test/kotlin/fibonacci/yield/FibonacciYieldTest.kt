package fibonacci.yield

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class FibonacciYieldTest {
    private lateinit var fibonacci: FibonacciYield

    @BeforeTest
    fun before(){
        fibonacci = FibonacciYield()
    }

    @Test
    fun `check 0 returns empty list`(){
        assertEquals(emptyList(), fibonacci.fib(0))
    }

    @Test
    fun `check 1 returns 0`(){
        assertEquals(mutableListOf(0), fibonacci.fib(1))
    }

    @Test
    fun `check 2 returns 0,1`(){
        assertEquals(mutableListOf(0,1), fibonacci.fib(2))
    }

    @Test
    fun `check 5 returns 0,1,1,2,3`(){
        assertEquals(mutableListOf(0,1,1,2,3), fibonacci.fib(5))
    }

    @Test
    fun `check 10 returns 0,1,1,2,3,5,8,13,21,34 list`(){
        assertEquals(mutableListOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), fibonacci.fib(10))
    }


}