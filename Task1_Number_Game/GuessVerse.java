import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class GuessVerse {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rd = new Random();

System.out.println("Welcome To GuessVerse");
System.out.println("=====================");
            
int hi = 0;    
File f = new File("HighScores.txt");    
          
if (f.exists()) {    
try {    
Scanner fs = new Scanner(f);    
if (fs.hasNextInt()) {    
hi = fs.nextInt();    
System.out.println("Highest Score: " + hi);    
}    
fs.close();    
} catch (Exception e) {    
System.out.println("Error reading file"); 
}    
}    

int score = 0;    
int rounds = 0;    

while (true) {    
int max = 0;
int chances = 0;
int pts = 0; 

int valid = 0;
while (valid == 0) {
System.out.println("\nSelect Difficulty:\n1. Easy\n2. Medium\n3. Hard");
System.out.print("Enter choice: ");
int ch = sc.nextInt();
                
if (ch == 1) {    
max = 50; 
chances = 7; 
pts = 10;    
valid = 1;
} else if (ch == 2) {    
max = 100; 
chances = 5; 
pts = 15;    
valid = 1;
} else if (ch == 3) {    
max = 500; 
chances = 4; 
pts = 30;    
valid = 1;
} else {
System.out.println("Wrong choice! Try again.");
}
}

int n = rd.nextInt(max) + 1;    
System.out.println("Number generated between 1 and " + max);    

int hnt = 0;
int g = 0;

for (int i = 1; i <= chances; i++) {    
System.out.print("Attempt " + i + "/" + chances + " -> Guess: ");    
g = sc.nextInt();    

if (g == n) {    
System.out.println("Correct Answer! You won.");    
if (i == 1) {    
System.out.println("Wow! First try luck!");    
}    
// Ekdum simple score calculation jo bache likhte hain
score = score + pts;    
rounds = rounds + 1;    
break;    
}     
                
if (g > n) {    
System.out.print("Too High! ");    
} else {    
System.out.print("Too Low! ");    
}    

// Math.abs hatakar manual human check lagaya
int d = 0;
if (n > g) {
    d = n - g;
} else {
    d = g - n;
}

if (d <= 3) {
System.out.println("(Very close!!)");    
} else if (d <= 12) {
System.out.println("(Getting closer)");    
} else {
System.out.println("(Too far away)");    
}    

if (hnt == 0 && i == (chances - 1)) {    
System.out.print("Want a hint? (y/n): ");    
String ask = sc.next();    
if (ask.equals("y") || ask.equals("Y") || ask.equals("yes")) {    
if (n % 2 == 0) {    
System.out.println("Hint: Even number");    
} else {    
System.out.println("Hint: Odd number");    
}    
hnt = 1;    
}    
}    
}    

if (g != n) {    
System.out.println("\nGame Over! Correct number was: " + n);    
}    

System.out.print("\nPlay again? (y/n): ");    
String ans = sc.next();    
if(ans.equals("n") || ans.equals("N") || ans.equals("no")) {    
break;    
}    
}    

System.out.println("\n--- GAME OVER ---");    
System.out.println("Rounds Won: " + rounds);    
System.out.println("Total Score: " + score);    

if (score >= 120) {    
System.out.println("Rank: Expert");    
} else if (score >= 60) {    
System.out.println("Rank: Intermediate");    
} else {    
System.out.println("Rank: Novice");    
}    

if (score > hi) {    
try {    
FileWriter fw = new FileWriter(f);    
fw.write("" + score); 
fw.close();    
System.out.println("New High Score saved!");    
} catch (Exception e) {    
System.out.println("Error saving score");
}    
}    
sc.close();
}
}