package Lesson5;


public class Main {
    public static final String PATH = "/home/dios/Desktop/JavaCore/src/Lesson5/file1.csv";
    public static final String PATH2 = "/home/dios/Desktop/JavaCore/src/Lesson5/file2.csv";

    public static void main(String[] args) {
        String[] headers = {"Value1", "Value2", "Value3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(headers, data);
        //String[] otherHeaders = {"First", "Second", "Third"};
        //int[][] otherData = {{48, 33, 16}, {7, 17, 23}};

        //AppData otherAppData = new AppData(otherHeaders, otherData);
        appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);

        //AppData receivedFromOtherPathAppData = AppData.readFromFile(PATH2);
    }
}