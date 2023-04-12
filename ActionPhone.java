/**
 * ActionPhone
 */
public interface ActionPhone extends ActionCommunication<CommunicationDevices>,CommunicateFromVoiceInterface {
    void SayHelloPhone();    // метод чтоб интерфейс был не пустым
}