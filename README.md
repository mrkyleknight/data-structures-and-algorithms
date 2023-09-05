[Code Challenge: 1 reverseArray](Code1.md)

[Code Challenge: 3 insertShiftArray](Code3.md)

[Code Challenge: 4 BinarySearch ](Code4.md)

[Code Challenge: 6 inked-list-insertions](Code6.md)

[Code Challenge: 7 linked-list-kth](Code7.md)

[Code Challenge: 26 inked-list-insertions](Code6.md)

[Code Challenge: 27 inked-list-insertions](Code6.md)

# Code Challenge: 32

## tree-intersection
Feature Tasks
Write a function called tree_intersection that takes two binary trees as parameters.
Using your Hashmap implementation as a part of your algorithm, return a set of values found in both trees.

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
I changed the 'TreeNode' source to fix the error. This wasn't about speed, just making the code work.

## Solution
To check if your code works, you can click 'Run Test' in your coding program. If everything is good, you'll see a message saying it passed; if not, you'll find out what needs fixing.

#### Assistance provided by ChatGPT from OpenAI & Code Fellow Staff

# Code Challenge: 35

## graph
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

add vertex
Arguments: value
Returns: The added vertex
Add a vertex to the graph
add edge
Arguments: 2 vertices to be connected by the edge, weight (optional)
Returns: nothing
Adds a new edge between two vertices in the graph
If specified, assign a weight to the edge
Both vertices should already be in the Graph
get vertices
Arguments: none
Returns all of the vertices in the graph as a collection (set, list, or similar)
Empty collection returned if there are no vertices
get neighbors
Arguments: vertex
Returns a collection of edges connected to the given vertex
Include the weight of the connection in the returned collection
Empty collection returned if there are no vertices
size
Arguments: none
Returns the total number of vertices in the graph
0 if there are none

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
I used a list-based approach for the graph because it's a flexible and space-efficient way to represent connections; this method typically has fast performance for common tasks and uses space proportional to the amount of data.

## Solution
To run the code, compile and execute the test class; when executed, it will validate the graph's functionality, showcasing its ability to add vertices, connect them with edges, and retrieve information.

#### Assistance provided by ChatGPT from OpenAI & Code Fellow Staff

# Code Challenge: 36

## graph-breadth-first
Write the following method for the Graph class:

breadth first
Arguments: Node
Return: A collection of nodes in the order they were visited.
Display the collection

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency

I used a "waiting line" method to visit each place in the network one by one, marking them as I go. This way is quick and doesn't use a lot of extra memory. In technical terms, the time and memory usage for this method are both related to the number of places and connections in the network.

## Solution

To run the code, open your code editor, navigate to the folder containing the test file, and execute the tests. The test output will show the method successfully visiting all the nodes in the graph in the specified order.

#### Assistance provided by ChatGPT from OpenAI & Code Fellow Staff

# Code Challenge: 38

## graph-depth-first
Write the following method for the Graph class:

Name: Depth first
Arguments: Node (Starting point of search)
Return: A collection of nodes in their pre-order depth-first traversal order
Program output: Display the collection

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency

I used a depth-first search method because it's a straightforward way to explore all the connected points in a graph.

## Solution
To solve the challenge, I used a simple "to-do list" of places to visit in the graph, marking off each one as I visited it. This method is both quick and doesn't require much extra memory.
To see the code in action, you can just put the provided code files into your coding project and run the tests. They'll show you if everything's working as expected.

#### Assistance provided by ChatGPT from OpenAI & Code Fellow Staff
