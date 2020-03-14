package com.e.mylibrary

class MyLibClass {

    fun arithmeticMean(numbers: Collection<Number?>): Number? {
        //check type of values
        val iterator = numbers.iterator()
        val firstNumberInCollection = iterator.next()
        if (firstNumberInCollection is Int) {
            return computeMeanInt(numbers)
        } else if (firstNumberInCollection is Long) {
            return computeMeanLong(numbers)
        }
        return computeMeanDouble(numbers)
    }

    private fun computeMeanInt(numbers: Collection<Number?>): Number? {
        var result = 0.0
        val iterator = numbers.iterator()
        while (iterator.hasNext()) {
            result += iterator.next()?.toDouble()!!
        }
        return result / numbers.size
    }

    private fun computeMeanLong(numbers: Collection<Number?>): Number? {
        var result = 0.0
        val iterator = numbers.iterator()
        while (iterator.hasNext()) {
            result += iterator.next()?.toDouble()!!
        }
        return result / numbers.size
    }

    private fun computeMeanDouble(numbers: Collection<Number?>): Number? {
        var result = 0.0
        val iterator = numbers.iterator()
        while (iterator.hasNext()) {
            result += iterator.next()?.toDouble()!!
        }
        return result / numbers.size
    }
}