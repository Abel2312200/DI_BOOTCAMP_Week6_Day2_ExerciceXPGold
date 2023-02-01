public class RLVariables {
    // Declare local variable here
    private int  mySecretNumber = 10;

    public void displaySecret(){
        mySecretNumber= 45;
    }

    public static void main(){
        RLVariables notSoPrivate = new RLVariables();
        notSoPrivate.displaySecret();

        RLVariables secret = new RLVariables();

    }
}
