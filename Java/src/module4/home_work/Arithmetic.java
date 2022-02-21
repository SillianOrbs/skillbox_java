package module4.home_work;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int comp(){
        return a * b;
    }

    public int max(){
        return Math.max(a, b);
    }

    public int min(){
        return Math.min(a, b);
    }


}
