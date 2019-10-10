import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        System.out.println(new Event());
        String host = args[0];
        Integer port = Integer.valueOf(args[1]);
        int incr = 0;
        System.out.println(host + port);
        InetSocketAddress address = new InetSocketAddress(host, port);

        SocketChannel socket = SocketChannel.open(address);
        while (true) {
            System.out.println(" enter number events");
            Scanner s = new Scanner(System.in);
            if (s.hasNextInt()) {
                int numEvent = s.nextInt();

                for (int i = 1; i < numEvent; i++) {
                    if (incr == 300) {
                        Thread.sleep(2000);
                        incr = 0;
                    }
                    Event event = new Event();
                    System.out.println(event);
                    ByteBuffer buffer = ByteBuffer.wrap(event.toString().getBytes());
                    socket.write(buffer);
                    incr++;
                }
                System.out.println("done");//
            }
        }
    }


}
