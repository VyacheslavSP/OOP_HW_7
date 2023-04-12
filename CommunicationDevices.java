public abstract class CommunicationDevices implements ActionCommunication<CommunicationDevices> {

    @Override
    public void doCommunicate() {
        System.out.println("Возможности устройства типа: " + this.getClass().toString());

    }

}
