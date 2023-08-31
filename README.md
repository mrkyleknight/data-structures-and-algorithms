[Code Challenge: 1 reverseArray](Code1.md)

[Code Challenge: 3 insertShiftArray](Code3.md)

[Code Challenge: 4 BinarySearch ](Code4.md)

[Code Challenge: 6 inked-list-insertions](Code6.md)

[Code Challenge: 7 linked-list-kth](Code7.md)

[Code Challenge: 26 inked-list-insertions](Code6.md)

[Code Challenge: 27 inked-list-insertions](Code6.md)

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
