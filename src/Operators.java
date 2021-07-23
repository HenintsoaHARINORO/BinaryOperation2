public class Operators {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c1=ET(a,b);
        int c2=OU(a,b);
        int c3=XOR(a,b);
        int c4=NOT(a);
        //DB(a);





        //System.out.println("a&b=" +(a &b));
    }
    public static int ET(int a,int b){
        return a&b;
    }
    public static int OU(int a,int b){
        return a|b;
    }
    public static int XOR(int a,int b){
        return a^b;
    }
    public static int NOT(int a){
        return ~a;
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
    }
}
