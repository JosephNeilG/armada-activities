const box = document.querySelector("#box");
const label = document.querySelector(".label");
const showHideBtn = document.querySelector(".nes-btn");

const openingSfx = new Audio("assets/opening-sfx.wav");
const closingSfx = new Audio("assets/closing-sfx.wav");

/** DOCU: Displays an explosion effect and plays the opening sound. */
function showOpeningFx() {
    box.src = "assets/explosion.gif";
    openingSfx.play();
}

/** DOCU: Changes the box image to its open state after a delay. */
function openBox() {
    setTimeout(() => {
        box.src = box.getAttribute("data-open");
    }, 850);
}

/**
 * DOCU: Updates the label and button text content.
 * @param {string} labelText The text to display as the label.
 * @param {string} btnText The text to display on the button.
 */
function updateLabelAndBtnText(labelText, btnText) {
    label.textContent = labelText;
    showHideBtn.textContent = btnText;
}

/** DOCU: Toggles between the closed and open states of the box. */
function toggleBox() {
    if (box.src.includes(box.getAttribute("data-closed"))) {
        showOpeningFx();
        openBox();
        updateLabelAndBtnText("Surprise!", "Close")
    } else {
        closingSfx.play();
        box.src = box.getAttribute("data-closed");
        updateLabelAndBtnText("Click for a surprise!", "Open");
    }
}

// Event listener to handle box toggle.
showHideBtn.addEventListener("click", toggleBox);