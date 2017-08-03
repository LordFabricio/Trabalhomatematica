/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomatematica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ftlor
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    String conA;
    String conB;
    char[] letrasA = null;
    char[] letrasB = null;
    ArrayList<Character> ALuniao = new ArrayList();
    ArrayList<Character> ALinter = new ArrayList();
    ArrayList<Character> ALamenosb = new ArrayList();
    ArrayList<Character> ALbmenosa = new ArrayList();
    int tamA;
    int tamB;
    int tamC;
    int cbt1 = 0;
    int cbt2 = 0;
    int cbt3 = 0;
    int cbt4 = 0;
    Font nf = new Font("Arial Black", Font.BOLD, 36);
    Font nf2 = new Font("Arial", Font.BOLD, 12);

    //Variavel teste
    boolean ta = false;
    boolean tb = false;
    boolean tc = false;
    boolean td = false;
    boolean te = false;
    boolean tf = false;
    boolean tg = false;
    boolean th = false;
    boolean ti = false;
    boolean tj = false;
    boolean tk = false;
    boolean tl = false;
    boolean tm = false;
    boolean tn = false;
    boolean to = false;
    boolean tp = false;
    boolean tq = false;
    boolean tr = false;
    boolean ts = false;
    boolean tt = false;
    boolean tu = false;
    boolean tv = false;
    boolean tw = false;
    boolean tx = false;
    boolean ty = false;
    boolean tz = false;
    boolean ta1 = false;
    boolean tb1 = false;
    boolean tc1 = false;
    boolean td1 = false;
    boolean te1 = false;
    boolean tf1 = false;
    boolean tg1 = false;
    boolean th1 = false;
    boolean ti1 = false;
    boolean tj1 = false;
    boolean tk1 = false;
    boolean tl1 = false;
    boolean tm1 = false;
    boolean tn1 = false;
    boolean to1 = false;
    boolean tp1 = false;
    boolean tq1 = false;
    boolean tr1 = false;
    boolean ts1 = false;
    boolean tt1 = false;
    boolean tu1 = false;
    boolean tv1 = false;
    boolean tw1 = false;
    boolean tx1 = false;
    boolean ty1 = false;
    boolean tz1 = false;

    public Tela() {
        initComponents();
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
        g.setVisible(false);
        h.setVisible(false);
        i.setVisible(false);
        j.setVisible(false);
        k.setVisible(false);
        l.setVisible(false);
        m.setVisible(false);
        n.setVisible(false);
        o.setVisible(false);
        p.setVisible(false);
        q.setVisible(false);
        r.setVisible(false);
        s.setVisible(false);
        t.setVisible(false);
        u.setVisible(false);
        v.setVisible(false);
        w.setVisible(false);
        y.setVisible(false);
        x.setVisible(false);
        z.setVisible(false);
        a1.setVisible(false);
        b1.setVisible(false);
        c1.setVisible(false);
        d1.setVisible(false);
        e1.setVisible(false);
        f1.setVisible(false);
        g1.setVisible(false);
        h1.setVisible(false);
        i1.setVisible(false);
        j1.setVisible(false);
        k1.setVisible(false);
        l1.setVisible(false);
        m1.setVisible(false);
        n1.setVisible(false);
        o1.setVisible(false);
        p1.setVisible(false);
        q1.setVisible(false);
        r1.setVisible(false);
        s1.setVisible(false);
        t1.setVisible(false);
        u1.setVisible(false);
        v1.setVisible(false);
        w1.setVisible(false);
        y1.setVisible(false);
        x1.setVisible(false);
        z1.setVisible(false);
        a3.setVisible(false);
        b3.setVisible(false);
        c3.setVisible(false);
        d3.setVisible(false);
        e3.setVisible(false);
        f3.setVisible(false);
        g3.setVisible(false);
        h3.setVisible(false);
        i3.setVisible(false);
        j3.setVisible(false);
        k3.setVisible(false);
        l3.setVisible(false);
        m3.setVisible(false);
        n3.setVisible(false);
        o3.setVisible(false);
        p3.setVisible(false);
        q3.setVisible(false);
        r3.setVisible(false);
        s3.setVisible(false);
        t3.setVisible(false);
        u3.setVisible(false);
        v3.setVisible(false);
        w3.setVisible(false);
        y3.setVisible(false);
        x3.setVisible(false);
        z3.setVisible(false);
        fecha.setVisible(false);
        abre.setVisible(false);
        result.setVisible(false);
        textobts.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        ConteudoB = new javax.swing.JTextField();
        ConteudoA = new javax.swing.JTextField();
        z3 = new javax.swing.JLabel();
        y3 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        u3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        k3 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        z1 = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        u1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        textoA = new javax.swing.JLabel();
        textoB = new javax.swing.JLabel();
        conjuntoA = new javax.swing.JLabel();
        conjuntoB = new javax.swing.JLabel();
        uniao = new javax.swing.JLabel();
        inter = new javax.swing.JLabel();
        amb = new javax.swing.JLabel();
        bma = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        abre = new javax.swing.JLabel();
        per = new javax.swing.JTextField();
        textcona = new javax.swing.JLabel();
        textconb = new javax.swing.JLabel();
        pertence = new javax.swing.JLabel();
        fundopertence = new javax.swing.JPanel();
        fundoconjunto = new javax.swing.JPanel();
        fundobotao = new javax.swing.JPanel();
        textobts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matematica - Conjuntos");
        setIconImages(null);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setEditable(false);
        result.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        result.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        result.setBorder(null);
        jPanel1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 570, -1));

        ConteudoB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ConteudoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConteudoBKeyPressed(evt);
            }
        });
        jPanel1.add(ConteudoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 390, -1));

        ConteudoA.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ConteudoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConteudoAKeyPressed(evt);
            }
        });
        jPanel1.add(ConteudoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 390, -1));

        z3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        z3.setText("z");
        z3.setToolTipText("");
        jPanel1.add(z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        y3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        y3.setText("y");
        y3.setToolTipText("");
        jPanel1.add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        x3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        x3.setText("x");
        x3.setToolTipText("");
        jPanel1.add(x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        w3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        w3.setText("w");
        w3.setToolTipText("");
        jPanel1.add(w3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        v3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        v3.setText("V");
        v3.setToolTipText("");
        jPanel1.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        u3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        u3.setText("u");
        u3.setToolTipText("");
        jPanel1.add(u3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        t3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        t3.setText("t");
        t3.setToolTipText("");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        s3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        s3.setText("s");
        s3.setToolTipText("");
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        r3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        r3.setText("r");
        r3.setToolTipText("");
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        q3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        q3.setText("q");
        q3.setToolTipText("");
        jPanel1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        p3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p3.setText("p");
        p3.setToolTipText("");
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        o3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        o3.setText("o");
        o3.setToolTipText("");
        jPanel1.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        n3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        n3.setText("n");
        n3.setToolTipText("");
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        m3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        m3.setText("m");
        m3.setToolTipText("");
        jPanel1.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        l3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        l3.setText("l");
        l3.setToolTipText("");
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        k3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        k3.setText("k");
        k3.setToolTipText("");
        jPanel1.add(k3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        j3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        j3.setText("j");
        j3.setToolTipText("");
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        i3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        i3.setText("i");
        i3.setToolTipText("");
        jPanel1.add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        h3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        h3.setText("h");
        h3.setToolTipText("");
        jPanel1.add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        g3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        g3.setText("g");
        g3.setToolTipText("");
        jPanel1.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        f3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        f3.setText("f");
        f3.setToolTipText("");
        jPanel1.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        e3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        e3.setText("e");
        e3.setToolTipText("");
        jPanel1.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        d3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        d3.setText("d");
        d3.setToolTipText("");
        jPanel1.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        c3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        c3.setText("c");
        c3.setToolTipText("");
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        b3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b3.setText("b");
        b3.setToolTipText("");
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        a3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        a3.setText("a");
        a3.setToolTipText("");
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        z.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        z.setText("z");
        z.setToolTipText("");
        jPanel1.add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        y.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        y.setText("y");
        y.setToolTipText("");
        jPanel1.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        x.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        x.setText("x");
        x.setToolTipText("");
        jPanel1.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        w.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        w.setText("w");
        w.setToolTipText("");
        jPanel1.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        v.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        v.setText("v");
        v.setToolTipText("");
        jPanel1.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        u.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        u.setText("u");
        u.setToolTipText("");
        jPanel1.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        t.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        t.setText("t");
        t.setToolTipText("");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        s.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        s.setText("s");
        s.setToolTipText("");
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        r.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        r.setText("r");
        r.setToolTipText("");
        jPanel1.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        q.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        q.setText("q");
        q.setToolTipText("");
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        p.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p.setText("p");
        p.setToolTipText("");
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        o.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        o.setText("o");
        o.setToolTipText("");
        jPanel1.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        n.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        n.setText("n");
        n.setToolTipText("");
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        m.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        m.setText("m");
        m.setToolTipText("");
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        l.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        l.setText("l");
        l.setToolTipText("");
        jPanel1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        k.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        k.setText("K");
        k.setToolTipText("");
        jPanel1.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        j.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        j.setText("j");
        j.setToolTipText("");
        jPanel1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        i.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        i.setText("i");
        i.setToolTipText("");
        jPanel1.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        h.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        h.setText("h");
        h.setToolTipText("");
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        g.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        g.setText("g");
        g.setToolTipText("");
        jPanel1.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        f.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        f.setText("f");
        f.setToolTipText("");
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        e.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        e.setText("e");
        e.setToolTipText("");
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        d.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        d.setText("d");
        d.setToolTipText("");
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        c.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        c.setText("c");
        c.setToolTipText("");
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        b.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b.setText("b");
        b.setToolTipText("");
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        a.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        a.setText("a");
        a.setToolTipText("");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        z1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        z1.setText("z");
        z1.setToolTipText("");
        jPanel1.add(z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        y1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        y1.setText("Y");
        y1.setToolTipText("");
        jPanel1.add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        x1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        x1.setText("x");
        x1.setToolTipText("");
        jPanel1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        w1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        w1.setText("w");
        w1.setToolTipText("");
        jPanel1.add(w1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        v1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        v1.setText("v");
        v1.setToolTipText("");
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        u1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        u1.setText("u");
        u1.setToolTipText("");
        jPanel1.add(u1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        t1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        t1.setText("t");
        t1.setToolTipText("");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        s1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        s1.setText("s");
        s1.setToolTipText("");
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        r1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        r1.setText("r");
        r1.setToolTipText("");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        q1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        q1.setText("q");
        q1.setToolTipText("");
        jPanel1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        p1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p1.setText("p");
        p1.setToolTipText("");
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        o1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        o1.setText("o");
        o1.setToolTipText("");
        jPanel1.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        n1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        n1.setText("N");
        n1.setToolTipText("");
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        m1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        m1.setText("n");
        m1.setToolTipText("");
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        l1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        l1.setText("l");
        l1.setToolTipText("");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        k1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        k1.setText("k");
        k1.setToolTipText("");
        jPanel1.add(k1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        j1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        j1.setText("j");
        j1.setToolTipText("");
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        i1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        i1.setText("i");
        i1.setToolTipText("");
        jPanel1.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        h1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        h1.setText("h");
        h1.setToolTipText("");
        jPanel1.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        g1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        g1.setText("g");
        g1.setToolTipText("");
        jPanel1.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        f1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        f1.setText("f");
        f1.setToolTipText("");
        jPanel1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        e1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        e1.setText("e");
        e1.setToolTipText("");
        jPanel1.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        d1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        d1.setText("d");
        d1.setToolTipText("");
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        c1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        c1.setText("c");
        c1.setToolTipText("");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        b1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b1.setText("b");
        b1.setToolTipText("");
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        a1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        a1.setText("a");
        a1.setToolTipText("");
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        textoA.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoA.setForeground(new java.awt.Color(255, 255, 0));
        textoA.setText("A");
        jPanel1.add(textoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        textoB.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textoB.setForeground(new java.awt.Color(255, 255, 0));
        textoB.setText("B");
        jPanel1.add(textoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        conjuntoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/circuloe.png"))); // NOI18N
        jPanel1.add(conjuntoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        conjuntoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/circulod.png"))); // NOI18N
        jPanel1.add(conjuntoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 380, 370));

        uniao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/uniao.png"))); // NOI18N
        uniao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uniaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uniaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uniaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uniaoMousePressed(evt);
            }
        });
        jPanel1.add(uniao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        inter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/inter.png"))); // NOI18N
        inter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                interMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                interMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                interMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                interMousePressed(evt);
            }
        });
        jPanel1.add(inter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        amb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/a-b.png"))); // NOI18N
        amb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ambMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ambMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ambMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ambMousePressed(evt);
            }
        });
        jPanel1.add(amb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        bma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/b-a.png"))); // NOI18N
        bma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bmaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bmaMousePressed(evt);
            }
        });
        jPanel1.add(bma, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        fecha.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        fecha.setText("}");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, -1, -1));

        abre.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        abre.setText("{");
        jPanel1.add(abre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        per.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        per.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        per.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                perKeyPressed(evt);
            }
        });
        jPanel1.add(per, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 30, -1));

        textcona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textcona.setText("Conjunto A :");
        jPanel1.add(textcona, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        textconb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textconb.setText("Conjunto B :");
        jPanel1.add(textconb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        pertence.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pertence.setText("A qual conjunto pertence :");
        jPanel1.add(pertence, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        fundopertence.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fundopertenceLayout = new javax.swing.GroupLayout(fundopertence);
        fundopertence.setLayout(fundopertenceLayout);
        fundopertenceLayout.setHorizontalGroup(
            fundopertenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        fundopertenceLayout.setVerticalGroup(
            fundopertenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel1.add(fundopertence, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 240, 50));

        fundoconjunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fundoconjuntoLayout = new javax.swing.GroupLayout(fundoconjunto);
        fundoconjunto.setLayout(fundoconjuntoLayout);
        fundoconjuntoLayout.setHorizontalGroup(
            fundoconjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        fundoconjuntoLayout.setVerticalGroup(
            fundoconjuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        jPanel1.add(fundoconjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 530, 90));

        fundobotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fundobotaoLayout = new javax.swing.GroupLayout(fundobotao);
        fundobotao.setLayout(fundobotaoLayout);
        fundobotaoLayout.setHorizontalGroup(
            fundobotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        fundobotaoLayout.setVerticalGroup(
            fundobotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel1.add(fundobotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 610, 60));

        textobts.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textobts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobts.setText("União");
        jPanel1.add(textobts, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 590, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConteudoAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConteudoAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            conA = ConteudoA.getText().toUpperCase();
            letrasA = conA.toCharArray();
            conB = conA;
            for (int i2 = 0; i2 < conA.length(); i2++) {
                if (letrasA[i2] == 'A') {
                    ta = true;
                    if (ta == true && ta1 == true) {
                        a3.setVisible(true);
                        a.setVisible(false);
                        a1.setVisible(false);
                    } else {
                        a.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'B') {
                    tb = true;
                    if (tb == true && tb1 == true) {
                        b3.setVisible(true);
                        b.setVisible(false);
                        b1.setVisible(false);
                    } else {
                        b.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'C') {
                    tc = true;
                    if (tc == true && tc1 == true) {
                        c3.setVisible(true);
                        c.setVisible(false);
                        c1.setVisible(false);
                    } else {
                        c.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'D') {
                    td = true;
                    if (td == true && td1 == true) {
                        d3.setVisible(true);
                        d.setVisible(false);
                        d1.setVisible(false);
                    } else {
                        d.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'E') {
                    te = true;
                    if (te == true && te1 == true) {
                        e3.setVisible(true);
                        e.setVisible(false);
                        e1.setVisible(false);
                    } else {
                        e.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'F') {
                    tf = true;
                    if (tf == true && tf1 == true) {
                        f3.setVisible(true);
                        f.setVisible(false);
                        f1.setVisible(false);
                    } else {
                        f.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'G') {
                    tg = true;
                    if (tg == true && tg1 == true) {
                        g3.setVisible(true);
                        g.setVisible(false);
                        g1.setVisible(false);
                    } else {
                        g.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'H') {
                    th = true;
                    if (th == true && th1 == true) {
                        h3.setVisible(true);
                        h.setVisible(false);
                        h1.setVisible(false);
                    } else {
                        h.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'I') {
                    ti = true;
                    if (ti == true && ti1 == true) {
                        i3.setVisible(true);
                        i.setVisible(false);
                        i1.setVisible(false);
                    } else {
                        i.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'J') {
                    tj = true;
                    if (tj == true && tj1 == true) {
                        j3.setVisible(true);
                        j.setVisible(false);
                        j1.setVisible(false);
                    } else {
                        j.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'K') {
                    tk = true;
                    if (tk == true && tk1 == true) {
                        k3.setVisible(true);
                        k.setVisible(false);
                        k1.setVisible(false);
                    } else {
                        k.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'L') {
                    tl = true;
                    if (tl == true && tl1 == true) {
                        l3.setVisible(true);
                        l.setVisible(false);
                        l1.setVisible(false);
                    } else {
                        l.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'M') {
                    tm = true;
                    if (tm == true && tm1 == true) {
                        m3.setVisible(true);
                        m.setVisible(false);
                        m1.setVisible(false);
                    } else {
                        m.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'N') {
                    tn = true;
                    if (tn == true && tn1 == true) {
                        n3.setVisible(true);
                        n.setVisible(false);
                        n1.setVisible(false);
                    } else {
                        n.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'O') {
                    to = true;
                    if (to == true && to1 == true) {
                        o3.setVisible(true);
                        o.setVisible(false);
                        o1.setVisible(false);
                    } else {
                        o.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'P') {
                    tp = true;
                    if (tp == true && tp1 == true) {
                        p3.setVisible(true);
                        p.setVisible(false);
                        p1.setVisible(false);
                    } else {
                        p.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'Q') {
                    tq = true;
                    if (tq == true && tq1 == true) {
                        q3.setVisible(true);
                        q.setVisible(false);
                        q1.setVisible(false);
                    } else {
                        q.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'R') {
                    tr = true;
                    if (tr == true && tr1 == true) {
                        r3.setVisible(true);
                        r.setVisible(false);
                        r1.setVisible(false);
                    } else {
                        r.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'S') {
                    ts = true;
                    if (ts == true && ts1 == true) {
                        s3.setVisible(true);
                        s.setVisible(false);
                        s1.setVisible(false);
                    } else {
                        s.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'T') {
                    tt = true;
                    if (tt == true && tt1 == true) {
                        t3.setVisible(true);
                        t.setVisible(false);
                        t1.setVisible(false);
                    } else {
                        t.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'U') {
                    tu = true;
                    if (tu == true && tu1 == true) {
                        u3.setVisible(true);
                        u.setVisible(false);
                        u1.setVisible(false);
                    } else {
                        u.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'V') {
                    tv = true;
                    if (tv == true && tv1 == true) {
                        v3.setVisible(true);
                        v.setVisible(false);
                        v1.setVisible(false);
                    } else {
                        v.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'W') {
                    tw = true;
                    if (tw == true && tw1 == true) {
                        w3.setVisible(true);
                        w.setVisible(false);
                        w1.setVisible(false);
                    } else {
                        w.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'X') {
                    tx = true;
                    if (tx == true && tx1 == true) {
                        x3.setVisible(true);
                        x.setVisible(false);
                        x1.setVisible(false);
                    } else {
                        x.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'Y') {
                    ty = true;
                    if (ty == true && ty1 == true) {
                        y3.setVisible(true);
                        y.setVisible(false);
                        y1.setVisible(false);
                    } else {
                        y.setVisible(true);
                    }
                }
                if (letrasA[i2] == 'Z') {
                    tz = true;
                    if (tz == true && tz1 == true) {
                        z3.setVisible(true);
                        z.setVisible(false);
                        z1.setVisible(false);
                    } else {
                        z.setVisible(true);
                    }
                }
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            ta = false;
            tb = false;
            tc = false;
            td = false;
            te = false;
            tf = false;
            tg = false;
            th = false;
            ti = false;
            tj = false;
            tk = false;
            tl = false;
            tm = false;
            tn = false;
            to = false;
            tp = false;
            tq = false;
            tr = false;
            ts = false;
            tt = false;
            tu = false;
            tv = false;
            tw = false;
            tx = false;
            ty = false;
            tz = false;
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
            d.setVisible(false);
            e.setVisible(false);
            f.setVisible(false);
            g.setVisible(false);
            h.setVisible(false);
            i.setVisible(false);
            j.setVisible(false);
            k.setVisible(false);
            l.setVisible(false);
            m.setVisible(false);
            n.setVisible(false);
            o.setVisible(false);
            p.setVisible(false);
            q.setVisible(false);
            r.setVisible(false);
            s.setVisible(false);
            t.setVisible(false);
            u.setVisible(false);
            v.setVisible(false);
            w.setVisible(false);
            y.setVisible(false);
            x.setVisible(false);
            z.setVisible(false);
            a3.setVisible(false);
            b3.setVisible(false);
            c3.setVisible(false);
            d3.setVisible(false);
            e3.setVisible(false);
            f3.setVisible(false);
            g3.setVisible(false);
            h3.setVisible(false);
            i3.setVisible(false);
            j3.setVisible(false);
            k3.setVisible(false);
            l3.setVisible(false);
            m3.setVisible(false);
            n3.setVisible(false);
            o3.setVisible(false);
            p3.setVisible(false);
            q3.setVisible(false);
            r3.setVisible(false);
            s3.setVisible(false);
            t3.setVisible(false);
            u3.setVisible(false);
            v3.setVisible(false);
            w3.setVisible(false);
            y3.setVisible(false);
            x3.setVisible(false);
            z3.setVisible(false);
            abre.setVisible(false);
            result.setVisible(false);
            fecha.setVisible(false);
            textobts.setVisible(false);
            ConteudoA.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_0) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            //conA = conA.substring(0,tamA-1);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_1) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_2) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_3) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_4) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_5) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_6) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_7) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_8) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_9) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COMMA) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COLON) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MINUS) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UNDERSCORE) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SLASH) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CIRCUMFLEX) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEPARATOR) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DECIMAL) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
    }//GEN-LAST:event_ConteudoAKeyPressed

    private void ConteudoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConteudoBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            conB = ConteudoB.getText().toUpperCase();
            letrasB = conB.toCharArray();
            for (int i2 = 0; i2 < conB.length(); i2++) {
                if (letrasB[i2] == 'A') {
                    ta1 = true;
                    if (ta == true && ta1 == true) {
                        a3.setVisible(true);
                        a.setVisible(false);
                        a1.setVisible(false);
                    } else {
                        a1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'B') {
                    tb1 = true;
                    if (tb == true && tb1 == true) {
                        b3.setVisible(true);
                        b.setVisible(false);
                        b1.setVisible(false);
                    } else {
                        b1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'C') {
                    tc1 = true;
                    if (tc == true && tc1 == true) {
                        c3.setVisible(true);
                        c.setVisible(false);
                        c1.setVisible(false);
                    } else {
                        c1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'D') {
                    td1 = true;
                    if (td == true && td1 == true) {
                        d3.setVisible(true);
                        d.setVisible(false);
                        d1.setVisible(false);
                    } else {
                        d1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'E') {
                    te1 = true;
                    if (te == true && te1 == true) {
                        e3.setVisible(true);
                        e.setVisible(false);
                        e1.setVisible(false);
                    } else {
                        e1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'F') {
                    tf1 = true;
                    if (tf == true && tf1 == true) {
                        f3.setVisible(true);
                        f.setVisible(false);
                        f1.setVisible(false);
                    } else {
                        f1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'G') {
                    tg1 = true;
                    if (tg == true && tg1 == true) {
                        g3.setVisible(true);
                        g.setVisible(false);
                        g1.setVisible(false);
                    } else {
                        g1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'H') {
                    th1 = true;
                    if (th == true && th1 == true) {
                        h3.setVisible(true);
                        h.setVisible(false);
                        h1.setVisible(false);
                    } else {
                        h1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'I') {
                    ti1 = true;
                    if (ti == true && ti1 == true) {
                        i3.setVisible(true);
                        i.setVisible(false);
                        i1.setVisible(false);
                    } else {
                        i1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'J') {
                    tj1 = true;
                    if (tj == true && tj1 == true) {
                        j3.setVisible(true);
                        j.setVisible(false);
                        j1.setVisible(false);
                    } else {
                        j1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'K') {
                    tk1 = true;
                    if (tk == true && tk1 == true) {
                        k3.setVisible(true);
                        k.setVisible(false);
                        k1.setVisible(false);
                    } else {
                        k1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'L') {
                    tl1 = true;
                    if (tl == true && tl1 == true) {
                        l3.setVisible(true);
                        l.setVisible(false);
                        l1.setVisible(false);
                    } else {
                        l1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'M') {
                    tm1 = true;
                    if (tm == true && tm1 == true) {
                        m3.setVisible(true);
                        m.setVisible(false);
                        m1.setVisible(false);
                    } else {
                        m1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'N') {
                    tn1 = true;
                    if (tn == true && tn1 == true) {
                        n3.setVisible(true);
                        n.setVisible(false);
                        n1.setVisible(false);
                    } else {
                        n1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'O') {
                    to1 = true;
                    if (to == true && to1 == true) {
                        o3.setVisible(true);
                        o.setVisible(false);
                        o1.setVisible(false);
                    } else {
                        o1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'P') {
                    tp1 = true;
                    if (tp == true && tp1 == true) {
                        p3.setVisible(true);
                        p.setVisible(false);
                        p1.setVisible(false);
                    } else {
                        p1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'Q') {
                    tq1 = true;
                    if (tq == true && tq1 == true) {
                        q3.setVisible(true);
                        q.setVisible(false);
                        q1.setVisible(false);
                    } else {
                        q1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'R') {
                    tr1 = true;
                    if (tr == true && tr1 == true) {
                        r3.setVisible(true);
                        r.setVisible(false);
                        r1.setVisible(false);
                    } else {
                        r1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'S') {
                    ts1 = true;
                    if (ts == true && ts1 == true) {
                        s3.setVisible(true);
                        s.setVisible(false);
                        s1.setVisible(false);
                    } else {
                        s1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'T') {
                    tt1 = true;
                    if (tt == true && tt1 == true) {
                        t3.setVisible(true);
                        t.setVisible(false);
                        t1.setVisible(false);
                    } else {
                        t1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'U') {
                    tu1 = true;
                    if (tu == true && tu1 == true) {
                        u3.setVisible(true);
                        u.setVisible(false);
                        u1.setVisible(false);
                    } else {
                        u1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'V') {
                    tv1 = true;
                    if (tv == true && tv1 == true) {
                        v3.setVisible(true);
                        v.setVisible(false);
                        v1.setVisible(false);
                    } else {
                        v1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'W') {
                    tw1 = true;
                    if (tw == true && tw1 == true) {
                        w3.setVisible(true);
                        w.setVisible(false);
                        w1.setVisible(false);
                    } else {
                        w1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'X') {
                    tx1 = true;
                    if (tx == true && tx1 == true) {
                        x3.setVisible(true);
                        x.setVisible(false);
                        x1.setVisible(false);
                    } else {
                        x1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'Y') {
                    ty1 = true;
                    if (ty == true && ty1 == true) {
                        y3.setVisible(true);
                        y.setVisible(false);
                        y1.setVisible(false);
                    } else {
                        y1.setVisible(true);
                    }
                }
                if (letrasB[i2] == 'Z') {
                    tz1 = true;
                    if (tz == true && tz1 == true) {
                        z3.setVisible(true);
                        z.setVisible(false);
                        z1.setVisible(false);
                    } else {
                        z1.setVisible(true);
                    }
                }
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            ta1 = false;
            tb1 = false;
            tc1 = false;
            td1 = false;
            te1 = false;
            tf1 = false;
            tg1 = false;
            th1 = false;
            ti1 = false;
            tj1 = false;
            tk1 = false;
            tl1 = false;
            tm1 = false;
            tn1 = false;
            to1 = false;
            tp1 = false;
            tq1 = false;
            tr1 = false;
            ts1 = false;
            tt1 = false;
            tu1 = false;
            tv1 = false;
            tw1 = false;
            tx1 = false;
            ty1 = false;
            tz1 = false;
            a1.setVisible(false);
            b1.setVisible(false);
            c1.setVisible(false);
            d1.setVisible(false);
            e1.setVisible(false);
            f1.setVisible(false);
            g1.setVisible(false);
            h1.setVisible(false);
            i1.setVisible(false);
            j1.setVisible(false);
            k1.setVisible(false);
            l1.setVisible(false);
            m1.setVisible(false);
            n1.setVisible(false);
            o1.setVisible(false);
            p1.setVisible(false);
            q1.setVisible(false);
            r1.setVisible(false);
            s1.setVisible(false);
            t1.setVisible(false);
            u1.setVisible(false);
            v1.setVisible(false);
            w1.setVisible(false);
            y1.setVisible(false);
            x1.setVisible(false);
            z1.setVisible(false);
            a3.setVisible(false);
            b3.setVisible(false);
            c3.setVisible(false);
            d3.setVisible(false);
            e3.setVisible(false);
            f3.setVisible(false);
            g3.setVisible(false);
            h3.setVisible(false);
            i3.setVisible(false);
            j3.setVisible(false);
            k3.setVisible(false);
            l3.setVisible(false);
            m3.setVisible(false);
            n3.setVisible(false);
            o3.setVisible(false);
            p3.setVisible(false);
            q3.setVisible(false);
            r3.setVisible(false);
            s3.setVisible(false);
            t3.setVisible(false);
            u3.setVisible(false);
            v3.setVisible(false);
            w3.setVisible(false);
            y3.setVisible(false);
            x3.setVisible(false);
            z3.setVisible(false);
            abre.setVisible(false);
            result.setVisible(false);
            fecha.setVisible(false);
            textobts.setVisible(false);
            ConteudoB.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_0) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            //conA = conA.substring(0,tamA-1);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_1) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_2) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_3) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_4) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_5) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_6) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_7) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_8) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_9) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COMMA) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COLON) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MINUS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UNDERSCORE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SLASH) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CIRCUMFLEX) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEPARATOR) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DECIMAL) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
    }//GEN-LAST:event_ConteudoBKeyPressed

    private void perKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String var = per.getText().toUpperCase();
            char[] var2 = var.toCharArray();
            int useA;
            int useB;
            if (ConteudoA.getText().equals("")) {
                useA = 0;
            } else {
                useA = conA.length();
            }
            if (ConteudoB.getText().equals("")) {
                useB = 0;
            } else {
                useB = conB.length();
            }
            if (useA == 0 && useB == 0) {
                JOptionPane.showMessageDialog(null, "Escreva Letras em Algum Conjunto", "Só Letras", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int i2 = 0; i2 < useA; i2++) {
                    if (var2[0] == 'A') {
                        if (ta1 == false && ta == true) {
                            a.setFont(nf);
                            a.setForeground(Color.RED);
                        } else {
                            a3.setFont(nf);
                            a3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'B') {
                        if (tb1 == false && tb == true) {
                            b.setFont(nf);
                            b.setForeground(Color.RED);
                        } else {
                            b3.setFont(nf);
                            b3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'C') {
                        if (tc1 == false && tc == true) {
                            c.setFont(nf);
                            c.setForeground(Color.RED);
                        } else {
                            c3.setFont(nf);
                            c3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'D') {
                        if (td1 == false && td == true) {
                            d.setFont(nf);
                            d.setForeground(Color.RED);
                        } else {
                            d3.setFont(nf);
                            d3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'E') {
                        if (te1 == false && te == true) {
                            e.setFont(nf);
                            e.setForeground(Color.RED);
                        } else {
                            e3.setFont(nf);
                            e3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'F') {
                        if (tf1 == false && tf == true) {
                            f.setFont(nf);
                            f.setForeground(Color.RED);
                        } else {
                            f3.setFont(nf);
                            f3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'G') {
                        if (tg1 == false && tg == true) {
                            g.setFont(nf);
                            g.setForeground(Color.RED);
                        } else {
                            g3.setFont(nf);
                            g3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'H') {
                        if (th1 == false && th == true) {
                            h.setFont(nf);
                            h.setForeground(Color.RED);
                        } else {
                            h3.setFont(nf);
                            h3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'I') {
                        if (ti1 == false && ti == true) {
                            i.setFont(nf);
                            i.setForeground(Color.RED);
                        } else {
                            i3.setFont(nf);
                            i3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'J') {
                        if (tj1 == false && tj == true) {
                            j.setFont(nf);
                            j.setForeground(Color.RED);
                        } else {
                            j3.setFont(nf);
                            j3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'K') {
                        if (tk1 == false && tk == true) {
                            k.setFont(nf);
                            k.setForeground(Color.RED);
                        } else {
                            k3.setFont(nf);
                            k3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'L') {
                        if (tl1 == false && tl == true) {
                            l.setFont(nf);
                            l.setForeground(Color.RED);
                        } else {
                            l3.setFont(nf);
                            l3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'M') {
                        if (tm1 == false && tm == true) {
                            m.setFont(nf);
                            m.setForeground(Color.RED);
                        } else {
                            m3.setFont(nf);
                            m3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'N') {
                        if (tn1 == false && tn == true) {
                            n.setFont(nf);
                            n.setForeground(Color.RED);
                        } else {
                            n3.setFont(nf);
                            n3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'O') {
                        if (to1 == false && to == true) {
                            o.setFont(nf);
                            o.setForeground(Color.RED);
                        } else {
                            o3.setFont(nf);
                            o3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'P') {
                        if (tp1 == false && tp == true) {
                            p.setFont(nf);
                            p.setForeground(Color.RED);
                        } else {
                            p3.setFont(nf);
                            p3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Q') {
                        if (tq1 == false && tq == true) {
                            q.setFont(nf);
                            q.setForeground(Color.RED);
                        } else {
                            q3.setFont(nf);
                            q3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'R') {
                        if (tr1 == false && tr == true) {
                            r.setFont(nf);
                            r.setForeground(Color.RED);
                        } else {
                            r3.setFont(nf);
                            r3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'S') {
                        if (ts1 == false && ts == true) {
                            s.setFont(nf);
                            s.setForeground(Color.RED);
                        } else {
                            s3.setFont(nf);
                            s3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'T') {
                        if (tt1 == false && tt == true) {
                            t.setFont(nf);
                            t.setForeground(Color.RED);
                        } else {
                            t3.setFont(nf);
                            t3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'U') {
                        if (tu1 == false && tu == true) {
                            u.setFont(nf);
                            u.setForeground(Color.RED);
                        } else {
                            u3.setFont(nf);
                            u3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'V') {
                        if (tv1 == false && tv == true) {
                            v.setFont(nf);
                            v.setForeground(Color.RED);
                        } else {
                            v3.setFont(nf);
                            v3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'W') {
                        if (tw1 == false && tw == true) {
                            w.setFont(nf);
                            w.setForeground(Color.RED);
                        } else {
                            w3.setFont(nf);
                            w3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'X') {
                        if (tx1 == false && tx == true) {
                            x.setFont(nf);
                            x.setForeground(Color.RED);
                        } else {
                            x3.setFont(nf);
                            x3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Y') {
                        if (ty1 == false && ty == true) {
                            y.setFont(nf);
                            y.setForeground(Color.RED);
                        } else {
                            y3.setFont(nf);
                            y3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Z') {
                        if (tz1 == false && tz == true) {
                            z.setFont(nf);
                            z.setForeground(Color.RED);
                        } else {
                            z3.setFont(nf);
                            z3.setForeground(Color.RED);
                        }
                    }
                }
                for (int i2 = 0; i2 < useB; i2++) {
                    if (var2[0] == 'A') {
                        if (ta == false && ta1 == true) {
                            a1.setFont(nf);
                            a1.setForeground(Color.RED);
                        } else {
                            a3.setFont(nf);
                            a3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'B') {
                        if (tb == false && tb1 == true) {
                            b1.setFont(nf);
                            b1.setForeground(Color.RED);
                        } else {
                            b3.setFont(nf);
                            b3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'C') {
                        if (tc == false && tc1 == true) {
                            c1.setFont(nf);
                            c1.setForeground(Color.RED);
                        } else {
                            c3.setFont(nf);
                            c3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'D') {
                        if (td == false && td1 == true) {
                            d1.setFont(nf);
                            d1.setForeground(Color.RED);
                        } else {
                            d3.setFont(nf);
                            d3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'E') {
                        if (te == false && te1 == true) {
                            e1.setFont(nf);
                            e1.setForeground(Color.RED);
                        } else {
                            e3.setFont(nf);
                            e3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'F') {
                        if (tf == false && tf1 == true) {
                            f1.setFont(nf);
                            f1.setForeground(Color.RED);
                        } else {
                            f3.setFont(nf);
                            f3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'G') {
                        if (tg == false && tg1 == true) {
                            g1.setFont(nf);
                            g1.setForeground(Color.RED);
                        } else {
                            g3.setFont(nf);
                            g3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'H') {
                        if (th == false && th1 == true) {
                            h1.setFont(nf);
                            h1.setForeground(Color.RED);
                        } else {
                            h3.setFont(nf);
                            h3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'I') {
                        if (ti == false && ti1 == true) {
                            i1.setFont(nf);
                            i1.setForeground(Color.RED);
                        } else {
                            i3.setFont(nf);
                            i3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'J') {
                        if (tj == false && tj1 == true) {
                            j1.setFont(nf);
                            j1.setForeground(Color.RED);
                        } else {
                            j3.setFont(nf);
                            j3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'K') {
                        if (tk == false && tk1 == true) {
                            k1.setFont(nf);
                            k1.setForeground(Color.RED);
                        } else {
                            k3.setFont(nf);
                            k3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'L') {
                        if (tl == false && tl1 == true) {
                            l1.setFont(nf);
                            l1.setForeground(Color.RED);
                        } else {
                            l3.setFont(nf);
                            l3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'M') {
                        if (tm == false && tm1 == true) {
                            m1.setFont(nf);
                            m1.setForeground(Color.RED);
                        } else {
                            m3.setFont(nf);
                            m3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'N') {
                        if (tn == false && tn1 == true) {
                            n1.setFont(nf);
                            n1.setForeground(Color.RED);
                        } else {
                            n3.setFont(nf);
                            n3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'O') {
                        if (to == false && to1 == true) {
                            o1.setFont(nf);
                            o1.setForeground(Color.RED);
                        } else {
                            o3.setFont(nf);
                            o3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'P') {
                        if (tp == false && tp1 == true) {
                            p1.setFont(nf);
                            p1.setForeground(Color.RED);
                        } else {
                            p3.setFont(nf);
                            p3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Q') {
                        if (tq == false && tq1 == true) {
                            q1.setFont(nf);
                            q1.setForeground(Color.RED);
                        } else {
                            q3.setFont(nf);
                            q3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'R') {
                        if (tr == false && tr1 == true) {
                            r1.setFont(nf);
                            r1.setForeground(Color.RED);
                        } else {
                            r3.setFont(nf);
                            r3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'S') {
                        if (ts == false && ts1 == true) {
                            s1.setFont(nf);
                            s1.setForeground(Color.RED);
                        } else {
                            s3.setFont(nf);
                            s3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'T') {
                        if (tt == false && tt1 == true) {
                            t1.setFont(nf);
                            t1.setForeground(Color.RED);
                        } else {
                            t3.setFont(nf);
                            t3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'U') {
                        if (tu == false && tu1 == true) {
                            u1.setFont(nf);
                            u1.setForeground(Color.RED);
                        } else {
                            u3.setFont(nf);
                            u3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'V') {
                        if (tv == false && tv1 == true) {
                            v1.setFont(nf);
                            v1.setForeground(Color.RED);
                        } else {
                            v3.setFont(nf);
                            v3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'W') {
                        if (tw == false && tw1 == true) {
                            w1.setFont(nf);
                            w1.setForeground(Color.RED);
                        } else {
                            w3.setFont(nf);
                            w3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'X') {
                        if (tx1 == false && tx == true) {
                            x.setFont(nf);
                            x.setForeground(Color.RED);
                        } else {
                            x3.setFont(nf);
                            x3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Y') {
                        if (ty == false && ty1 == true) {
                            y1.setFont(nf);
                            y1.setForeground(Color.RED);
                        } else {
                            y3.setFont(nf);
                            y3.setForeground(Color.RED);
                        }
                    }
                    if (var2[0] == 'Z') {
                        if (tz == false && tz1 == true) {
                            z1.setFont(nf);
                            z1.setForeground(Color.RED);
                        } else {
                            z3.setFont(nf);
                            z3.setForeground(Color.RED);
                        }
                    }
                }
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            a.setFont(nf2);
            a.setForeground(Color.BLACK);
            b.setFont(nf2);
            b.setForeground(Color.BLACK);
            c.setFont(nf2);
            c.setForeground(Color.BLACK);
            d.setFont(nf2);
            d.setForeground(Color.BLACK);
            e.setFont(nf2);
            e.setForeground(Color.BLACK);
            f.setFont(nf2);
            f.setForeground(Color.BLACK);
            g.setFont(nf2);
            g.setForeground(Color.BLACK);
            h.setFont(nf2);
            h.setForeground(Color.BLACK);
            i.setFont(nf2);
            i.setForeground(Color.BLACK);
            j.setFont(nf2);
            j.setForeground(Color.BLACK);
            k.setFont(nf2);
            k.setForeground(Color.BLACK);
            l.setFont(nf2);
            l.setForeground(Color.BLACK);
            m.setFont(nf2);
            m.setForeground(Color.BLACK);
            n.setFont(nf2);
            n.setForeground(Color.BLACK);
            o.setFont(nf2);
            o.setForeground(Color.BLACK);
            p.setFont(nf2);
            p.setForeground(Color.BLACK);
            q.setFont(nf2);
            q.setForeground(Color.BLACK);
            r.setFont(nf2);
            r.setForeground(Color.BLACK);
            s.setFont(nf2);
            s.setForeground(Color.BLACK);
            t.setFont(nf2);
            t.setForeground(Color.BLACK);
            u.setFont(nf2);
            u.setForeground(Color.BLACK);
            v.setFont(nf2);
            v.setForeground(Color.BLACK);
            w.setFont(nf2);
            w.setForeground(Color.BLACK);
            x.setFont(nf2);
            x.setForeground(Color.BLACK);
            y.setFont(nf2);
            y.setForeground(Color.BLACK);
            z.setFont(nf2);
            z.setForeground(Color.BLACK);
            a1.setFont(nf2);
            a1.setForeground(Color.BLACK);
            b1.setFont(nf2);
            b1.setForeground(Color.BLACK);
            c1.setFont(nf2);
            c1.setForeground(Color.BLACK);
            d1.setFont(nf2);
            d1.setForeground(Color.BLACK);
            e1.setFont(nf2);
            e1.setForeground(Color.BLACK);
            f1.setFont(nf2);
            f1.setForeground(Color.BLACK);
            g1.setFont(nf2);
            g1.setForeground(Color.BLACK);
            h1.setFont(nf2);
            h1.setForeground(Color.BLACK);
            i1.setFont(nf2);
            i1.setForeground(Color.BLACK);
            j1.setFont(nf2);
            j1.setForeground(Color.BLACK);
            k1.setFont(nf2);
            k1.setForeground(Color.BLACK);
            l1.setFont(nf2);
            l1.setForeground(Color.BLACK);
            m1.setFont(nf2);
            m1.setForeground(Color.BLACK);
            n1.setFont(nf2);
            n1.setForeground(Color.BLACK);
            o1.setFont(nf2);
            o1.setForeground(Color.BLACK);
            p1.setFont(nf2);
            p1.setForeground(Color.BLACK);
            q1.setFont(nf2);
            q1.setForeground(Color.BLACK);
            r1.setFont(nf2);
            r1.setForeground(Color.BLACK);
            s1.setFont(nf2);
            s1.setForeground(Color.BLACK);
            t1.setFont(nf2);
            t1.setForeground(Color.BLACK);
            u1.setFont(nf2);
            u1.setForeground(Color.BLACK);
            v1.setFont(nf2);
            v1.setForeground(Color.BLACK);
            w1.setFont(nf2);
            w1.setForeground(Color.BLACK);
            x1.setFont(nf2);
            x1.setForeground(Color.BLACK);
            y1.setFont(nf2);
            y1.setForeground(Color.BLACK);
            z1.setFont(nf2);
            z1.setForeground(Color.BLACK);
            a3.setFont(nf2);
            a3.setForeground(Color.BLACK);
            b3.setFont(nf2);
            b3.setForeground(Color.BLACK);
            c3.setFont(nf2);
            c3.setForeground(Color.BLACK);
            d3.setFont(nf2);
            d3.setForeground(Color.BLACK);
            e3.setFont(nf2);
            e3.setForeground(Color.BLACK);
            f3.setFont(nf2);
            f3.setForeground(Color.BLACK);
            g3.setFont(nf2);
            g3.setForeground(Color.BLACK);
            h3.setFont(nf2);
            h3.setForeground(Color.BLACK);
            i3.setFont(nf2);
            i3.setForeground(Color.BLACK);
            j3.setFont(nf2);
            j3.setForeground(Color.BLACK);
            k3.setFont(nf2);
            k3.setForeground(Color.BLACK);
            l3.setFont(nf2);
            l3.setForeground(Color.BLACK);
            m3.setFont(nf2);
            m3.setForeground(Color.BLACK);
            n3.setFont(nf2);
            n3.setForeground(Color.BLACK);
            o3.setFont(nf2);
            o3.setForeground(Color.BLACK);
            p3.setFont(nf2);
            p3.setForeground(Color.BLACK);
            q3.setFont(nf2);
            q3.setForeground(Color.BLACK);
            r3.setFont(nf2);
            r3.setForeground(Color.BLACK);
            s3.setFont(nf2);
            s3.setForeground(Color.BLACK);
            t3.setFont(nf2);
            t3.setForeground(Color.BLACK);
            u3.setFont(nf2);
            u3.setForeground(Color.BLACK);
            v3.setFont(nf2);
            v3.setForeground(Color.BLACK);
            w3.setFont(nf2);
            w3.setForeground(Color.BLACK);
            x3.setFont(nf2);
            x3.setForeground(Color.BLACK);
            y3.setFont(nf2);
            y3.setForeground(Color.BLACK);
            z3.setFont(nf2);
            z3.setForeground(Color.BLACK);
        }
        if (evt.getKeyCode() == KeyEvent.VK_0) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            //conA = conA.substring(0,tamA-1);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_1) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_2) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_3) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_4) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_5) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_6) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_7) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_8) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_9) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COMMA) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_COLON) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MINUS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_EQUALS) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UNDERSCORE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SLASH) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_CIRCUMFLEX) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            conA = ConteudoA.getText().toUpperCase();
            tamA = conA.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoA.setText(conA.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_SEPARATOR) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DECIMAL) {
            conB = ConteudoB.getText().toUpperCase();
            tamB = conB.length();
            JOptionPane.showMessageDialog(null, "Somente Letras Ok!", "Só Letras", JOptionPane.ERROR_MESSAGE);
            ConteudoB.setText(conB.toLowerCase());
        }
    }//GEN-LAST:event_perKeyPressed

    private void uniaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uniaoMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/uniaos.png"));
        uniao.setIcon(II);
    }//GEN-LAST:event_uniaoMouseEntered

    private void uniaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uniaoMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/uniao.png"));
        uniao.setIcon(II);
    }//GEN-LAST:event_uniaoMouseExited

    private void uniaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uniaoMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/uniao.png"));
        uniao.setIcon(II);
    }//GEN-LAST:event_uniaoMousePressed

    private void uniaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uniaoMouseClicked
        if (ConteudoA.getText().equals("") || ConteudoB.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Conjuntos A e B com Letras", "Só Letras", JOptionPane.ERROR_MESSAGE);
        } else {
            if (cbt1 == 0) {
                cbt1 = 1;
                cbt2 = 0;
                cbt3 = 0;
                ALuniao.clear();
                conA = ConteudoA.getText().toUpperCase();
                letrasA = conA.toCharArray();
                tamA = letrasA.length;
                conB = ConteudoB.getText().toUpperCase();
                letrasB = conB.toCharArray();
                tamB = letrasB.length;
                for (int i2 = 0; i2 < letrasA.length; i2++) {
                    ALuniao.add(letrasA[i2]);
                }
                for (int i2 = 0; i2 < letrasB.length; i2++) {
                    if (ALuniao.contains(letrasB[i2])) {

                    } else {
                        ALuniao.add(letrasB[i2]);
                    }
                }
                result.setText(String.valueOf(ALuniao.get(0)));
                for (int i2 = 1; i2 < ALuniao.size(); i2++) {
                    result.setText(result.getText() + ", " + String.valueOf(ALuniao.get(i2)));
                }
                abre.setVisible(true);
                result.setVisible(true);
                fecha.setVisible(true);
                textobts.setText("União dos Conjuntos");
                textobts.setVisible(true);
            } else {
                cbt2 = 0;
                cbt1 = 0;
                cbt3 = 0;
                ALbmenosa.clear();
                ALamenosb.clear();
                ALuniao.clear();
            }
        }
    }//GEN-LAST:event_uniaoMouseClicked

    private void interMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/inters.png"));
        inter.setIcon(II);
    }//GEN-LAST:event_interMouseEntered

    private void interMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/inter.png"));
        inter.setIcon(II);
    }//GEN-LAST:event_interMouseExited

    private void interMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/inter.png"));
        inter.setIcon(II);
    }//GEN-LAST:event_interMousePressed

    private void interMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interMouseClicked
        if (ConteudoA.getText().equals("") || ConteudoB.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Conjuntos A e B com Letras", "Só Letras", JOptionPane.ERROR_MESSAGE);
        } else {
            cbt1 = 0;
            cbt2 = 0;
            cbt3 = 0;
            ALbmenosa.clear();
            ALamenosb.clear();
            ALuniao.clear();
            ALinter.clear();
            if (ta == true && ta1 == true){
                ALinter.add('A');
            }
            if (tb == true && tb1 == true){
                ALinter.add('B');
            }
            if (tc == true && tc1 == true){
                ALinter.add('C');
            }
            if (td == true && td1 == true){
                ALinter.add('D');
            }
            if (te == true && te1 == true){
                ALinter.add('E');
            }
            if (tf == true && tf1 == true){
                ALinter.add('F');
            }
            if (tg == true && tg1 == true){
                ALinter.add('G');
            }
            if (th == true && th1 == true){
                ALinter.add('H');
            }
            if (ti == true && ti1 == true){
                ALinter.add('I');
            }
            if (tj == true && tj1 == true){
                ALinter.add('J');
            }
            if (tk == true && tk1 == true){
                ALinter.add('K');
            }
            if (tl == true && tl1 == true){
                ALinter.add('L');
            }
            if (tm == true && tm1 == true){
                ALinter.add('M');
            }
            if (tn == true && tn1 == true){
                ALinter.add('N');
            }
            if (to == true && to1 == true){
                ALinter.add('O');
            }
            if (tp == true && tp1 == true){
                ALinter.add('P');
            }
            if (tq == true && tq1 == true){
                ALinter.add('Q');
            }
            if (tr == true && tr1 == true){
                ALinter.add('R');
            }
            if (ts == true && ts1 == true){
                ALinter.add('S');
            }
            if (tt == true && tt1 == true){
                ALinter.add('T');
            }
            if (tu == true && tu1 == true){
                ALinter.add('U');
            }
            if (tv == true && tv1 == true){
                ALinter.add('V');
            }
            if (tw == true && tw1 == true){
                ALinter.add('W');
            }
            if (tx == true && tx1 == true){
                ALinter.add('X');
            }
            if (ty == true && ty1 == true){
                ALinter.add('Y');
            }
            if (tz == true && tz1 == true){
                ALinter.add('Z');
            }
            result.setText(String.valueOf(ALinter.get(0)));
            for (int i2 = 1; i2 < ALinter.size(); i2++) {
                result.setText(result.getText()+", "+String.valueOf(ALinter.get(i2)));
            }
            abre.setVisible(true);
            result.setVisible(true);
            fecha.setVisible(true);
            textobts.setText("Intersecção dos Conjuntos");
            textobts.setVisible(true);
        }
    }//GEN-LAST:event_interMouseClicked

    private void ambMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ambMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/a-bs.png"));
        amb.setIcon(II);
    }//GEN-LAST:event_ambMouseEntered

    private void ambMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ambMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/a-b.png"));
        amb.setIcon(II);
    }//GEN-LAST:event_ambMouseExited

    private void ambMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ambMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/a-b.png"));
        amb.setIcon(II);
    }//GEN-LAST:event_ambMousePressed

    private void ambMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ambMouseClicked
        if (ConteudoA.getText().equals("") || ConteudoB.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Conjuntos A e B com Letras", "Só Letras", JOptionPane.ERROR_MESSAGE);
        } else {
            if (cbt2 == 0) {
                cbt1 = 0;
                cbt2 = 1;
                cbt3 = 0;
                ALamenosb.clear();
                conA = ConteudoA.getText().toUpperCase();
                letrasA = conA.toCharArray();
                tamA = letrasA.length;
                conB = ConteudoB.getText().toUpperCase();
                letrasB = conB.toCharArray();
                tamB = letrasB.length;
                for (int i2 = 0; i2 < letrasB.length; i2++) {
                    ALbmenosa.add(letrasB[i2]);
                }
                for (int i2 = 0; i2 < letrasA.length; i2++) {
                    if (ALbmenosa.contains(letrasA[i2])) {

                    } else {
                        ALamenosb.add(letrasA[i2]);
                    }
                }
                if (ALamenosb.isEmpty()) {
                    result.setText("");
                } else {
                    result.setText(String.valueOf(ALamenosb.get(0)));
                }
                for (int i2 = 1; i2 < ALamenosb.size(); i2++) {
                    result.setText(result.getText() + ", " + String.valueOf(ALamenosb.get(i2)));
                }
                abre.setVisible(true);
                result.setVisible(true);
                fecha.setVisible(true);
                textobts.setText("A - B dos Conjuntos");
                textobts.setVisible(true);
            } else {
                cbt2 = 0;
                cbt1 = 0;
                cbt3 = 0;
                ALbmenosa.clear();
                ALamenosb.clear();
                ALuniao.clear();
            }
        }
    }//GEN-LAST:event_ambMouseClicked

    private void bmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmaMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/b-as.png"));
        bma.setIcon(II);
    }//GEN-LAST:event_bmaMouseEntered

    private void bmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmaMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/b-a.png"));
        bma.setIcon(II);
    }//GEN-LAST:event_bmaMouseExited

    private void bmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmaMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/b-a.png"));
        bma.setIcon(II);
    }//GEN-LAST:event_bmaMousePressed

    private void bmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmaMouseClicked
        if (ConteudoA.getText().equals("") || ConteudoB.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os Conjuntos A e B com Letras", "Só Letras", JOptionPane.ERROR_MESSAGE);
        } else {
            if (cbt3 == 0) {
                ALbmenosa.clear();
                cbt1 = 0;
                cbt2 = 0;
                cbt3 = 1;
                conA = ConteudoA.getText().toUpperCase();
                letrasA = conA.toCharArray();
                tamA = letrasA.length;
                conB = ConteudoB.getText().toUpperCase();
                letrasB = conB.toCharArray();
                tamB = letrasB.length;
                for (int i2 = 0; i2 < letrasA.length; i2++) {
                    ALamenosb.add(letrasA[i2]);
                }
                for (int i2 = 0; i2 < letrasB.length; i2++) {
                    if (ALamenosb.contains(letrasB[i2])) {

                    } else {
                        ALbmenosa.add(letrasB[i2]);
                    }
                }
                if (ALbmenosa.isEmpty()) {
                    result.setText("");
                } else {
                    result.setText(String.valueOf(ALbmenosa.get(0)));
                }
                for (int i2 = 1; i2 < ALbmenosa.size(); i2++) {
                    result.setText(result.getText() + ", " + String.valueOf(ALbmenosa.get(i2)));
                }
                abre.setVisible(true);
                result.setVisible(true);
                fecha.setVisible(true);
                textobts.setText("B - A dos Conjuntos");
                textobts.setVisible(true);
            } else {
                cbt2 = 0;
                cbt1 = 0;
                cbt3 = 0;
                ALbmenosa.clear();
                ALamenosb.clear();
                ALuniao.clear();
            }
        }
    }//GEN-LAST:event_bmaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConteudoA;
    private javax.swing.JTextField ConteudoB;
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel abre;
    private javax.swing.JLabel amb;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel bma;
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel conjuntoA;
    private javax.swing.JLabel conjuntoB;
    private javax.swing.JLabel d;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel e;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel f;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fundobotao;
    private javax.swing.JPanel fundoconjunto;
    private javax.swing.JPanel fundopertence;
    private javax.swing.JLabel g;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel h;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel i;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel inter;
    private javax.swing.JLabel j;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel k3;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel m;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel n;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel o;
    private javax.swing.JLabel o1;
    private javax.swing.JLabel o3;
    private javax.swing.JLabel p;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p3;
    private javax.swing.JTextField per;
    private javax.swing.JLabel pertence;
    private javax.swing.JLabel q;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel r;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r3;
    private javax.swing.JTextField result;
    private javax.swing.JLabel s;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel t;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel textcona;
    private javax.swing.JLabel textconb;
    private javax.swing.JLabel textoA;
    private javax.swing.JLabel textoB;
    private javax.swing.JLabel textobts;
    private javax.swing.JLabel u;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u3;
    private javax.swing.JLabel uniao;
    private javax.swing.JLabel v;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel w;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w3;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel y;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel y3;
    private javax.swing.JLabel z;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z3;
    // End of variables declaration//GEN-END:variables
}
