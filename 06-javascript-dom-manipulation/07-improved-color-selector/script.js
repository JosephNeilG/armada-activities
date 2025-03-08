let body = document.body;

let container = document.querySelector("#container");

let buttons = document.querySelectorAll(".color-box");
let displaySelectedColor = document.querySelector("#displaySelectedColor");

/**
 * DOCU: Changes the background color of the specified element based on the selected button.
 * @param {HTMLElement} element - The element to change the background color (body or container).
 * @param {HTMLElement} button - The color used referenced on button's bg color.
 */
function changeBgColor(element, button) {
    let color = getComputedStyle(button).backgroundColor;
    element.style.backgroundColor = color;
}

/**
 * DOCU: Changes the text color of the body on specified buttons.
 * @param {string} color - The text content of the selected button.
 */
function changeFontColor(color) {
    body.style.color = "black";

    if (["Red", "Blue", "Green", "Purple"].includes(color)) {
        body.style.color = "white";
    }
}

/**
 * DOCU: Highlights the selected button by adding an 'active' class that has black border.
 * @param {HTMLElement} button - The button to highlight.
 */
function buttonSelectedActive(button) {
    buttons.forEach(button => {
        button.classList.remove("active");
    })
    button.classList.add("active");
}

/**
 * DOCU: Updates the displayed text with the selected color.
 * @param {string} colorName - The name of the selected color.
 */
function trackColor(colorName) {
    displaySelectedColor.textContent = `Selected Color: ${colorName}`;
}

/**
 * DOCU: Resets the UI to its default state when container is clicked.
 */
function resetColors() {
    container.style.backgroundColor = "lightgray";
    body.style.backgroundColor = "white";
    body.style.color = "black";
    displaySelectedColor.textContent = "Selected Color: None";
    buttons.forEach(button => button.classList.remove("active"));
}

// Event listener for the container to reset colors when clicked
document.getElementById("container").addEventListener("click", function() {
    alert("You clicked the container! Selected color will reset.");
    resetColors();
    // "this" refers to the element that triggered the event (in this case, #container)
    //this.style.backgroundColor = "lightgray"; 
});

// Event listener for each color button
document.querySelectorAll(".color-box").forEach(button => {
    button.addEventListener("click", function(event) {
        event.stopPropagation();  // Uncomment this to see the difference
        changeBgColor(body, this);
        changeBgColor(container, this);
        changeFontColor(this.textContent);
        buttonSelectedActive(this);
        trackColor(this.textContent);
    });
});