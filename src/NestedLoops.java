public class NestedLoops {

    public static String xSquare(int n) {

        return "";
    }

    public static String flippedTriangle(int n) {

        return "";
    }

    public static String fizzBuzz(int n) {

        return "";
    }

    public static String sideways() {
        String top = "";
        // top part of sideways
        for (int i=1; i<=4; i++) {
            int spaces = 5-i;
            for (int j=0; j<spaces; j++) {
                top += "  ";
            }
            for (int k=i; k>=1; k--) {
                top += k + " ";
            }
            top += "\n";
        }

        // bottom part of sideways
        String bottom = "";
        for (int i=1; i<=5; i++) {
            int spaces = 5-i;
            for (int k=1; k<=i; k++) {
                bottom = k + " " + bottom;
            }
            for (int j=0; j<spaces; j++) {
                bottom = "  " + bottom;
            }
            bottom = "\n" + bottom;
        }
        return top.substring(0, top.length()-1) + bottom.substring(0, bottom.length()-1);
    }
}
