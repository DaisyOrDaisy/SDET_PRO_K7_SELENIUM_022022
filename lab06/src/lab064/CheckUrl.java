package lab064;

public class CheckUrl {
    public static void main(String[] args) {
        String url = "https://google.com";

        String protocol=url.substring(0,url.indexOf(':'));
        String topLevelDomain=url.substring(url.lastIndexOf('.'));
        String domain=url.substring(url.lastIndexOf('/')+1,url.lastIndexOf('.'));

        System.out.println("the protocol has been used: "+protocol);
        System.out.println("the domain name :"+domain);
        System.out.println("the top level domain :"+topLevelDomain);
    }
}
