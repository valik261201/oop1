package lab3.task2;

public class Manipulation {
    public static void Letters(String text){
        int count = 0;
        for(int i=0; i<text.length(); i++){
            if(Character.isLetter(text.charAt(i)))
                count++;
        }
        System.out.println(count);
    }

    public static void Vowels(String text){
        int count = 0;
        for(int i=0; i<text.length(); i++){
            char letter = Character.toLowerCase(text.charAt(i));
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                count++;
        }
        System.out.println(count);
    }

    public static void Consonants(String text){
        int count = 0;
        for(int i=0; i<text.length(); i++){
            char letter = Character.toLowerCase(text.charAt(i));
            if(Character.isLetter(letter) && (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u'))
                count++;
        }
        System.out.println(count);
    }
}
