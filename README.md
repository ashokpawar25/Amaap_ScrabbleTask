# Amaap_ScrabbleTask

## Problem Statement

Scrabble, this is a game where players attempt to create words from a set of letter tiles. Different letters have different points allocated to them.
In the English alphabet, letters have the following point scores:
Point(s)	Letter(s)
1			E, A, I, O, N, R, T, L, S, U
2			D, G
3			B, C, M, P
4			F, H, V, W, Y
5			K
8			J, X
10			Q, Z

Calculate the score for a word. The score is the sum of the points for the letters that make up a word. 
For example: GUARDIAN = 2 + 1 + 1 + 1 + 2 + 1 + 1 + 1 = 10.


## Classes and Variables


### ScrabbleManager

- **States**:
  - `PointAllocator allocator`: class to allocate points to varibles.
  - `dataSupplier`: class to supply the data of election result.

- **Constructors**:
  - `ScrabbleManager(PointAllocator allocator)`: Initializes the local variable.

- **Behaviour**:
  - `getScore(String word)`: get word as input and return the result.


### PointAllocator Class

- **States**:
  - `Map<Integer, List<String>> pointsTable`: store the points for alphabets.

- **Constructors**:
  - `PointAllocator()`: Empty constructor to initilize add the points to alphabets.

- **Behaviour**:
  - `Map<Integer, List<String>> getPointsTable()`: Return points to alphabets.
  
