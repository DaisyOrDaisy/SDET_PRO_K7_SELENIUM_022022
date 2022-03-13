package lab064;

public class CheckUrl {
    public static void main(String[] args) {
        String url = "https://google.com",protocol="",domain="";
        int i=0;
        // extract ten gia thuc
        while (url.charAt(i)!=':'){
            protocol=protocol.concat(Character.toString(url.charAt(i)));
            i++;
        }
        // bo qua phan giua dia chi
        while (url.charAt(i)!='.'){
            i++;
        }
        i++;//bo qua dau '.'
        // extract ten mien
        while(i<url.length()){
            domain=domain.concat(Character.toString(url.charAt(i)));
            i++;
        }

        System.out.println("the protocol has been used: "+protocol);
        System.out.println("the domain name :"+domain);
    }
}
