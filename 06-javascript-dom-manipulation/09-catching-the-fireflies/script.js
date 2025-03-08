// Select all fireflies
let fireflies = document.querySelectorAll(".firefly");

/**
 * DOCU: Shrinks the firefly by scaling it down.
 * @param {HTMLElement} fireflyElement - The firefly element to shrink.
 */
function shrinkFirefly(fireflyElement) {
    fireflyElement.style.transform = "scale(0)";
    fireflyElement.style.transition = "transform 0.3s ease";
}

/**
 * DOCU: Hides the firefly after a short delay.
 * @param {HTMLElement} fireflyElement - The firefly element to hide.
 */
function hideFirefly(fireflyElement) {
    setTimeout(() => {
        fireflyElement.style.visibility = "hidden";
    }, 300);
}

/**
 * DOCU: Makes the firefly visible again and restores its original size.
 * @param {HTMLElement} fireflyElement - The firefly element to show.
 */
function showFirefly(fireflyElement) {
    setTimeout(() => {
        fireflyElement.style.visibility = "visible";
        fireflyElement.style.transform = "scale(1)";
    }, 1000);
}

// Attach event listener to each firefly
fireflies.forEach(firefly => {
    firefly.addEventListener("click", function() {
        shrinkFirefly(this);
        hideFirefly(this);
        showFirefly(this);
    });
});