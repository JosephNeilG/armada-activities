// DOCU: Creates a character object with default properties on name and health and random values for class, randomizeHealth, and specialAbility.
let character = {
    name: "Hero",
    health: 100,
    class: getRandomClass(),
    randomizeHealth() {
        this.health = Math.floor(Math.random() * (150 - 50 + 1) + 50);
    },
    specialAbility: getRandomAbility()
}

// Test cases for character object.
character.randomizeHealth(); // Invoke to set set random health value from 50-150.
console.log(character.health); // Should log a random value between 50 and 150.

/**
 * DOCU: Selects a random name from the name list and returns it.
 * @return {string} The randomly selected name from the list.
 */
function getRandomName() {
    let nameArr = [ "Thorin", "Elara", "Zane", "Ivy", "Dante"];
    let randomIndex = Math.floor(Math.random() * nameArr.length);
    let selectedName = nameArr[randomIndex];
    return selectedName;
}

/**
 * DOCU: Selects a random class from the predefined class list and returns it.
 * @return {string} The randomly selected class from the list.
 */
function getRandomClass() {
    let classArr = ["Warrior", "Mage", "Archer", "Healer", "Assassin"];
    let randomIndex = Math.floor(Math.random() * classArr.length);
    let selectedClass = classArr[randomIndex];
    return selectedClass;
}

/**
 * DOCU: Generates a random health value between 50 and 150.
 * @return {number} The randomly generated health value.
 */
function getRandomHealth() {
    return Math.floor(Math.random() * (150 - 50 + 1) + 50);
}

/**
 * DOCU: Selects a random ability from the ability list and returns it.
 * @return {string} The randomly selected ability from the list.
 */
function getRandomAbility() {
    let abilityArr = ["Fireball", "Healing Touch", "Stealth", "Lightning Strike", "Power Slash"];
    let randomIndex = Math.floor(Math.random() * abilityArr.length);
    let selectedAbility = abilityArr[randomIndex];
    return selectedAbility;
}

/**
 * DOCU: Generates a new character object with randomly assigned or specified attributes.
 * @param {string} name Optional parameter for specifying the character's name. If not provided, a random name is assigned.
 * @return {Object} - A character object containing randomized properties.
 */
function generateCharacter(name) {
    let newCharacter = {
        name: name || getRandomName(), // Assigns the provided name if it's truthy; otherwise, generates a random name.
        class: getRandomClass(),
        health: getRandomHealth(),
        specialAbility: getRandomAbility(),

        /**
         * DOCU: Simulates a battle action where the character attacks another character, reducing their health.
         * @param {Object} otherCharacter The target character object to be attacked.
         */
        battle(otherCharacter) {
            let damage = Math.floor(Math.random() * (20 - 5 + 1) + 5);
            let initialHealth = otherCharacter.health;
            
            otherCharacter.health -= damage;

            if (otherCharacter.health < 0) {
                otherCharacter.health = 0;
            }

            console.log(`Character ${this.name} attacked Character ${otherCharacter.name} with ${this.specialAbility}. ${otherCharacter.name}'s health dropped from ${initialHealth} to ${otherCharacter.health}.`);
        }
    }
    return newCharacter;
}

/**
 * DOCU: Generates an array of multiple character objects.
 * @param {number} x The number of characters to generate.
 * @return {Array} An array of generated character objects.
 */
function generateMultipleCharacters(x) {
    let multipleCharactersArr = [];
    for (let i = 0; i < x; i++) {
        multipleCharactersArr.push(generateCharacter());
    }
    return multipleCharactersArr;
}

// Test Cases

// DOCU: Generates a character with random attributes.
const randomCharacter = generateCharacter();
console.dir(randomCharacter); // Logs a character with random attributes

// DOCU: Generates a character with a specified name.
const namedCharacter = generateCharacter("Drake");
console.dir(namedCharacter); // Logs a character named "Drake"

// DOCU: Creates two characters and initiates a battle between them.
const character1 = generateCharacter("Zane");
const character2 = generateCharacter("Elara");

// Battle initialization
character1.battle(character2); // Logs: "Character Zane attacked Character Elara with Power Slash. Elara's health dropped from 120 to 102."

// DOCU: Generates a group of 5 random characters.
const party = generateMultipleCharacters(5);
console.dir(party); // Logs an array of 5 different characters