public class Soustraction {
    public static void main(String [] args){
    String A="1000";
    int a= Integer.parseInt(A,2);
    System.out.println(a);
    String B="0011";
    int b = Integer.parseInt(B,2);
   System.out.println(b);

        //System.out.println(res);
    String resu =subtract(B,A);
    //System.out.println(resu);
    if (resu.length() >4){
        String rest =resu.substring(resu.length()-4);
        int g = Integer.parseInt(rest,2);
        System.out.println(rest);
        System.out.println(g);
    }

    }
    public static String subtract(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1-b1;
        return Integer.toBinaryString(sum); }

   }
