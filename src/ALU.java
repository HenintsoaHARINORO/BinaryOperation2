public class ALU {
    public  static void main(String []args) {
        String operandA = "1001";
        String operandB = "0110";
        String F = "0000";
        int b1 = Integer.parseInt(F, 2);
        System.out.println(b1);

        switch (b1)
        {
            case 0:
                System.out.println(Complement(operandA));
                break;
            case 1:
                System.out.println(Complement(OU(operandA,operandB)));
                break;
            case 2:


        }
    }
    static char flip(char c)
    {
        return (c == '0') ? '1' : '0';
    }
    public static String Complement(String a){
        int n = a.length();
        int i;
        String ones = "";
        ones =  "";
        for (i = 0; i < n; i++)
        {
            ones += flip(a.charAt(i));
        }
        return ones;
    }
    public static String OU(String a,String b){
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1|b2;
        return Integer.toBinaryString(c);

    }
    public static void DB(int a){

        int [] entier= new int[40] ;

        int index = 0;
        int i;
        while (a >0){
            entier[index++] = a% 2;
            a=a/2;
        }
        for ( i =index - 1;i>=0;i-=1){
            System.out.print(entier[i]);
        }

    }
}
