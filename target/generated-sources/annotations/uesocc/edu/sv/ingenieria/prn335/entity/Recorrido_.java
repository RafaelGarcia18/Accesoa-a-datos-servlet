package uesocc.edu.sv.ingenieria.prn335.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Viaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(Recorrido.class)
public class Recorrido_ { 

    public static volatile SingularAttribute<Recorrido, Date> horaHasta;
    public static volatile SingularAttribute<Recorrido, Date> fechaHasta;
    public static volatile SingularAttribute<Recorrido, Long> idRecorrido;
    public static volatile SingularAttribute<Recorrido, Date> horaDesde;
    public static volatile SingularAttribute<Recorrido, Date> fechaDesde;
    public static volatile SingularAttribute<Recorrido, String> coordenadaInicial;
    public static volatile SingularAttribute<Recorrido, String> coordenadaFinal;
    public static volatile SingularAttribute<Recorrido, Viaje> idReserva;

}