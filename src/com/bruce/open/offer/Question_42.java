package com.bruce.open.offer;

/**
 * 题目一:输入一个英文句子,翻转句子中单词的顺序,但单词内字符的顺序不变。
 * 为简单起见,标点符号和普通字母一样处理。例如输入字符串“I am a student.”, 则输出“student. a am I”.
 */
public class Question_42 {
    public static void main(String[] args) {
        Question_42 p = new Question_42();
        String string = "I am a student.";
        System.out.println(p.reverseSentence(string));
    }

    public String reverseSentence(String sentence) {
        if (sentence == null)
            return sentence;
        String[] strArr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i--) {
            sb.append(strArr[i]);
            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
