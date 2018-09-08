//3-1找出数组中的重复数字
public class Duplicate(){
    
    public boolean findDuplicate(int[] array_in, int length){
        if (array_in == null) || (length < 0){
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
                    System.out.println(array_in[i]);
                    contiune;
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
        int[] array = {2,3,1,0,2,5,3};
        if first.findDuplicate(array, array.length){
            System.out.println("find!")
        }
    }
}


//3-2不修改数组找出重复的数字
