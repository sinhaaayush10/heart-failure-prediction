public class LargetElement{

    public static  int findLargestElement(int arr[]){
         
        //access krne k liye or logic idhar hai!!
        int largestElement = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largestElement)
                largestElement =arr[i];
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int arr[] = {99,55,4,66,4};

        //logic idhar pass hojayega
       int largestValue= findLargestElement(arr);
       System.out.print("largest element is"+ largestValue);
    } 
}