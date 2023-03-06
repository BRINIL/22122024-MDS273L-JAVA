Name:J Brinil John
Reg.No:22122024
Email:brinil.john@msds.christuniversity.in
Class:2 MscDs A

LAB-4:QUESTION:

Write a JAVA Menu driven program that does the following:
    You can ONLY have the below variables as global variables
        Account Number
        Account Holder Name
        Account Balance
    You MUST have the below as functions
        To initialize the customer
        To deposit money
        To withdraw money
        To print the transactions
        To print account summary
    Your menu will have the following operations once the customer is created
        To deposit money
        To withdraw money
        To print the transactions
        To print account summary

Discription:

This is a Java program for a basic banking system that allows the user to deposit, withdraw, print transaction history, and print account summary:

1.)The program defines a class lab4 with the following instance variables; AccNo (Account number), AccHolderName (Account Holder name), balance (current balance), and transactionHistory (a list of all the transactions made on this account).

2.)The class has a constructor that initializes the Account number, Account Holder name, and initial balance of the account.

3.)The class also has four methods: deposit, withdraw, printTransactionHistory, and printAccountSummary. These methods allow the user to perform various banking operations on the account.

4.)The deposit method allows the user to deposit money into the account, provided the amount is greater than zero. The method updates the balance and adds the transaction to the transaction history.

5.)The withdraw method allows the user to withdraw money from the account, provided the amount is greater than zero and the account has enough balance. The method updates the balance and adds the transaction to the transaction history.

6.)The printTransactionHistory method prints the transaction history of the account.

7.)The printAccountSummary method prints the account summary, which includes the account number, account holder name, and current balance.

8.)The main method is the entry point of the program. It takes user input to initialize the account and allows the user to perform various banking operations by selecting options from a menu. The menu options are: deposit money, withdraw money, print transaction history, print account summary, and exit. The program uses a switch statement to perform the selected operation and loops until the user chooses to exit the program.


