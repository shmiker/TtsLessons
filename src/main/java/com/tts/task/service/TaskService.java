package com.tts.task.service;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class TaskService {

    public String removeDuplicates(String s) {
        char[] letters = new char[s.length()];//создаем массив символов и переводим в него строку
        HashSet<Character> words =new HashSet<>();
        //делим строку по букве и записываем ее в массив
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);
        }
        //Переносим все в хешсет
        for (char letter : letters) {
            words.add(letter);
        }
//        String s =
      //TODO


        return "zzz";
    }

}
