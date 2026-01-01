# Chapter1_Challenge_1_3 — The Dungeon Game

### 🧠 Description
This program simulates a simple text-based dungeon adventure game.  
The player enters 5 rooms, each containing a random event: a trap, a healing potion, or a monster.  
The player’s health changes according to their actions and events until they either win or are defeated.

### ⚙️ Program Requirements
- Player starts with 100 health.
- Each of the 5 rooms triggers one of three random events:
  1. Trap → health decreases by 20.
  2. Potion → health increases by 15 (max 100).
  3. Monster → player must guess a number (1–5) using a `do-while` loop.
- The game ends early if the player’s health reaches 0.
- Uses `for`, `switch`, `break`, and `Random` for logic.

### 💻 Example Output
Entering room 1...
You found a healing potion! Health is now: 100
Entering room 2...
A monster appears!
Guess a number (1–5) to defeat it: 3
Wrong! Try again.
Guess a number (1–5) to defeat it: 1
You defeated the monster!
Health is now: 85
You cleared the dungeon! Victorious with 85 health!

### 🧮 Concepts Used
- Loops (`for`, `do-while`)
- Random number generation
- Switch statements
- Conditional logic and break statements
- User input with `Scanner`

### 🧩 Reflection
This challenge combined multiple programming fundamentals: loops, randomization, and condition handling.  
The hardest part was handling user input for the monster guessing game and ensuring health values were capped at 100.  
I also learned how `break` and `continue` affect loop control flow in real use cases.

