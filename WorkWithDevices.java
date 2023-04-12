public class WorkWithDevices<T extends CommunicationDevices> {
    public void acton(ActionCommunication<T> action) {
        action.doCommunicate();
    }
}
