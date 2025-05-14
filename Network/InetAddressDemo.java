import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getLocalHost();
            InetAddress address2 = InetAddress.getByName("www.google.co.in");
            InetAddress[] address3 = InetAddress.getAllByName("www.google.co.in");
            System.out.println(address1.getHostAddress());
            System.out.println(address1.equals(address2));
            System.out.println(address1);
            System.out.println(address2.toString());
            System.out.println(address2.getHostName());
            byte[] addBytes = address2.getAddress();
            for (int i = 0; i < addBytes.length; i++) {
                System.out.println(Integer.toBinaryString(addBytes[i] & 0xFF));// 11111111
            }
            for (InetAddress address : address3)
            System.out.println(address);
        } catch (UnknownHostException uHostException) {
            System.out.println(uHostException);
        }
    }
}
