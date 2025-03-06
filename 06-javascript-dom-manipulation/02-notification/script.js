/**
 * Last Updated: 2025-03-07
 * Author: Joseph Neil Gapuz
 */

/* ======= Notification Container Element ======= */
const notifContainer = document.querySelector("#notifContainer");

/**
 * DOCU: Creates and displays a notification at the top of the notification container. Each notification has a close button and disappears automatically after 5 seconds.
 */
function showNotif() {
    // Create notification elements
    const notifItem = document.createElement("div"); // container
    const notifDescription = document.createElement("p"); // message
    const closeNotifBtn = document.createElement("button"); // close button


    // DOCU: Apply Bootstrap alert styling and flexbox properties for proper alignment.
    notifItem.classList.add("alert", "alert-primary", "d-flex", "justify-content-between", "align-items-center");

    // DOCU: Insert the new notification at the top of the container if there are existing notifications. Else, append it as the first notification.

    if (notifContainer.firstChild) {
        notifContainer.insertBefore(notifItem, notifContainer.firstChild);
    } else {
        notifContainer.appendChild(notifItem);
    }    

    // DOCU: Add the message text inside notification item container.
    notifDescription.classList.add("mb-0");
    notifDescription.textContent = "You have a new message!";
    notifItem.appendChild(notifDescription);

    // DOCU: Create a close button for users to manually close the notification.
    closeNotifBtn.classList.add("btn-close");
    closeNotifBtn.setAttribute("type", "button");
    notifItem.appendChild(closeNotifBtn);

    // DOCU: Automatically remove the notification after 5 seconds if it's still in the container.
    setTimeout(() => {
        if(notifContainer.contains(notifItem)) {
            notifContainer.removeChild(notifItem);
        }
    }, 5000);

    // DOCU: Allow users to manually remove the notification by clicking the close button.
    closeNotifBtn.addEventListener("click", () => {
        notifContainer.removeChild(notifItem);

    });
}