public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        int rows = board.length;
        int cols = board[0].length;

        int[][] nextState = new int[rows][cols];

        // Iterate each cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j, rows, cols);

                if (board[i][j] == 1) {
                    // Rule 1 or 3
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        nextState[i][j] = 0;
                    }
                    // Rule 2
                    else {
                        nextState[i][j] = 1;
                    }
                } else {
                    // Rule 4
                    if (liveNeighbors == 3) {
                        nextState[i][j] = 1;
                    } else {
                        nextState[i][j] = 0;
                    }
                }
            }
        }

        // Print the next state
        System.out.println("Next Generation Board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nextState[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Count live neighbors
    static int countLiveNeighbors(int[][] board, int x, int y, int rows, int cols) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int count = 0;

        for (int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                count += board[nx][ny];
            }
        }

        return count;
    }
}
