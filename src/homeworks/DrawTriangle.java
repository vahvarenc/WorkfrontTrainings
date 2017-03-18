package homeworks;

/**
 * Created by Karen on 3/18/2017.
 */
public class DrawTriangle {
    public static void drawTriangle(int n){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
