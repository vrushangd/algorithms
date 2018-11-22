class bubblesort{
    public static void main(String[]args){
        int[] a = new int[5]
        int n=a.length();
        for(int k=1;k<n-1;k++){
            for(int i=0;i<n-2;i++){
                if(a[i]>a[i+1]){
                    temp =a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int number :a){
            System.out.println(number);
        }
    }
}