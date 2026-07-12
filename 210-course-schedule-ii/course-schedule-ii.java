class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int state[] = new int[numCourses];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<numCourses; i++){
            if(state[i] == 0){
                if(!topSortutil(graph, i, state, s) ){
                    return new int[0];
                }
            }
        }

        int[] ans = new int[numCourses];
        int idx = 0;

        while(!s.isEmpty()){
            ans[idx++] = s.pop();
        }
        
        return ans;
        
    }

    public boolean topSortutil(ArrayList<ArrayList<Integer>> graph, int curr, int[] state, Stack<Integer> s){

        state[curr] = 1;
        for(int i=0; i < graph.get(curr).size(); i++){
            int neigh = graph.get(curr).get(i);

            if(state[neigh] == 1){
               return false;
            }
            if(state[neigh] == 0){
                if(!topSortutil(graph, neigh, state, s)){
                    return false;
                }

            }
             
        }

        state[curr] = 2;
        s.push(curr);

        return true;
    }


}