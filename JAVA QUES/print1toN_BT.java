class print1toN_BT {
    
    static void func(int i, int n){
        
            // Base Condition.
            if(i<1) return;
            
            // Function call to print(n-1) integers.
            func(i-1,n);
            System.out.println(i);

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
       int n = 4;
       func(n,n);
    }
}