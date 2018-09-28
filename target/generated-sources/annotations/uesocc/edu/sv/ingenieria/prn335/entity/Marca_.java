package uesocc.edu.sv.ingenieria.prn335.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.ingenieria.prn335.entity.Modelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-13T18:06:37")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, String> descripcion;
    public static volatile ListAttribute<Marca, Modelo> modeloList;
    public static volatile SingularAttribute<Marca, Integer> idMarca;
    public static volatile SingularAttribute<Marca, String> nombre;
    public static volatile SingularAttribute<Marca, Boolean> activo;

}