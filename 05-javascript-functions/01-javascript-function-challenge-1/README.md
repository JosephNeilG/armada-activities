# JavaScript Function Challenge I

## Challenge 1:

### Given Code:

```javascript
function calculateSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

let numbers = [1, 2, 3, 4];
console.log("Sum:", calculateSum(numbers));
```

### Predicted and Actual Output:

```
Sum: 10
```

### Explanation:
- `calculateSum(arr)` takes an array as input and calculates the sum of its element.
- variable `sum` stores the total sum.
- The `for` loop iterates through each element in the array, and adds it to sum.
- the `calculateSum` function is called with `numbers` argument with an array as input.

### T Diagram:

| Variable  |       Values          |
| ----------|:---------------------:|
| numbers   | [1,2,3,4]             |
| sum       | 0 -> 1 -> 3 -> 6 -> 10|
| i         | 0 -> 1 -> 2 -> 3 -> 4 |

## Challenge 2:

### Given Code:

```javascript
function isEven(num) {
    if (num % 2 === 0) {
        return true;
    } else {
        return false;
    }
}

console.log(isEven(4));
console.log(isEven(7));
console.log(isEven(0));
```

### Predicted and Actual Output:

```
true
false
true
```

### Explanation:
- `isEven(num)` checks if a number is even.
- It uses `num % 2 === 0` to check if the number is divisible by 2.
- If the remainder is 0, it returns `true` (even number). Else, it returns `false` (odd number).

### T Diagram:

| Variable  |       Values          |
| ----------|:---------------------:|
| num       | 4                     |
| num       | 4                     |
| num       | 4                     |

## Challenge 3:

### Given Code:

```javascript
function greet(name) {
    return "Hello, " + name + "!";
}

function personalizedGreeting(names) {
    for (let i = 0; i < names.length; i++) {
        console.log(greet(names[i]));
    }
}

let friends = ["Alice", "Bob", "Charlie"];
personalizedGreeting(friends);
```

### Predicted and Actual Output:

```
Hello, Alice!
Hello, Bob!
Hello, Charlie!
```

### Explanation:

- `greet` function takes a name as input and returns a greeting.
- `personalizedGreeting` functions loops through the `names` array and calls `greet` for each name.
- `personalizedGreeting(friends)` iterates through `friends` array and prints a greeting of each name.

### T Diagram:

| Variable  |       Values                 |
| ----------|:----------------------------:|
| i         | 0 -> 1 -> 2                  |
| friends   | ["Alice", "Bob", "Charlie"]  |
| names[i]  | "Alice" -> "Bob" -> "Charlie"|

## Challenge 4:

### Given Code:

```javascript
function reverseArray(arr) {
    let reversed = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        reversed.push(arr[i]);
    }
    return reversed;
}

let originalArray = [10, 20, 30];
console.log(reverseArray(originalArray));
console.log(originalArray);
```

### Predicted and Actual Output:

```
[30, 20, 10]
[10, 20, 30]
```

### Explanation:
- `reverseArray(arr)` takes an array as input and creates a new reversed array.
- Initialized empty array `reversed`.
- `for` loop iterates through `arr` from last element to first and each element is added to `reversed` using `push()`.
- function returns reversed array.

### T Diagram:

| Variable       |       Values                        |
| -------------- |:-----------------------------------:|
| reversed       | [] -> [30] -> [30,20] -> [30,20,10] |
| i              | 2 -> 1 -> 0 -> -1                   |
| originalArray  | [10, 20, 30]                        |


## Challenge 5:

### Given Code:

```javascript
function multiplyMatrix(matrix) {
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            matrix[i][j] *= 2;
        }
    }
    return matrix;
}

let matrix = [
    [1, 2],
    [3, 4],
];
console.log(multiplyMatrix(matrix));
```

### Predicted Output:

```
none
```

### Actual Output:

```
[
    [2,4],
    [6,8]
]
```

### Explanation:
- `multiplyMatrix` function takes a 2D array as input.
- The outer `for` loop (`i`) iterates through the array rows.
- The inner `for` loop (`j`) iterates through the array columns.
- Each element is multiplied by 2, and the matrix is updated.

### T Diagram:

| Variable  |       Values                        |
| ----------|:-----------------------------------:|
| matrix    | [[1, 2],[3, 4]] -> [[2, 2],[3, 4]] -> [[2, 4],[3, 4]] -> [[2, 4],[6, 4]] -> [[2, 4],[6, 8]]|
| i         | 0 -> 1                                |
| j         | 0 ->1 -> 0 -> 1                       |
