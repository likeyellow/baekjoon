import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[] words = new String[N];
        for(int i = 0; i < N; i++){
            words[i] = sc.next();
        }
        Arrays.sort(words, new Comparator<String>(){
            
            public int compare(String w1, String w2){
                if(w1.length() == w2.length())
                    return w1.compareTo(w2);
                return w1.length() - w2.length();
            } 
        });
        System.out.println(words[0]);
        for(int i = 1; i < N; i++){
            if(!words[i].equals(words[i-1]))
                System.out.println(words[i]);
        }
    }
}