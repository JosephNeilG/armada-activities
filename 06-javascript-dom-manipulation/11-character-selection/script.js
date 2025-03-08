const operatorCards = document.querySelectorAll(".operator-card");

const detailsContainer = document.querySelector("#operatorDetailsContainer");
const opName = document.querySelector("#opName");
const opDescription = document.querySelector("#opDescription");
const opIcon = document.querySelector("#opIcon");
const opInfoPic = document.querySelector("#opInfoPic");

/**
 * DOCU: Updates the operator details section with the selected operator's information.
 * @param {string} name The name of the selected operator.
 * @param {string} description The description of the selected operator.
 * @param {string} icon The URL of the operator's icon image.
 * @param {string} image The URL of the operator's main image.
 */
function updateOperatorDetails(name, description, icon, image) {
    opName.textContent = name;
    opDescription.textContent = description;
    opIcon.src = icon;
    opIcon.alt = `${name} Icon`;
    opInfoPic.src = image;
    opInfoPic.alt = `${name}`;
}

/**
 * DOCU: Toggles the "selected" class to highlight the active operator card.
 *       Removes the "selected" class from the previously selected card 
 *       and adds it to the clicked card for isActive-like styling.
 * @param {HTMLElement} cardElement The operator card element that was clicked.
 */
function toggleActiveCard(cardElement) {
    operatorCards.forEach(op => op.classList.remove("selected"));
    cardElement.classList.add("selected");
}

// Loops and add click event listener for each card.
operatorCards.forEach(card => {
    card.addEventListener("click", function () {
        // Get data attributes from the clicked card.
        const name = this.getAttribute("data-name");
        const description = this.getAttribute("data-description");
        const icon = this.getAttribute("data-icon");
        const image = this.getAttribute("data-image");

        // Toggle active card.
        toggleActiveCard(this);

        // Update the details section.
        updateOperatorDetails(name, description, icon, image);

        // Make the details container visible.
        detailsContainer.classList.remove("d-none");
    });
});