package LL8;

public class checking_private_variables {
    public checking_private_variables copy2()
    {
        checking_private_variables cpv=new checking_private_variables(5,5);
        cpv.a=this.a;
        cpv.b=this.b;
        return cpv;
    }
    //public checking_private_variables copy2;
    private int a;
    int b;
    public checking_private_variables(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
//    public checking_private_variables copy2()
//    {
//        checking_private_variables cpv=new checking_private_variables();
//        cpv.a=this.a;
//        cpv.b=this.b;
//        return cpv;
//    }
}

