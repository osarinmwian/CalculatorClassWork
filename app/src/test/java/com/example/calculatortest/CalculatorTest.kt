package com.example.calculatortest

import org.junit.Assert.*

import org.junit.Test

class CalculatorTest {


    @Test

    fun addition_whenGivenTwoPositiveNumbers_returnTrue() {

        val num1 = 3
        val num2 = 4

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(7, output)
    }

    @Test

    fun addition_whenGivenTwoNegativeNumbers_returnTrue() {

        val num1 = -3
        val num2 = -4

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(-7, output)
    }


    @Test

    fun addition_whenGivenOnePositiveNumberAndOneNegativeNumber_returnTrue() {

        val num1 = +3
        val num2 = -4

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(-1, output)
    }

    @Test

    fun addition_whenGivenOnePositiveNumberAndZero_returnTrue() {

        val num1 = 3
        val num2 = 0

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(3, output)
    }
    @Test

    fun addition_whenGivenOnePositiveNumberAndOneNegativeNumber_returnFalse() {

        val num1 = +3
        val num2 = -4

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(3, output)
    }


    @Test

    fun substraction_whenGivenTwoNegativeNumbers_returnTrue() {

        val num1 = -3
        val num2 = -4

        val output: Int = Calculator().substraction(num1, num2)
        assertEquals(1, output)
    }

    @Test

    fun subraction_whenGivenOnePositiveNumberAndOneNegativeNumber_returnTrue() {

        val num1 = +3
        val num2 = -4

        val output: Int = Calculator().substraction(num1, num2)
        assertEquals(7, output)
    }

    @Test

    fun substraction_whenGivenTwoPositiveNumbers_returnTrue() {

        val num1 = -3
        val num2 = -4

        val output: Int = Calculator().substraction(num1, num2)
        assertEquals(1, output)
    }

    @Test

    fun substraction_whenGivenOnePositiveNumberAndOneNegativeNumber_returnTrue() {

        val num1 = +9
        val num2 = -5

        val output: Int = Calculator().addition(num1, num2)
        assertEquals(4, output)
    }

    @Test

    fun multiplication_whenGivenTwoPositiveNumbers_returnTrue() {

        val num1 = 3
        val num2 = 4

        val output: Int = Calculator().multiplication(num1, num2)
        assertEquals(12, output)
    }

    @Test

    fun multiplication_whenGivenTwoNegativeNumbers_returnTrue() {

        val num1 = -3
        val num2 = -4

        val output: Int = Calculator().multiplication(num1, num2)
        assertEquals(12, output)
    }


    @Test

    fun multiplication_whenGivenOnePositiveNumberAndOneNegativeNumber_returnTrue() {

        val num1 = +3
        val num2 = -4

        val output: Int = Calculator().multiplication(num1, num2)
        assertEquals(-12, output)
    }

    @Test

    fun multiplication_whenGivenOnePositiveNumberAndZero_returnFalse() {

        val num1 = 12
        val num2 = 0

        val output: Int = Calculator().multiplication(num1, num2)
        assertEquals(0, output)
    }
    @Test

    fun multiplication_whenGivenOneNegativeNumberAndZero_returnTrue() {

        val num1 = 18
        val num2 = -0

        val output: Int = Calculator().multiplication(num1, num2)
        assertEquals(0, output)
    }

    @Test

    fun division_whenGivenTwoPositiveNumbers_returnTrue() {

        val num1 = 25
        val num2 = 5

        val output: Int = Calculator().division(num1, num2)
        assertEquals(5, output)
    }

    @Test

    fun division_whenGivenTwoNegativeNumbers_returnTrue() {

        val num1 = -21
        val num2 = -3

        val output: Int = Calculator().division(num1, num2)
        assertEquals(7, output)
    }


    @Test

    fun division_whenGivenOnePositiveNumberAndOneNegativeNumber_returnTrue() {

        val num1 = 28
        val num2 = -4

        val output: Int = Calculator().division(num1, num2)
        assertEquals(-7, output)
    }


    @Test

    fun division_whenGivenOnePositiveNumberAndOne_returnTrue() {

        val num1 = +10
        val num2 = 1

        val output: Int = Calculator().division(num1, num2)
        assertEquals(10, output)
    }

}
