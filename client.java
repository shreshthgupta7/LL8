package LL8;

import LL8.checking_private_variables;

public class client
{
    public static void main(String[] args) {
        checking_private_variables cons=new checking_private_variables(10,5);
        // int x=cons=a;
        checking_private_variables copy1=cons.copy2();
        System.out.println(copy1.a);

    }
}