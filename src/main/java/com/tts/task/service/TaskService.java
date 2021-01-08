package com.tts.task.service;

import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

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
        String str = builder.toString();

        return str;
    }

    public String reverseString(String input){
        // перевернуть строку

        return "zzz";
    }

}
