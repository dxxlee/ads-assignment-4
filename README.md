# ads-assignment-4
Weighted Graph Implementation with BFS and Dijkstra's Algorithm
This repository contains a Java implementation of a weighted graph data structure along with Breadth-First Search (BFS) and Dijkstra's algorithm for pathfinding. The implementation uses object-oriented principles to represent vertices and edges in a graph, allowing for efficient traversal and shortest path calculations.

Contents
Vertex.java: Represents a vertex in the graph, storing its data and adjacent vertices with respective weights.

WeightedGraph.java: Implements the weighted graph using adjacency list representation. It supports both directed and undirected graphs and provides methods to add vertices, add weighted edges, and retrieve vertices and their adjacent vertices.

Search.java: An abstract class that serves as a base class for BFS and Dijkstra's algorithm implementations. It contains methods for pathfinding such as hasPathTo and pathTo.

BreadthFirstSearch.java: Extends Search and implements BFS to find the shortest path in an unweighted graph.

DijkstraSearch.java: Extends Search and implements Dijkstra's algorithm to find the shortest path in a weighted graph.

Main.java: Contains example usage demonstrating how to create graphs, fill them with vertices and edges, and perform pathfinding using both BFS and Dijkstra's algorithm. I didn't changed Main for perfect scenario


Usage
Setting Up a Weighted Graph:

Create an instance of WeightedGraph.
Add vertices using addVertex.
Add edges with weights using addEdge.
Performing BFS:

Instantiate BreadthFirstSearch with the graph and starting vertex.
Use pathTo to retrieve the shortest path from the starting vertex to a destination.
Performing Dijkstra's Algorithm:

Instantiate DijkstraSearch with the graph and starting vertex.
Use pathTo to retrieve the shortest path from the starting vertex to a destination.
Example:
WeightedGraph<String> weightedGraph = new WeightedGraph<>(true); // Directed graph
weightedGraph.addEdge("A", "B", 5.0);
weightedGraph.addEdge("B", "C", 3.0);
weightedGraph.addEdge("A", "C", 7.0);

System.out.println("Dijkstra:");
Search<String> dijkstra = new DijkstraSearch<>(weightedGraph, "A");
outputPath(dijkstra, "C");

System.out.println("BFS:");
Search<String> bfs = new BreadthFirstSearch<>(weightedGraph, "A");
outputPath(bfs, "C");
