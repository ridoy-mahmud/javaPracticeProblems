import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;

class BFSVisualization extends JFrame {
    private int SIZE;
    private boolean[][] adjacencyMatrix;
    private boolean[] visited;
    private JTextArea outputArea;
    private JButton startButton;

    public BFSVisualization() {
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
        startButton = new JButton("Start BFS");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false); // Disable button during simulation
                bfs(0); // Start BFS from node 0
            }
        });

        // Set up the layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);

        // Ask the user for the number of nodes in the graph
        String sizeInput = JOptionPane.showInputDialog("Enter the number of nodes in the graph:");
        try {
            SIZE = Integer.parseInt(sizeInput);
            initializeGraph();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    // Initialize the adjacency matrix and visited array based on user input
    private void initializeGraph() {
        adjacencyMatrix = new boolean[SIZE][SIZE];
        visited = new boolean[SIZE];

        // Ask the user to input the adjacency matrix
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                String input = JOptionPane
                        .showInputDialog("Is there an edge between Node " + i + " and Node " + j + "? (true/false)");
                try {
                    adjacencyMatrix[i][j] = Boolean.parseBoolean(input);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input. Please enter 'true' or 'false'.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            }
        }
    }

    // Perform BFS traversal and display the steps in the JTextArea with proper
    // visualization
    private void bfs(int startNode) {
        outputArea.setText(""); // Clear previous output
        java.util.Queue<Integer> queue = new LinkedList<>();

        // Enqueue the starting node and mark it as visited
        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            // Visualize the visited node (change color)
            outputArea.append("Visiting Node: " + currentNode + "\n");
            highlightNode(outputArea.getText().lastIndexOf("Visiting Node: " + currentNode),
                    outputArea.getText().lastIndexOf("Visiting Node: " + currentNode) + 14, Color.GREEN);

            // Enqueue all adjacent nodes that haven't been visited
            for (int i = 0; i < SIZE; i++) {
                if (adjacencyMatrix[currentNode][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }

            // Delay for visualization purposes
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Enable the Start BFS button after simulation is complete
        startButton.setEnabled(true);
    }

    // Helper method to highlight a specific portion of the text area with a given
    // color
    private void highlightNode(int start, int end, Color color) {
        try {
            DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(color);
            outputArea.getHighlighter().addHighlight(start, end, painter);
        } catch (BadLocationException e) {
            e.printStackTrace();
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
