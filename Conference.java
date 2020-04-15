class Seat
{
long n,i;
long id=0;
void method(int n)
{
for(long i=1;i<n;i++)
{
if(id==n)
{
System.out.println("Be Seated "+i);
}
}
id++;
}
}
public static void main(String [] args)
{
 Seat ref1=new Seat();
ref1.method(2000);
}
}
