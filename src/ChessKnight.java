import static java.lang.Character.getNumericValue;

public class ChessKnight {

    public static String getKnightMoves(String position) {
        char column = position.charAt(0);
        int row = getNumericValue(position.charAt(1));
        String possiblePositions = "";

        possiblePositions += checkPosition((char) (column - 2), row - 1);
        possiblePositions += checkPosition((char) (column - 2), row + 1);
        possiblePositions += checkPosition((char) (column - 1), row - 2);
        possiblePositions += checkPosition((char) (column - 1), row + 2);
        possiblePositions += checkPosition((char) (column + 1), row - 2);
        possiblePositions += checkPosition((char) (column + 1), row + 2);
        possiblePositions += checkPosition((char) (column + 2), row - 1);
        possiblePositions += checkPosition((char) (column + 2), row + 1);

        return possiblePositions.toLowerCase();
    }

    private static String checkPosition(char column, int row) {
        String possiblePosition = "";
        if (1 <= row && row <= 8 && 'A' <= column && column <= 'H' || 'a' <= column && column <= 'h') {
            possiblePosition += column + Integer.toString(row) + " ";
        }
        return possiblePosition;
    }

    public static void main(String[] args) {
        for (String s : new String[]{"A1", "d5", "g6", "C8"}) {
            System.out.println(s + " -> " + getKnightMoves(s));
        }
    }
}