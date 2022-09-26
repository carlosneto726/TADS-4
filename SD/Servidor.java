import java.net.DatagramPacket;

public class Servidor{
    public static void main(String[] args){
        DatagramSocket s = null;

        //try{
            s = new DatagramSocket(6789);
            byte[] buffer = new byte[1000];
            DatagramPacket req = new DatagramPacket(buffer, buffer.length);

            s.receive(req);

            System.out.println(req.getAddress()+":"+req.getPort());

            DatagramPacket resp = new DatagramPacket(req.getData(), rep.getLenght(), req.getAddress(), req.getPort());
            s.send(resp);
            

        //}catch{

        //}

    }
}