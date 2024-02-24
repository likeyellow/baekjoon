import java.util.Scanner;

class Main {
    static Egg[] eggs;
    static int n;
    static int answer;
    
    public static void main(String[] args) {
// 1. 가장 왼쪽의 계란을 든다.
// 2. 손에 들고 있는 계란으로 깨지지 않은 다른 계란 중에서 하나를 친다. 
//	  단, 손에 든 계란이 깨졌거나 깨지지 않은 다른 계란이 없으면 치지 않고 넘어간다. 
//	  이후 손에 든 계란을 원래 자리에 내려놓고 3번 과정을 진행한다.
// 3. 가장 최근에 든 계란의 한 칸 오른쪽 계란을 손에 들고 2번 과정을 다시 진행한다. 
//	  단, 가장 최근에 든 계란이 가장 오른쪽에 위치한 계란일 경우 계란을 치는 과정을 종료한다.
// 4. 일렬로 놓인 계란들의 내구도와 무게가 차례대로 주어졌을 때 최대 몇 개의 계란을 깰 수 있는지 알아맞춰보자
//  	첫째 줄에 계란의 수를 나타내는 N(1 ≤ N ≤ 8)가 주어진다. 
//  	그 다음 N개의 줄에는 계란의 내구도와 무게에 대한 정보가 주어진다. 
//  	i+1번째 줄에는 왼쪽에서 i번째에 위치한 계란의 내구도 Si(1 ≤ Si ≤ 300)와 무게 Wi(1 ≤ Wi ≤ 300)가 
//  	한 칸의 빈칸을 사이에 두고 주어진다.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        eggs = new Egg[n];
        for(int i = 0; i < n; i++) 
            eggs[i] = new Egg(sc.nextInt(), sc.nextInt());
        solve(0);
        System.out.println(answer);
    }
    public static void solve(int pick) {
        // base case
        if(pick == n) {
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(eggs[i].durability <= 0) count++;
            }
            answer = Math.max(answer, count);
            return;
        }
        // recursive case
        if(eggs[pick].durability > 0) {
            boolean targetExists = false;
            for(int target = 0; target < n; target++) {
                if(pick == target) continue;
                if(eggs[target].durability > 0) {
                    targetExists = true;
                    eggs[pick].fight(eggs[target]);
                    solve(pick + 1);
                    eggs[pick].restore(eggs[target]);
                }
            }
            if(!targetExists) solve(pick + 1);
        } else {
            solve(pick + 1);
        }
    }
}
class Egg {
    int durability;
    int weight;
    
    public Egg(int d, int w) {
        this.durability = d;
        this.weight = w;
    }
    
    public void fight(Egg other) {
        this.durability -= other.weight;
        other.durability -= this.weight;
    }
    public void restore(Egg other) {
        this.durability += other.weight;
        other.durability += this.weight;
    }
}