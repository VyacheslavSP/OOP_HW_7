public class MobilePhone extends Phone implements CommunicateFromMesengeInterface {

    @Override
    public void CommunicateFromVoice() {
        System.out.println("Телефон звонит");

    }

    @Override
    public void doCommunicate() {
        
        super.doCommunicate();
        SayHelloPhone();
        CommunicateFromMesenge();
        CommunicateFromVoice();

    }

    @Override
    public void CommunicateFromMesenge() {
        System.out.println("Телефон отправляет сообщение");

    }

    @Override
    public void SayHelloPhone() {
       System.out.println("Этот " + this.getClass().getName()+ " говорит привет");
        
    }

}
