package structural.adapter;

public class SocketAdapter implements ThreePinSocket{
    private final TwoPinPlug twoPinPlug;

    public SocketAdapter(TwoPinPlug twoPinPlug){
        this.twoPinPlug = twoPinPlug;
    }

    @Override
    public void connect(){
        twoPinPlug.connect();;
    }

}
