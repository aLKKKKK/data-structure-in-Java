//3-1找出数组中的重复数字
public class Duplicate(){
    private int duplication;
    
    public boolean findDuplicate(int[] array_in, int length){
        if (array_in == null) || (length <= 0){
            return false;
        }
        for(int i=0; i<length; i++){
            if (array_in[i] < 0) || (array_in[i] > length-1){
                return false;
            }
        }
        for(int i=0; i<length; i++){
            while(array_in[i]!=i){
                if array_in[i] == array_in[array_in[i]]{
                    duplication = array_in[i]； 
                    //System.out.println(array_in[i]);
                    return true;
                }
                else{
                    temp = array_in[i];
                    array_in[i] = array_in[temp];
                    array_in[temp] = temp;     
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Duplicate first = new Duplicate();
        int[] array = new int[]{2,3,1,0,2,5,3};
        if first.findDuplicate(array, array.length){
            System.out.println("find!" + first.duplication);
        }
    }
}


//3-2不修改数组找出重复的数字
public class Duplicate(){
    private int duplication;
    
    public boolean findDuplicate(int[] array_in, int length){
        if (array_in == null) || (length <= 0){
            return false;
        }
        for(int i=0; i<length; i++){
            if (array_in[i] < 0) || (array_in[i] > length-1){
                return false;
            }
        }
        int end = length-1;
        int start = 1;
        while(end>=start){
            int middle = (end-start)>>1 + start;
            int count = countRange(array_in, start, middle, length);
            if(end == start){
                if (count > 1) {
                    duplication = start;
                    return true;
                }
                else{
                    break;
                }
            }
            if (count > (middle-start+1)) end = middle;
            else start = middle + 1;          
        }
        return false;
    }
    
    public int countRange(int[] array, int start, int end, int length){
        if array == null return 0;
        int count = 0;
        for(int i=0; i<length; i++){
            if array[i]>=start && array[i]<=end count += 1;
        }
        return count;
    }
    
    public static void main(String[] args){
        Duplicate second = new Duplicate();
        int[] array = new int[]{2,3,5,4,3,2,6,7};
        if first.findDuplicate(array, array.length){
            System.out.println("find!" + second.duplication);
        }
    }
}
