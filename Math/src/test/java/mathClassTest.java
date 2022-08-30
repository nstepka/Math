import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathClassTest {

    @Test
    public void myMathTestAdd2add2(){
        //add 2 + 2
        assertEquals(4, Math.doMath(1,2,2));
    }
    @Test
    public void myMathTestAdd0add1(){
        //add 2 + 2
        assertEquals(1, Math.doMath(1,0,1));
    }
    @Test
    public void myMathTestAdd9add9(){
        //add 2 + 2
        assertEquals(18, Math.doMath(1,9,9));
    }
    @Test
    public void myMathTestminus10minus5(){
        //10 minus 5
        assertEquals(5, Math.doMath(2,10,5));
    }
    @Test
    public void myMathTestminus10minus11(){
        //10 minus 1
        assertEquals(-1, Math.doMath(2,10,11));
    }
    @Test
    public void myMathTestminus10minus2(){
        //10 minus 2
        assertEquals(8, Math.doMath(2,10,2));
    }
    @Test
    public void myMathTestminus10times2(){
        //10 times 2
        assertEquals(20, Math.doMath(3,10,2));
    }

    @Test
    public void myMathTestminus10timesNeg2(){
        //10 times -2
        assertEquals(-20, Math.doMath(3,10,-2));
    }
    @Test
    public void myMathTestminus10times0(){
        //10 times 0
        assertEquals(0, Math.doMath(3,10,0));
    }
    @Test
    public void myMathTestminus10divide2(){
        //10 divide 2
        assertEquals(5, Math.doMath(4,10,2));
    }
    @Test
    public void myMathTestminus10divideNeg2(){
        //10 divide -2
        assertEquals(-5, Math.doMath(4,10,-2));
    }
    @Test
    public void myMathTestminus10divide0(){
        //10 divide 0; returns 0.
        assertEquals(0, Math.doMath(4,10,0));
    }

}



