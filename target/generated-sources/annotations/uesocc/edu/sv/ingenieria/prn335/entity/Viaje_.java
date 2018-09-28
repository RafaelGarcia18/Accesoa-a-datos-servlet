package uesocc.edu.sv.ingenieria.prn335.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Recorrido;
import uesocc.edu.sv.ingenieria.prn335.entity.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(Viaje.class)
public class Viaje_ { 

    public static volatile SingularAttribute<Viaje, Integer> fechaHasta;
    public static volatile SingularAttribute<Viaje, Date> fechaDesde;
    public static volatile SingularAttribute<Viaje, String> motorista;
    public static volatile SingularAttribute<Viaje, Date> horaLlegada;
    public static volatile SingularAttribute<Viaje, Float> kilometros;
    public static volatile SingularAttribute<Viaje, String> observaciones;
    public static volatile ListAttribute<Viaje, Recorrido> recorridoList;
    public static volatile SingularAttribute<Viaje, Reserva> reserva;
    public static volatile SingularAttribute<Viaje, Long> idReserva;
    public static volatile SingularAttribute<Viaje, Date> horaSalida;

}