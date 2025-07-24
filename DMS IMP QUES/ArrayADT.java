class ArrayADT {
    //array making;
    private int arr[];
    //size of array;
    private int index;
    //capacity of array;
    private int size;

    //constructor
    public ArrayADT(int size){
        this.size = size;
        this.index = 0;
        this.arr = new int[size];
    }

    //1.insertion code
    public void insert(int value){
        //checking is the array is full
        if(index == this.size){
            System.out.print("-----ARRAY IS FULL------");
            return;
        }
        arr[index] = value;
        index++;
    }

    //2.deletion code
    public void delete(int DelIndex){
        if(DelIndex <0 || DelIndex > index){
            System.out.print("-----Invalid Index-----");
            return;
        }
        for(int i =DelIndex; i<DelIndex; i++){
            arr[i] = arr[i+1];
        }
        index--;
    }

    //3.search value and retun value of index
    public int search(int value){
        int IndexResult = -1;
        for(int i =0; i<index; i++){
            if(arr[i] == value){
            IndexResult =1;
            break;
        }}
        return IndexResult;
    }

    //4.get the value
    public int get(int getIndex){
        if(getIndex <0 || getIndex >= this.index){
            System.out.println("-----Invalid Index-----");
            return -1;
        }
        return arr[getIndex];
    }

    //5.traversing index
    public void traverse(){
        for(int i=0; i<this.index; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //6.update array
    public void update (int updateIndex , int value){
        if(updateIndex <0 || updateIndex >=index){
            System.out.print("-----INVALID INPUT");
            return;
        }
         arr[updateIndex] = value;
    }
}