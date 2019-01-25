class Prime
{
public static void main(String[] args)
{
int a=7;
int count=0;
for(int i=0;i<=a;i++)
{
if(a%i==0)
count++;
}
if(count==2)
System.out.println("prime");
else
System.out.println("NOT A PRIME");
}
}
