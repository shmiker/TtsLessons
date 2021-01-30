package com.tts.task.service;

import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

@Component
public class TaskService {

    public String removeDuplicates(String s) {
        char[] letters = new char[s.length()];//создаем массив символов и переводим в него строку
        // char[] letters1 = s.toCharArray(); более короткая реализация записи в букв в массив
        Set<Character> words = new LinkedHashSet<>();
        //делим строку по букве и записываем ее в массив
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }
        //Переносим все в хешсет
        for (char letter : letters) {
            words.add(letter);
        }

        //TODO
//переносим массив в строку
        StringBuilder builder = new StringBuilder();
        for (Character a : words) {
            builder.append(a);
        }

        return builder.toString();
    }

    public String reverseString(String input){
        // перевернуть строку

        char[] array = input.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public boolean containsDuplicate(int[] input){
        // проверить, содержит ли массив дубликаты
        return true;
    }

}
