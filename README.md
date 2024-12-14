# **ContiCorrenti - Java Application**

## **Overview**
The *ContiCorrenti* application is a Java program developed for managing **bank accounts** with features such as opening accounts, performing deposits and withdrawals, checking balances, and closing accounts. The application leverages a structured OOP (Object-Oriented Programming) approach and includes relationships between classes to maintain account data efficiently.

This project was developed as part of an **exam** and uses the `UniBSFpLib` library to handle auxiliary functionality like file management or utilities.

---

## **Features**
- **Account Management**: Open new bank accounts and assign them unique identifiers.
- **Deposits and Withdrawals**: Support for deposits (`versamenti`) and withdrawals (`prelievi`) from accounts.
- **Account State**: Manage account balances and check account status (open/closed).
- **Data Retrieval**: Retrieve details like total balance and account information.
- **Closure of Accounts**: Securely close bank accounts after verifying their state.
- **Interactive Console**: Users interact with the system using prompts and system messages.

---

## **Class Diagram**

![Class Diagram](Conti_Correnti.png)

### **Class Relationships**
1. **ContoCorrente**  
   Represents individual bank accounts, encapsulating key properties like account balance (`saldo`), account holder name (`intestatario`), and account ID.

2. **ElencoConti**  
   Manages a collection of accounts (`ContoCorrente`). Supports operations such as adding new accounts, deleting accounts, searching, and printing account details.

3. **ContiCorrentiMain**  
   The main entry point of the program. It initializes the system, manages user interaction, and coordinates functionality.

4. **Utility**  
   A helper class containing constants and utility methods for system messages, prompts, and string handling.

---

## **Folder Structure**

The project folder is organized as follows:

```
\---Java_Exam_2018
    |   README.md                                               # This README file
    |   
    +---Conti_Correnti
    |   |   .classpath
    |   |   .project
    |   |   Conti_Correnti.png
    |   |   Conti_Correnti.ucls
    |   |   
    |   +---bin                                                 # Binary data  
    |   +---doc                                                 # Documentation for the classes
    |   |   +---it
    |   |   |   \---unibs
    |   |   |       \---fp
    |   |   |           +---ContiCorrenti
    |   |   |           |   |   ContiCorrentiMain.html
    |   |   |           |   |   ContoCorrente.html
    |   |   |           |   |   ElencoConti.html
    |   |   |           |   |   package-frame.html
    |   |   |           |   |   package-summary.html
    |   |   |           |   |   package-tree.html
    |   |   |           |   |   package-use.html
    |   |   |           |   |   Utility.html
    |   |   |           |   |   
    |   |   |           |   \---class-use
    |   |   |           |           ContiCorrentiMain.html
    |   |   |           |           ContoCorrente.html
    |   |   |           |           ElencoConti.html
    |   |   |           |           Utility.html
    |   |   |           |           
    |   |   |           \---mylib
    |   |   |               |   BelleStringhe.html
    |   |   |               |   EstrazioniCasuali.html
    |   |   |               |   InputDati.html
    |   |   |               |   MyMenu.html
    |   |   |               |   NumeriCasuali.html
    |   |   |               |   package-frame.html
    |   |   |               |   package-summary.html
    |   |   |               |   package-tree.html
    |   |   |               |   package-use.html
    |   |   |               |   ServizioFile.html
    |   |   |               |   
    |   |   |               \---class-use
    |   |   |                       BelleStringhe.html
    |   |   |                       EstrazioniCasuali.html
    |   |   |                       InputDati.html
    |   |   |                       MyMenu.html
    |   |   |                       NumeriCasuali.html
    |   |   |                       ServizioFile.html
    |   |           
    |   \---src                                                 # Code
    |       \---it
    |           \---unibs
    |               \---fp
    |                   \---ContiCorrenti
    |                           ContiCorrentiMain.java          # Main class (application entry point)
    |                           ContoCorrente.java              # Represents individual bank accounts
    |                           ContoCorrenteTest.java          # Test class
    |                           ElencoConti.java                # Manages the collection of accounts
    |                           Utility.java                    # Utility class for constants and messages
    |                           
    \---UniBSFpLib
        |   .classpath
        |   .project
        |   
        +---bin
        |                       
        \---src
            \---it
                \---unibs
                    \---fp
                        \---mylib
                                BelleStringhe.java
                                EstrazioniCasuali.java
                                InputDati.java
                                MyMenu.java
                                NumeriCasuali.java
                                ServizioFile.java
                                

```

---

## **Requirements**
To run this application, ensure you have the following:
- **Java Development Kit (JDK)** 8 or later.
- **UniBSFpLib** library: Place the `UniBSFpLib.jar` file in the `lib/` folder.
- **Development Environment**: IntelliJ IDEA, Eclipse, or other preferred IDEs.

---

## **How to Run**

1. **Clone the Project**  
   Clone the project repository to your local machine:
   ```bash
   git clone <repository-url>
   cd ContiCorrenti
   ```

2. **Set Up the Project**
    - Import the project into your preferred IDE.
    - Add `UniBSFpLib.jar` as an external library to the project build path.

3. **Run the Application**  
   Execute the `ContiCorrentiMain` class as the entry point:
   ```bash
   javac ContiCorrentiMain.java
   java ContiCorrentiMain
   ```

4. **Interacting with the Program**  
   Follow the console prompts to manage accounts, perform operations, and view system outputs.

---

## **Usage**
When running the application, you will be prompted with options to:
- **Open a New Account**
- **Deposit or Withdraw Funds**
- **View Account Balance**
- **Close an Account**

---

## **Libraries Used**
- **UniBSFpLib**: Used for auxiliary operations (e.g., file I/O, string utilities).

---
## **Future Improvements**
- Implement **persistence** to save account states in a file or database.
- Enhance the **user interface** by integrating a GUI.
- Add **exception handling** for invalid inputs.