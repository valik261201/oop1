package lab3.task3;

public class Manipulation {
    public static void longestWord(String text){
        String[] words = text.split("[. ?!:,<>/;{}\n]+");
        int max = 0;
        String longest = "";
        for(String word: words){
            int len = word.length();
            if(len>max){
                max = len;
                longest = word;
            }
        }
        System.out.println(longest);
    }

    public static void topFive(String text){
        String[] words = text.split("[. ?!:,<>/;{}\n]+");
        int[] count = {0,0,0,0,0};
        String[] five = {"", "", "", "", ""};
        int o = 1;

        first: for(int k = 0; k < words.length; k++){
            for(int i = 0; i < 5; i++){
                if(five[i].equals(words[k]))
                    continue first;
            }
            for(int i = k+1; i< words.length; i++){
                if(words[k].equals(words[i])){
                    o++;
                }
            }

            for(int i = 0; i<5; i++){
                if(o>count[4-i]){
                    for(int j = 0; j<4-i; j++){
                        count[j] = count[j+1];
                        five[j] = five[j+1];
                    }
                    count[4-i] = o;
                    five[4-i] = words[k];
                    break;
                }
            }
            o = 1;
        }

        for(int i=4; i>=0; i--){
            System.out.print(five[i]+" ");
        }
    }
}
