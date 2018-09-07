public class AssignmentOperator{
    public static class MyString{
        private String data;
        
        public MyString(String data){
            this.data = data;
        }
        public MyString assign(MyString other){
            if (this == other) || this.data.equals(other.data)
                return this;
            else{
                this.data = other.data;
                return this;
            }
        }
    }
    public static void main(String[] args){
        MyString s1 = new MyString('a');
        MyString s2 = new MyString('b');
        MyString s3 = new MyString('c');
        System.out.println(s1.assign(s2));
        System.out.println(s1.assign(s3));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

// reference 简书 https://www.jianshu.com/p/3f024a03176b
