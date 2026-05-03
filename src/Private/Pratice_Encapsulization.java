class A
{
    private int value;

    public void setValue(int x)  //abstract value
    {
        value = x;
    }
    public int getValue()
    {
        return ++value;
    }
}
class B
{
    public static void main(String[] args)
    {
        A a = new A();
        a.setValue(100);
        System.out.println(a.getValue());
    }
}
