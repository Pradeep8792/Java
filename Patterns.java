public class Patterns {
    public static void main(String[] args) {
        
        // for( int i =0;i<5;i++)
        // {
        //     for( int j= 0;j<5;j++)//rows 1 to 5
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //    for( int i =0;i<5;i++)
        // {
        //     for( int j= 0;j<5;j++)//rows 1 to 5
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // // left triangle
        //    for( int i =0;i<5;i++)
        // {
        //     for( int j= 0;j<i;j++)
        //     {
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }

        // // dimension
        // for( int i =5;i>=0;i--)
        // {
        //     for(int j =0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //right triangle 
    //     for( int i =1;i<=5;i++)
    //    {
    //         for(int j = 1;j<=5-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j = 1;j<=i;j++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //    }
    //    System.out.println("============");
    //     for( int i =5;i>=0;i--)
    //    {
    //         for(int j = 1;j<=5-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j = 1;j<=i;j++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //    }

    // int h=1;
    // for(int i =0;i<3;i++)
    // {
    //     for(int j=0;j<3;j++)
    //     {
    //         System.out.print(h);
    //         h++;
    //     }
    //     System.out.println();
    // }




    System.out.println("=====================Diamond =====================");
    int n= 5;
    for(int i =0;i<=n;i++)
    {
        for(int space=0;space<n-i;space++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    for( int i =5;i>=1;i--)
    {
        for(int j= 1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    for( int i =1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
        System.out.println("==============================");
        int nu=5;
        for(int i=1;i<=nu;i++)
        {
           /*  for(int space = 0;space<nu-i;space++)
            {
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }*/

                for(int j=0;j<=5;j++)
                {
                    if(i+j<=5)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
        }


        System.out.println("====================================");
        int num=5;
        for(int i =1;i<num;i++)
        {
            for(int space=num;space<i;space++)
                {
                    System.out.print(" ");
                } 
                for(int j=1;j<=num;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }


        System.out.println("=============================");
        int n1=5;
        for(int i =1;i<n1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=======================");
        int number=8;
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                if(i==0||i==number-1 || j==0 || j ==number-1 )
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
