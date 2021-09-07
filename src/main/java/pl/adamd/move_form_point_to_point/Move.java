package pl.adamd.move_form_point_to_point;

interface Move {
    /**
     * @param X starting point
     * @param Y end point
     * @param D the length of the movement
     * @return minimum number of moves from position X to Y
     */
   static int move(int X, int Y, int D) {
        int distance = X + D;
        int numOfMoves = 1;

        if (X == Y) {
            return 0;
        }
        while (distance < Y) {
            distance = distance + D;
            numOfMoves += 1;
        }
        return numOfMoves;
    }
}
