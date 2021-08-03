package json;

import com.google.gson.Gson;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Json {
    private Gson gson;

    public Json(){
        this.gson = new Gson();
    }

    public void saveJson(Persona persona, String ruta){
        try {

            Writer writer = Files.newBufferedWriter(Paths.get(ruta));
            gson.toJson(persona, writer);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Persona readJson(String ruta){
        Persona persona = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(ruta));
            persona = gson.fromJson(reader, Persona.class);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return persona;

    }


}
