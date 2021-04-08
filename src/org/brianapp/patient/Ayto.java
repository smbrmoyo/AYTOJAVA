package org.brianapp.patient;

import java.util.Scanner;

public class Ayto {

    private String name, gender, skinColor, idealSkinColor;
    private int height, weight, idealHeight, idealWeight, prefOne, prefTwo, note;
    Scanner scanner = new Scanner(System.in);

    public Ayto() {
        System.out.println("Hello, what is your name?");
        this.name = scanner.nextLine();
        System.out.println("Are you a male or a female?");
        this.gender = scanner.nextLine();
        System.out.println("What is your height? (cM)");
        this.height = scanner.nextInt();
        System.out.println("What is your weight? (kG)");
        this.weight = scanner.nextInt();
        System.out.println("What is your skin color? \nDark\nLight\nWhite\nYellow");
        this.skinColor = scanner.next();
        System.out.println("Describe your soulmate. What would the ideal height be? (cM)");
        this.idealHeight = scanner.nextInt();
        System.out.println("What would the ideal weight be? (kG)\n");
        this.idealWeight = scanner.nextInt();
        System.out.println("What would the ideal skin color be?\nDark \nLight\nWhite\nYellow");
        this.idealSkinColor = scanner.next();
        System.out.println("Choose first pref:\n1 for Height\n2 for Weight\n3 for Skin color");
        this.prefOne = scanner.nextInt();
        System.out.println("Choose second pref:\n1 for Height\n2 for Weight\n3 for Skin color");
        this.prefTwo = scanner.nextInt();
        this.note = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getIdealSkinColor() {
        return idealSkinColor;
    }

    public void setIdealSkinColor(String idealSkinColor) {
        this.idealSkinColor = idealSkinColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIdealHeight() {
        return idealHeight;
    }

    public void setIdealHeight(int idealHeight) {
        this.idealHeight = idealHeight;
    }

    public int getIdealWeight() {
        return idealWeight;
    }

    public void setIdealWeight(int idealWeight) {
        this.idealWeight = idealWeight;
    }

    public int getPrefOne() {
        return prefOne;
    }

    public void setPrefOne(int prefOne) {
        this.prefOne = prefOne;
    }

    public int getPrefTwo() {
        return prefTwo;
    }

    public void setPrefTwo(int prefTwo) {
        this.prefTwo = prefTwo;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
