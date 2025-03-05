//lock
class privateEx{
    private int num=222;
    void showcase(){

        System.out.println(num);
    }
}

public class accessmodifer{
    public static void main(String[] args) {
        privateEx obj = new privateEx();
        obj.showcase();
    }
}
//lock

class accessmodifer