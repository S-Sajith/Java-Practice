// A Binary Number System is composed of two symbols 
// : 0’s (zeroes) and 1’s (ones)
// Binary Number can also be thought of as 
// a string of just 0’s and 1’s.
// An Octal Number System comprises 
// of eight digits ranging from 0 to 7.
// It is an 8-base number system and can be formulated by
// grouping the bits in a binary number in groups of three
// nd calculating the corresponding value of each group as 
// a single digit in the resultant Octal Number.

// Algorithm:
//     1. Convert the binary number to a decimal number.
//     2.Now, for this converted decimal number, 
//     run a while loop till this number becomes 0.
//     3.In every iteration of the loop, 
//     get the remainder by dividing the number by 8.
//     4.Multiply this remainder with increasing powers of 10.
//     5.Finally divide the original number by 8.

public class Conversion{

	static int binaryToDecimal(long binary){

		int decimalNo = 0 ; int i =0;

		while(binary>0){
			decimalNo += (binary%10) * Math.pow(2,i++);
			binary/=10;
		}
		return decimalNo;
	}

	static int decimalToOctal(long binary){

		int octalNo = 0; int i =0;

		int decimalNum = binaryToDecimal(binary);

		while(decimalNum>0){
			octalNo += (decimalNum%8) * ((int)Math.pow(10,i++));
			decimalNum/=8;
		}
		return octalNo;
	}

	public static void main(String[] args) {
		Conversion conversion = new Conversion();
		System.out.println(conversion.decimalToOctal(100100));
	}

}