public class Main {
    public static void main(String[] args) {
            //task1
        for(int i = 0; i<10; i++) {
            System.out.println(i+1);
        }

            //task2
        for(int i = 10; i>0; i--) {
            System.out.println(i);
        }

            //task3
        for(int i = 0; i<17; i++) {
            if(i%2==0){System.out.println(i);}
        }

            //task4
        for(int i = 10; i>-11; i--) {
            System.out.println(i);
        }

            //task 5
        for(int i=1904; i<2097; i+=4) {
            System.out.println(i + " год является високосным");
        }

            //task 6
        for(int i = 7; i < 100; i+=7){
            System.out.println(i);
        }

            //task 7
        for(int i = 1; i<=512; i*=2) {
            System.out.println(i);
        }

            //task8
        double moneyAMonth = 29_000;
        double moneyAYear = 0;

        for(int i = 0; i<12; i++) {
            moneyAYear += moneyAMonth;
            moneyAMonth = moneyAMonth *1.12;
            System.out.printf("Месяц " + (i+1) + ", сумма накоплений равна %.2f рублей \n", moneyAYear);

        }

    }
}