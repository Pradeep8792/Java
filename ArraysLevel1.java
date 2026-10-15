public class ArraysLevel1 {
    //Methods -- Print all elements -->Traversing 
        void printElements(int []arr)
        {
            System.out.println("Methods -- Print all elements -->Traversing ");
            for(int i = 0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
    
        //--Print length of an array
        void printLength(int []arr)
        {
            System.out.println(arr.length);
            System.out.println(arr);
        }

        //Method 4 : modify third element -- update array

        void modifyAray(int [] arr)
        {
            arr[2]=100;
            System.out.println("After modifying");
            for(int i =0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
        
        //Print method 2 :Print first middle and last -- index based access
        void PrintFirstMidLast(int[] arr)
        {
            System.out.println("Print method 2 :Print first middle and last -- index based access");
            System.out.println("First "+arr[0]);
            System.out.println("Mid "+arr[arr.length/2]);
            System.out.println("Last "+arr[arr.length-1]);

        }

        //Method 5 : Demo of refrence copy
        void refrenceCopy(int [] arr)
        {
            int []copy = arr;

            System.out.println("Before");

            for(int i =0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            copy[0]=100;
            
            System.out.println("After");
            for(int i =0;i<copy.length;i++)
            {
                System.out.println(copy[i]);
            }
        }
        
        // method 6 :Different type of arrays
        void differentTypeOfType(int []number,
                                double[] salaries,
                                char [] grades,
                                boolean[] status,
                                String [] names)
        {
            System.out.println("Integer array ");
            for(int i =0;i<number.length;i++)
                {
                    System.out.println(number[i]);
                }          
        }
        
        //Method 7 Empty array 
        void emptyArray(int []arr)
        {
            System.out.println("Lentgh :"+arr.length);
            for( int i =0; i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }

        //Method 8
        void nullDemo(int []arr)
        {
            System.out.println(arr);

        }

        public static void main(String args[])
        {
           /*  int []a={10,20,30};
            printElements(a);*/

            ArraysLevel1 obj = new ArraysLevel1();
            //--Method1 
            int [] a = {10,20,30,40,50};
            obj.printElements(a);
            //Method 2
            obj.PrintFirstMidLast(a);

            //method 3
            obj.printLength(a);

            //method 4
            obj.modifyAray(a);

            //method 5
            obj.refrenceCopy(a);

            //method 6;
            int number[]={11,12,13};
            double [] salaries={25000,35000.75};
            char []grades={'A','B','C'};
            boolean [] status={true, false,true};
            String [] names={"Ram","Sham","Beema"};
            obj.differentTypeOfType(number,salaries,grades,status,names);

            
            //method 7
            int []array={};
            obj.emptyArray(array);

            //Method 8
            int b[]=null;
            obj.nullDemo(b);

        }

}
