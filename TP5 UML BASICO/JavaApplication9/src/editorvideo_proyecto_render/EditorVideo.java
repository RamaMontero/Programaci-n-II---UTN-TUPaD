/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorvideo_proyecto_render;

/**
 *
 * @author Rama Montero
 */
public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);

        System.out.println("Exportando proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato de exportación: " + render.getFormato());
    }
}

