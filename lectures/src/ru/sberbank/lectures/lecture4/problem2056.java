package ru.sberbank.lectures.lecture4;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class problem2056 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> wordCountMap = new TreeMap<String, Integer>();

        File Inputfile = new File("input.txt");

        Scanner scanner = new Scanner(Inputfile);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.toLowerCase().split(" ");
            for (String word : words) {
                if (word.length() > 0){
                    if (wordCountMap.containsKey(word))
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    else
                        wordCountMap.put(word, 1);
                }
            }
        }
        scanner.close();
        System.out.println(Collections.singletonList(wordCountMap));

        int maxValueinHashMap = (Collections.max(wordCountMap.values()));
        FileWriter outputFile = new FileWriter("output.txt");
        for (Map.Entry<String, Integer> entry: wordCountMap.entrySet()){
            if (entry.getValue() == maxValueinHashMap) {
                outputFile.write(entry.getKey());
                outputFile.write("\n");
            }
        }
        outputFile.close();
    }
}