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

### Predicted Output:
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

### Predicted Output:
```
["apple", "banana", "cherry", "mango", "zebra"]
```

### Explanation:
- The code sorts the `words` array in alphabetical order.
- The outer loop iterates over each element.
- The inner loop compares the selected word with the next words.
- The if condition `(words[i] > words[j])` checks if `words[i]` comes after `words[j]` alphabetically.
- If true, swapping occurs using the `temp` variable, moving the smaller word forward.

