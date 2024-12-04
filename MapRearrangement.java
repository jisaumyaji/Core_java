import java.util.*;

public class MapRearrangement {

    static class Cell {
        int x, y, dist;
        Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the N and M values
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        // Read the entire grid
        char[][] grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }
        
        // Solve the problem
        System.out.println(shortestPath(grid, N, M));
    }

    private static int shortestPath(char[][] grid, int N, int M) {
        // Initialize the adjacency list to hold the sheets
        List<char[][]> sheets = new ArrayList<>();

        // Step 1: Extract the M x M sheets
        for (int i = 0; i < N; i += M) {
            for (int j = 0; j < N; j += M) {
                char[][] sheet = new char[M][M];
                for (int x = 0; x < M; x++) {
                    System.arraycopy(grid[i + x], j, sheet[x], 0, M);
                }
                sheets.add(sheet);
            }
        }

        // Step 2: Reconstruct the grid from the sheets
        // We'll try to place the sheets correctly in the N x N grid
        char[][] reconstructed = new char[N][N];
        int totalSheets = (N / M) * (N / M);
        boolean[] placed = new boolean[totalSheets];
        int[] sheetIndices = new int[totalSheets];
        Arrays.fill(sheetIndices, -1);

        // Step 3: Start BFS from 'S' and reconstruct the grid
        int startX = -1, startY = -1, endX = -1, endY = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'D') {
                    endX = i;
                    endY = j;
                }
            }
        }

        // Directions for BFS (up, down, left, right)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // BFS to find the shortest path from 'S' to 'D'
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        
        // Start BFS from 'S'
        queue.add(new Cell(startX, startY, 0));
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            
            // If we reach 'D', return the distance
            if (curr.x == endX && curr.y == endY) {
                return curr.dist;
            }
            
            // Explore all 4 directions
            for (int i = 0; i < 4; i++) {
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];
                
                // Check if the new position is valid
                if (newX >= 0 && newX < N && newY >= 0 && newY < N && !visited[newX][newY] && (grid[newX][newY] == 'T' || grid[newX][newY] == 'S' || grid[newX][newY] == 'D')) {
                    visited[newX][newY] = true;
                    queue.add(new Cell(newX, newY, curr.dist + 1));
                }
            }
        }
        
        // If there's no path found, return -1
        return -1;
    }
}
