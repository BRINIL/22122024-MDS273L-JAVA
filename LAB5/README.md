Name:J Brinil John
Reg.No:22122024
Email:brinil.john@msds.christuniversity.in
Class:2 MscDs A

LAB-5:QUESTION:

Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row
 _______________________________________________________________________________________________________________
|Plain :| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
|_______|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|
|Cypher:| X | Y | Z | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | 
|_______|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|
Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.

Discription:

1.The program begins by importing the Scanner class, which allows the program to read input from the user.

2.The main method of the program creates a new Scanner object and a new Cipher object. It then enters a while loop that repeatedly prompts the user to select one of three options: encrypt a message, decrypt a message, or exit the program.

3.When the user chooses to encrypt a message, the program prompts the user to enter the message to be encrypted. It then passes the message to the encrypt method of the Cipher object, which applies the substitution cipher and returns the resulting ciphertext. The program outputs the ciphertext to the console.

4.When the user chooses to decrypt a message, the program prompts the user to enter the message to be decrypted. It then passes the message to the decrypt method of the Cipher object, which applies the reverse substitution cipher and returns the resulting plaintext. The program outputs the plaintext to the console.

5.If the user chooses to exit the program, the program prints a message indicating that the user has successfully exited, and then calls the System.exit() method to terminate the program.

6.The Cipher class contains two methods, encrypt and decrypt, which take a string input and apply the substitution cipher to it. Both methods first convert the input to uppercase, then iterate over each character in the input string.

7.For each character in the input string, the encrypt method finds the index of the character in the PLAIN string, and then uses that index to retrieve the corresponding character from the CIPHER string. The encrypt method then concatenates the ciphertext character to a string that represents the encrypted message.

8.The decrypt method does the reverse: it finds the index of the character in the CIPHER string, and then uses that index to retrieve the corresponding character from the PLAIN string. The decrypt method then concatenates the plaintext character to a string that represents the decrypted message.

9.Finally, the encrypt and decrypt methods return the ciphertext or plaintext string, respectively, to the calling method in the main program.



