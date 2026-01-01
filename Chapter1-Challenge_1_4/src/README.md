# Chapter1_Challenge_1_4 — The Robust File Config Reader

### 🧠 Description
This program reads a configuration file named `config.txt` that contains two lines:
1. A numeric configuration version.
2. A file path.

It validates both lines and handles every possible error gracefully using **multiple catch blocks** and a **custom exception**.

### ⚙️ Program Requirements
- Read the file `config.txt`.
- Line 1: Must be a number (version). If less than 2 → throw `InvalidConfigVersionException`.
- Line 2: Must be a valid existing file path. If not → throw `IOException`.
- Always execute a `finally` block printing `"Config read attempt finished."`
- Never crash, even on invalid input.

### 🧾 Example `config.txt`
1
C:\nonexistent_folder\nonexistent_file.txt

### 💻 Example Output

Error: Config version too old!
Config read attempt finished.

### 🧮 Concepts Used
- Exception handling (`try-catch-finally`)
- Multiple specific catch blocks
- Custom exception class
- File I/O with `BufferedReader`
- Manual exception throwing (`throw new Exception()`)

### 🧩 Reflection
This challenge improved my understanding of Java’s exception hierarchy and how to make programs more fault-tolerant.  
I learned that handling specific exceptions provides clearer debugging and user feedback.  
Implementing a custom exception also made me appreciate how professional software enforces validation rules.
