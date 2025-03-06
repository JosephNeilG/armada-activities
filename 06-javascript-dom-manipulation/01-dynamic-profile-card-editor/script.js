const profileName = document.querySelector("#profileName");
const nameInput = document.querySelector("#nameInput");

const profileBio = document.querySelector("#profileBio");
const bioInput = document.querySelector("#bioInput");

const profileImg = document.querySelector("#profileImg");
const imgInput = document.querySelector("#imgInput");

function updateName() {
    const newName = nameInput.value.trim();
    if (newName) {
        profileName.textContent = newName;
        nameInput.value = "";
    }
}

function updateBio() {
    const newBio = bioInput.value.trim();
    if (newBio) {
        profileBio.textContent = newBio;
        bioInput.value = "";
    }
}

function updateImg() {
    const newImg = imgInput.value.trim();
    if (newImg) {
        profileImg.setAttribute("src", newImg);
    }
}