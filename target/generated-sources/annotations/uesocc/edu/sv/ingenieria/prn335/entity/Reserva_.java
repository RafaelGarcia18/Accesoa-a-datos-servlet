package uesocc.edu.sv.ingenieria.prn335.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.EstadoReserva;
import uesocc.edu.sv.ingenieria.prn335.entity.TipoUsuario;
import uesocc.edu.sv.ingenieria.prn335.entity.Vehiculo;
import uesocc.edu.sv.ingenieria.prn335.entity.Viaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, String> cliente;
    public static volatile SingularAttribute<Reserva, String> unidad;
    public static volatile ListAttribute<Reserva, EstadoReserva> estadoReservaList;
    public static volatile SingularAttribute<Reserva, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Reserva, TipoUsuario> idTipoUsuario;
    public static volatile SingularAttribute<Reserva, Date> fechaSolicitada;
    public static volatile SingularAttribute<Reserva, Viaje> viaje;
    public static volatile SingularAttribute<Reserva, Long> idReserva;
    public static volatile SingularAttribute<Reserva, Date> fechaReserva;

}