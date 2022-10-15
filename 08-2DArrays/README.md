# Week 10 - 2D Arrays

- [Programiz - Multi-Dimensional Arrays](https://www.programiz.com/java-programming/multidimensional-array)

### 2-D Arrays

A 2D array is an array of arrays. Each element of a 2D array is an array itself. It is easiest to think of 2D arrays in terms of number of rows, an x-axis and number of columns, a y-axis.

```
int[][] twod = new int[3][3];
```

- creates 3, 3 element arrays
- to access a value stored in the array, need to access the index

| [\_][\_] | [\_][0] | [\_][1] | [\_][2] |
| -------- | ------- | ------- | ------- |
| [0][_]   | 12      | 8       | 72      |
| [1][_]   | 89      | 3       | 42      |
| [2][_]   | 9       | 87      | 15      |

To initialize a 2-D array with the values above, the array could have  
been created like so:

```
// the following could be written on one line
// for clarity, I'm adding new lines
int[][] tdnumarr = {{12, 8, 72},
                    {89, 3, 42},
                    {9, 87, 15} };
```

- `System.out.println(tdnumarr[0][2]);` would print `72`
- `tdnumarr[1][1] = 45;` would change the value at `[1][1]` from `89` to `45`

### 3-D Arrays (and beyond!)

3-D arrays are a build on from 2-D. Each element in a 3D array is an array, and each element in that element is an array. I think of 3-D arrays as adding a "depth" or "z"-axis - so my mental model is a cube.

You can expand this beyond a 3D array, up to N-dimensions. At some point, they get hard to think about and your brain hurts. Amusements parks, when they says 4-D ride, it means they are going to move you up and down, left and right, forward and backward, and inject smells in the air so you smell the jungle. I am not a fan.

- The array below, `test`, could have been set to an initial size:
- `int[][][] test = new int[3][2][4];`
- In words, what we have stated is this:
  - create a 3 element array
  - for each element in that array, create an array of 2 elements
  - for each element in that array, create an array of 4 elements

```
// test is a 3d array
int[][][] test = {
        {
          {1, -2, 3, 8},
          {2, 3, 4, -3}
        },
        {
          {6, -3, 9, 1},
          {1, 5, -42, -4}
        },
        {
          {0, 2, 43, 5},
          {-9, 12, 7, 2}
        }
};
```

- `System.out.println(test[0][1][1]);` would print `3`
- `test[2][1][0] = 42;` would change the value at `[2][1][0]` from `-9` to`42`

### Ragged arrays

Each row of the multidimensional array in Java can be of different lengths.

- Professor Duncan has not found use for this outside of tricky exam questions.

```
int[][] a = {
      {1, 2, 3},
      {4, 5, 6, 9},
      {7},
};
```

### Multidimensional Arrays & Nested Loops

Recommendation: if you need to review nested loops without bringing arrays into the mix, head back to [04-Loops](../04-Loops)

For 1-D arrays, we talked about accessing each index by using a `for` loop, using the `iterator` of the `for` loop to iterate through `index` values, and access each `index` of an array.

2-D arrays are going to use the same concept, but with an outer loop to access the "x"-axis index, or row index, and inner loop to access the "y"-axis index, or column index. Here is a sample that creates a 2-D array, then fills it with value read from console (standard input / the user)

```
int funarr = int[2][3];
// get array size for "outer" loop - xsize would also be a good name
int rows = funarr.length;
// get array size for "inner" loop - ysize would also be a good name
int cols = funarr[0].length;

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        funarr[i][j] = scnr.nextInt();
    }
}

```
