public class Main {
    public static void main(String[] args) {
        WorkWithDevices<CommunicationDevices> workWithDevices = new WorkWithDevices<>();
        workWithDevices.acton(new MobilePhone());
        workWithDevices.acton(new Tablet());
        workWithDevices.acton(new Telegraph());
        workWithDevices.acton(new StationaryPhone());
    }
}