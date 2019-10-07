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

public class Main {
    public static void main(String[] args) throws IOException {
        String host = args[0];
        Integer port = Integer.valueOf(args[1]);
        System.out.println(host + port);
        InetSocketAddress address = new InetSocketAddress(host, port);

        SocketChannel socket = SocketChannel.open(address);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("product\t")
                .append("132\t")
                .append("2019-05-07\t")
                .append("category\t")
                .append("192.168.1.1")
                .append("\n");

        System.out.println(stringBuilder.toString());
        ByteBuffer buffer = ByteBuffer.wrap(stringBuilder.toString().getBytes());
        socket.write(buffer);

//
//        String fileName = "src/main/resources/cars.csv";
////        Path myPath = Paths.get(fileName);
//
//        List<Event> cars = new ArrayList<>();
//        cars.add(new Event("product", "123", "2019-05-01","cat","192.168.1.1"));
//        cars.add(new Event("product2", "1234", "2019-06-01","cat","192.168.1.2"));
//
//
//        try (BufferedWriter writer = Files.newBufferedWriter(File.createTempFile("events",".csv").toPath(),
//                StandardCharsets.UTF_8)) {
//
//            StatefulBeanToCsv<Event> beanToCsv = new StatefulBeanToCsvBuilder(writer)
//                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
//                    .build();
//
//
//            beanToCsv.write(cars);
//            socket.write(writer);
//// byteBuffer.put(lineStr.getBytes());
//
//        } catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException |
//                IOException ex) {
//
//        }
    }



}
