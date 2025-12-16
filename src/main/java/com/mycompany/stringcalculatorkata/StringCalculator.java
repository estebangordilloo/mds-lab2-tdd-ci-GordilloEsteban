/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringcalculatorkata;

/**
 *
 * @author espe
 */
public class StringCalculator {
    
    
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Usamos una expresión regular: "," o "|" o "\n"
        String[] numberArray = numbers.split(",|\n");
        int sum = 0;

        for (String number : numberArray) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
