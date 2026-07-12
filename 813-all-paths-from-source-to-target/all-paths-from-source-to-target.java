class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(graph, 0, graph.length -1, ans, temp);

        return ans;
        
    }

    private void helper(int[][] graph, int src , int des, List<List<Integer>> ans,  List<Integer> temp){
        temp.add(src);
        if(src == des){
            ans.add(new ArrayList<>(temp));
        }
        for(int i =0; i<graph[src].length; i++){
            int next = graph[src][i];
            helper(graph, next, des, ans,temp);
        }

        temp.remove(temp.size() - 1);
    }
}