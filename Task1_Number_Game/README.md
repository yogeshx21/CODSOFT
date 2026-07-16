# Number Game (GuessVerse)

# Description
Number Game (GuessVerse) is a Java console-based guessing game developed as part of the CODSOFT Java Programming Internship. The player has to guess a randomly generated number within a limited number of attempts. The game includes three difficulty levels (Easy, Medium, and Hard), a scoring system, hint support, high score saving using file handling, player ranking, and a replay option. This project demonstrates the use of Java fundamentals, conditional statements, loops, random number generation, and file handling in an interactive console application.

# Features
 Random number generation based on selected difficulty level.
 Three difficulty levels (Easy, Medium, Hard).
 Limited number of attempts for each difficulty.
 Feedback after every guess (Too High / Too Low).
 Closeness indicator (Very Close, Getting Closer, Too Far Away).
 Hint system (Even/Odd) before the last attempt.
 Score calculation based on difficulty level.
 Multiple rounds with Play Again option.
 High score saving using file handling.
 Player ranking (Novice, Intermediate, Expert).
 User-friendly console interface.

# Game Rules
 Select a difficulty level (Easy, Medium, or Hard).
 The computer generates a random number within the selected range.
 Guess the correct number within the given attempts.
 After each incorrect guess, the game tells whether your guess is too high or too low.
 A hint (Even/Odd) is available before the final attempt.
 Earn points by guessing the correct number.
 You can play multiple rounds.
 Your highest score is automatically saved.

# Technologies Used
Language: Java
Libraries: java.util.Scanner, java.util.Random, java.io.File, java.io.FileWriter
Tools & Platform: VS Code, JDK, Git, GitHub

# How to Run
1. Install Java JDK 8 or later.
2. Clone or download this repository.
3. Open the project in VS Code or any Java IDE.
4. Compile the program:
   ```bash
   javac GuessVerse.java
   ```
5. Run the program:
   ```bash
   java GuessVerse
   ```
6. Select a difficulty level and start playing.
---

# Sample Output
```text
=============================
      Welcome To GuessVerse
=============================

Highest Score: 90

Select Difficulty:
1. Easy
2. Medium
3. Hard

Enter choice: 2

Number generated between 1 and 100

Attempt 1/5 -> Guess: 60
Too High! (Getting closer)

Attempt 2/5 -> Guess: 45
Too Low! (Very close!!)

Attempt 3/5 -> Guess: 48
Correct Answer! You won.

Play again? (y/n): n

--- GAME OVER ---
Rounds Won: 1
Total Score: 15
Rank: Novice
New High Score saved!
```

# Learning Outcomes
This project helped me practice:

 Java Programming Fundamentals
 Conditional Statements (if-else)
 Loops (while and for)
 Random Number Generation
 User Input using Scanner
 File Handling
 Exception Handling
 Score and Rank Management
 Console-based Game Development
 Problem Solving and Logical Thinking
---

## Author
**Yogesh Mondhe**
Developed as part of the **CODSOFT Java Programming Internship**.
