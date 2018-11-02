public class Main {


    public static double workEffort;

    public static void main(String[] args) {

        workEffort = 0;

        addWork(100);
        addWork(50);
        addWork(20);
        addWork(360);
        addWork(80);
        addWork(160);
        addWork(500);
        addWork(240);
        addWork(40);
        addWork(40);


        capacity(8, 3, 40);
        capacity(9, 3, 40);
        capacity(10, 3, 40);
        capacity(11, 3, 40);
        capacity(8, 4, 40);
        capacity(8, 5, 40);
        capacity(8, 6, 40);

        capacity(8, 3, 35);
        capacity(9, 3, 35);
        capacity(10, 3, 35);
        capacity(11, 3, 35);
        capacity(8, 4, 35);
        capacity(8, 5, 35);
        capacity(8, 6, 35);

        capacity(8, 3, 30);
        capacity(9, 3, 30);
        capacity(10, 3, 30);
        capacity(11, 3, 30);
        capacity(8, 4, 30);
        capacity(8, 5, 30);
        capacity(8, 6, 30);


    }

    public static void addWork(double item){
        workEffort += item;
    }

    public static void capacity(int eng, int weeks, int hrPWk){
        double capacity = workEffort/(eng*weeks*hrPWk);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %d%% of capacity.\n",eng,weeks,hrPWk,(int)(capacity*100));
    }




}
