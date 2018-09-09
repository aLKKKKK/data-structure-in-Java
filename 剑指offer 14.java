//动态规划
public Solution(){
    public maxProductForCutting(int length){
        if (length < 2){
            return 0;
        }else if(length == 2){
            return 1;
        }else if (length == 3){
            return 2;
        }
        
        int[] products = new int [length+1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        for (int i = 4; i <= length; i++){
            int max = 0;
            for (int j = 1; j<=i/2; j++){
                int product = products[j] * products[i-j];
                if (max < product){
                    max = product;
                }
            }
            products[i] = max;
        }
        return products[length];
    }
}

//贪婪算法
public Solution(){
    public maxProductForCutting(int length){
        if (length < 2){
            return 0;
        }else if(length == 2){
            return 1;
        }else if (length == 3){
            return 2;
        }
        
        int timeFor3 = length/3;
        if (length%3 == 1){
            timeFor3 -= 1;
        }
        
        int timeFor2 = (length - timeFor3 * 3)/2;
        
        return (Math.power(3, timeFor3) * Math.power(2, timeFor2));        
    }
}
