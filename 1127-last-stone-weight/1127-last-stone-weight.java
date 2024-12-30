class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
       // PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
       PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
  
        for(int stone:stones)
        {
           p.add(stone); 
        }
     
       while(p.size()> 1)
        {
            int stones1=p.remove();
            int stones2=p.remove();
            if(stones1!=stones2){
            p.add(stones1-stones2);} 
        }
        return p.isEmpty()?0:p.remove();

    }
}