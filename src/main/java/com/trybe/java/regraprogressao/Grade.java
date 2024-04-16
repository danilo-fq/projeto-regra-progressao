package com.trybe.java.regraprogressao;

public class Grade {

  private final String name;

  private final int weight;

  private final int grade;
  public Grade(String name, int weight, int grade) {
    this.name = name;
    this.weight = weight;
    this.grade = grade;
  }

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
