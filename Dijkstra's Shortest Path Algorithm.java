import java.util.*;

public class DijkstraAlgorithm {
    private static final int NO_PARENT = -1;

    public static void dijkstra(int[][] graph, int startVertex) {
        int nVertices = graph.length;

        int[] shortestDistances = new int[nVertices];
        boolean[] added = new boolean[nVertices];

        for (int i = 0; i < nVertices; i++) {
            shortestDistances[i] = Integer.MAX_VALUE;
            added[i] = false;
        }

        shortestDistances[startVertex] = 0;
        int[] parents = new int[nVertices];
        parents[startVertex] = NO_PARENT;

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = graph[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    private static void printSolution(int startVertex, int[] distances, int[] parents) {
        System.out.println("Vertex\t Distance\tPath");

        for (int i = 0; i < distances.length; i++) {
            if (i != startVertex) {
                System.out.print(startVertex + " -> " + i + "\t " + distances[i] + "\t\t");
                printPath(i, parents);
                System.out.println();
            }
        }
    }

    private static void printPath(int currentVertex, int[] parents) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] {
                {0, 7, 9, 0, 0, 14},
                {7, 0, 10, 15, 0, 0},
                {9, 10, 0, 11, 0, 2},
                {0, 15, 11, 0, 6, 0},
                {0, 0, 0, 6, 0, 9},
                {14, 0, 2, 0, 9, 0}
        };
        dijkstra(graph, 0);
    }
}
