package Day_1_assignment;

public class StaticVar {
    int a = 10;
    static int b = 20;

    void add()
    {
        int c = 30, d;
        d = a + b + c;
        System.out.println(d);

        {
            int e = 40, f;
            f = a * b * e;
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        StaticVar obj = new StaticVar();
        obj.add();
    }
}


