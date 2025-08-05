public class RotateImage {
//    1 2 3     1 4 7
//    4 5 6     2 5 8
//    7 8 9     3 6 9
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col = arr[0].length;
        Transpose(arr,row,col);
        Rotate(arr,row,col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }


    }
    static void Transpose(int[][] arr,int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<row;j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void Rotate(int[][] arr,int row, int col)
    {
        for(int i=row;i>row;i--)
        {
            for(int j=0;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
