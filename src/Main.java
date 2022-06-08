import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        greatDir("D://Games/srs");
        greatDir("D://Games/srs/main");
        greatDir("D://Games/srs/test");
        greatDir("D://Games/savegames");
        greatDir("D://Games/temp");
        greatDir("D://Games/res");
        greatDir("D://Games/res/drawables");
        greatDir("D://Games/res/vectors");
        greatDir("D://Games/res/icons");
        greatFile("D://Games/srs/main/Main.java");
        greatFile("D://Games/srs/main/Utils.java");


        String text = sb.toString();
        System.out.println(text);

        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


    public static void greatDir(String name) {
        File file = new File(name);
        if (file.mkdir()) {
            sb.append("Каталог " + name + " создан; ");
        } else {
            sb.append("каталог не создан ");
        }
    }

    public static void greatFile(String fileName) {
        File myFile = new File(fileName);
        try {
            if (myFile.createNewFile())
                sb.append("Файл " + fileName + " добавлен; ");
        } catch (IOException ex) {
            sb.append("Файл не создан");
        }
    }
}