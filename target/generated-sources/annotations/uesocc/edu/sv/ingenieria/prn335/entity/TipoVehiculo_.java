package uesocc.edu.sv.ingenieria.prn335.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Modelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(TipoVehiculo.class)
public class TipoVehiculo_ { 

    public static volatile SingularAttribute<TipoVehiculo, Integer> idTipoVehiculo;
    public static volatile SingularAttribute<TipoVehiculo, Float> pesoMinLbs;
    public static volatile SingularAttribute<TipoVehiculo, String> descripcion;
    public static volatile ListAttribute<TipoVehiculo, Modelo> modeloList;
    public static volatile SingularAttribute<TipoVehiculo, Float> pesoMaxLbs;
    public static volatile SingularAttribute<TipoVehiculo, Integer> cantidadEjes;
    public static volatile SingularAttribute<TipoVehiculo, String> nombre;
    public static volatile SingularAttribute<TipoVehiculo, Boolean> activo;

}