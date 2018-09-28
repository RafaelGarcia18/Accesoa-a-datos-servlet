package uesocc.edu.sv.ingenieria.prn335.control;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.ingenieria.prn335.entity.Marca;

@LocalBean
@Stateless
public class Utilidades {

    @PersistenceContext(unitName = "uesocc.edu.sv.ingenieria.prn335_AntesDelParcial_war_1.0-SNAPSHOTPU")
    private EntityManager manager;

    public List findMarca() throws Exception {
        Query consulta = manager.createQuery("select todo.nombre from Marca todo");
        return consulta.getResultList();
    }

    public List findByCampos(String busqueda) throws Exception {
        Query consulta2 = manager.createQuery("select o from Marca o where (o.descripcion like " + busqueda + " ");
        return consulta2.getResultList();
    }

    public void insert(Marca entity) throws Exception {
        manager.persist(entity);
    }

    public void delete(Marca entity) throws Exception {
        manager.remove(entity);
    }

    public void update(Marca entity) throws Exception {
        manager.merge(entity);
    }
}
