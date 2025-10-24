/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorvideo_proyecto_render;

/**
 *
 * @author Rama Montero
 */
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Tutorial", 30);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}

