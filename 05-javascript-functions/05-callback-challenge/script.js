// 1. Custom Map Function
function customMap(arr, cb) {
    let doubledArr = [];
    for (let i = 0; i < arr.length; i++) {
        doubledArr.push(cb(arr[i]));
    }
    return doubledArr;
}

let numbers = [1, 2, 3];
let doubled = customMap(numbers,
    function(num) {
        return num * 2;
    });
console.log(doubled); // Should output: [2,4,6]

// 2. Filter Function
function filter(arr, cb) {
    let filteredArr = [];
    for (let i = 0; i < arr.length; i++) {
        if (cb(arr[i])) {
            filteredArr.push(arr[i]);
        }
    }
    return filteredArr;
}

let result = filter([1, 2, 3, 4, 15],
    function(val) {
        return val < 10;
    });
console.log(result); // Should output: [1,2,3,4]

// 3. Some Function
function some(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        if (cb(arr[i])) {
            return true;
        }
    }
    return false;
}

let result1 = some([1, 2, 3, 4],
    function(val) {
        return val > 5;
    });
console.log(result1); // "Should output: true" shows in the instruction, but my output is false as there's no value in the array greater than 5.

// 4. Every Function
function every(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        if (!cb(arr[i])) {
            return false;
        }
    }
    return true;
}

let result2 = every([1, 2, 3],
    function(val) {
        return val > 0;
    });
console.log(result2); // Should output: true

// 5. Reduce Function
function reduce(arr, cb) {
    let sum = arr[0];
    for (let i = 1; i < arr.length; i++) {
        sum = cb(sum, arr[i]);
    }
    return sum;
}
let sum = reduce([1, 2, 3],
    function(acc, num) {
        return acc + num;
    });
console.log(sum); //Should output: 6

// 6. Includes Check
function includes(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        if(cb(arr[i])) {
            return true;
        }
    }
    return false;
}

let result3 = includes([1, 2, 3],
    function(val) {
        return val === 2;
    });
console.log(result3); // Should output: true
