/**
 * Last Updated: 2025-03-07
 * Author: Joseph Neil Gapuz
 */

/* ======= Task Container Element ======= */
const taskListContainer = document.querySelector("#taskListContainer");

/* ======= Form Input Element ======= */
const taskInput = document.querySelector("#taskInput");

/* =======Validation Element======= */
const taskValidation = document.querySelector("#taskValidation");

/* ======= Alert Elements ======= */
const alertContainer = document.querySelector("#alertContainer");
const alertText = document.querySelector("#alertText");


/**
 * DOCU: Creates a new task list item with a remove button, adds it to the list, 
 *       and shows a success alert. If input is empty, it shows a validation message.
 */
function addTask() {
    // Create list and remove button elements.
    const taskListItem = document.createElement("li");
    const removeTaskBtn = document.createElement("button");

    // Set id and add bootstrap classes for task list.
    taskListItem.setAttribute("id", "taskListItem");
    taskListItem.classList.add("list-group-item", "list-group-item-action", "rounded", "border", "d-flex", "justify-content-between", "align-items-center");

    // Set type, add bootstrap classes, and label for remove button.
    removeTaskBtn.setAttribute("type", "button");
    removeTaskBtn.classList.add("btn", "btn-danger", "btn-sm");
    removeTaskBtn.textContent = "Remove";
       
    // Append task and remove button. Show notification for task added. Else, show validation for blank.
    const newTask = taskInput.value.trim();
    if (newTask) {
        taskListItem.textContent = newTask;
        clearInput(taskInput);

        taskListContainer.appendChild(taskListItem);
        taskListItem.appendChild(removeTaskBtn);

        showAlert(`Task added: ${newTask}`, "success")
        hideValidation(taskValidation);
    } else {
        showValidation(taskValidation, "Task cannot be empty.");
    }

    // Removes deleted task. Show notification for task removed.
    removeTaskBtn.addEventListener("click", () => {
        taskListContainer.removeChild(taskListItem);

        showAlert(`Task removed: ${newTask}`, "danger")
    });
}

/**
 * DOCU: Clears the value of an input field.
 * @param {HTMLElement} element The input field to clear.
 */
function clearInput(element) {
    element.value = "";
}

/**
 * DOCU: Displays an alert message when task is added or removed.
 * @param {string} message The message to display.
 * @param {string} type The type of alert, "success" or "danger" for bootstrap styling.
 */
function showAlert(message, type) {
    alertContainer.classList.remove("alert-success", "alert-danger");
    alertContainer.classList.add(`alert-${type}`);

    alertContainer.style.display = "block";
    alertText.textContent = message;

    // Hide alert after 3 seconds.
    setTimeout(() => {
        alertContainer.style.display = "none";
    }, 3000);
}

/**
 * DOCU: Displays a validation error message.
 * @param {HTMLElement} element The validation message container.
 * @param {string} message The validation message to display.
 */
function showValidation(element, message) {
    element.textContent = message;
}

/**
 * DOCU: Hides the validation error message.
 * @param {HTMLElement} element The validation message container.
 */
function hideValidation(element) {
    element.textContent = "";
}