public class Hospital {

    public static void main(String[] args) {

        //double[] hospital = new double[2];
        double[] hospital = {36.6, 36.8, 32.0, 36.9, 40.0, 37.2, 38.1, 39.6, 39.9, 36.2, 36.6, 36.8, 39.9, 40.0, 32.6, 36.7, 39.9, 37.3, 38.4, 36.3, 33.5, 38.0, 39.4, 36.7, 40.0, 33.8, 39.3, 36.4, 36.8, 40.0};
        System.out.println(hospital.length);
        double sumTemperature = 0;
        int countGoodHealth = 0;
        for (int i = 0; i < hospital.length; i++) {
            sumTemperature += hospital[i];
            if (hospital[i] >= 36.2 && hospital[i] <= 36.9) {
                countGoodHealth++;
            }
        }
        double middleTemperature = (Math.round(sumTemperature * 1.0) / 1.0) / hospital.length;
        System.out.println("Hospital average body temperature = " + middleTemperature);
        System.out.println("The number of healthy people: " + countGoodHealth + " peoples");

    }
}
