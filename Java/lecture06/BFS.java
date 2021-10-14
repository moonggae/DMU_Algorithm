package lecture06;

import java.util.*;

public class BFS {
    public boolean[] visited = new boolean[9];
    public int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};
    int start = 1;
    
    public BFS() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            System.out.print(x + " ");
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int node : graph[x]) {
                if (!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}