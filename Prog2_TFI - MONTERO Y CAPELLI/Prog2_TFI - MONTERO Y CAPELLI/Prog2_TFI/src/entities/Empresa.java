/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Rama Montero
 */
public class Empresa {

    private Long id;
    private Boolean eliminado;
    private String razonSocial;
    private String cuit;
    private String actividadPrincipal;
    private String email;

    // Relación 1→1 unidireccional
    private DomicilioFiscal domicilioFiscal;

    // Constructor vacío 
    public Empresa() {
        this.eliminado = false; 
    }

    // Constructor completo
    public Empresa(Long id, String razonSocial, String cuit,
                   String actividadPrincipal, String email,
                   DomicilioFiscal domicilioFiscal) {

        this.id = id;
        this.eliminado = false;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.actividadPrincipal = actividadPrincipal;
        this.email = email;
        this.domicilioFiscal = domicilioFiscal;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getEliminado() { return eliminado; }
    public void setEliminado(Boolean eliminado) { this.eliminado = eliminado; }

    public String getRazonSocial() { return razonSocial; }
    public void setRazonSocial(String razonSocial) { this.razonSocial = razonSocial; }

    public String getCuit() { return cuit; }
    public void setCuit(String cuit) { this.cuit = cuit; }

    public String getActividadPrincipal() { return actividadPrincipal; }
    public void setActividadPrincipal(String actividadPrincipal) { this.actividadPrincipal = actividadPrincipal; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public DomicilioFiscal getDomicilioFiscal() { return domicilioFiscal; }
    public void setDomicilioFiscal(DomicilioFiscal domicilioFiscal) { this.domicilioFiscal = domicilioFiscal; }

    // toString sin recursión
    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", actividadPrincipal='" + actividadPrincipal + '\'' +
                ", email='" + email + '\'' +
                ", domicilioFiscal=" + (domicilioFiscal != null ? domicilioFiscal.getId() : null) +
                '}';
    }
}
