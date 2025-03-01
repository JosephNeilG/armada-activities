# JavaScript Function Challenge II

## Challenge 1:

### Given Code:

```javascript
function generatePattern() {
    let result = "";
    for (let i = 1; i <= 3; i++) {
        for (let j = 1; j <= i; j++) {
            result += j + " ";
        }
        result += "\n";
    }
    return result;
}

console.log(generatePattern());
```

### Predicted and Actual Output:

```
1
1 2
1 2 3 
```

### Explanation:
- Initialize emtpy string `result` to store pattern.
- Outer `for` loop (`i`) for the pattern's column and inner loop (`j`) for the row.

## Challenge 2:

### Given Code:

```javascript
function swapFirstLast(arr) {
    let first = arr.shift();
    let last = arr.pop();
    arr.unshift(last);
    arr.push(first);
    return arr;
}

let numbers = [10, 20, 30, 40];
console.log(swapFirstLast(numbers));
console.log(numbers);
```

### Predicted and Actual Output:

```
[40, 20, 30, 10]
[40, 20, 30, 10]
```

### Explanation:
- `swapFirstLast(arr)` swaps the first and last element of the array.
- `.shift()` removes first element from the array and stores it in `first` variable.
- `.pop` removes last element from the array and stores it in `last` variable.
- `.unshift()` adds `last` to the beginning of the array.
- `.push()` adds `first` to the end of the array.

## Challenge 3:

### Given Code:

```javascript
function filterPassingGrades(grades) {
    let passing = [];
    for (let grade of grades) {
        if (grade >= 70) {
            passing.push(grade);
        } else {
            passing.unshift(grade);
        }
    }
    return passing;
}

let scores = [85, 45, 90, 60];
console.log(filterPassingGrades(scores));
```

### Predicted and Actual Output:

```
[60, 45, 85, 90]
```

### Explanation:
- `filterPassingGrades(grades)` filter passing scores (end of array) from the failing scores (beginning of array).
- Initialized empty `passing` array to store filtered grades.
- `for of` loop iterates through each grade in `grades`.
- `if` condition checks whether the score passed (`.push()`) or not (`.unshift()`).

## Challenge 4:

### Given Code:

```javascript
function updateStatus(tasks) {
    for (let task of tasks) {
        task.completed = !task.completed;
    }
    return tasks;
}

let taskList = [
    { id: 1, completed: false },
    { id: 2, completed: true }
];

console.log(updateStatus(taskList));
console.log(taskList);
```

### Predicted and Actual Output:

```
[
    { id: 1, completed: true },
    { id: 2, completed: false }
]
[
    { id: 1, completed: true },
    { id: 2, completed: false }
]
```

### Explanation:
- `invertStatus(tasks)` inverts the value `completed` status using `!task.completed`.
- `for of` loop iterates through each task object in the `tasks` array.

## Challenge 5:

### Given Code:

```javascript
function findValue(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return `Found at index ${i}`;
        }
    }
    return "Not found";
}

let data = [5, 12, 8, 130, 44];
console.log(findValue(data, 12));
console.log(findValue(data, 100));  
```

### Predicted and Actual Output:

```
Found at index 1
Not found
```

### Explanation:
- `findValue(arr, target)` finds the index of the specified `target` from the `arr`.
- `for` iterates over the `data` array.
- `if` condition checks if the element is equal to the `target`.