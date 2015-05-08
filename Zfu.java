import java.io.*;
public class Zfu 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("ÇëÊäÈë×Ö·û£º");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num1 = null;
		num1 = br.readLine();
		//String num1 = "lskdjfldfe";
		int Len = num1.length();
		char[] zfArray = num1.toCharArray();
		char[] rArray = new char[Len]; 
		for(int i = 0; i < Len; i++)
		rArray[Len - i -1] = zfArray[i];
		//for(int i = 0; i < Len; i++)
		String out = String.valueOf(rArray);
		System.out.println(out);
	}
}
