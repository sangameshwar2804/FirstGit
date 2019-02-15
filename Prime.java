class Prime
{
  public void add()
  {
    int a=10;
    int b=20;
    int c=a+b;
    System.out.println(c);
  }
  public void sub()
  {
    int a=10;
    int b=20;
    int c=a-b;
    System.out.println(c);
  }
public void mul()
  {
    int a=10;
    int b=20;
    int c=a*b;
    System.out.println(c);
  }

public static void main(String[] args)
{
  Prime p=new Prime();
  p.add();
  p.sub();
  p.mul();
System.out.println("Sample");
}
}
