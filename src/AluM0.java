import java.util.Scanner;
//Cn=0
public class AluM0 {
    public  static void main(String []args) {
        int Cn=0;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Entrer l'operande A:");
        String operandA = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer l'operande B:");
        String operandB = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Entrer la fonction F:");
        String F = sc2.next();*/
        String operandA = "1111";
        String operandB = "1000";
        String F = "0110";
        Cn=1;
        //int f=Integer.parseInt(F,2);
        /*String res = ET(operandA,Complement(operandB));

        int res1 = Integer.parseInt(res, 2);

        int res3 = res1+res2;
        System.out.println(res3);
        String res4 = Integer.toBinaryString(res3);
        System.out.println(res4);
        if (res4.length()>4) {
            String carryOut = res4.substring(0,1);
            System.out.println("Retenue: "+carryOut);
            String res5 = res4.substring(1,5);

            System.out.println(res5);
        }
        char c = 0;
        if (res4.length()>4){
            c= res4.charAt(0);
        }

        */
        //System.out.println(c);
        int A = Integer.parseInt(operandA,2);
        int b1 = Integer.parseInt(F, 2);
        System.out.println(b1);
        String res11=ET(operandA,operandB);
        String res16 =OU(operandA,Complement(operandB));
        String res26 =OU(operandA, operandB);
        String res3 = ET(operandA,Complement(operandB));
        //String res3 = " ";
        if (Cn == 0) {
            switch (b1) {
                case 0:
                    System.out.println(operandA);
                    break;
                case 1:
                    System.out.println(res26);
                    break;
                case 2:
                    //String res = Complement(operandA);
                    //System.out.println(res);
                    System.out.println(res16);
                    break;
                case 3:
                    System.out.println("-1");
                    break;
                case 4:
                    String res= ADD(operandA,ET(operandA,Complement(operandB)));
                    String res1 =Res(res);
                    String retenue = CarryOut(res);
                    System.out.println("Resultat: "+res1);
                    System.out.println("Retenue: "+retenue);
                    break;
                case 5:
                    String res2 = OU(operandA,operandB);

                    String res4 = ADD(res2,res3);
                    String res5 = Res(res4);
                    String REtenue1 = CarryOut(res4);
                    System.out.println("Resultat: "+res5);
                    System.out.println("Retenue: "+REtenue1);

                    break;
                case 6:
                    String res6 =subtract(operandA ,operandB);


                    System.out.println(res6);
                    break;
                case 7:
                    String res9 = ET(operandA,Complement(operandB));
                    int Res3 =Integer.parseInt(res9 , 2);
                    String res10 = Integer.toBinaryString(Res3 -1);
                    System.out.println(Bits(res10));
                    break;
                case 8:
                    String res12 = add(operandA,res11);
                    System.out.println(res12);
                    String res13 = Res(res12);
                    String REtenue2 = CarryOut(res12);
                    System.out.println("Resultat: "+res13);
                    System.out.println("Retenue: "+REtenue2);
                    break;
                case 9:
                    String res14 = add(operandA,operandB);
                    String res15 = Res(res14);
                    String REtenue3 = CarryOut(res14);
                    System.out.println("Resultat: "+res15);
                    System.out.println("Retenue: "+REtenue3);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    System.out.println(res17);
                    String res18 = Res(res17);
                    String REtenue4 = CarryOut(res17);
                    System.out.println("Resultat: "+res18);
                    System.out.println("Retenue: "+REtenue4);
                    break;
                case 11:
                    int res19 = Integer.parseInt(res11,2);
                    int res20 = res19 - 1;
                    String res21 = Integer.toBinaryString(res20);
                    System.out.println(Bits(res21));
                    break;
                case 12:
                    int res22 = A <<1;
                    String res23 = Integer.toBinaryString(res22);
                    String res24 = ADD(operandA,res23);
                    System.out.println(res24);
                    break;
                case 13:
                    String res25 = ADD(res26,operandA);
                    System.out.println(res25);
                    String res31 = Res(res25);
                    String REtenue6 = CarryOut(res25);
                    System.out.println("Resultat: "+res31);
                    System.out.println("Retenue: "+REtenue6);
                    break;
                case 14:
                    String res27 = ADD(res16,operandA);
                    System.out.println(res27);
                    String res30 = Res(res27);
                    String REtenue5 = CarryOut(res27);
                    System.out.println("Resultat: "+res30);
                    System.out.println("Retenue: "+REtenue5);
                    break;
                case 15:
                    int res28 =A -1 ;
                    String res29 = Integer.toBinaryString(res28);
                    System.out.println(res29);
                    break;
            }
        }
        if (Cn == 1) {
            switch (b1) {
                case 0:
                    String res31 = Integer.toBinaryString(A+1);
                    System.out.println(res31);
                    break;
                case 1:
                    int res32 = Integer.parseInt(res26,2) +1;
                    String res33 = Integer.toBinaryString(res32);
                    System.out.println(res33);
                    break;
                case 2:
                    int res34 = Integer.parseInt(res16,2) +1;
                    String res35 = Integer.toBinaryString(res34);
                    System.out.println(res35);
                    break;
                case 3:
                    System.out.println("0");
                    break;
                case 4:
                    String res= ADD(operandA,ET(operandA,Complement(operandB)));
                    int res36 = Integer.parseInt(res,2)+1;
                    String res37 = Integer.toBinaryString(res36);
                    System.out.println(res37);
                    String res38 =Res(res37);
                    String Retenue6 = CarryOut(res37);
                    System.out.println("Resultat: "+res38);
                    System.out.println("Retenue: "+Retenue6);
                    break;
                case 5:
                    String res2 = OU(operandA,operandB);
                    //String res3 = ET(operandA,Complement(operandB));
                    String res4 = ADD(res2,res3);
                    int res52 = Integer.parseInt(res4,2)+1;
                    String res39 = Integer.toBinaryString(res52);
                    System.out.println(res39);
                    String res5 = Res(res39);
                    String REtenue1 = CarryOut(res39);
                    System.out.println("Resultat: "+res5);
                    System.out.println("Retenue: "+REtenue1);

                    break;
                case 6:
                    String res6 =subtract(operandA ,operandB);
                    int Res1=Integer.parseInt(res6,2);
                    int Res2= Res1 - 1;
                    String res7 = Integer.toBinaryString(Res2);
                    String res8 = Bits(res7);
                    System.out.println(res8);
                    break;
                case 7:
                    String res9 = ET(operandA,Complement(operandB));

                    System.out.println(res9);
                    break;
                case 8:
                    String res12 = add(operandA,res11);
                    int res40= Integer.parseInt(res12,2)+1;
                    String res41 = Integer.toBinaryString(res40);
                    System.out.println(res41);
                    String res13 = Res(res41);
                    String REtenue2 = CarryOut(res41);
                    System.out.println("Resultat: "+res13);
                    System.out.println("Retenue: "+REtenue2);
                    break;
                case 9:
                    String res14 = add(operandA,operandB);
                    int res42 = Integer.parseInt(res14,2)+1;
                    String res43 = Integer.toBinaryString(res42);
                    System.out.println(res43);
                    String res15 = Res(res43);
                    String REtenue3 = CarryOut(res43);
                    System.out.println("Resultat: "+res15);
                    System.out.println("Retenue: "+REtenue3);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    int res44 = Integer.parseInt(res17,2)+1;
                    String res45 = Integer.toBinaryString(res44);
                    System.out.println(res45);

                    String res18 = Res(res45);
                    String REtenue4 = CarryOut(res45);
                    System.out.println("Resultat: "+res18);
                    System.out.println("Retenue: "+REtenue4);
                    break;
                case 11:
                    System.out.println(res11);
                    break;
                case 12:
                    String res24 = ADD(operandA,operandA);
                    int res46 = Integer.parseInt(res24,2)+1;
                    String res47 = Integer.toBinaryString(res46);
                    System.out.println(res47);
                    break;
                case 13:
                    String res25 = ADD(res26,operandA);
                    int res48 = Integer.parseInt(res25,2)+1;
                    String res49 = Integer.toBinaryString(res48);
                    System.out.println(res49);
                    String res61 = Res(res49);
                    String REtenue6 = CarryOut(res49);
                    System.out.println("Resultat: "+res61);
                    System.out.println("Retenue: "+REtenue6);
                    break;
                case 14:
                    String res27 = ADD(res16,operandA);
                    int res50 = Integer.parseInt(res27,2)+1;
                    String res51 = Integer.toBinaryString(res50);

                    System.out.println(res51);
                    String res30 = Res(res51);
                    String REtenue5 = CarryOut(res51);
                    System.out.println("Resultat: "+res30);
                    System.out.println("Retenue: "+REtenue5);
                    break;
                case 15:

                    System.out.println(operandA);
                    break;
            }
        }
    }
    public  static String add(String a,String b){
        int b1= Integer.parseInt(a,2);
        int b2= Integer.parseInt(b,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
        //return sum;
    }
    public static String Bits(String a){
        String res = " ";
        if(a.length()<4){
            res = "0" + a;
        }
        return res;
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
    public static String Res(String a){
        String res5=" ";
        if (a.length()>4) {
            res5 = a.substring(1,5);


        }
        return  res5;
    }

    public static String CarryOut(String a){
        String b =" ";
        if (a.length()>4) {
            b = a.substring(0,1);
        }

        return  b;
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
    public static String ADD(String a,String b){
        int a1 =Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int c = a1+b1;
        String res =Integer.toBinaryString(c);
        return res;
    }
    public static String subtract(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1-b1;
        return Integer.toBinaryString(sum);
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
