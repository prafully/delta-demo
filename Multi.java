class Multi {
    public static void main(String[] args) {
        System.out.println("Prafull");
        multiply ();
        divisible ();
    }

    static void multiply() {
        int a = 20;
        int b = 10;
        int c = a*b;
        System.out.println("C = "+c);
    }

    static void divisible() {
        int a = 15;

        if (a%7==0) {
            System.out.println("Given Number is divisible by 7");
        }else{
            System.out.println("Wrong");
        }
    }

}