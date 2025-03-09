package InterfazYMain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterfazPlaylist extends JFrame {
    final private Font fuente = new Font("Sergoe print", Font.BOLD, 18);
    
    public void iniciar() {
        setTitle("Reproductor de Música");
        setSize(400, 600);
        setMinimumSize(new Dimension(300, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        
        // Icono de la música
        JLabel lbIcono = new JLabel("♪", SwingConstants.CENTER);
        lbIcono.setFont(new Font("Sergoe UI", Font.BOLD, 50));
        panel.add(lbIcono, BorderLayout.NORTH);
        
        // Controles de reproducción
        JPanel panelControles = new JPanel();
        panelControles.setLayout(new GridLayout(1, 3, 5, 5));
        
        JButton btnPrev = new JButton("⏮"); // Botón Anterior
        btnPrev.setFont(fuente);
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la función para ir a la canción anterior
            }
        });
        
        JButton btnPlayPause = new JButton("⏯"); // Botón Play/Pausa
        btnPlayPause.setFont(fuente);
        btnPlayPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la función para reproducir/pausar
            }
        });
        
        JButton btnNext = new JButton("⏭"); // Botón Siguiente
        btnNext.setFont(fuente);
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la función para ir a la siguiente canción
            }
        });
        
        panelControles.add(btnPrev);
        panelControles.add(btnPlayPause);
        panelControles.add(btnNext);
        panel.add(panelControles, BorderLayout.CENTER);
        
        // Barra de progreso
        JSlider slider = new JSlider(0, 100, 0);
        panel.add(slider, BorderLayout.SOUTH);
        
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        InterfazPlaylist miReproductor = new InterfazPlaylist();
        miReproductor.iniciar();
    }
}
