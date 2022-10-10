import java.io.*;//needed for BufferedReader, InputStreamReader, etc.
/**A java program that displays the armstrong nos. within a range.
 *An Armstrong number is number,the sum of the cubes of whose digits 
 *is the number itself.*/
public class Armstrong_no_range
{
//program execution starts here
public static void main(String []args)throws IOException
{
//First creating a single shared BufferedReader for Keyboard input
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader st=new BufferedReader(in);
//prompting the user
int count=0;
System.out.println("Enter the lowest limit");
int ll=Integer.parseInt(st.readLine());//Reading line of integer from the user
System.out.println("Enter the highest limit");
int hl=Integer.parseInt(st.readLine());//Reading line of integer from the user
int d,n;//declared necessary variables
double cube,sum;
System.out.println("The Armstrong numbers within this range are :");
for(int i=ll;i<=hl;i++)//Running loop to get the numbers within range
{
sum=0;//initialising necessary variables
n=i;
while(n>0)//Running while loop to extract all the digits and add their cubes
{
d=n%10;
cube=Math.pow(d,3);
sum=sum+cube;
n=n/10;
}
if(sum==i)//if the sum is the no. itself, then the no. is displayed
{
    System.out.println(i);
}
}
}//End of main method.
}//End of class.
