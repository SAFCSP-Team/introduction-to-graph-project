# Graph Project

### Objective

In this project, we will cover the fundamentals of a `graph`, and how to implement it using an `adjacency matrix`.

### Concepts

Use the provided resources for a better understanding.


| Concept                                 | Resources                                                                                                          |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| Understand the Graph                    | [Graph Introduction](https://www.youtube.com/watch?v=R74DnYySxv0) |
| Understand how to implement graph       | [Graph Adjacency Matrix Implementation](https://www.youtube.com/watch?v=B28xAWEerK8)       |

### Problem
Create a graph to represent the metro system.

The metro system has 3 stations which are 'A', 'B', 'C'.
Make the following connections between the stations as shown in the image below.

<image src="images/graph-adjMatrix.png">

Present the graph using adjacency matrix.


### Implementation

Write the implementation of the **graph adjacency matrix**.

1. Add attribute data of type chr in **Vertex** class to store the station name. 
2. In Graph class, create attribute called **vertices** of type array list which store the vertices in array list.
3. In Graph class, create attribute called **adjMatrix** of type 2D array to store the adjacency matrix.
4. Do the following in Graph class:
    - Create an attribute called **vertices** of type array list which store the vertices. And initialize it in the constructor.
    - Create an attribute called **adjMatrix** of type 2D array to store the adjacency matrix. And initialize it in the constructor.
    - Do the **addVertex** implementaiton which takes a vertex and add it to the vertices array list.
    - Do the **addEdge** implemetation which adds 1 to the adjMatrix at the index of source and destination.

**OUTPUT:**
````
  A  B  C
A 0  1  0  
B 0  0  1  
C 1  0  0  
````

> * Once you complete this project, Create an issue with the title "Completed [your-username]".
> * Create an issue of your questions, If you face any trouble solving the project.
