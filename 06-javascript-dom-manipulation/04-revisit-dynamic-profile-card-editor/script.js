/**
 * Last Updated: 2025-03-07
 * Author: Joseph Neil Gapuz
 */

/* Profile Elements */
const profileName = document.querySelector("#profileName");
const nameInput = document.querySelector("#nameInput");

const profileBio = document.querySelector("#profileBio");
const bioInput = document.querySelector("#bioInput");

const profileImg = document.querySelector("#profileImg");
const imgInput = document.querySelector("#imgInput");

const profileCard = document.querySelector("#profileCard");
const bgColorInput = document.querySelector("#bgColorInput");

/* Alert Elements */
const alertContainer = document.querySelector("#alertContainer");
const alertText = document.querySelector("#alertText");

/* Validation Elements */
const nameValidation = document.querySelector("#nameValidation");
const bioValidation = document.querySelector("#bioValidation");
const imgValidation = document.querySelector("#imgValidation");

/* Update Profile Button */
const updateProfileBtn = document.querySelector("#updateProfileBtn");

/** DOCU: Updates the profile name. */
function updateName() {
    const newName = nameInput.value.trim();
    profileName.textContent = newName;
}

/** DOCU: Updates the profile bio. */
function updateBio() {
    const newBio = bioInput.value.trim();
    profileBio.textContent = newBio;
}

/** DOCU: Updates the profile picture with image URL. */
function updateImg() {
    const newImg = imgInput.value.trim();
    profileImg.setAttribute("src", newImg);
}

/** DOCU: Updates the profile card's background color. */
function updateBgColor() {
    const newColor = bgColorInput.value;
    profileCard.style.backgroundColor = newColor;
}

/** DOCU: Clears all input fields. */
function clearAllInputs() {
    nameInput.value = "";
    bioInput.value = "";
    imgInput.value = "";
}

/** DOCU: Displays a success message in an alert container. Hides it after 3 seconds. */
function showSuccessMessage() {
    alertContainer.style.display = "block";
    alertText.textContent = "Profile Card updated successfully!";

    setTimeout(() => {
        alertContainer.style.display = "none";
    }, 3000);
}

/** 
 * DOCU: Displays a validation error message for a specific input field.
 * @param {HTMLElement} element The validation message container.
 * @param {string} message The validation message to display.
 */
function showValidation(element, message) {
    element.textContent = message;
}

/** 
 * DOCU: Hides the validation error message for a specific input field.
 * @param {HTMLElement} element The validation message container.
 */
function hideValidation(element) {
    element.textContent = "";
}

/** DOCU: Calls functions to update profile details. Also, clears input fields and shows a success message. */
function updateProfile() {
    updateName();
    updateBio();
    updateImg();
    updateBgColor();
    clearAllInputs();
    showSuccessMessage();
}

/** DOCU: Event listener for update profile button that validates inputs and updates the profile if all fields are filled. */
updateProfileBtn.addEventListener("click", () => {
    let isValid = true;

    if (!nameInput.value.trim()) {
        showValidation(nameValidation, "Name cannot be empty.");
        isValid = false;
    } else {
        hideValidation(nameValidation);
    }

    if (!bioInput.value.trim()) {
        showValidation(bioValidation, "Bio cannot be empty.");
        isValid = false;
    } else {
        hideValidation(bioValidation);
    }

    if (!imgInput.value.trim()) {
        showValidation(imgValidation, "Profile picture cannot be empty.");
        isValid = false;
    } else {
        hideValidation(imgValidation);
    }

    // If all inputs are valid, update profile.
    if (isValid) {
        updateProfile();
    }
});