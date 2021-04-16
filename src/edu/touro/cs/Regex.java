package edu.touro.cs;

// https://docs.oracle.com/javase/tutorial/essential/regex/
// https://regex101.com/
// https://www.jrebel.com/system/files/regular-expressions-cheat-sheet.pdf
import javax.swing.*;
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

    public static void main(String[] args){
        while (true) {

            String regex = JOptionPane.showInputDialog("Enter your regex: ");
            Pattern pattern = Pattern.compile(regex);

            String s = JOptionPane.showInputDialog("Enter input string to search: ");
            Matcher matcher = pattern.matcher(s);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(regex);
                System.out.println(s);

                System.out.printf("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;

                for (int group = 1; group <= matcher.groupCount(); group++)
                {
                    System.out.printf("\tGroup %d: %s%n", group, matcher.group(group));
                }
            }
            if(!found){
                System.out.println("No match found.%n");
            }
        }
    }
}