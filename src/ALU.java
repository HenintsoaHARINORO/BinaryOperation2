import java.util.Scanner;

public class ALU {
    public  static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer l'operande A:");
        String operandA = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer l'operande B:");
        String operandB = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Entrer la fonction F:");
        String F = sc2.next();
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
                String res= Complement(operandA);
                //System.out.println(res);
                System.out.println(ET(res,operandB));
                break;
            case 3:
                System.out.println(0);
                break;
            case 4:
                System.out.println(Complement(ET(operandA,operandB)));
                break;
            case 5:
                System.out.println(Complement(operandB));
                break;
            case 6:
                System.out.println(XOR(operandA,operandB));
                break;
            case 7:
                System.out.println(ET(operandA,Complement(operandB)));
                break;
            case 8:
                System.out.println(OU(Complement(operandA),operandB));
                break;
            case 9:
                System.out.println(Complement(XOR(operandA,operandB)));
                break;
            case 10:
                System.out.println(operandB);
                break;
            case 11:
                System.out.println(ET(operandA,operandB));
                break;
            case 12:
                System.out.println(1);
                break;
            case 13:
                System.out.println(OU(operandA,Complement(operandB)));
                break;
            case 14:
                System.out.println(OU(operandA,operandB));
                break;
            case 15:
                System.out.println(operandA);
                break;


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
    public static String XOR(String a,String b){
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1^b2;
        return Integer.toBinaryString(c);
    }
    public static String OU(String a,String b){
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1|b2;
        String res= Integer.toBinaryString(c);
        while (res.length()<4){
            res="0"+res;
        }
        return res;
    }
    public static String ET(String a,String b)
    {
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1&b2;
        String res=Integer.toBinaryString(c);
        while (res.length()<4){
            res="0"+res;
        }
        return res;
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
