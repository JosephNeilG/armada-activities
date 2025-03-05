// DOCU: Creates a warrior1 object with properties: name, hp, strength and attack function property.
let warrior1 = {
    name: "Thor",
    hp: 100,
    strength: 15,
    // DOCU: Calculates and returns a random attack value based on the character's strength.  
    attack() {
        return Math.floor(Math.random() * (this.strength + 1));
    }
}

// DOCU: Creates a warrior2 object with properties: name, hp, strength and attack function property.
let warrior2 = {
    name: "Zeus",
    hp: 100,
    strength: 12,
    attack() {
        return Math.floor(Math.random() * (this.strength + 1));
    }
}

/**
 * DOCU: Displays the current round number.
 * @param {number} round The round number to be displayed.
 */
function displayRound(round) {
    console.log(`=== Round ${round} ===`);
}

/**
 * DOCU: Simulates an attack from one character to another and updates the defender's HP.
 * @param {object} attacker The character initiating the attack. Must have an `attack` method and a `name` property.
 * @param {object} defender The character receiving the attack. Must have an `hp` property and a `name` property.
 */
function attackOpponent(attacker, defender) {
    let damageThrown = attacker.attack();
    console.log(`${attacker.name} attacks ${defender.name} and does ${damageThrown} damage!`);

    defender.hp -= damageThrown;
}

/**
 * DOCU: Displays the current HP of both warriors, ensuring HP does not go below 0.
 * @param {object} warrior1 The first warrior, must have `name` and `hp` properties.
 * @param {object} warrior2 The second warrior, must have `name` and `hp` properties.
 */
function displayHp(warrior1, warrior2) {
    // DOCU: Prevents negative hp.
    if (warrior1.hp < 0) warrior1.hp = 0;
    if (warrior2.hp < 0) warrior2.hp = 0;

    console.log(`${warrior1.name} HP: ${warrior1.hp} | ${warrior2.name} HP: ${warrior2.hp}`);
}

/**
 * DOCU: Determines and announces the winner of the battle based on remaining HP.
 * @param {object} warrior1 The first warrior, must have `name` and `hp` properties.
 * @param {object} warrior2 The second warrior, must have `name` and `hp` properties.
 */
function checkWinner(warrior1, warrior2) {
    if (warrior1.hp > warrior2.hp) {
        console.log(`🏆 ${warrior1.name} WINS the battle! 🏆`);
    } else if (warrior2.hp > warrior1.hp) {
        console.log(`🏆 ${warrior2.name} WINS the battle! 🏆`);
    } else {
        console.log("The battle ends in a DRAW!")
    }
}

/**
 * DOCU: Simulates 10 rounds of battle between two warriors.
 *       Displays current round.
 *       Each warrior takes turns attacking the other, and their HP is updated accordingly.
 *       The battle results are displayed after each attack.
 *       Checks if the defender's health is 0 every attack, it ends the battle.
 */
for (let i = 1; i <=10; i++) {
    displayRound(i);

    attackOpponent(warrior1, warrior2);
    displayHp(warrior1, warrior2);

    if (warrior2.hp === 0) {
        break;
    }

    attackOpponent(warrior2, warrior1);
    displayHp(warrior1, warrior2);

    if (warrior1.hp === 0) {
        break;
    }
    
}

// DOCU: Determines and announces the winner of the battle after 10 rounds based on remaining hp.
checkWinner(warrior1, warrior2);