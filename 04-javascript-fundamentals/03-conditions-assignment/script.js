// Task 1: Grading System
let score = 78;

if (score >= 90 && score <= 100) {
    console.log("Grade A");
} else if (score >= 80 && score <= 89) {
    console.log("Grade B");
} else if (score >= 70 && score <= 79) {
    console.log("Grade C");
} else if (score >= 60 && score <= 69) {
    console.log("Grade D");
} else {
    console.log("Grade F");
}

// Task 2: Weather Advisor
let temperature = 41;

if (temperature > 30) {
    console.log("It's hot outside. Stay hydrated!");
} else if (temperature >= 16 && temperature <= 30) {
    console.log("The weather is nice. Enjoy your day!");
} else if (temperature >= 0 && temperature <= 15) {
    console.log("It's cold outside. Wear a jacket.");
} else {
    console.log("It's freezing outside! Bundle up!");
}

// Task 3: Eligibility Checker
let age = 18;

if (age >= 18) {
    console.log("You are eligible for this activity.");
} else if (age >= 13 && age <= 17) {
    console.log("You need parental permission.");
} else {
    console.log("You are too young for this activity.");
}

// Task 4: Ticket Price Calculator
let age2 = 12;
let isMember = true;

if (age2 < 12) {
    console.log("Ticket is free.");
} else if (isMember) {
    console.log("$10");
} else {
    console.log("$15");
}

// Task 5: Challenge Task (Optional): Leap Year Checker
function isLeapYear(year) {
    if (year % 4 === 0 && year % 100 !== 0 || year % 400 === 0 ) {
        return true;
    } else {
        return false;
    }
}

console.log(isLeapYear(2020));
console.log(isLeapYear(2021));