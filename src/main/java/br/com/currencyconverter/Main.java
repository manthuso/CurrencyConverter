package br.com.currencyconverter;

import br.com.currencyconverter.service.CurrencyAPI;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String apiKey = "a3dcc310ca6fbc7b63675dd8";
    private static final String apiBaseUrl = "https://v6.exchangerate-api.com/v6/";

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            CurrencyAPI apiService = new CurrencyAPI(apiBaseUrl, apiKey);

            System.out.println(" ---> Money Conversor 3000 Alpha Build <---");

            while (true) {
                showMenu();
                try {
                    int chooser = input.nextInt();
                    input.nextLine();

                    if (chooser == 0) {
                        System.out.println("Closing Operation, bye bye");
                        break;
                    }

                    String originCoin;
                    String finalCoin;

                    switch (chooser) {
                        case 1:
                            originCoin = "USD";
                            finalCoin = "BRL";
                            break;
                        case 2:
                            originCoin = "BRL";
                            finalCoin = "USD";
                            break;
                        case 3:
                            originCoin = "EUR";
                            finalCoin = "JPY";
                            break;
                        case 4:
                            originCoin = "GBP";
                            finalCoin = "BRL";
                            break;
                        default:
                            System.out.println("Error, try number 1 to 4.");
                            continue;
                    }

                    System.out.println(String.format("Use a value in %s to convert: ", originCoin));
                    double normalValue = input.nextDouble();

                    double tax = apiService.getExchangeRate(originCoin, finalCoin);

                    if (normalValue < 0) {
                        System.out.println("Try a positive number");
                        continue;
                    }

                    if (tax != -1.0) {
                        double convertedValue = normalValue * tax;
                        System.out.println(String.format("\n%.2f %s = %.2f %s , tax: %.4f", normalValue, originCoin, convertedValue, finalCoin, tax));
                    } else {
                        System.out.println("Error, coins not found");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error, type a number for option and value");
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("uga uga uga " + e.getMessage());
                }
            }
            input.close();

    }
    private static void showMenu() {
        String menutext = "\n Choose a conversion option: " +
                "\n1. USD to BRL " +
                "\n2. BRL to USD " +
                "\n3. EUR to JPY " +
                "\n4. GBP to BRL " +
                "\n0. Exit" +
                "\n";

        System.out.println(menutext);

    }
}