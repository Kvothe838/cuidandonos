package test;

import db.EntityManagerHelper;
import entities.Direccion;
import entities.Persona;
import entities.Usuario;
import entities.Viaje;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PersistenciaTest {
    @Test
    @Ignore
    public void peristirViaje(){
        Direccion origen = new Direccion("Rivadavia", 3000);
        Direccion destino = new Direccion("Bolivia", 0);
        Persona transeunte = new Persona("Juan", "Perez");
        Persona cuidador = new Persona("Pedro", "Aranjuez");
        Viaje viaje = new Viaje(origen, destino, Arrays.asList(cuidador), transeunte);

        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(viaje);

        EntityManagerHelper.commit();
    }

    @Test
    @Ignore
    public void recuperarViaje(){
        ArrayList<Viaje> viajes = (ArrayList<Viaje>)EntityManagerHelper.createQuery("FROM viaje ");
        Assert.assertEquals(1, viajes.size());
    }
}
