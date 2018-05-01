package com.kodilla;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;


class LetterA{
    private ArrayList<String> odd = new ArrayList<String>();
    private ArrayList<String> even = new ArrayList<String>();

    public void list(ArrayDeque<String> theList){
        while(theList.size() > 0){
            String k = theList.poll();
            if(k.length() % 2 == 0){
                even.add(k + " " + k.length());
            } else {
                odd.add(k + " " + k.length());
            }
        }
    }
    public ArrayList<String> getOdd(){
        return odd;
    }

    public ArrayList<String> getEven(){
        return even;
    }
}

class App {
    public static ArrayDeque<String> generate(){

        ArrayDeque<String> text = new ArrayDeque<String>();
        String s = "";
        Random generator = new Random();
        for(int i=0; i<50; i++){
            int iloscA = generator.nextInt(50)+1;
            for(int j=0; j < iloscA; j++){
                s += "a";
            }
            text.add(s);
            s = "";
        }
        return text;
    }
    public static void main (String[] args)
    {

        ArrayDeque<String> text = generate();

        LetterA full = new LetterA();
        full.list(text);
        System.out.println(full.getOdd());
        System.out.println("Even: " + full.getEven());
    }
}
