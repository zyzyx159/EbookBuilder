package zyz.barqu.cookbook;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class App {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // this is fine for testing, but long term I want to pass in the yaml file as an
        // argument
        File file = new File(classLoader.getResource("obsidian test.yml").getFile());

        ObjectMapper om = new ObjectMapper(new YAMLFactory());

        try {
            Settings settings = om.readValue(file, Settings.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
