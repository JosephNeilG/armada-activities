/**
 * Last Updated: 2025-03-07
 * Author: Joseph Neil Gapuz
 */

// Current balance.
let balance = 1000;

// Balance and input elements.
const currentBal = document.querySelector("#currentBal");
const amountInput = document.querySelector("#amountInput");

// Deposit and withdraw button elements.
const depositBtn = document.querySelector("#depositBtn");
const withdrawBtn = document.querySelector("#withdrawBtn");

// Transaction feedback element.
const transacFeedback = document.querySelector("#transacFeedback");

/** DOCU: Updates and displays balance. */
function updateBal() {
    currentBal.textContent = `$${balance.toFixed(2)}`;
}

/**
 * DOCU: Displays feedback messages for transactions.
 * @param {string} feedback The transaction message to be displayed.
 * @param {boolean} isSuccess If true, applies success styling; if false, applies error styling.
 */
function displayFeedback(feedback, isSuccess) {
    transacFeedback.textContent = feedback;
    transacFeedback.classList.toggle("text-success", isSuccess);
    transacFeedback.classList.toggle("text-danger", !isSuccess);
}

/** DOCU: Clears the transaction feedback after 8 seconds. */
function clearFeedback() {
    setTimeout(() => {
        transacFeedback.textContent = "";
        transacFeedback.classList.remove("text-success", "text-danger");
    }, 8000);
}

/** DOCU: Clears the amount input field. */
function clearInput() {
    amountInput.value = "";
}

/**
 * DOCU: Handles deposit transactions.
 *       Validates the input, updates the balance, and provides feedback.
 */
function depositAmount() {
    const amount = parseFloat(amountInput.value);
    if (!isNaN(amount) && amount > 0) {
        balance += amount;
        updateBal();
        displayFeedback(`Successfully deposited $${amount.toFixed(2)}.`, true);
    } else {
        displayFeedback(`Invalid deposit amount. Please try again.`, false);
    }
}

/**
 * DOCU: Handles withdrawal transactions.
 *       Validates the input, checks balance, updates balance, and provides feedback.
 */
function withdrawAmount() {
    const amount = parseFloat(amountInput.value);
    if (isNaN(amount) || amount <= 0) {
        displayFeedback(`Invalid withdrawal amount. Please try again.`, false);
        return;
    }

    if (balance >= amount) {
        balance -= amount;
        updateBal();
        displayFeedback(`Successfully withdrew $${amount.toFixed(2)}.`, true);
    } else {
        displayFeedback(`Insufficient balance.`, false);
    }
}

// Event listeners for deposit and withdrawal buttons.
depositBtn.addEventListener("click", () => {
    depositAmount();
    clearInput();
    clearFeedback();
});

withdrawBtn.addEventListener("click", () => {
    withdrawAmount();
    clearInput();
    clearFeedback();
});

// Initialize the displayed balance on page load.
updateBal();