/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.demojunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class DemoJunitTest {
    DemoJunit pt;
    public DemoJunitTest() {
        pt= new DemoJunit();
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
        int kq= pt.Nhan(4,5);
        int ketqua=20;
        assertEquals(kq,ketqua);
    }
    
}
