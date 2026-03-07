package Level1.ReversedString;

public class ReversedString implements CharSequence {

    private String string;

    public ReversedString(String string){
        this.string = reverse(string);
    }

    @Override
    public int length(){
        return string.length();
    }

    private String reverse(String string){

        String reversedString = "";

        for(int i = string.length() - 1; i >= 0 ; i--){
            reversedString += string.charAt(i);
        }

        return reversedString;
    }

    @Override
    public char charAt(int index){
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end){
        return string.subSequence(start, end);
    }

    public String getString(){
        return string;
    }
}
