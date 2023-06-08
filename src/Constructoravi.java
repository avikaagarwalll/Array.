class Temp
{
    // block to be executed first
    {
        System.out.println("init");
    }


    Temp()
    {
        System.out.println("default");
    }

    Temp(int x)
    {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }

    public static void main(String args[])
    {
        new Temp();
        new Temp(10);
    }
}
