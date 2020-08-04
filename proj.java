import java.util.*;
public class proj
{
	public static void main(String[]args)
	{
		selection();
	}
	static void selection()
	{
		System.out.println("Enter ur choice");
		System.out.println("1.Encrypt");
		System.out.println("2.Decrypt");
		System.out.println("3.Exit");
		char n;
		Scanner sc=new Scanner(System.in);
		n=sc.next().charAt(0);
		switch(n)
		{
			case '1':encrypt();
			selection();
			break;
			case '2':decrypt();
			selection();
			break;
			case '3':System.exit(0);
			break;
			default:System.out.println("Invalid Input");
			selection();
		}
	}
	static void encrypt()
	{
		System.out.println("Enter the message to be encrypted:");
		String str_in;
		int j=0;
		Scanner sc=new Scanner(System.in);
		str_in=sc.nextLine();
		char[] st=str_in.toCharArray();
		char[] st_encrypt=new char[st.length];
		for(int i=0;i<st.length;i++)
		{
			if((i+2)<st.length)
				st_encrypt[i]=st[i+2];
			else
			{
				st_encrypt[i]=st[j];
				j++;
			}
		}
		String str_out=new String(st_encrypt);
		System.out.println("The Encrypted message:"+str_out);
	}
	static void decrypt()
	{
		System.out.println("Enter the message to be decrypted:");
		String str_in;
		int j=0;
		Scanner sc=new Scanner(System.in);
		str_in=sc.nextLine();
		char[] st=str_in.toCharArray();
		char[] st_decrypt=new char[st.length];
		for(int i=0;i<st.length;i++)
		{
			if((i+(st.length-2))<st.length)
				st_decrypt[i]=st[i+(st.length-2)];
			else
			{
				st_decrypt[i]=st[j];
				j++;
			}
		}
		String str_out=new String(st_decrypt);
		System.out.println("The Decrypted message:"+str_out);
	}
}