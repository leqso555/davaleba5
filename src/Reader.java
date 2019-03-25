import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reader {
    public static void reader(String filePath){
        List<Car> cars=new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(filePath));
            String str;

            while ((str = in.readLine())!= null) {
                String[] tokens=str.split(" ");
                String category=tokens[0];
                String wheel=tokens[1];
                String model=tokens[2];
                String color=tokens[3];
                Car car=new Car(model,category,wheel,color);
                cars.add(car);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


            Collections.sort(cars, new Comparator<Car>() {
                @Override
                public int compare(Car cars1, Car cars2)
                {

                    return  cars1.getModel().compareTo(cars2.getModel());
                }
            });
        System.out.printf(String.valueOf(cars));
        }
    }



