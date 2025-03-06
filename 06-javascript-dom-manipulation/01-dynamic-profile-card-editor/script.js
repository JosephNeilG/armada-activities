/**
 * Last Updated: 2025-03-06
 * Author: Joseph Neil Gapuz
 */

/* ======= Profile Elements ======= */
const profileName = document.querySelector("#profileName");
const nameInput = document.querySelector("#nameInput");

const profileBio = document.querySelector("#profileBio");
const bioInput = document.querySelector("#bioInput");

const profileImg = document.querySelector("#profileImg");
const imgInput = document.querySelector("#imgInput");

const profileCard = document.querySelector("#profileCard");
const bgColorInput = document.querySelector("#bgColorInput");

/* ======= Alert Elements ======= */
const alertContainer = document.querySelector("#alertContainer");
const alertText = document.querySelector("#alertText");

/* =======Validation Elements ======= */
const nameValidation = document.querySelector("#nameValidation");
const bioValidation = document.querySelector("#bioValidation");
const imgValidation = document.querySelector("#imgValidation");

/**
 * DOCU: Updates the profile name with the user-provided input.
 *       Shows a success message or validation error.
 */
function updateName() {
    const newName = nameInput.value.trim();

    if (newName) {
        profileName.textContent = newName;
        clearInput(nameInput);

        showSuccessMessage("Name updated successfully!");
        hideValidation(nameValidation);
    } else {
        showValidation(nameValidation, "Name cannot be empty.");
    }
}

/**
 * DOCU: Updates the profile bio with the user-provided input.
 *       Shows a success message or validation error.
 */
function updateBio() {
    const newBio = bioInput.value.trim();
    if (newBio) {
        profileBio.textContent = newBio;
        clearInput(bioInput);

        showSuccessMessage("Bio updated successfully!");
        hideValidation(bioValidation);
    } else {
        showValidation(bioValidation, "Bio cannot be empty.");
    }
}

/**
 * DOCU: Updates the profile picture with the user-provided image URL.
 *       Shows a success message or validation error.
 */
function updateImg() {
    const newImg = imgInput.value.trim();
    if (newImg) {
        profileImg.setAttribute("src", newImg);
        clearInput(imgInput);

        showSuccessMessage("Profile picture updated successfully!");
        hideValidation(imgValidation);
    } else {
        showValidation(imgValidation, "Profile picture cannot be empty.");
    }
}

/**
 * DOCU: Updates the profile card's background color.
 *       Displays a success message.
 */
function updateBgColor() {
    const newColor = bgColorInput.value;
    if (newColor) {
        profileCard.style.backgroundColor = newColor;

        showSuccessMessage("Background color updated successfully!");
    }
}

/**
 * DOCU: Clears the value of an input field.
 * @param {HTMLElement} element The input field to clear.
 */
function clearInput(element) {
    element.value = "";
}

/**
 * DOCU: Displays a success message in an alert container.
 *       Hides it after 3 seconds.
 * @param {string} message - The success message to display.
 */
function showSuccessMessage(message) {
    alertContainer.style.display = "block";
    alertText.textContent = message;

    setTimeout(() => {
        alertContainer.style.display = "none";
    }, 3000);
}

/**
 * DOCU: Displays a validation error message for a specific input field.
 * @param {HTMLElement} element - The validation message container.
 * @param {string} message - The validation message to display.
 */
function showValidation(element, message) {
    element.textContent = message;
}

/**
 * DOCU: Hides the validation error message for a specific input field.
 * @param {HTMLElement} element - The validation message container.
 */
function hideValidation(element) {
    element.textContent = "";
}