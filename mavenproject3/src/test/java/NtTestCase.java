
import com.mycompany.mavenproject3.Ultis;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
    
public class NtTestCase {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AFTER ALL");
    }
        
    @BeforeEach
    public void beforeEach(){
        System.out.println("BEFORE EACH");
        
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AFTER EACH");
        
    }
    @Test
    public void testNtChan(){
        int n=2;
        boolean expected = true;
        boolean actual = Ultis.ktNt(n);
        
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNtLe(){
        int n=5;
       
        boolean actual = Ultis.ktNt(n);
        
        Assertions.assertTrue( actual);
    }
}
