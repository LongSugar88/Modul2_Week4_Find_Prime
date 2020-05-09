public class SuperFindPrime implements Runnable {
    String name;
    int num;
    SuperFindPrime (int number, String name){
        this.num = number;
        this.name = name;
    }
    @Override
    public void run() {
        int count = 1;
        for(int i = 2 ; i< this.num ; i++ ){
            int primeNumber = i;
            boolean isPrime = true;
            if( i > 2){
                int check = 2;
                while (check <= Math.sqrt(primeNumber) ){
                    if( primeNumber % check == 0){
                        isPrime = false;
                        break;
                    }
                    check++;
                }
            }
            if(isPrime){
                System.out.println("The prime number "+ count+"th finding use super method by " + name+" is "+primeNumber);
                count++;
            }
        }
    }
}