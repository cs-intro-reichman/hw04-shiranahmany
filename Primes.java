public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int lim = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean [lim +1];
        arrangeArr(isPrime);
        int numOfPrime = primeCheck(isPrime);
        printPrime(isPrime, numOfPrime);
    }

    public static void printPrime(boolean[] arr, int nPrime){
        System.out.println(" Prime numbers up to " + (arr.length -1) + ":");
        for(int i = 1; i < arr.length; i++){
            if(arr[i]) System.out.println(i);
        }
        double pre = ((double)nPrime/(arr.length -1)) * 100;
        System.out.println("There are " + nPrime + " primes between 2 and " + (arr.length -1) + " (" + (int)pre + "% are primes)");
    }

    public static void arrangeArr(boolean[] arr){
        arr[0] = false;
        arr[1] = false;
        for(int i = 2; i< arr.length; i++){
            arr[i] = true;
        }
    }

    public static int primeCheck(boolean[] arr){
        int count = 0;
        int countP = 0;
        int p = 2;
        while(p <= Math.sqrt((double)(arr.length -1))){
            for(int i = p; i < arr.length; i++){
                if(i%p == 0 && i != p) arr[i] = false;
            }
            count = p+1;
            while(!arr[count]){
                count ++;
            }
            p = count;
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i]) countP++;
        }
         
        return countP;
    }

}