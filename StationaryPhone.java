/**
 * StationaryPhone
 */
public class StationaryPhone extends Phone {

    @Override
    public void doCommunicate() {
        SayHelloPhone();
        super.doCommunicate();
        CommunicateFromVoice();

    }

    @Override
    public void CommunicateFromVoice() {
        System.out.println("Стационарный телефон звонит");
    }

    @Override
    public void SayHelloPhone() {
        System.out.println("Этот " + this.getClass().getName() + " говорит привет");

    }

}