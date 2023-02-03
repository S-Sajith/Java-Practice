public class PrimeRange{
	public static void main(String[] args)
    {
        int l = 4, r = 13;
        for(int i = l ; i<=r ; i++){
    		boolean isPrime = checkPrime(i);
    		if(isPrime){
    			System.out.print(i + " ");
    		}
    	}
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

}