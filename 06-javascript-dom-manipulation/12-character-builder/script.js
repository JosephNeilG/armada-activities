// Select all armor item choices.
const armorItems = document.querySelectorAll(".armor-item");

// * DOCU: Loops through each armor item and attaches a click event listener.
armorItems.forEach((armorItem) => {
    armorItem.addEventListener("click", function () {
        updateCharacterPreview(this);
        toggleSelectedItem(this);
    });
});

/**
 * DOCU: Updates the character preview image with the selected armor item.  
 * @param {HTMLElement} armorItem The clicked armor item element.  
 */
function updateCharacterPreview(armorItem) {
    const itemType = armorItem.getAttribute("data-part");
    const itemImg = armorItem.getAttribute("src");

    const itemPreviewSlot = document.getElementById(`${itemType}-slot`);
    itemPreviewSlot.src = itemImg;
}

/**
 * DOCU: Highlights the currently selected armor piece by adding an active background.
 *       Removes the "active" class from the previously selected item and adds it to the newly selected one of the same type.
 * @param {HTMLElement} armorItem The clicked armor item element.
 */
function toggleSelectedItem(armorItem) {
    const itemType = armorItem.getAttribute("data-part");

    // Select all items of the same type and remove the "active" class
    const armorItemsSameType = document.querySelectorAll(`.armor-item[data-part="${itemType}"]`);
    armorItemsSameType.forEach((item) => {
        item.classList.remove("active")
    });

    armorItem.classList.add("active");
}