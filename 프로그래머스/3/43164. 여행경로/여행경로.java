import java.util.*;

class Solution {
    private LinkedList<String> route = new LinkedList<>();
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        //int n = tickets[0].length;
        
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        
        for(String[] ticket : tickets) {
            String from = ticket[0];
            String to = ticket[1];
            
            if(!graph.containsKey(from)) {
                graph.put(from, new PriorityQueue<>());
            }
            graph.get(from).add(to);
        }
        dfs("ICN", graph);
        
        return route.toArray(new String[0]);
    }
    private void dfs(String airport, Map<String, PriorityQueue<String>> graph) {
        PriorityQueue<String> arrivals = graph.get(airport);
        while (arrivals != null && !arrivals.isEmpty()) {
            String next = arrivals.poll();
            dfs(next, graph);
        }

        // 후위 순회로 경로 저장
        route.addFirst(airport);
    }
}