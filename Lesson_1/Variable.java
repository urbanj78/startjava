public class Variable {
    public static void main(String[] args) {
        byte digitCapacity = 64;
        System.out.println("Разрядность ОС - " + digitCapacity + " bit");

        short physicalMemory = 12249;
        System.out.println("Объем физической памяти - " + physicalMemory + " MB");

        int numOfCpus = 1;
        System.out.println("Количество процессоров - " + numOfCpus);

        long numOfCores = 4;
        System.out.println("Количество ядер - " + numOfCores);

        float cpuFreq = 2.8f;
        System.out.println("Частота процессора - " + cpuFreq + " MHz");

        double perfIndex = 7.4d;
        System.out.println("Индекс производительности - " + perfIndex);

        char sysDiskLetter = 'C';
        System.out.println("Буква системного диска - " + sysDiskLetter + ":");

        boolean swithedOn = true;
        System.out.println("Включено питание - " + swithedOn);
    }
}