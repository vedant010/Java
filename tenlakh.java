
class Ten{

    static int countPrime, countNonPrime, countPrime1, countNonPrime1;		
    
    public static int checkIfPrime(int arr[]){
    
        for (int i = 0; i<arr.length; i++){
            if (isPrime(arr[i])){
                countPrime++;	
            }
            else{
                countNonPrime++;
            }
        }
        return countPrime;
    }
    
    public static int checkIfPrime1(int arr[]){
    
        for (int i = 0; i<arr.length; i++){
            if (isPrime(arr[i])){
                countPrime1++;	
            }
            else{
                countNonPrime1++;
            }
        }
        return countPrime1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public static void main (String [] args){
        
    int[] Ar;
    Ar = new int [1000000];
    for (int i = 0; i < 1000000; i++) {
        Ar[i] = (int)(System.currentTimeMillis() % 10000000);
    }
    int w = 0;
   
    while(w < 5){
        System.out.println("Starting Time" + System.nanoTime());
        long A = Ten.checkIfPrime(Ar);
        System.out.println("Concluding Time" + System.nanoTime());
        System.out.println("Number of Primes" + A);
        
        System.out.println("Starting Time" + System.nanoTime());
        long B = Ten.checkIfPrime1(Ar);
        System.out.println("Concluding Time" + System.nanoTime());
        System.out.println("Number of Primes" + B);
        w++;
    }   
}

