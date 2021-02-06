public class MyArraySizeException extends ArrayStoreException {
    private final int size;


    public MyArraySizeException(String s, int size) {
        super(s);
        this.size = size;
        System.out.println();
    }
}