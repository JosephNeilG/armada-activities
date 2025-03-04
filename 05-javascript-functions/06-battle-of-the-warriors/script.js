// object 1
let warrior1 = {
    name: "Thor",
    hp: 100,
    strength: 15,
    attack: function() {
        return Math.floor(Math.random() * (this.strength + 1));
    }
}

// object 2
let warrior2 = {
    name: "Zeus",
    hp: 100,
    strength: 12,
    attack: function() {
        return Math.floor(Math.random() * (this.strength + 1));
    }
}

// displays round number header
function displayRound(round) {
    console.log(`=== Round ${round} ===`);
}

// displays who attacked who and damage thrown value
function trackDamage(attacker, defender) {
    let damageThrown = attacker.attack();
    console.log(`${attacker.name} attacks ${defender.name} and does ${damageThrown} damage!`);

    defender.hp -= damageThrown;
}

// displays each warrior's remaining hp.
function displayHp(warrior1, warrior2) {
    // prevents negative hp
    if (warrior1.hp < 0) warrior1.hp = 0;
    if (warrior2.hp < 0) warrior2.hp = 0;

    console.log(`${warrior1.name} HP: ${warrior1.hp} | ${warrior2.name} HP: ${warrior2.hp}`)
}

// displays winner or draw
function checkWinner(warrior1, warrior2) {
    if (warrior1.hp > warrior2.hp) {
        console.log(`${warrior1.name} WINS the battle!`);
    } else if (warrior2.hp > warrior1.hp) {
        console.log(`${warrior2.name} WINS the battle!`);
    } else {
        console.log("The battle ends in a DRAW!")
    }
}

// simulates 10 rounds of battle
for (let i = 1; i <=10; i++) {
    displayRound(i);

    trackDamage(warrior1, warrior2);
    displayHp(warrior1, warrior2);

    trackDamage(warrior2, warrior1);
    displayHp(warrior1, warrior2);
}

// checks winner after 10th round
checkWinner(warrior1, warrior2);