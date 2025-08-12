public class MaxArrayValue {
    int[] array = {1,5,3,8,2};

    public void getMax() {
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            temp = array[i];
            for(int j = 0; j < array.length; j++) {
                if(temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println(array[0]);
    }
}
