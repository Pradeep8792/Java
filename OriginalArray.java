public class OriginalArray {
    static void  printArray(int []ar)
    {
        //Print array - original array
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }

    //lets change 
    static void change(int arr[])
    {
        System.out.println("Before change");

        printArray(arr);
        arr[0]=111;
        System.out.println("After change");
        printArray(arr);
    }


    //Array traversing using while loop
    static void traverseUsingWhileLoop(int a[])
    {
        int i = 0;
        while (i<a.length) {
            System.out.println(a[i]);
            i++;
            
        }
    }

    //Using do while
    static void usingDowhile(int arr[])
    {
        int i =0;
        do{
            
            System.out.println(arr[i]);
            i++;
        }while(i<arr.length);
    }

    // Using foreachLoop
    static void forReachLoop(int []arr)
    {
        System.out.println("Using for each loop");
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
    public static void main(String [] args)
    {
        int []a ={10,20,30};
        System.out.println("Before calling");
        printArray(a);
        change(a);
        System.out.println("After calling");
        printArray(a);

        System.out.println("Print using while loop");
        int arr[]={111,222,333,444};
        traverseUsingWhileLoop(arr);

        System.out.println("Print using do while loop");
        int arr1[]={100,200,300,400};
        usingDowhile(arr1);

        forReachLoop(arr1);
    }
}
