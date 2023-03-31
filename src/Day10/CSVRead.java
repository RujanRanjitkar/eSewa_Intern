package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Flight{
    String flight_id,curr_altitude_fit,destination_airport_code,dept_time,curr_location;

    public Flight(String flight_id, String curr_altitude_fit, String destination_airport_code, String dept_time, String curr_location) {
        this.flight_id = flight_id;
        this.curr_altitude_fit = curr_altitude_fit;
        this.destination_airport_code = destination_airport_code;
        this.dept_time = dept_time;
        this.curr_location = curr_location;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getCurr_altitude_fit() {
        return curr_altitude_fit;
    }

    public void setCurr_altitude_fit(String curr_altitude_fit) {
        this.curr_altitude_fit = curr_altitude_fit;
    }

    public String getDestination_airport_code() {
        return destination_airport_code;
    }

    public void setDestination_airport_code(String destination_airport_code) {
        this.destination_airport_code = destination_airport_code;
    }

    public String getDept_time() {
        return dept_time;
    }

    public void setDept_time(String dept_time) {
        this.dept_time = dept_time;
    }

    public String getCurr_location() {
        return curr_location;
    }

    public void setCurr_location(String curr_location) {
        this.curr_location = curr_location;
    }

    @Override
    public String toString() {
        return "{" +
                "flight_id='" + flight_id + '\'' +
                ", curr_altitude_fit='" + curr_altitude_fit + '\'' +
                ", dept_time='" + dept_time + '\'' +
                ", curr_location='" + curr_location + '\'' +
                '}';
    }
}

public class CSVRead {
    public static void main(String[] args) {
        String csvFile = "D:\\Intern Syllabus\\MOCK_FLIGHT_DATA1.csv";
        String line = " ";
        String csvSeparator = ",";
        int value=0;
        ArrayList<Flight> arrayList=new ArrayList<>();
      HashMap<String, ArrayList<Flight>> hashMap=new HashMap<>();
        try{
            BufferedReader reader= new BufferedReader(new FileReader(csvFile));
            while((line= reader.readLine())!=null){
                if(value>=1){
                    String[] row=line.split(csvSeparator);
                        String flight_id=row[0];
                        String curr_altitude_fit=row[1];
                        String destination_airport_code=row[2];
                        String dept_time=row[3];
                        String curr_location=row[4];
                        Flight flight=new Flight(flight_id,curr_altitude_fit,destination_airport_code,dept_time,curr_location);
                        arrayList.add(flight);
                }
                value++;
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        for(Flight flight: arrayList){
//            System.out.println(f.getFlight_id() + " " + f.getCurr_altitude_fit() + " " + f.getDestination_airport_code()+ " " + f.getDept_time() + " " + f.getCurr_location());
            ArrayList<Flight> flightInfo=hashMap.getOrDefault(flight.getDestination_airport_code(),new ArrayList<>());
            flightInfo.add(flight);
            hashMap.put(flight.getDestination_airport_code(),flightInfo);
        }

        for(Map.Entry<String,ArrayList<Flight>> map:hashMap.entrySet()){
            ArrayList<Flight> flights=map.getValue();
            System.out.println(flights.size());
            System.out.println(map.getKey() +  " " + map.getValue());
        }

    }
}
