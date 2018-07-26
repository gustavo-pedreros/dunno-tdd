package com.gas.labs.dunno.tdd

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    private var fizzBuzz: FizzBuzz = FizzBuzz()

    @Before
    fun setUp() {
    }

    @Test
    fun should_return_1_when_receives_1() {
        val result = fizzBuzz.calculate(1)
        assertEquals("1", result)
    }

    @Test
    fun should_return_2_when_receives_2() {
        val result = fizzBuzz.calculate(2)
        assertEquals("2", result)
    }

    @Test
    fun should_return_fizz_when_receives_3() {
        val result = fizzBuzz.calculate(3)
        assertEquals("Fizz", result)
    }

    @Test
    fun should_return_4_when_receives_4() {
        val result = fizzBuzz.calculate(4)
        assertEquals("4", result)
    }

    @Test
    fun should_return_buzz_when_receives_5() {
        val result = fizzBuzz.calculate(5)
        assertEquals("Buzz", result)
    }

    @Test
    fun should_return_fizz_when_receives_multiple_3() {
        val result = fizzBuzz.calculate(6)
        assertEquals("Fizz", result)
    }

    @Test
    fun should_return_buzz_when_receives_multiple_5() {
        val result = fizzBuzz.calculate(10)
        assertEquals("Buzz", result)
    }

    @Test
    fun should_return_fizz_buzz_when_receives_multiple_3_and_5() {
        val result = fizzBuzz.calculate(15)
        assertEquals("FizzBuzz", result)
    }

    @Test
    fun should_return_fizz_buzz_when_receives_30() {
        val result = fizzBuzz.calculate(30)
        assertEquals("FizzBuzz", result)
    }

    @Test
    fun should_return_fizz_buzz_when_receives_90() {
        val result = fizzBuzz.calculate(90)
        assertEquals("FizzBuzz", result)
    }

}
