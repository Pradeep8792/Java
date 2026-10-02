class JVMArch //method area 
{
    public static void main(String[] args) {
        int x =10;// in stack
        int y= 5;// in stack
        int add = x+y;// in stack
        String  str = new String("Sum"+add); //sum40//heap
        System.out.println(str+add);//sum4040

    }
}
