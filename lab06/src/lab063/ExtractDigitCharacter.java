package lab063;

public class ExtractDigitCharacter {
    public static void main(String[] args) {
        String myStr = "100 tfy657y8,7minutes",newString="";
        for (int i = 0; i < myStr.length(); i++) {
            char kt= myStr.charAt(i);
            if (Character.isDigit(kt)){
                //System.out.println(kt);
                newString=newString.concat(Character.toString(kt));
            }
        }
        System.out.println("extract result: "+newString);
    }
}