public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 9;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /=5;
        System.out.println(d);

        int e = 8;
        e *=3;
        System.out.println(e);

        int f1 =123;
        int f2 =345;

            System.out.println(f1 > f2);



        int g1 =350;
        int g2 =200;
        if (g2*2 > g1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        int h = 135738745;
        boolean x = ( (h % 11) == 0 );
        System.out.println(x);

        int i1 = 10;
        int i2 = 3;
        boolean z = (i1 > (i2*2)) && (i1 <(i2*4));
        System.out.println(z);

        int j = 1521;
        boolean n = ((j % 3) == 0) || ((j % 5) == 0);
        System.out.println(n);


    }
}
