/*
By Raghu#7084 and AL#6562
 */


import java.util.*;
public class Main{

    public static void main(String[] args) {
        //create scanner for user input
        Scanner scanner = new Scanner(System.in);
        //create map to store data
        Map<Character,String> h = new HashMap<>();

        String[] codes = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliett","Kilo",
                "Lima","Mike","November","Oscar","Papa","Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor",
                "Whiskey","X-ray", "Yankee", "Zulu"};

        for (String string:codes) {

            h.put('A',"Alpha ");
            h.put('B',"Bravo ");
            h.put('C',"Charlie ");
            h.put('D',"Delta ");
            h.put('E',"Echo ");
            h.put('F',"Foxtrot ");
            h.put('G',"Golf ");
            h.put('H',"Hotel ");
            h.put('I',"India ");
            h.put('J',"Juliet ");
            h.put('K',"Kilo ");
            h.put('L',"Lima ");
            h.put('M',"Mike ");
            h.put('N',"November ");
            h.put('O',"Oscar ");
            h.put('P',"Papa ");
            h.put('Q',"Quebec ");
            h.put('R',"Romeo ");
            h.put('S',"Sierra ");
            h.put('T',"Tango ");
            h.put('U',"Uniform ");
            h.put('V',"Victor ");
            h.put('W',"Whiskey ");
            h.put('X',"Xray ");
            h.put('Z',"Zulu ");
            h.put(string.charAt(0),string);

        }

        System.out.println("ENTER A WORD TO ENCODE IT TO MILITARY CODES : ");
        String input = scanner.nextLine().toUpperCase();

        char[] characters = input.toCharArray();

        for(Character character:characters){
            String code = h.get(character);
            System.out.print(code + " ");
        }

    }

}