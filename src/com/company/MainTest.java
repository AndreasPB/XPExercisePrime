package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {


        assertEquals(true, checkIfPrime(13));
        assertEquals(false, checkIfPrime(141));
        assertEquals("3*47", madeOf(141));

    }

    boolean checkIfPrime(int num) {
        boolean flag = true;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                flag = false; // og er dermed ikke et primtal
                break;
            }
        }
        return flag;
    }


    String madeOf(int num) {
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                firstNumber = i;
                secondNumber = num / i;
                break;
            }
        }

        String numbers = firstNumber + "*" + secondNumber;
        System.out.println(numbers);

        return numbers;
    }
}