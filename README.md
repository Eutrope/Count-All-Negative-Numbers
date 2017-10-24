# Count-All-Negative-Numbers
This is a Java program that counts all the negative integers in a <i>n x m</i> matrix.</br>
We will assume that the matrix is sorted from smallest to largest on every row.<br>

<b>Approach:</b> given a 3x2 matrix with elements {{-1, 2, 3}, {-2, -1, 5}}, we will be moving on every row from right to left, 
keeping track the <i>index + 1</i> position of the first negative number we see. Once we found our negative number, we go move
on to the next row of the matrix. We do this because once we find the first negative number, we know that every number 
to it's left is a negative number as well, and therefore no longer need to continue traversing the array.<br>

<b>Example input:</b> {{-1,2,3}, {-2,-1,5}} <br>
<b>Example output:</b> 3
