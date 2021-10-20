package lab3.task1;

public class Manipulation {
    public static void Sentences(String text){
        String[] words = text.split("[ \n]+");
        int count = 0;
        for(int i = 0; i<words.length-1; i++){
            if(words[i].endsWith(".") || words[i].endsWith("!") || words[i].endsWith("?") || words[i].endsWith(":")){
                count++;
            }
        }
        System.out.println(count+1);
    }

    public static void Words(String text){
        String[] words = text.split("[ \n]+");
        System.out.println(words.length);
    }
}
