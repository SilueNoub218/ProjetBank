Le projet BankManager est une application console développée en Java qui simule un système de gestion de comptes bancaires. 
Son objectif principal est de mettre en œuvre le concept d'héritage en Programmation Orientée Objet (POO).

À partir d'une classe parente générique (BankAccount) qui regroupe les informations communes à tous les comptes (le numéro de compte et le solde en FCFA), 
le projet structure trois types de comptes spécifiques (comptes enfants) :

CheckingAccount (Compte courant) : intègre une limite d'autorisation de découvert.

SavingsAccount (Compte d'épargne) : intègre un taux d'intérêt.

COD (Certificat de dépôt) : intègre une durée de blocage des fonds.

Le programme se finalise dans une classe principale qui instancie ces différents comptes, applique des valeurs financières réalistes en FCFA, 
puis simule l'accès en lecture et en écriture à leurs données pour valider le bon fonctionnement de l'architecture.
