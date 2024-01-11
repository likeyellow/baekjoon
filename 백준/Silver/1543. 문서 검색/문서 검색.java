import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String doc = sc.nextLine();
        String word = sc.nextLine();
        
        int count = 0;
        int startIndex = 0;
        while(true) {
            int findIndex = doc.indexOf(word, startIndex);
            if(findIndex < 0)
                break;
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}