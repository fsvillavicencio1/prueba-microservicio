package ec.edu.utpl.sic.gp.microservicio.dto;
import java.io.Serializable;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;


@Entity
@Table(name = "denuncias")
public class Denuncia implements Serializable{
	private static final long serialVersionUID = 4894729030347835498L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String tipo;
    private String ubicacion;
    private String descripcion;
    private String estado;
    private String url;
    
    public Denuncia() {}

    public Denuncia(Long id, String tipo, String ubicacion, String descripcion, String estado, String url) {
        super();
    	this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Denuncia [id=");
        builder.append(id);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", ubicacion=");
        builder.append(ubicacion);
        builder.append(", descripcion=");
        builder.append(descripcion);
        builder.append(", estado=");
        builder.append(estado);
        builder.append(", url=");
        builder.append(url);
        builder.append("]");
        return builder.toString();
    }
}