package uesocc.edu.sv.ingenieria.prn335.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Marca;
import uesocc.edu.sv.ingenieria.prn335.entity.ModeloParte;
import uesocc.edu.sv.ingenieria.prn335.entity.TipoVehiculo;
import uesocc.edu.sv.ingenieria.prn335.entity.Vehiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, TipoVehiculo> idTipoVehiculo;
    public static volatile ListAttribute<Modelo, ModeloParte> modeloParteList;
    public static volatile SingularAttribute<Modelo, Integer> idModelo;
    public static volatile SingularAttribute<Modelo, Marca> idMarca;
    public static volatile SingularAttribute<Modelo, String> nombre;
    public static volatile SingularAttribute<Modelo, Integer> anio;
    public static volatile ListAttribute<Modelo, Vehiculo> vehiculoList;

}