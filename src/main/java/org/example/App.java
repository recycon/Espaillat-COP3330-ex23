package org.example;

import java.util.Scanner;

/**
 * Is the car silent when you turn the key? y
 * Are the battery terminals corroded? n
 * Replace cables and try again.
 *
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        System.out.println("y for yes\n" +
                "n for no");
        System.out.print("Is the car silent when you turn the key? ");
        answer = in.next();
        if (answer.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            answer = in.next();
            if (answer.equals("y")) {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            } else if (answer.equals("n")) {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }

        }else if (answer.equals("n")) {
                System.out.print("Does the car make a slicking noise? ");
                answer = in.next();
                if (answer.equals("y")) {
                    System.out.print("Replace the battery.");
                    System.exit(0);
                } else if (answer.equals("n")) {
                    System.out.print("Does the car crank up but fail to start? ");
                    answer = in.next();
                    if (answer.equals("y")) {
                        System.out.print("Check spark plug connections.");
                        System.exit(0);
                    } else if (answer.equals("n")) {
                        System.out.print("Does the engine start and then die? ");
                        answer = in.next();
                        if (answer.equals("y")) {
                            System.out.print("Does you car have fuel injection? ");
                            answer = in.next();
                            if (answer.equals("y")) {
                                System.out.print("Get it in for service.");
                                System.exit(0);
                            } else if (answer.equals("n")) {
                                System.out.print("Check to ensure the choke is opening and closing.");
                                System.exit(0);
                            }
                        } else if (answer.equals("n")) {
                            System.out.print("This should not be possible.");
                        }
                    }
                }

            }
        }
    }

