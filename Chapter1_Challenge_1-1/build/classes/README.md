# Chapter1_Challenge_1_1 — The Cryptic Message Decoder

### 🧠 Description
In this challenge, we simulate a secret agent decoding a hidden integer message.  
Given a positive integer, the program extracts specific digits using **only variables and arithmetic operators** — no loops or conditionals — to reveal the real code.

### ⚙️ Program Requirements
- Input: A single positive integer (e.g., 13579)
- Process:
  - Extract the first and last digits.
  - Multiply them together.
  - Add the second and second-last digits.
  - Concatenate the product and the sum to form the final code.
- Output: The decrypted code.

### 💻 Example Input/Output
**Input:**
13579

**Output:**
The decrypted code is: 910

### 🧮 Concepts Used
- Variables and arithmetic operators  
- Division `/` and modulus `%`  
- Math functions (`Math.log10`, `Math.pow`)  
- Type casting and concatenation

### 🧩 Reflection
This challenge helped me understand how to manipulate numbers mathematically without loops or conditional statements.  
The main challenge was correctly extracting digits using division and modulus operations. Once I visualized the place values, the logic became much clearer.

