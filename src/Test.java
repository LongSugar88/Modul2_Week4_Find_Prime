public class Test {
    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime(1000, "Long Hero");
        SuperFindPrime superFindPrime = new SuperFindPrime(1000, "Long Super Hero");
        Thread myNormalThread = new Thread(findPrime);
        Thread mySuperThread = new Thread(superFindPrime);
        myNormalThread.start();
        mySuperThread.start();
        System.out.println(myNormalThread.notify());
    }
}
