public class FindPrime implements Runnable {
    String name;
    int num;
    FindPrime (int number, String name){
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
                    while (check < primeNumber ){
                        if( primeNumber % check == 0){
                            isPrime = false;
                            break;
                        }
                        check++;
                    }
                }
                if(isPrime){
                    System.out.println("The prime number "+ count+"th finding by " + name+" is "+primeNumber);
                    count++;
                }
            }
        }
    }
