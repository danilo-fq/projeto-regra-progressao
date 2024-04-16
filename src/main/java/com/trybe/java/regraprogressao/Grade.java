package com.trybe.java.regraprogressao;

public class Grade {

  private final String name;

  private final int weight;

  private final int grade;

  /**
   * Grade. Método construtor
   * @param name Nome da atividade
   * @param weight Peso da atividade
   * @param grade Nota da atividade
   */
  public Grade(String name, int weight, int grade) {
    this.name = name;
    this.weight = weight;
    this.grade = grade;
  }

  /**
   * FinalProgressiveGrade. Calcula a nota progressiva de cada atividade.
   * @param weight Peso da atividade
   * @param grade Nota que o aluno tirou na atividade
   * @return Retorna a nota final que o aluno teve em uma determinada atividade
   */
  public int finalProgressiveGrade(int weight, int grade) {
    return weight * grade;
  }

  public int getGrade() {
    return this.grade;
  }

  public int getWeight() {
    return this.weight;
  }
}
