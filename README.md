# CIT300 Data Structure and Graph Performance Analyzer

## Assignment
CIT300 Data Structures and Algorithms - Graded Practical Assignment 2 (Week 12)

## Project Description
A Java console-based application demonstrating Array, Stack, Queue, Linked List, Searching, Graph Traversal, and Performance/Complexity analysis.

## Team Members
| Member | Student ID | Responsibility | Contribution |
|---|---|---|---|
| MFF Hansa | 23DA2-0480 | Array + Searching | Implemented CustomArray operations and Linear/Binary Search integration and testing. |
| MSF Shahama | 23DA2-0899 | Stack + Queue | Implemented Stack and Queue operations, empty/full validation, and testing. |
| MM Mifla Banu | 23DA2-1111 | Linked List + Integration | Implemented Linked List operations and helped integrate/testing of the main menu. |
| A Hijas Ahamad | 23DA2-0720 | Graph + Performance | Implemented Graph, Add Vertex/Edge, BFS, DFS and performance/complexity demonstration. |

> Replace all four placeholder Student IDs with the actual IDs before submission.

## Technologies
- Java
- VS Code
- Git / GitHub
- Console-based application

## Main Features
1. Array: Insert, Delete, Search, Display
2. Stack: Push, Pop, Peek, Display
3. Queue: Enqueue, Dequeue, Peek/Front, Display
4. Linked List: Insert, Delete, Search, Display
5. Searching: Linear Search, Binary Search, comparison
6. Graph: Add Vertex, Add Edge, Display, BFS, DFS
7. Performance/Complexity comparison
8. Input validation and empty-structure handling

## How to Run in VS Code

### Check Java
```bash
java -version
javac -version
```

### Compile
From the project root:
```bash
javac -d out src/*.java
```

### Run
```bash
java -cp out Main
```

## Complexity Summary
| Component | Operation | Complexity |
|---|---|---|
| Array | Search | O(n) |
| Array | Insert/Delete | O(n) worst case |
| Stack | Push/Pop/Peek | O(1) |
| Queue | Enqueue/Dequeue/Peek | O(1) |
| Linked List | Search | O(n) |
| Linked List | Insert at end | O(n) in this implementation |
| Linear Search | Search | O(n) |
| Binary Search | Search | O(log n) |
| Graph BFS | Traversal | O(V + E) |
| Graph DFS | Traversal | O(V + E) |

## Suggested Demo Data
Graph vertices:
- Main Gate
- Library
- IT Faculty
- Cafeteria
- Hostel
- Administration

Example edges:
- Main Gate - Library
- Main Gate - IT Faculty
- Library - Cafeteria
- IT Faculty - Hostel
- Cafeteria - Administration
- Hostel - Administration

