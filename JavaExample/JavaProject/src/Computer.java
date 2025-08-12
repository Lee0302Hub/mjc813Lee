public class Computer {
    String[] stOut = new String[5];
    Computer(String computerName) {
        stOut[0] = computerName;
        stOut[1] = null;
        stOut[2] = null;
        stOut[3] = null;
        stOut[4] = null;
    }

    Computer(String computerName, String cpu) {
        stOut[0] = computerName;
        stOut[1] = cpu;
        stOut[2] = null;
        stOut[3] = null;
        stOut[4] = null;
    }

    Computer(String computerName, String cpu, String ram) {
        stOut[0] = computerName;
        stOut[1] = cpu;
        stOut[2] = ram;
        stOut[3] = null;
        stOut[4] = null;
    }

    Computer(String computerName, String cpu, String ram, String ssd) {
        stOut[0] = computerName;
        stOut[1] = cpu;
        stOut[2] = ram;
        stOut[3] = ssd;
        stOut[4] = null;
    }

    Computer(String computerName, String cpu, String ram, String ssd, String gpu) {
        stOut[0] = computerName;
        stOut[1] = cpu;
        stOut[2] = ram;
        stOut[3] = ssd;
        stOut[4] = gpu;
    }

    public void stringOut() {
        for(int i = 0; i < stOut.length; i++) {
            if(stOut[i] == null) {
                stOut[i] = "조립중입니다.";
            }
        }

        for(String val : stOut) {
            System.out.println(val);
        }
    }

}
