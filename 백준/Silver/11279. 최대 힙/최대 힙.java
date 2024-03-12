import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxPriorityQueue pq = new MaxPriorityQueue();
		int n = sc.nextInt();
		StringBuilder ans = new StringBuilder(); // 정답을 담을 변수
		while(n-- > 0) {
			int x = sc.nextInt();
			if(x == 0) 
				ans.append(pq.pop()).append('\n');
			else
				pq.push(x);			
		}
		System.out.println(ans);
	}
}

// 배열로 구현
class MaxPriorityQueue {
	int[] heap;
	int size;
	public MaxPriorityQueue() {
		heap = new int[100001];
		size = 0;
	}
	
	void swap(int a, int b) {
		int tmp = heap[a];
		heap[a] = heap[b];
		heap[b] = tmp;
	}
	
	public void push(int x) {
		heap[++size] = x;
		int current = size;  // 현재 위치를 current 변수에 담아둚
		while(current > 1) { // 현재 위치가 루트노드가 아닐때까지 작업함
			int parent = current / 2; // 부모노드는 현재 위치의 중간
			if(heap[parent] >= heap[current]) break; // 부모노드가 자식보다 크면 만족하니 연산종료
			swap(parent, current); // 부모노드가 자식보다 작으면 위치 바꿈
			current = parent; // 자식노드의 인덱스는 위치를 바꿨기 때문에 부모노드의 인덱스로 덮어씌움
		}
	}
	
	public int pop() {
		if(size == 0) return 0; // 데이터가 없으면 0 출력
		int ret = heap[1]; // 힙의 첫번째 노드 반환
		
		heap[1] = heap[size--]; // 힙의 루트노드에는 가장 끝에 있는 노드를 배치함
		int current = 1; // 루트노드 기준
		while(current * 2 <= size) {
			int left = current * 2;
			int right = left + 1;
			int child = left;
			if(right <= size && heap[left] < heap[right]) {
				child = right; // swap하는 대상을 right로 바꿔줌
			}
			if(heap[current] >= heap[child]) break; // 자식과 내 노드를 비교-내가 더 큰값을 들고있음
			swap(current, child);
			current = child; // 인덱스 갱신
		}		
		return ret;
				
	}
}
