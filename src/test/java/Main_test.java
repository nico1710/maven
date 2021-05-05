import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 0 1 2 3 4 5 6
// 0 1 1 2 3 4 8
public class Main_test {

    @Test
    public void serie_test() {
        int control, obtenido;
        control = 2;
        obtenido = Main.serie(3);
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void serie_test2() {
        int control, obtenido;
        control = 3;
        obtenido = Main.serie(4);
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void serie_test3() {
        int control, obtenido;
        control = 8;
        obtenido = Main.serie(6);
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void fibo_test() {
        int[] control = {0,1,1,2,3,5};
        int[] obtenido;
        obtenido = Main.fibo(control.length);
        Assertions.assertArrayEquals(control, obtenido);
    }




}
