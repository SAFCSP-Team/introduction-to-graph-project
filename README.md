# Graph

### Objective

In this project, we will be covered the fundamentals of a `graph`, and how to implement it using `adjacency matrix`.

### Concepts

Use the provided resources for a better understanding.


| Concept                                 | Resources                                                                                                          |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| Understand the Graph                    | [Graph Introduction](https://www.youtube.com/watch?v=R74DnYySxv0&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp&index=34) |
| Understand how to implement graph       | [Graph Adjacency Matrix Implementation](https://www.youtube.com/watch?v=xX5iOYCJmBI&list=PLZPZq0r_RZON1eaqfafTnEexRzuHbfZX8)       |

### Problem
You have a metro system with a number of stations. Each station is connected to some other stations. 
Create a graph to represent the metro system.

The metro system has 4 stations which are 'A', 'B', 'C', 'D'.
'A' is connected to 'B' and 'C', 'B' is connected to 'C', 'C' is connected to 'A' and 'D', 'D' is connected to 'A'.
Present the graph using adjacency matrix.

> Draw the graph on a paper before you start coding, to make it easier to understand the problem.

### Implementation

Write the implemenation of the **graph adjacency matrix**.

1. Create a class called **Node** to store the station name. 
2. In Node class, create a constructor to initialize the station name.
3. Create a class called **Graph** with ArrayList nodes and two-dimensional array to store the connection between station.
4. In Graph class, create a method called `addNode` to add a new station.
5. In Graph class, create a method called `addEdge` to add a connection between two stations.
6. In main method, create a graph and add the stations and the connections between them based on the problem.

````Java
public class Main {
    public static void main(String[] args) {
        /* Your Code Here */
  
    }
}
````

> * Once you complete this project, Create an issue with title "Completed [your-username]".
> * Create an issue of your questions, If you face any trouble solving the project.
