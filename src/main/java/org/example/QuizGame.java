package org.example;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Check the database connection
        DatabaseConnection.checkDatabaseConnection();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        String tablename="user";
        String age="23";
        String address="dhaka";
        //DatabaseConnection.insert(tablename,username, age,address);
       // DatabaseConnection.delete(tablename,username);
       // DatabaseConnection.update(tablename,username,"345");

    }

}
