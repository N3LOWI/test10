class Player {
    constructor(name, score) {
        this.name = name;
        this.score = score;
    }

    toString() {
        return `{${this.name} - ${this.score}}`;
    }
}

function generateArrayOfPlayers() {
    const players = [];
    const names = new Set(); // To ensure unique names

    for (let i = 0; i < 10; i++) {
        let name;
        do {
            name = "Player" + Math.floor(Math.random() * (9999 - 1000 + 1) + 1000); // Generate unique names
        } while (names.has(name));

        names.add(name);
        const score = Math.floor(Math.random() * (999 - 100 + 1) + 100); // Generate scores between 100 and 999
        players.push(new Player(name, score));
    }
    return players;
}

// Generate and display 5 arrays of players
for (let i = 0; i < 5; i++) {
    const players = generateArrayOfPlayers();
    console.log(`Array ${i + 1}:`, players.map(player => player.toString()));
}
