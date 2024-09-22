package structural.adapter;

public class ExtensionChord {
    public static void main(String[] args){
        TwoPinPlug twoPinPlug = new TwoPinPlug();
        ThreePinSocket threePinSocket = new SocketAdapter(twoPinPlug);
        threePinSocket.connect();
    }
}
