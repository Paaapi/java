import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class weatherreport {
    public static void main(String[] args) {
        String[] reports = {
            "2023-10-14, Temp 25°C, Humidity: 60%, Rain: 0mm",
            "2023-10-23, Temp 24°C, Humidity: 55%, Rain: 1mm"
        };
        
        String filePath = "weather_reports.txt";
        saveReportsToFile(reports, filePath);

        System.out.println("Weather reports are saved to  " + filePath);
    }

    public static void saveReportsToFile(String[] reports, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String report : reports) {
                writer.write(report);
                writer.newLine();
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
