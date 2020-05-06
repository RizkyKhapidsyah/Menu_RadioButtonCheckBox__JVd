package com.rk.rbcm;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JMenuBar A;

    public FormUtama() {
        super("Rizky Khapidsyah");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        A = new JMenuBar();

        aturCheckBoxMenu();
        aturRadioButtonMenu();

        setJMenuBar(A);

        setPreferredSize(new Dimension(500,200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void aturCheckBoxMenu() {
        JMenu B;
        JCheckBoxMenuItem C, D;

        B = new JMenu("File");

        D = new JCheckBoxMenuItem("Buka");
        B.add(D);

        C = new JCheckBoxMenuItem("Simpan");
        B.add(C);

        A.add(B);
    }

    public void aturRadioButtonMenu() {
        JMenu E;
        JRadioButtonMenuItem F, G, H;
        ButtonGroup I;

        E = new JMenu("Bantuan");
        I = new ButtonGroup();

        F = new JRadioButtonMenuItem("Hubungi Programmer");
        I.add(F);
        E.add(F);

        G = new JRadioButtonMenuItem("Tentang Program Ini");
        I.add(G);
        E.add(G);

        H = new JRadioButtonMenuItem("Keluar");
        I.add(H);
        E.add(H);

        A.add(E);
    }

}
