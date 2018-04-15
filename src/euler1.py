#!/bin/python3

import unittest

def sum_factors(divisor, num):
    n = (num-1) // divisor +1
    return ((n*n - n) // 2 )* divisor

def sumOfMultiplesOf3And5Upto(n):
    return  sum_factors(3, n) + sum_factors(5, n) - sum_factors(15, n)

class TestSumFizzBuzz(unittest.TestCase):

    def test_multiplesUpto0ShouldTotal0(self):
        self.assertEqual(0, sumOfMultiplesOf3And5Upto(0))

    def test_multiplesUpto3ShouldTotal0(self):
        self.assertEqual(0, sumOfMultiplesOf3And5Upto(3))

    def test_multiplesUpto4ShouldTotal3(self):
        self.assertEqual(3, sumOfMultiplesOf3And5Upto(4))
        
    def test_multiplesUpto10ShouldTotal23(self):
        self.assertEqual(23, sumOfMultiplesOf3And5Upto(10))

    def test_multiplesUpto1000ShouldTotal233168(self):
        self.assertEqual(233168, sumOfMultiplesOf3And5Upto(1000))          

if __name__ == '__main__':
    unittest.main()