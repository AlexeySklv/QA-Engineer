public class MyArrayDataException extends NumberFormatException {
    private final int firstCoordinate;
    private final int secondCoordinate;

    public String getCoordinates() {
        return "[" + firstCoordinate + "][" + secondCoordinate + "]";
    }

    public MyArrayDataException(int firstCoordinate, int secondCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }

    public MyArrayDataException(String s, int firstCoordinate, int secondCoordinate) {
        super(s);
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }
}