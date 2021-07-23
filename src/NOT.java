public class NOT {
    public static void main(String [] args){
        int a= 1010;
        int b = 1001;
        int c = a & b;
        //int c = a | b;
        //int c = a^ b;
        //int c = ~a;
        //int c = a+ (a << 1);
        String b1 = "0001";
        String b2 = "1001";
        System.out.println(c);


        //System.out.println(add(b1,b2));
    }
    public  static String add(String a,String b){
        int b1= Integer.parseInt(a,2);
        int b2= Integer.parseInt(b,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
        //return sum;
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
