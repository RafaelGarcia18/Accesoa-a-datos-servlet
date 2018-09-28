package uesocc.edu.sv.ingenieria.prn335.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Reserva;
import uesocc.edu.sv.ingenieria.prn335.entity.TipoEstadoReserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(EstadoReserva.class)
public class EstadoReserva_ { 

    public static volatile SingularAttribute<EstadoReserva, Date> fecha;
    public static volatile SingularAttribute<EstadoReserva, Boolean> actual;
    public static volatile SingularAttribute<EstadoReserva, String> responsable;
    public static volatile SingularAttribute<EstadoReserva, TipoEstadoReserva> idTipoEstadoReserva;
    public static volatile SingularAttribute<EstadoReserva, String> observaciones;
    public static volatile SingularAttribute<EstadoReserva, Long> idEstadoReserva;
    public static volatile SingularAttribute<EstadoReserva, Reserva> idReserva;

}