public class Demo23 {
    public static void main(String[] args) {
        // 24. break    = break out of the loop(STOP)
        //     continue = skip current iteration of a loop (skip)

        for(int i = 0; i < 10; i++) {

            if(i ==5){
                continue; // continue count from to to 4 and skip to then count from 6 to 10
            //  break;    // skip at 4
            }
            System.out.print(i + " ");
        }
    }
}
