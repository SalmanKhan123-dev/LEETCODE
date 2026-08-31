class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // If both colors are same, nothing to do
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int i, int j,
                    int originalColor, int color) {

        // Boundary check
        if (i < 0 || i >= image.length ||
            j < 0 || j >= image[0].length ||
            image[i][j] != originalColor) {

            return;
        }

        // Change current color
        image[i][j] = color;

        // Top
        dfs(image, i - 1, j, originalColor, color);

        // Right
        dfs(image, i, j + 1, originalColor, color);

        // Bottom
        dfs(image, i + 1, j, originalColor, color);

        // Left
        dfs(image, i, j - 1, originalColor, color);
    }
}