package com.example;

import org.junit.jupiter.api.*;
//(1)
import static org.junit.jupiter.api.Assertions.*;

//(2)
class MathUtilTest {

    //(3)自分で作成
    @BeforeAll
    static void setUpBeforeClass(){

    }
    //(4)自分で作成
    @AfterAll
    static void tearDownAfterClass(){

    }


    //(5)
    @BeforeEach
    void setUp() {
    }
    //(6)
    @AfterEach
    void tearDown() {
    }


    //(7)自分で作成
    @Test
    void testPower1() {
        double actualAnswer = MathUtil.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります");
    }
    @Test
    void testPower2(){
        double actualAnswer = MathUtil.power(0,-1);
        assertEquals(Double.POSITIVE_INFINITY,actualAnswer,"TC2:期待値と実際の結果が異なります");
    }
    @Test
    void testPower3(){
        double actualAnswer = MathUtil.power(0,0);
        assertEquals(1.0,actualAnswer,"TCC:期待値と実際の結果が異なります");
    }

    // ---

    @Test
    void testPower21(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                ()->MathUtil.power(100,0));
        assertEquals("100以上の値は不正です",expectedException.getMessage(),"TC21:期待値と実際の結果が異なります");
    }

	@Test
	void testPower21_old() {
		try {
			MathUtil.power(100, 0);
			fail("TC21:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("100以上の値は不正です", e.getMessage(), "TC21:期待値と実際の結果が異なります");
		}
	}

}