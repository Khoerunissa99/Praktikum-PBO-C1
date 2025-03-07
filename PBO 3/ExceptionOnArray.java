// Nama : Khoerunissa Billah Wahyu Sarbini
// NIM  : 24060123140178
// Lab : C1
// File : ExceptionOnArray.java

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[3] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
