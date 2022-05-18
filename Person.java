/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_oop_170522_3;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Person {
    static int instanceCount = 0;
    int localCount = 0;
    
    
    Person(){
        instanceCount++;
        localCount++;  
    }
    
    
}
