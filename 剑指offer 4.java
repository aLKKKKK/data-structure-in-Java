public class Solution {
    public boolean Find(int target, int [][] array) {
        //rows = array.length;
        int rows = 0;
        int cols = array[0].length-1;
        
        while ((rows <array.length) && (cols >= 0)){
            if (target == array[rows][cols]){
                return true;
            }
            else if (target > array[rows][cols]){
                rows += 1;
            }
            else{
                cols -= 1;
            }
        }
        return false;
    }
}
