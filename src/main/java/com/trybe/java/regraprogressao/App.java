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
    Grade[] examsList = new Grade[examsNumber];

    if (examsNumber == 0) {
      System.out.println("Digite pelo menos uma atividade");
    } else {
      for (int index = 1; index <= examsNumber; index += 1) {
        System.out.println("Digite o nome da atividade " + index + ":");
        String examName = scanner.nextLine();
        System.out.println("Digite o peso da atividade " + index + ":");
        int examWeight = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a nota obtida para " + examName + ":");
        int examGrade = Integer.parseInt(scanner.nextLine());
        examsList[index - 1] = new Grade(examName, examWeight, examGrade);
      }
    }

    verifyExamsGrade(examsList);


    scanner.close();
  }

  /**
   * VerifyExamsGrade. Metodo que verifica se os pesos das atividades é igual a 100.
   *
   * @param gradeList Lista das atividades com seus nomes, pesos e notas.
   *
   */
  public static void verifyExamsGrade(Grade[] gradeList) {
    int weigthSums = 0;

    for (Grade grade : gradeList) {
      weigthSums += grade.getWeight();
    }

    if (weigthSums != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}