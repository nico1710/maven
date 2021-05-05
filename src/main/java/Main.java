
public class Main {
    public static void main(String[] args){
    }

    public static int serie(int posicion) {
        if(posicion == 0) {
            return 0;
        }else if (posicion == 1){
            return 1;
        }else {
            return serie(posicion - 1) + serie(posicion - 2);
        }
    }

    public static int [] fibo(int cantidad) {
        int[] array = new int[cantidad];
        for(int i=0; i<cantidad; i++) {
            array[i] = serie(i);
        }
        return array;
    }


}
