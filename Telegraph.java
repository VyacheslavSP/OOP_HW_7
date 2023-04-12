public class Telegraph extends OtherDvices  {

    @Override
    public void CommunicateFromMesenge() {
        System.out.println("Телеграф отправляет сообщение");

    }

    @Override
    public void doCommunicate() {
        super.doCommunicate();
        CommunicateFromMesenge();

    }

}
