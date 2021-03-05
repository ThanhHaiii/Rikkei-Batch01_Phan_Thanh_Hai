package Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

public class MapEmployees {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader(file_name);
        BufferedReader bf = new BufferedReader(f);


        Map<Integer, String> emloyee = new HashMap<>();

            while (true) {
                String em = bf.readLine();
                if (em == null || em == "") {
                    break;
                }
                String[] t = em.split("[;]");
                String name = t[0];
                String age = t[1];
                String address = t[2];
                emloyee.put(1, name);
                emloyee.put(2, age);
                emloyee.put(3, address);
            }
            for (Integer k : emloyee.keySet()) {
                System.out.println(emloyee.get(k));
            }
        }
    public static final String file_name = "src/Files/Employees.csv";
    }
