class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer>arO=new ArrayList<>();
        ArrayList<Integer>arE=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arE.add(arr[i]);
            }
            else{
                arO.add(arr[i]);
            }
        }
        Collections.sort(arE);
        Collections.sort(arO);
        Collections.reverse(arO);
        int k=0;
        for(int it:arO){
            arr[k]=it;
            k++;
        }
        int l=k;
        for(int a:arE){
            arr[l]=a;
            l++;
        }
       
        
    }
}
