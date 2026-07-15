// Last updated: 7/16/2026, 1:08:44 AM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int n =stones.length;
        for(int i =0;i<n;i++){
            q.add(stones[i]);
        }
        int last=0;
        while(q.size()>1){
            int a =q.poll();
            int b =q.poll();
            //if(a==b) continue;
            if(a!=b){
                q.add(a-b);
            }
        }
        return q.isEmpty() ? 0: q.poll();
    }
}