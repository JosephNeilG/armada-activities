/**
 * Last Updated: 2025-03-08
 * Author: Joseph Neil Gapuz
 */

// Current balance.
let balance = 1000;

// Variables to track daily withdrawal limit.
let dailyWithdrawn = 0;
const dailyLimit = 500;

const currentBal = document.querySelector("#currentBal");
const amountInput = document.querySelector("#amountInput");

const depositBtn = document.querySelector("#depositBtn");
const withdrawBtn = document.querySelector("#withdrawBtn");

const transacFeedback = document.querySelector("#transacFeedback");

const container = document.querySelector("#transacHistoryContainer");

/**
 * DOCU: Adds a new transaction record to the transaction history list dynamically.
 * @param {string} type Type of transaction (Deposit or Withdraw).
 * @param {number} amount The transaction amount.
 */
function addTransactionHistory(type, amount) {
    // Create list item.
    const listItem = document.createElement("li");
    listItem.classList.add("list-group-item");

    // Create heading element transaction type.
    const heading = document.createElement("h6");
    heading.classList.add("mb-2", type === "Deposit" ? "text-success" : "text-danger");
    heading.textContent = type;

    // Create container for label and amount.
    const details = document.createElement("div");
    details.classList.add("d-flex", "w-100", "justify-content-between");

    // Create amount label.
    const label = document.createElement("small");
    label.classList.add("text-secondary");
    label.textContent = "Amount";

    // Create transaction amount with + or - sign.
    const amountText = document.createElement("small");
    amountText.classList.add("text-secondary-emphasis");
    amountText.textContent = `${type === "Deposit" ? "+" : "-"} $${amount.toFixed(2)}`;

    // Append elements to list item.
    details.appendChild(label);
    details.appendChild(amountText);
    listItem.appendChild(heading);
    listItem.appendChild(details);

    // Insert new transaction item on top of list.
    if (container.firstChild) {
        container.insertBefore(listItem, container.firstChild);
    } else {
        container.appendChild(listItem);
    }
}

/** DOCU: Updates and displays balance. */
function updateBal() {
    currentBal.textContent = `$${balance.toFixed(2)}`;
}

/** DOCU: Displays daily withdrawal limit note. */
function showDailyLimit() {
    transacFeedback.textContent = `Note: Your daily withdrawal limit is $${dailyLimit}.`;
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

/** DOCU: Clears the transaction feedback after 8 seconds and resets to daily withdrawal note. */
function clearFeedback() {
    setTimeout(() => {
        transacFeedback.textContent = "Note: Daily withdrawal limit is $500.";
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
        addTransactionHistory("Deposit", amount);
        displayFeedback(`Successfully deposited $${amount.toFixed(2)}.`, true);
    } else {
        displayFeedback(`Invalid deposit amount. Please try again.`, false);
    }
}

/**
 * DOCU: Handles withdrawal transactions.
 *       Validates the input, checks balance, updates balance, and provides feedback.
 *       Simulate daily withdrawal limit exceeded.
 */
function withdrawAmount() {
    const amount = parseFloat(amountInput.value);
    if (isNaN(amount) || amount <= 0) {
        displayFeedback(`Invalid withdrawal amount. Please try again.`, false);
        return;
    }

    if (balance < amount) {
        displayFeedback(`Insufficient balance.`, false);
        return;
    }

    if (dailyWithdrawn + amount > dailyLimit) {
        displayFeedback(`Daily withdrawal limit reached!`, false);
        return;
    }

    balance -= amount;
    dailyWithdrawn += amount;

    updateBal();
    addTransactionHistory("Withdraw", amount);
    displayFeedback(`Successfully withdrew $${amount.toFixed(2)}.`, true);
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

// Initialize the displayed balance and daily limit on page load.
updateBal();
showDailyLimit();