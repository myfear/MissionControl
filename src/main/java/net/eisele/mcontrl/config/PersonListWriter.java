/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.mcontrl.config;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import net.eisele.mcontrl.entities.Person;

/**
 *
 * @author eiselem
 */
@Provider
public class PersonListWriter implements
        MessageBodyWriter<List<Person>> {

    @Override
    public boolean isWriteable(Class<?> type, Type type1, Annotation[] antns, MediaType mt) {
        return List.class.isAssignableFrom(type);
    }

    @Override
    public long getSize(List<Person> t, Class<?> type, Type type1, Annotation[] antns, MediaType mt) {
        return -1;
    }

    @Override
    public void writeTo(List<Person> t, Class<?> type, Type type1, Annotation[] antns, MediaType mt, MultivaluedMap<String, Object> mm, OutputStream out) throws IOException, WebApplicationException {

        JsonGenerator generator = Json.createGenerator(out);
        generator.writeStartArray();
        for (Person p : t) {
            generator.writeStartObject()
                    .write("id", p.getId())
                    .write("name", p.getName())
                    .write("email", p.getEmail())
                    .write("location", p.getLocation())
                    .writeEnd();
        }
        generator.flush();


    }
}
