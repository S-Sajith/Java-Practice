// number is prime if num is divisible by 1 and num itself

public class SumPrime{

	public static void main(String[] args)
    {
        int l = 4, r = 13;
        System.out.println(primeSum(l, r));
    }

	static boolean checkPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
 
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }

    static int primeSum(int l ,int r){

    	int sum = 0;
    	for(int i = l ; i<=r ; i++){
    		boolean isPrime = checkPrime(i);
    		if(isPrime){
    			sum = sum + i;
    		}
    	}
    	return sum;
    }


}