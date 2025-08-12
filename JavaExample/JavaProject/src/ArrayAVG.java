public class ArrayAVG {
    int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
    };

    public void getAvg() {
        double avg = 0.0;
        int sum = 0, index = 0;

        for(int i = 0; i < array.length; i++) {
            index = array[i].length;
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        avg = (double)sum / index;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }

}