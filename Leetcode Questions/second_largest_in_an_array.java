class second_largest_in_an_array {
    public int getSecondLargest(int[] arr) {
        int largest=arr[0];
        int s_largest=-1;
        
        for(int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                s_largest=largest;
                largest=arr[i];
            }if (arr[i]<largest && arr[i]>s_largest){
                s_largest=arr[i];
            }
            
        }
        return s_largest;



        
    }
}