package QuadraticEquation;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isQuadratic () {
        return a != 0;
    }

    public int discriminant () {
        return b * b - 4 * a * c;
    }

    public class Solution {
        public double root1;
        public double root2;
    };

    public Solution findSolution() {
        Solution solution = new Solution(); // = null;
        if (!isQuadratic()) return null;
        int d = discriminant();
        if (d > 0) {
            solution.root1 = (- b + Math.sqrt(d)) / (2 * a);
            solution.root2 = (- b - Math.sqrt(d)) / (2 * a);
        }
        else if (d == 0) {
            solution.root1 = solution.root2 = - b / (2 * a);
        }
        else return null;
        return solution;
    }

}

