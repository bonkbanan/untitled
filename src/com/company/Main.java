package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String string = "THE BOY WHO LIVED \n" +
                "\n" +
                "Mr. and Mrs. Dursley, of number four, Privet Drive, \n" +
                "were proud to say that they were perfectly normal, \n" +
                "thank you very much. They were the last people you’d \n" +
                "expect to be involved in anything strange or \n" +
                "mysterious, because they just didn’t hold with such \n" +
                "nonsense. \n" +
                "\n" +
                "Mr. Dursley was the director of a firm called \n" +
                "Grunnings, which made drills. He was a big, beefy \n" +
                "man with hardly any neck, although he did have a \n" +
                "very large mustache. Mrs. Dursley was thin and \n" +
                "blonde and had nearly twice the usual amount of \n" +
                "neck, which came in very useful as she spent so \n" +
                "much of her time craning over garden fences, spying \n" +
                "on the neighbors. The Dursley s had a small son \n" +
                "called Dudley and in their opinion there was no finer \n" +
                "boy anywhere. \n" +
                "\n" +
                "The Dursleys had everything they wanted, but they \n" +
                "also had a secret, and their greatest fear was that \n" +
                "somebody would discover it. They didn’t think they \n" +
                "could bear it if anyone found out about the Potters. \n" +
                "Mrs. Potter was Mrs. Dursley’s sister, but they hadn’t \n" +
                "\n" +
                "Page | 2 Harry Potter and the Philosophers Stone - J.K. Rowling \n" +
                "\n" +
                "\n" +
                "\n" +
                "met for several years; in fact, Mrs. Dursley pretended \n" +
                "she didn’t have a sister, because her sister and her \n" +
                "good-for-nothing husband were as unDursleyish as it \n" +
                "was possible to be. The Dursleys shuddered to think \n" +
                "what the neighbors would say if the Potters arrived in \n" +
                "the street. The Dursleys knew that the Potters had a \n" +
                "small son, too, but they had never even seen him. \n" +
                "\n" +
                "This boy was another good reason for keeping the \n" +
                "Potters away; they didn’t want Dudley mixing with a \n" +
                "child like that. \n" +
                "\n" +
                "When Mr. and Mrs. Dursley woke up on the dull, gray \n" +
                "Tuesday our story starts, there was nothing about the \n" +
                "cloudy sky outside to suggest that strange and \n" +
                "mysterious things would soon be happening all over \n" +
                "the country. Mr. Dursley hummed as he picked out \n" +
                "his most boring tie for work, and Mrs. Dursley \n" +
                "gossiped away happily as she wrestled a screaming \n" +
                "Dudley into his high chair.";
        //string= string.toLowerCase();
        string= string.toUpperCase();
        string = string.replaceAll("\\.","");
        string = string.replaceAll("\\,","");
        string = string.replaceAll("\\n","");
        String[] words = string.split(" +");
        System.out.println(words.length);
        System.out.println(words[10]);
        int counter=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==4){
                System.out.print(words[i] + " ");
                counter++;
            }
            if(counter==5){
                System.out.println();
                counter=0;
            }
        }
        System.out.println();
        for (int j = 0; j < words.length; j++) {
            if(words[j].charAt(0) == 'a' && words[j].length() == 3){
                System.out.print(words[j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("the")){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 10; i < 21; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
