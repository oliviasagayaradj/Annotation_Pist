import java.io.*;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.processing.Filer;

public class organization {
    public static void main(String [] args) throws Exception {
            File file = new File("test.txt");
            Scanner br = new Scanner(new FileReader(file));
            List<String> list = new ArrayList<>();
            String ID = br.next();
            String start_codon = br.next();
            String stop_codon = br.next();

            Matcher matcher = Pattern.normalizedPattern(ID, start_codon, stop_codon).matcher(br.next());
            if(matcher.matches()) {
                System.out.println(ID);
            }
        }
    }

            /*
            try {
            while(br.hasNextLine()) {
                if(ID == start_codon && stop_codon) {
                    String [] IDs = br.nextLine().split("\\s");
                    for (String x : IDs) {
                        list.add(String.parseBoolean(x));
                    }
                    break;
                }
                br.nextLine();
            }
            System.out.println(list);
        }


        //Declare string variable 
        String ID = br.nextLine();
        boolean boolean_ID = Boolean.parseBoolean(ID);

        String start_codon = br.nextLine();
        boolean boolean_start_codon = Boolean.parseBoolean(start_codon);

        String stop_codon = br.nextLine();
        boolean boolean_stop_codon = Boolean.parseBoolean(stop_codon);


        while (boolean_ID = br.readLine() != null) {
            if (boolean_ID = br.ready() == boolean_start_codon && boolean_start_codon) {
                System.out.println(ID);
                break;
            }
        }*/
