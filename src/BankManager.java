// Classe principale qui contient la méthode main
public class BankManager {

    public static void main(String[] args) {

        System.out.println("--- Initialisation des comptes bancaires ---\n");

        // 1. Création d'une instance de CheckingAccount (Compte Courant)
        CheckingAccount checking = new CheckingAccount();
        checking.account = "CI034-COURANT-12345";
        checking.balance = 500000;   // Solde en FCFA
        checking.limit = 150000;     // Limite en FCFA

        // 2. Création d'une instance de SavingsAccount (Compte d'Épargne)
        SavingsAccount savings = new SavingsAccount();
        savings.account = "CI034-EPARGNE-67890";
        savings.balance = 2500000;   // Solde en FCFA
        savings.interestRate = 3.5;  // Taux d'intérêt en %

        // 3. Création d'une instance de COD (Certificat de Dépôt)
        COD codAccount = new COD();
        codAccount.account = "CI034-COD-11223";
        codAccount.balance = 5000000; // Solde en FCFA
        codAccount.maturityMonths = 12; // Durée en mois


        // --- Vérification : Lecture des attributs parent et enfants ---

        // Affichage du Compte Courant
        System.out.println("[Checking Account]");
        System.out.println("Numéro de compte : " + checking.account);
        System.out.println("Solde actuel     : " + checking.balance + " FCFA");
        System.out.println("Limite d'autorisation : " + checking.limit + " FCFA\n");

        // Affichage du Compte d'Épargne
        System.out.println("[Savings Account]");
        System.out.println("Numéro de compte : " + savings.account);
        System.out.println("Solde actuel     : " + savings.balance + " FCFA");
        System.out.println("Taux d'intérêt   : " + savings.interestRate + " %\n");

        // Affichage du Certificat de Dépôt
        System.out.println("[COD]");
        System.out.println("Numéro de compte : " + codAccount.account);
        System.out.println("Solde actuel     : " + codAccount.balance + " FCFA");
        System.out.println("Durée du dépôt   : " + codAccount.maturityMonths + " mois\n");

        System.out.println("--------------------------------------------");
    }
}

// =================================================================
// Étape 1 : Création de la classe parente BankAccount
// =================================================================
class BankAccount {
    String account;
    double balance;
}

// =================================================================
// Étape 2 : Création de la classe enfant CheckingAccount
// =================================================================
class CheckingAccount extends BankAccount {
    double limit;
}

// =================================================================
// Étape 3 : Répéter l'opération pour SavingsAccount et COD
// =================================================================
class SavingsAccount extends BankAccount {
    double interestRate;
}

class COD extends BankAccount {
    int maturityMonths;
}