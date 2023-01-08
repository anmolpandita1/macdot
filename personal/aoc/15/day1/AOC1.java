import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AOC1 {
    public static void main(String[] args){
        String data = "";
        try {
            File input = new File("input.txt");
            Scanner Reader = new Scanner(input);

            while(Reader.hasNext()){
                data = Reader.nextLine();
            }
            Reader.close();
        } catch (FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        }

        int floor = 0;
        int posBasementChar = 0;
        boolean calculated = false;
        for(int i = 0; i < data.length(); i++){
            if (floor == -1 && calculated == false)  {
                posBasementChar = i;
                calculated = true;
            }
            if(data.charAt(i) == '(') {
                floor++;
            } else {
                floor--;
            }

        }

      System.out.println("floor: " + floor);
      System.out.println("posBasementChar: " + posBasementChar);

    }
}
