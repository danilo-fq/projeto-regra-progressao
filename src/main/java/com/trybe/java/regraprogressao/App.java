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

    int totalWeight = totalExamsWeight(examsList);

    if (totalWeight == 100) {
      verifyStudentStatus(examsList);
    }


    scanner.close();
  }

  /**
   * VerifyExamsGrade. Metodo que verifica se os pesos das atividades é igual a 100.
   *
   * @param gradeList Lista das atividades com seus nomes, pesos e notas.
   *
   */
  public static int totalExamsWeight(Grade[] gradeList) {
    int weigthSums = 0;

    for (Grade grade : gradeList) {
      weigthSums += grade.getWeight();
    }

    if (weigthSums != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    return weigthSums;
  }

  /**
   * VerifyStudentStatus. Método que avalia a nota final no período do estudante
   * @param gradeList Lista das notas que o estudante obteve para cada projeto.
   */
  public static void verifyStudentStatus(Grade[] gradeList) {
    double result = 0;
    for (Grade grade : gradeList) {
      result += grade.getWeight() * grade.getGrade() / 100.00;
    }

    if (result >= 85) {
      System.out.println("Parabéns! Você alcançou " + result + "%! "
          + "E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação"
          + " alcançada neste período, " + result + "%, "
          + "você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}