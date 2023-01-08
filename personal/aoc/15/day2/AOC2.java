import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class AOC2 {
    public static int calculateExtraPaper(String l, String w, String h){
        int length = Integer.parseInt(l);
        int width = Integer.parseInt(w);
        int height = Integer.parseInt(h);

        int extraPaper = 0;
        // System.out.printf("%d %d %d \n", length, width, height);



        return extraPaper;
    }
    public static void main(String[] args){
        ArrayList<String> data = new ArrayList<>();
        int paperRequired = 0;
        try {
            File input = new File("input.txt");
            Scanner Reader = new Scanner(input);

            for (int i = 0; Reader.hasNextLine(); i++) {
                int l, w, h;
                String inputLine = Reader.nextLine();
                String[] dimensions = inputLine.split("x");
                paperRequired += calculateExtraPaper(dimensions[0] , dimensions[1], dimensions[2]);
            }

            Reader.close();
        } catch (FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }

}
