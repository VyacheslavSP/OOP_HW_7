/**
 * Tablet
 */
public class Tablet extends OtherDvices implements  CommunicationFromVideoInterface {

    @Override
    public void CommunicateFromMesenge() {
        System.out.println("Планшет отправляет сообщение");

    }

    @Override
    public void doCommunicate() {
        super.doCommunicate();
        CommunicateFromMesenge();
        CommunicationFromVideo();
    }

    @Override
    public void CommunicationFromVideo() {
        System.out.println("Планшет совершает видеозвонок");
    }

}
