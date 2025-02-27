// 1. Multiplication Table Generator
let number = 5;

for (let i = 1; i <= 10; i++) {
    let product = number * i;
    console.log(`${number} x ${i} = ${product}`);
}

// 2. Sum of First N Natural Numbers
let n = 5;
let sum = 0;

for (let i = 1; i <= n; i++) {
    sum = sum + i;
}

console.log(`The sum of the first ${n} numbers is: ${sum}`);

// 3. Array Elements Printer
let arr = [2, 4, 6, 8, 10];

for (let i = 0; i < arr.length; i++) {
    console.log(`Array Element: ${arr[i]}`);
}

// 4. Pattern Printer
let pattern = "";
for (let row = 1; row <= 5; row++) {
    for (let col = 1; col <= row; col++) {
        pattern = pattern + "*";
    }
    pattern = pattern + "\n";
}

console.log(pattern);

// 5. Reverse Array Elements
let array = [1, 3, 5, 7, 9];

for (let i = array.length - 1; i >= 0; i--) {
    console.log(`Reversed Element: ${array[i]}`);
}