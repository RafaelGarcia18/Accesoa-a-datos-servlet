package uesocc.edu.sv.ingenieria.prn335.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, Integer> idTipoUsuario;
    public static volatile ListAttribute<TipoUsuario, Reserva> reservaList;
    public static volatile SingularAttribute<TipoUsuario, String> appId;
    public static volatile SingularAttribute<TipoUsuario, String> observaciones;
    public static volatile SingularAttribute<TipoUsuario, String> nombre;
    public static volatile SingularAttribute<TipoUsuario, Boolean> activo;

}