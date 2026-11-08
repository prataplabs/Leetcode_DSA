class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int i=arr.length-1 ; i >= 0 ; i--){
            ans.put(arr[i], i);
        }

        for(int i=0 ; i<arr.length ; i++){
            if(ans.containsKey(arr[i]*2 ) && ans.get(arr[i]*2 ) != i ){
                return true;
            }
        }

        return false;
        
    }
}