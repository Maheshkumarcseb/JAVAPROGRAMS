  /* public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SortArray(arr);

    }
    static void SortArray(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]>arr[i]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
            else{
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]<arr[i])
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]= temp;
                    }
                }
            }
        }
        System.out.println("sorted element of array are:");
        for(int ele:arr)
            System.out.print(ele+" ");
    }
}


   */


  public class Sort {
      public static void main(String[] args) {
          int[] arr = {1, 2, 4, 7, 6, 3, 10};
          int n = arr.length;
          for (int i = 0; i < n; i++) {
              if (arr[i] % 2 == 0) {
                  for (int j = i + 1; j < n; j++) {
                      if ((arr[j] % 2 == 0) && arr[j] > arr[i]) {
                          int temp = arr[i];
                          arr[i] = arr[j];
                          arr[j] = temp;
                      }
                  }
              } else {
                  for (int j = i + 1; j < n; j++) {
                      if ((arr[j] % 2 != 0) && arr[j] < arr[i]) {
                          int temp = arr[i];
                          arr[i] = arr[j];
                          arr[j] = temp;
                      }
                  }
              }
          }

          for (int ele : arr)
              System.out.print(ele + " ");
      }
  }

