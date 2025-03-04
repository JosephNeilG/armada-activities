// Task 1: Custom Array Filter
function customFilter(arr, callback) {
    let filteredArr = [];
    for (let i = 0; i < arr.length; i++) {
        if(callback(arr[i])) {
            filteredArr.push(arr[i]);
        }
    }
    return filteredArr;
}

function isEven(num) {
    return num % 2 === 0;
}

var numbers = [1, 2, 3, 4, 5, 6];
var evenNumbers = customFilter(numbers, isEven);
console.log(evenNumbers);

// Task 2: Countdown Timer
function countdown(start, callback) {
    for (let i = start; i >= 0; i--) {
        setTimeout(function() {
            callback(i);
        }, (start - i) * 1000);
    }
}

function displayNumber(num) {
    console.log(num);
}

countdown(5, displayNumber);

// Task 3: Simple Event Listener
function createButton(buttonText, callback) {
    let btn = document.createElement("button");
    btn.innerHTML = buttonText;
    btn.addEventListener("click", callback);

    let bodyContainer = document.body;
    bodyContainer.appendChild(btn);

}

function buttonClicked() {
    console.log("Button clicked");
}

createButton("Click Me", buttonClicked);

// Task 4: Task Runner
function runTasks(tasks) {
    for (let i = 0; i < tasks.length; i++) {
        setTimeout(function () {
            tasks[i]();
        }, (i + 1) * 1000);
    }
}

function task1() {
    console.log("Task 1 is completed");
}

function task2() {
    console.log("Task 2 is completed");
}

function task3() {
    console.log("Task 3 is completed");
}

runTasks([task1, task2, task3]);

// Task 5: Interactive Quiz Game (Extra Miles)
function askQuestion(question, choices, correctAnswer, callback) {
    let answer = prompt(question + "\nChoices are: " + choices);
    if (answer.trim() === correctAnswer) {
        callback(true);
    } else {
        callback(false);
    }
}

function checkAnswer(isCorrect) {
    if (isCorrect) {
        console.log("Correct!");
    } else {
        console.log("Wrong!");
    }
}

askQuestion("What is 2 + 2?", ["1", "2", "3", "4"], "4", checkAnswer);

