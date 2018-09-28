package uesocc.edu.sv.ingenieria.prn335.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.TipoEstadoVehiculo;
import uesocc.edu.sv.ingenieria.prn335.entity.Vehiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(EstadoVehiculo.class)
public class EstadoVehiculo_ { 

    public static volatile SingularAttribute<EstadoVehiculo, Date> fecha;
    public static volatile SingularAttribute<EstadoVehiculo, Boolean> estadoActual;
    public static volatile SingularAttribute<EstadoVehiculo, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<EstadoVehiculo, TipoEstadoVehiculo> idTipoEstadoVehiculo;
    public static volatile SingularAttribute<EstadoVehiculo, Long> idEstadoVehiculo;

}