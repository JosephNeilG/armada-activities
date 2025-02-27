// Task 1: Calculate the Total Cost of Items
let item1 = 5;
let item2 = 10;
let item3 = 30;

let totalCost = item1 + item2 + item3;

console.log(`The total cost of the items is: $${totalCost}`);

// Task 2: Calculate the Average of Three Numbers
let num1 = 2;
let num2 = 16;
let num3 = 24;

let average = (num1 + num2 + num3) / 3;

console.log(`The average is: ${average}`);

// Task 3: Odd or Even Checker
let num = 15;

if (num % 2 === 0) {
    console.log(`${num} is an even number.`);
} else {
    console.log(`${num} is an odd number.`);
}

// Task 4: Calculate Discounts
let origPrice = 100;
let discPct = 20;

let discAmt = (origPrice * discPct) / 100;
let discountedPrice = origPrice - discAmt;

console.log(`The discounted price is: $${discountedPrice}.`);

// Bonus Task (Optional): Reverse Percentage Calculation
let discountedPrice2 = 80;
let discPct2 = 20;

let origPrice2 = discountedPrice2 / (1 - discPct2 / 100);

console.log(`The original price before the discount was: $${origPrice2}.`);