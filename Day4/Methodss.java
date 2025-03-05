package Day4;

class School{

    public void passmethepen()

    {
       System.out.println("pen");
    }

    public String dance(int time)
    

    {
       if(time>10)
       return "Steps";
       else
       return "nothing";
    }
}

public class Methodss
{
    public static void main(String[] args) {
        School obj = new School();
        obj.passmethepen();
        
        String str = obj.dance(9);
        System.out.println(str);    

    }

}