import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

class BFSVisualization extends JFrame {
    private final int SIZE = 5; // Number of nodes in the graph
    private boolean[][] adjacencyMatrix;
    private boolean[] visited;
    private JTextArea outputArea;

    public BFSVisualization() {
        // Initialize the adjacency matrix and visited array
        adjacencyMatrix = new boolean[SIZE][SIZE];
        visited = new boolean[SIZE];

        // Set up the JFrame
        setTitle("BFS Algorithm Visualization");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a JTextArea for displaying the output
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Create a button to start the BFS simulation
        JButton startButton = new JButton("Start BFS");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bfs(0); // Start BFS from node 0
            }
        });

        // Set up the layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }

    // Perform BFS traversal and display the steps in the JTextArea
    private void bfs(int startNode) {
        outputArea.setText(""); // Clear previous output
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue the starting node and mark it as visited
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            outputArea.append("Visiting Node: " + currentNode + "\n");

            // Enqueue all adjacent nodes that haven't been visited
            for (int i = 0; i < SIZE; i++) {
                if (adjacencyMatrix[currentNode][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BFSVisualization().setVisible(true);
            }
        });
    }
}
