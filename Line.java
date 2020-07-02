package geometry;

public class Line {
    //properties
    public int startX;
    public int endX;
    public int startY;
    public int endY;

    //constructor
    public Line(int startX, int startY, int endX, int endY) {

        if ((startX + startY) != (endX + endY)) {
            this.startX = startX;
            this.endX = endX;
            this.startY = startY;
            this.endY = endY;
        } else {
            System.err.println("INVALID LINE COORDINATES! START POINT EQUALS THE END POINT...");
        }
    }

    public void printCoords() {
        System.out.println("[" + startX + ":" + startY + "]----->[" + endX + ":" + endY + "]");
    }

    public int length() {
        return (int)Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2));
    }
}
