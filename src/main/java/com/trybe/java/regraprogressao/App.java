package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int examsNumber = Integer.parseInt(scanner.nextLine());

    for (int index = 1; index <= examsNumber; index += 1) {
      System.out.println("Digite o nome da atividade " + index + ":");
      String examName = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + index + ":");
      Integer examWeight = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();
  }
}