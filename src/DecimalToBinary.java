public class DecimalToBinary {
    public static  void  main(String [] args){
        int a=23;
        DB(a);

    }
    public static void  DB(int a){

        int [] entier= new int[40] ;
        int index = 0;
        while (a >0){
            entier[index++] = a% 2;
            a=a/2;
        }
        for (int i =index - 1;i>=0;i-=1){
            System.out.print(entier[i]);
        }
        if(a<0){
            a= - a;
            entier[index++] = a% 2;
            a=a/2;
        }
        for (int i =index - 1;i>=0;i-=1){
            System.out.print(entier[i]);
        }
    }
}
