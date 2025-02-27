# JavaScript Challenge II

## Task 1: Inventory Tracker

### Given Code:

```javascript
let inventory = ["apple", "banana", "cherry", "date", "elderberry"];
let inventoryCount = [10, 15, 5, 20, 7];

for (let i = 0; i < inventory.length; i++) {
    console.log(`${inventory[i]}: ${inventoryCount[i]}`);
}
```

### Output:

```
apple: 10
banana: 15
cherry: 5
date: 20
elderberry: 7
```

### Explanation:

- The code displays the name of the fruits along with their inventory count.
- `inventory` and `inventoryCount` arrays are defined.
- `inventory` stores the fruit name, and the `inventoryCount` stores the quantity for each fruit listed in the inventory.
- The for loop iterates through the `inventory` array. Each iteration, it prints the fruit name and its count using template literals or backticks.

## Task 2: Alphabetical Sorting

### Given Code:

```javascript
let words = ["zebra", "apple", "mango", "cherry", "banana"];

for (let i = 0; i < words.length; i++) {
    for (let j = i + 1; j < words.length; j++) {
        if (words[i] > words[j]) {
            let temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
    }
}

console.log(words);
```

### Output:

```
["apple", "banana", "cherry", "mango", "zebra"]
```

### Explanation:

- The code sorts the `words` array in alphabetical order.
- The outer loop iterates over each element.
- The inner loop compares the selected word with the next words.
- The if condition `(words[i] > words[j])` checks if `words[i]` comes after `words[j]` alphabetically.
- If true, swapping occurs using the `temp` variable, moving the smaller word forward.

## Task 3: Unique Array Builder

### Given Code:

```javascript
let uniqueNumbers = [];

while (uniqueNumbers.length < 10) {
    let randomNumber = Math.floor(Math.random() * 20) + 1;

    // Check if the randomNumber already exists in the array
    let exists = false;
    for (let i = 0; i < uniqueNumbers.length; i++) {
        if (uniqueNumbers[i] === randomNumber) {
            exists = true;
            break;
        }
    }

    // If it doesn't exist, add it to the array
    if (!exists) {
        uniqueNumbers.push(randomNumber);
    }
}

console.log(uniqueNumbers);
```

### Output:

```
[1, 3, 19, 16, 6, 14, 9, 12, 7, 17]
```

NOTE: _Every execution gives a different output._

### Explanation:

- The code fills the `uniqueNumbers` array with 10 unique random numbers between 1 and 20.
- Initialize empty `uniqueNumbers` array to store the random numbers.
- The `while` loop runs until the array contains 10 numbers.
- The variable randomNumber stores a random number between 1 and 20, generated using `Math.random()` and `Math.floor()`.
- A `for` loop iterates through `uniqueNumbers` to check for duplicates.
  - If the number already exists, `exists` is set to `true`, and the loop breaks.
- If the number doesn't exist, it is added to the `uniqueNumbers` array using the `.push()` method.

## Task 4: Unique Array Builder

### Given Code:

```javascript
let sideA = 7;
let sideB = 10;
let sideC = 5;

if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
    console.log(`The sides ${sideA}, ${sideB}, and ${sideC} form a valid triangle.`);
} else {
    console.log(`The sides ${sideA}, ${sideB}, and ${sideC} do not form a valid triangle.`);
}
```

### Output:

```
The sides 7, 10, and 5 form a valid triangle.
```

### Explanation:
- The code checks whether the declared sides in `sideA`, `sideB`, and `sideC` form a valid triangle.
- Based on the `if` condition, a triangle is valid if the sum of any two sides is greater than the third side.
