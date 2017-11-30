
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * This code was maked with the intention to give to the student a symple
 * example of Java and MySQL runtime Application, if you need to make any
 * correction you can seen the code below the next lines.
 *
 * #StayHungryStayFoolish MIT License 2016
 *
 * @author urksi
 */
public class Gestor extends javax.swing.JFrame {

    DBC driver;

    public Gestor() {
        initComponents();
        driver = new DBC();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        FrameModificarArticulos = new javax.swing.JFrame();
        FieldNo_Serie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FieldCostoActual = new javax.swing.JTextField();
        FieldStatus = new javax.swing.JTextField();
        FieldMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        FieldAVida = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FieldResguardo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FieldPatrimonio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        FieldCaracteristicas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        FieldClaveRecurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FieldNota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldACompra = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        FieldProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FieldFactura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FieldPrecio_Fac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FieldPartida = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        FieldBien = new javax.swing.JTextField();
        BotonActualizarArticulos = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        BotonSeleccionar = new javax.swing.JButton();
        FrameEliminarArticulos = new javax.swing.JFrame();
        jLabel39 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox<>();
        BotonSeleccionar2 = new javax.swing.JButton();
        FrameSeleccionar = new javax.swing.JFrame();
        jLabel20 = new javax.swing.JLabel();
        FieldPrecio_Fac1 = new javax.swing.JTextField();
        FieldFactura1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        FieldACompra1 = new javax.swing.JTextField();
        FieldNota1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FieldPatrimonio1 = new javax.swing.JTextField();
        FieldResguardo1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FieldNombre1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        FieldModelo1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        FieldMarca1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        FieldNo_Serie1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        BotonSeleccionar1 = new javax.swing.JButton();
        FieldCostoActual1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        FieldStatus1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        FieldAVida1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        FieldCaracteristicas1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        FieldClaveRecurso1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        FieldProveedor1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        FieldPartida1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        FieldBien1 = new javax.swing.JTextField();
        FrameInsertarBajas = new javax.swing.JFrame();
        nota = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        id_baja = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        motivo = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        fecha_baja = new javax.swing.JTextField();
        a_compra = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        no_factura = new javax.swing.JTextField();
        laneld = new javax.swing.JLabel();
        observacion_baja = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        no_serie = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        precio_fac = new javax.swing.JTextField();
        labelde3 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        costo_act = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        no_resguardo = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        a_vida = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        no_patrimonio = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        caracteristicas = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        id_partida = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        cla_recur = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        tipo_bien = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        cla_destino = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        FrameEliminarBajas = new javax.swing.JFrame();
        jLabel109 = new javax.swing.JLabel();
        ComboEliminarBajas = new javax.swing.JComboBox<>();
        BotonEliminarBajas = new javax.swing.JButton();
        FrameModificarBajas = new javax.swing.JFrame();
        jLabel46 = new javax.swing.JLabel();
        id_baja1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        motivo1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        fecha_baja1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        observacion_baja1 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        no_serie1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        marca1 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        modelo1 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        no_resguardo1 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        no_patrimonio1 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        a_compra1 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        no_factura1 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        precio_fac1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        costo_act1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        status1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        a_vida1 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        caracteristicas1 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        cla_recur1 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        proveedor1 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        id_partida1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        tipo_bien1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        cla_destino1 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        ComboBajas1 = new javax.swing.JComboBox<>();
        BotonBajas1 = new javax.swing.JButton();
        BotonMoficiar = new javax.swing.JButton();
        FrameSeleccionarBajas = new javax.swing.JFrame();
        jLabel85 = new javax.swing.JLabel();
        ComboBajas2 = new javax.swing.JComboBox<>();
        BotonBajas2 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        id_baja2 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        motivo2 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        fecha_baja2 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        observacion_baja2 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        no_serie2 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        marca2 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        modelo2 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        no_resguardo2 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        no_patrimonio2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        nota2 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        a_compra2 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        no_factura2 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        precio_fac2 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        costo_act2 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        status2 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        a_vida2 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        caracteristicas2 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        cla_recur2 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        proveedor2 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        id_partida2 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        tipo_bien2 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        cla_destino2 = new javax.swing.JTextField();
        FrameInsertarDestinos = new javax.swing.JFrame();
        jLabel110 = new javax.swing.JLabel();
        id_destino = new javax.swing.JTextField();
        nombre_destino = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        BotonInsertarDestino = new javax.swing.JButton();
        FrameModificarDestinos = new javax.swing.JFrame();
        jLabel112 = new javax.swing.JLabel();
        ComboDestino1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        id_destino2 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        nombre_destino2 = new javax.swing.JTextField();
        BotonModificarDestino = new javax.swing.JButton();
        FrameEliminarDestinos = new javax.swing.JFrame();
        jLabel120 = new javax.swing.JLabel();
        ComboDestino3 = new javax.swing.JComboBox<>();
        Go4 = new javax.swing.JButton();
        FrameConsultarDestinos = new javax.swing.JFrame();
        jLabel117 = new javax.swing.JLabel();
        ComboDestino2 = new javax.swing.JComboBox<>();
        Go3 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        id_destino3 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        nombre_destino3 = new javax.swing.JTextField();
        FrameInsertarPartidas = new javax.swing.JFrame();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        id_partida3 = new javax.swing.JTextField();
        nom_partida3 = new javax.swing.JTextField();
        insertarbuton = new javax.swing.JButton();
        FrameModificarPartidas = new javax.swing.JFrame();
        jLabel123 = new javax.swing.JLabel();
        id_partida4 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        nom_partida4 = new javax.swing.JTextField();
        insertarbuton1 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        ComboPartidas1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        FrameEliminarPartidas = new javax.swing.JFrame();
        jLabel129 = new javax.swing.JLabel();
        ComboPartidas3 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        FrameConsultarPartidas = new javax.swing.JFrame();
        jLabel125 = new javax.swing.JLabel();
        id_partida5 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        nom_partida5 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        ComboPartidas2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        FrameInsertarPersonal = new javax.swing.JFrame();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        id_personal_ip = new javax.swing.JTextField();
        puesto_ip = new javax.swing.JTextField();
        area_asig_ip = new javax.swing.JTextField();
        nombre_ip = new javax.swing.JTextField();
        nombre_jefe_ip = new javax.swing.JTextField();
        Insertar_ip = new javax.swing.JButton();
        FrameModificarPersonal = new javax.swing.JFrame();
        jLabel135 = new javax.swing.JLabel();
        id_personal_ip1 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        nombre_ip1 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        puesto_ip1 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        area_asig_ip1 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        nombre_jede_ip1 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        Combo_ip = new javax.swing.JComboBox<>();
        go_ip = new javax.swing.JButton();
        Modificar_ip = new javax.swing.JButton();
        FrameEliminarPersonal = new javax.swing.JFrame();
        jLabel114 = new javax.swing.JLabel();
        Combo_ip1 = new javax.swing.JComboBox<>();
        go_ip1 = new javax.swing.JButton();
        FrameConsultarPersonal = new javax.swing.JFrame();
        jLabel140 = new javax.swing.JLabel();
        id_personal_ip2 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        nombre_ip2 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        puesto_ip2 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        area_asig_ip2 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        nombre_jede_ip2 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        Combo_ip2 = new javax.swing.JComboBox<>();
        go_ip2 = new javax.swing.JButton();
        FrameInsertarRecurso = new javax.swing.JFrame();
        jLabel146 = new javax.swing.JLabel();
        cla_recurso_ir = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        nombre_ir = new javax.swing.JTextField();
        Insertar_ir = new javax.swing.JButton();
        FrameModificarRecurso = new javax.swing.JFrame();
        jLabel148 = new javax.swing.JLabel();
        cla_recurso_ir1 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        nombre_ir1 = new javax.swing.JTextField();
        Modificar_ir = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        Combo_Recurso = new javax.swing.JComboBox<>();
        go_recurso = new javax.swing.JButton();
        FrameEliminarRecurso = new javax.swing.JFrame();
        jLabel154 = new javax.swing.JLabel();
        Combo_Recurso2 = new javax.swing.JComboBox<>();
        go_recurso2 = new javax.swing.JButton();
        FrameConsultarRecurso = new javax.swing.JFrame();
        jLabel151 = new javax.swing.JLabel();
        Combo_Recurso1 = new javax.swing.JComboBox<>();
        go_recurso1 = new javax.swing.JButton();
        jLabel152 = new javax.swing.JLabel();
        cla_recurso_ir2 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        nombre_ir2 = new javax.swing.JTextField();
        FrameInsertarResguardos = new javax.swing.JFrame();
        jLabel155 = new javax.swing.JLabel();
        id_resguardo_irr = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        fecha_irr = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        ubicacion_irr = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        sub_responsable_irr = new javax.swing.JTextField();
        Anadir_irr = new javax.swing.JButton();
        id_personal_irr = new javax.swing.JComboBox<>();
        no_serie_irr = new javax.swing.JComboBox<>();
        FrameModificarResguardos = new javax.swing.JFrame();
        jLabel161 = new javax.swing.JLabel();
        id_resguardo_irr1 = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        fecha_irr1 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        ubicacion_irr1 = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        sub_responsable_irr1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel167 = new javax.swing.JLabel();
        id_resg = new javax.swing.JComboBox<>();
        go_irr = new javax.swing.JButton();
        no_serie_irr3 = new javax.swing.JComboBox<>();
        id_personal_irr3 = new javax.swing.JComboBox<>();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        FrameEliminarResguardos = new javax.swing.JFrame();
        jLabel175 = new javax.swing.JLabel();
        id_resg2 = new javax.swing.JComboBox<>();
        Eliminar_resg = new javax.swing.JButton();
        FrameConsultarResguardos = new javax.swing.JFrame();
        jLabel168 = new javax.swing.JLabel();
        id_resg3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel169 = new javax.swing.JLabel();
        id_resguardo_irr2 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        no_serie_irr2 = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        id_personal_irr2 = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        fecha_irr2 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        ubicacion_irr2 = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        sub_responsable_irr2 = new javax.swing.JTextField();
        FrameInsertarUsuarios = new javax.swing.JFrame();
        FrameModificarUsuarios = new javax.swing.JFrame();
        FrameEliminarUsuarios = new javax.swing.JFrame();
        FrameConsultarUsuarios = new javax.swing.JFrame();
        MenuBar = new javax.swing.JMenuBar();
        MenuArticulos = new javax.swing.JMenu();
        MenuInsertarArticulo = new javax.swing.JMenuItem();
        MenuModificarArticulo = new javax.swing.JMenuItem();
        MenuEliminarArticulo = new javax.swing.JMenuItem();
        MenuMostrarArticulo = new javax.swing.JMenuItem();
        MenuArticulos5 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        MenuBajas = new javax.swing.JMenu();
        MenuInsertarBajas = new javax.swing.JMenuItem();
        MenuModificarBajas = new javax.swing.JMenuItem();
        MenuEliminarBajas = new javax.swing.JMenuItem();
        MenuMostrarBajas = new javax.swing.JMenuItem();
        MenuDestinos = new javax.swing.JMenu();
        MenuInsertarDestinos = new javax.swing.JMenuItem();
        MenuModificarDestinos = new javax.swing.JMenuItem();
        MenuEliminarDestinos = new javax.swing.JMenuItem();
        MenuMostrarDestinos = new javax.swing.JMenuItem();
        MenuPartidas = new javax.swing.JMenu();
        MenuInsertarPartidas = new javax.swing.JMenuItem();
        MenuModificarPartidas = new javax.swing.JMenuItem();
        MenuEliminarPartidas = new javax.swing.JMenuItem();
        MenuMostrarPartidas = new javax.swing.JMenuItem();
        MenuPersonal = new javax.swing.JMenu();
        MenuInsertarPersonal = new javax.swing.JMenuItem();
        MenuModificarPersonal = new javax.swing.JMenuItem();
        MenuEliminarPersonal = new javax.swing.JMenuItem();
        MenuMostrarPersonal = new javax.swing.JMenuItem();
        MenuRecursos = new javax.swing.JMenu();
        MenuInsertarRecursos = new javax.swing.JMenuItem();
        MenuModificarRecursos = new javax.swing.JMenuItem();
        MenuEliminarRecursos = new javax.swing.JMenuItem();
        MenuMostrarRecursos = new javax.swing.JMenuItem();
        MenuResguardos = new javax.swing.JMenu();
        MenuInsertarResguardos = new javax.swing.JMenuItem();
        MenuModificarResguardos = new javax.swing.JMenuItem();
        MenuEliminarResguardos = new javax.swing.JMenuItem();
        MenuMostrarResguardos = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JMenu();
        MenuInsertarUsuarios = new javax.swing.JMenuItem();
        MenuModificarUsuarios = new javax.swing.JMenuItem();
        MenuEliminarUsuarios = new javax.swing.JMenuItem();
        MenuMostrarUsuarios = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        FieldNo_Serie.setEditable(false);
        FieldNo_Serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNo_SerieActionPerformed(evt);
            }
        });

        jLabel1.setText("No_Serie:  ");

        jLabel11.setText("Costo Act:");

        FieldCostoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCostoActualActionPerformed(evt);
            }
        });

        FieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldStatusActionPerformed(evt);
            }
        });

        FieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMarcaActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel3.setText("Modelo:");

        FieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldModeloActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        FieldAVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAVidaActionPerformed(evt);
            }
        });

        jLabel12.setText("Status:");

        jLabel13.setText("A. Vida:");

        jLabel5.setText("No. Resguardo");

        FieldResguardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldResguardoActionPerformed(evt);
            }
        });

        jLabel7.setText("No. Patrimonio");

        FieldPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPatrimonioActionPerformed(evt);
            }
        });

        jLabel14.setText("Caracteristicas:");

        FieldCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCaracteristicasActionPerformed(evt);
            }
        });

        jLabel15.setText("Clave Recurso:");

        FieldClaveRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldClaveRecursoActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota:");

        FieldNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNotaActionPerformed(evt);
            }
        });

        jLabel8.setText("A. Compra");

        FieldACompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldACompraActionPerformed(evt);
            }
        });

        jLabel17.setText("Proveedor:");

        FieldProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProveedorActionPerformed(evt);
            }
        });

        jLabel9.setText("No_Factura");

        FieldFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldFacturaActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio_Fac");

        FieldPrecio_Fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecio_FacActionPerformed(evt);
            }
        });

        jLabel16.setText("Id. Partida");

        FieldPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPartidaActionPerformed(evt);
            }
        });

        jLabel18.setText("Tipo Bien:");

        FieldBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBienActionPerformed(evt);
            }
        });

        BotonActualizarArticulos.setText("Actualizar");
        BotonActualizarArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonActualizarArticulosMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("No_Serie Articulo:");

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        BotonSeleccionar.setText("Go");
        BotonSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSeleccionarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarArticulosLayout = new javax.swing.GroupLayout(FrameModificarArticulos.getContentPane());
        FrameModificarArticulos.getContentPane().setLayout(FrameModificarArticulosLayout);
        FrameModificarArticulosLayout.setHorizontalGroup(
            FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FieldACompra)
                                    .addComponent(FieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FieldFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FieldResguardo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FieldModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FieldNo_Serie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FieldPatrimonio))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldPrecio_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))))
                        .addGap(68, 68, 68)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameModificarArticulosLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addGap(18, 18, 18)
                                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FieldPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(FieldBien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(BotonActualizarArticulos))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldCostoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldAVida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(FieldClaveRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(FieldCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        FrameModificarArticulosLayout.setVerticalGroup(
            FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarArticulosLayout.createSequentialGroup()
                .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldCostoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(FieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(FieldAVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(FieldCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(FieldClaveRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(FieldProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(FieldPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldBien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(FrameModificarArticulosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSeleccionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FieldNo_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(FieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FieldResguardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(FieldPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldACompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldPrecio_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(35, 35, 35)
                .addComponent(BotonActualizarArticulos)
                .addContainerGap())
        );

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("No_Serie Articulo:");

        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        BotonSeleccionar2.setText("Eliminar");
        BotonSeleccionar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSeleccionar2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarArticulosLayout = new javax.swing.GroupLayout(FrameEliminarArticulos.getContentPane());
        FrameEliminarArticulos.getContentPane().setLayout(FrameEliminarArticulosLayout);
        FrameEliminarArticulosLayout.setHorizontalGroup(
            FrameEliminarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarArticulosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSeleccionar2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        FrameEliminarArticulosLayout.setVerticalGroup(
            FrameEliminarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarArticulosLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(FrameEliminarArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSeleccionar2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel20.setText("Precio_Fac");

        FieldPrecio_Fac1.setEditable(false);
        FieldPrecio_Fac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPrecio_Fac1ActionPerformed(evt);
            }
        });

        FieldFactura1.setEditable(false);
        FieldFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldFactura1ActionPerformed(evt);
            }
        });

        jLabel21.setText("No_Factura");

        jLabel22.setText("A. Compra");

        FieldACompra1.setEditable(false);
        FieldACompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldACompra1ActionPerformed(evt);
            }
        });

        FieldNota1.setEditable(false);
        FieldNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNota1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Nota:");

        jLabel24.setText("No. Patrimonio");

        FieldPatrimonio1.setEditable(false);
        FieldPatrimonio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPatrimonio1ActionPerformed(evt);
            }
        });

        FieldResguardo1.setEditable(false);
        FieldResguardo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldResguardo1ActionPerformed(evt);
            }
        });

        jLabel25.setText("No. Resguardo");

        jLabel26.setText("Nombre:");

        FieldNombre1.setEditable(false);
        FieldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombre1ActionPerformed(evt);
            }
        });

        jLabel27.setText("Modelo:");

        FieldModelo1.setEditable(false);
        FieldModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldModelo1ActionPerformed(evt);
            }
        });

        jLabel28.setText("Marca:");

        FieldMarca1.setEditable(false);
        FieldMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMarca1ActionPerformed(evt);
            }
        });

        jLabel29.setText("No_Serie:  ");

        FieldNo_Serie1.setEditable(false);
        FieldNo_Serie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNo_Serie1ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("No_Serie Articulo:");

        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        BotonSeleccionar1.setText("Go");
        BotonSeleccionar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSeleccionar1MousePressed(evt);
            }
        });

        FieldCostoActual1.setEditable(false);
        FieldCostoActual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCostoActual1ActionPerformed(evt);
            }
        });

        jLabel31.setText("Costo Act:");

        jLabel32.setText("Status:");

        FieldStatus1.setEditable(false);
        FieldStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldStatus1ActionPerformed(evt);
            }
        });

        jLabel33.setText("A. Vida:");

        FieldAVida1.setEditable(false);
        FieldAVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAVida1ActionPerformed(evt);
            }
        });

        jLabel34.setText("Caracteristicas:");

        FieldCaracteristicas1.setEditable(false);
        FieldCaracteristicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCaracteristicas1ActionPerformed(evt);
            }
        });

        jLabel35.setText("Clave Recurso:");

        FieldClaveRecurso1.setEditable(false);
        FieldClaveRecurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldClaveRecurso1ActionPerformed(evt);
            }
        });

        jLabel36.setText("Proveedor:");

        FieldProveedor1.setEditable(false);
        FieldProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProveedor1ActionPerformed(evt);
            }
        });

        jLabel37.setText("Id. Partida");

        FieldPartida1.setEditable(false);
        FieldPartida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPartida1ActionPerformed(evt);
            }
        });

        jLabel38.setText("Tipo Bien:");

        FieldBien1.setEditable(false);
        FieldBien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBien1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameSeleccionarLayout = new javax.swing.GroupLayout(FrameSeleccionar.getContentPane());
        FrameSeleccionar.getContentPane().setLayout(FrameSeleccionarLayout);
        FrameSeleccionarLayout.setHorizontalGroup(
            FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldACompra1)
                            .addComponent(FieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FieldFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FieldResguardo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                            .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel28)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FieldModelo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldNo_Serie1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FieldPatrimonio1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(FieldPrecio_Fac1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldCostoActual1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(FieldStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(FieldAVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(FieldCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameSeleccionarLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                                    .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel36))
                                    .addGap(18, 18, 18)
                                    .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FieldPartida1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FieldProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel38)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldBien1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameSeleccionarLayout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(18, 18, 18)
                            .addComponent(FieldClaveRecurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97))
            .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(jLabel31)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jLabel30)
                    .addGap(18, 18, 18)
                    .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(BotonSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        FrameSeleccionarLayout.setVerticalGroup(
            FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(FieldNo_Serie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(FieldMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(FieldModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(FieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(FieldResguardo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(FieldPatrimonio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldACompra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldPrecio_Fac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                        .addComponent(FieldCostoActual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(FieldStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(FieldAVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(FieldCaracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(FieldClaveRecurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(FieldProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(FieldPartida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldBien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrameSeleccionarLayout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(jLabel31))
                        .addGroup(FrameSeleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSeleccionar1)))
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaActionPerformed(evt);
            }
        });

        jLabel40.setText("nota");

        id_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_bajaActionPerformed(evt);
            }
        });

        jLabel41.setText("Id_Baja");

        jLabel42.setText("Motivo");

        motivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motivoActionPerformed(evt);
            }
        });

        jLabel43.setText("Fecha_Baja");

        fecha_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_bajaActionPerformed(evt);
            }
        });

        a_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_compraActionPerformed(evt);
            }
        });

        jLabel44.setText("a_compra");

        jLabel45.setText("no_factura");

        no_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_facturaActionPerformed(evt);
            }
        });

        laneld.setText("observacion_baja");

        observacion_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacion_bajaActionPerformed(evt);
            }
        });

        jLabel47.setText("no_serie");

        no_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_serieActionPerformed(evt);
            }
        });

        jLabel48.setText("pecio_fac");

        precio_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_facActionPerformed(evt);
            }
        });

        labelde3.setText("marca");

        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        jLabel50.setText("modelo");

        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });

        jLabel51.setText("costo_act");

        costo_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costo_actActionPerformed(evt);
            }
        });

        jLabel52.setText("nombre");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel53.setText("status");

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel54.setText("no_resguardo");

        no_resguardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_resguardoActionPerformed(evt);
            }
        });

        jLabel55.setText("a_vida");

        a_vida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_vidaActionPerformed(evt);
            }
        });

        jLabel56.setText("no_patrimonio");

        no_patrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_patrimonioActionPerformed(evt);
            }
        });

        jLabel57.setText("caracteristicas");

        caracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caracteristicasActionPerformed(evt);
            }
        });

        jLabel58.setText("id_partida");

        id_partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_partidaActionPerformed(evt);
            }
        });

        jLabel59.setText("cla_recur");

        cla_recur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cla_recurActionPerformed(evt);
            }
        });

        jLabel60.setText("proveedor");

        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        jLabel61.setText("tipo_bien");

        tipo_bien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_bienActionPerformed(evt);
            }
        });

        jLabel62.setText("cla_destino");

        cla_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cla_destinoActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarBajasLayout = new javax.swing.GroupLayout(FrameInsertarBajas.getContentPane());
        FrameInsertarBajas.getContentPane().setLayout(FrameInsertarBajasLayout);
        FrameInsertarBajasLayout.setHorizontalGroup(
            FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel53)))
                            .addComponent(jLabel51)
                            .addComponent(jLabel48)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addGap(18, 18, 18)
                                    .addComponent(a_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addGap(18, 18, 18)
                                    .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precio_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(labelde3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(a_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(costo_act, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel57)
                                        .addGap(18, 18, 18)
                                        .addComponent(caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                            .addComponent(jLabel60)
                                            .addGap(18, 18, 18)
                                            .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                            .addComponent(jLabel59)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cla_recur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(18, 18, 18)
                                        .addComponent(cla_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43))))
            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id_partida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(18, 18, 18)
                                .addComponent(tipo_bien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel52)
                                .addComponent(jLabel50))
                            .addGap(18, 18, 18)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(modelo)))
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(no_resguardo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                                .addComponent(laneld)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(observacion_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_baja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_baja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(18, 18, 18)
                                .addComponent(no_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(marca)
                                .addComponent(no_serie, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                    .addGap(99, 99, 99)
                    .addComponent(jLabel40)
                    .addGap(18, 18, 18)
                    .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        FrameInsertarBajasLayout.setVerticalGroup(
            FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(a_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(precio_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelde3))
                            .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(costo_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cla_recur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_partida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_bien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(cla_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FrameInsertarBajasLayout.createSequentialGroup()
                            .addComponent(id_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel43)
                                .addComponent(fecha_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(laneld)
                                .addComponent(observacion_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addComponent(no_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel52))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(no_resguardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(no_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel56)))
                        .addGroup(FrameInsertarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addContainerGap(118, Short.MAX_VALUE)))
        );

        jLabel109.setText("Id_ Bajas:");

        BotonEliminarBajas.setText("Eliminar");
        BotonEliminarBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEliminarBajasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarBajasLayout = new javax.swing.GroupLayout(FrameEliminarBajas.getContentPane());
        FrameEliminarBajas.getContentPane().setLayout(FrameEliminarBajasLayout);
        FrameEliminarBajasLayout.setHorizontalGroup(
            FrameEliminarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarBajasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel109)
                .addGap(18, 18, 18)
                .addComponent(ComboEliminarBajas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarBajas)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        FrameEliminarBajasLayout.setVerticalGroup(
            FrameEliminarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarBajasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(FrameEliminarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(ComboEliminarBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarBajas))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel46.setText("ID_BAJA: ");

        id_baja1.setEditable(false);

        jLabel49.setText("Motivo:");

        jLabel63.setText("Fecha_baja");

        jLabel64.setText("Observacion_Baja: ");

        jLabel65.setText("No. Serie");

        jLabel66.setText("Marca:");

        jLabel67.setText("Modelo:");

        jLabel68.setText("Nombre: ");

        jLabel69.setText("No. Resguardo:");

        jLabel70.setText("No. Patrimonio:");

        jLabel71.setText("Nota:");

        jLabel72.setText("A. Compra:");

        jLabel73.setText("No. Factura:");

        jLabel74.setText("Precio. Fac:");

        jLabel75.setText("Costo. Actual:");

        jLabel76.setText("Status:");

        jLabel77.setText("A. Vida:");

        jLabel78.setText("Caracteristicas:");

        jLabel79.setText("Cla. Recurso:");

        jLabel80.setText("Proveedor:");

        jLabel81.setText("ID. Partida:");

        jLabel82.setText("Tipo. Bien:");

        jLabel83.setText("Cla. Destino:");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("ID. Bajas:");

        BotonBajas1.setText("Go");
        BotonBajas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBajas1MousePressed(evt);
            }
        });

        BotonMoficiar.setText("Modificar");
        BotonMoficiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonMoficiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarBajasLayout = new javax.swing.GroupLayout(FrameModificarBajas.getContentPane());
        FrameModificarBajas.getContentPane().setLayout(FrameModificarBajasLayout);
        FrameModificarBajasLayout.setHorizontalGroup(
            FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addGap(18, 18, 18)
                                .addComponent(a_vida1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(18, 18, 18)
                                .addComponent(costo_act1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addGap(18, 18, 18)
                                .addComponent(no_factura1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(18, 18, 18)
                                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addGap(18, 18, 18)
                                .addComponent(no_resguardo1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(18, 18, 18)
                                .addComponent(modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addGap(18, 18, 18)
                                .addComponent(no_serie1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(18, 18, 18)
                                .addComponent(fecha_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(id_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel70)
                                        .addGap(18, 18, 18)
                                        .addComponent(no_patrimonio1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel49)
                                                .addGap(18, 18, 18)
                                                .addComponent(motivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel64)
                                                .addGap(18, 18, 18)
                                                .addComponent(observacion_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel66)
                                                .addGap(18, 18, 18)
                                                .addComponent(marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel68)
                                                .addGap(18, 18, 18)
                                                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addGap(18, 18, 18)
                                        .addComponent(a_compra1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel74)
                                        .addGap(18, 18, 18)
                                        .addComponent(precio_fac1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel76)
                                        .addGap(18, 18, 18)
                                        .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel78)
                                        .addGap(18, 18, 18)
                                        .addComponent(caracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(18, 18, 18)
                                .addComponent(id_partida1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18)
                                .addComponent(cla_recur1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(18, 18, 18)
                                .addComponent(cla_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addGap(18, 18, 18)
                                .addComponent(proveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(18, 18, 18)
                                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonMoficiar)
                                    .addComponent(tipo_bien1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel84)
                .addGap(18, 18, 18)
                .addComponent(ComboBajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameModificarBajasLayout.setVerticalGroup(
            FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarBajasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(ComboBajas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBajas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(id_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(motivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(fecha_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(observacion_baja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(no_serie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(no_resguardo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(no_patrimonio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(a_compra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(no_factura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(precio_fac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(costo_act1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(a_vida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(caracteristicas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(cla_recur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(proveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(id_partida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82)
                    .addComponent(tipo_bien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameModificarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(cla_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrameModificarBajasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BotonMoficiar)))
                .addGap(27, 27, 27))
        );

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("ID. Bajas:");

        BotonBajas2.setText("Go");
        BotonBajas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBajas2MousePressed(evt);
            }
        });

        jLabel86.setText("ID_BAJA: ");

        id_baja2.setEditable(false);

        jLabel87.setText("Motivo:");

        motivo2.setEditable(false);

        jLabel88.setText("Fecha_baja");

        fecha_baja2.setEditable(false);

        jLabel89.setText("Observacion_Baja: ");

        observacion_baja2.setEditable(false);

        jLabel90.setText("No. Serie");

        no_serie2.setEditable(false);

        jLabel91.setText("Marca:");

        marca2.setEditable(false);

        jLabel92.setText("Modelo:");

        modelo2.setEditable(false);

        jLabel93.setText("Nombre: ");

        nombre2.setEditable(false);

        jLabel94.setText("No. Resguardo:");

        no_resguardo2.setEditable(false);

        jLabel95.setText("No. Patrimonio:");

        no_patrimonio2.setEditable(false);

        jLabel96.setText("Nota:");

        nota2.setEditable(false);

        jLabel97.setText("A. Compra:");

        a_compra2.setEditable(false);

        jLabel98.setText("No. Factura:");

        no_factura2.setEditable(false);

        jLabel99.setText("Precio. Fac:");

        precio_fac2.setEditable(false);

        jLabel100.setText("Costo. Actual:");

        costo_act2.setEditable(false);

        jLabel101.setText("Status:");

        status2.setEditable(false);

        jLabel102.setText("A. Vida:");

        a_vida2.setEditable(false);

        jLabel103.setText("Caracteristicas:");

        caracteristicas2.setEditable(false);

        jLabel104.setText("Cla. Recurso:");

        cla_recur2.setEditable(false);

        jLabel105.setText("Proveedor:");

        proveedor2.setEditable(false);

        jLabel106.setText("ID. Partida:");

        id_partida2.setEditable(false);

        jLabel107.setText("Tipo. Bien:");

        tipo_bien2.setEditable(false);

        jLabel108.setText("Cla. Destino:");

        cla_destino2.setEditable(false);

        javax.swing.GroupLayout FrameSeleccionarBajasLayout = new javax.swing.GroupLayout(FrameSeleccionarBajas.getContentPane());
        FrameSeleccionarBajas.getContentPane().setLayout(FrameSeleccionarBajasLayout);
        FrameSeleccionarBajasLayout.setHorizontalGroup(
            FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                        .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addGap(18, 18, 18)
                                .addComponent(a_vida2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addGap(18, 18, 18)
                                .addComponent(costo_act2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addGap(18, 18, 18)
                                .addComponent(no_factura2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel96)
                                .addGap(18, 18, 18)
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addGap(18, 18, 18)
                                .addComponent(no_resguardo2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addGap(18, 18, 18)
                                .addComponent(modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addGap(18, 18, 18)
                                .addComponent(no_serie2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addGap(18, 18, 18)
                                .addComponent(fecha_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addGap(18, 18, 18)
                                .addComponent(id_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel95)
                                        .addGap(18, 18, 18)
                                        .addComponent(no_patrimonio2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel87)
                                                .addGap(18, 18, 18)
                                                .addComponent(motivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel89)
                                                .addGap(18, 18, 18)
                                                .addComponent(observacion_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel91)
                                                .addGap(18, 18, 18)
                                                .addComponent(marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                                .addComponent(jLabel93)
                                                .addGap(18, 18, 18)
                                                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 36, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel97)
                                        .addGap(18, 18, 18)
                                        .addComponent(a_compra2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel99)
                                        .addGap(18, 18, 18)
                                        .addComponent(precio_fac2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel101)
                                        .addGap(18, 18, 18)
                                        .addComponent(status2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                        .addComponent(jLabel103)
                                        .addGap(18, 18, 18)
                                        .addComponent(caracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addGap(18, 18, 18)
                                .addComponent(id_partida2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addGap(18, 18, 18)
                                .addComponent(cla_recur2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel108)
                                .addGap(18, 18, 18)
                                .addComponent(cla_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addGap(18, 18, 18)
                                .addComponent(proveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addGap(18, 18, 18)
                                .addComponent(tipo_bien2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(FrameSeleccionarBajasLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel85)
                .addGap(18, 18, 18)
                .addComponent(ComboBajas2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBajas2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameSeleccionarBajasLayout.setVerticalGroup(
            FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameSeleccionarBajasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(ComboBajas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBajas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(id_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(motivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(fecha_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(observacion_baja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(no_serie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(marca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(no_resguardo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95)
                    .addComponent(no_patrimonio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(a_compra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(no_factura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(precio_fac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(costo_act2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(status2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(a_vida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103)
                    .addComponent(caracteristicas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(cla_recur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105)
                    .addComponent(proveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(id_partida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107)
                    .addComponent(tipo_bien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSeleccionarBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(cla_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jLabel110.setText("ID. Destino: ");

        jLabel111.setText("Nombre:");

        BotonInsertarDestino.setText("Insertar");
        BotonInsertarDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonInsertarDestinoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarDestinosLayout = new javax.swing.GroupLayout(FrameInsertarDestinos.getContentPane());
        FrameInsertarDestinos.getContentPane().setLayout(FrameInsertarDestinosLayout);
        FrameInsertarDestinosLayout.setHorizontalGroup(
            FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarDestinosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FrameInsertarDestinosLayout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(18, 18, 18)
                        .addComponent(id_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarDestinosLayout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FrameInsertarDestinosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BotonInsertarDestino)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        FrameInsertarDestinosLayout.setVerticalGroup(
            FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarDestinosLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(id_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(nombre_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(BotonInsertarDestino)
                .addGap(25, 25, 25))
        );

        jLabel112.setText("Id_Destino");

        jButton2.setText("Go");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jLabel115.setText("ID. Destino: ");

        id_destino2.setEditable(false);

        jLabel116.setText("Nombre:");

        BotonModificarDestino.setText("Modificar");
        BotonModificarDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonModificarDestinoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarDestinosLayout = new javax.swing.GroupLayout(FrameModificarDestinos.getContentPane());
        FrameModificarDestinos.getContentPane().setLayout(FrameModificarDestinosLayout);
        FrameModificarDestinosLayout.setHorizontalGroup(
            FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarDestinosLayout.createSequentialGroup()
                .addGroup(FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameModificarDestinosLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(ComboDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(FrameModificarDestinosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FrameModificarDestinosLayout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addGap(18, 18, 18)
                                .addComponent(id_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarDestinosLayout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombre_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarDestinosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonModificarDestino)
                .addGap(73, 73, 73))
        );
        FrameModificarDestinosLayout.setVerticalGroup(
            FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarDestinosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(ComboDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(64, 64, 64)
                .addGroup(FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(id_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(nombre_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(BotonModificarDestino)
                .addGap(33, 33, 33))
        );

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Id_Destino");

        Go4.setText("Eliminar");
        Go4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Go4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarDestinosLayout = new javax.swing.GroupLayout(FrameEliminarDestinos.getContentPane());
        FrameEliminarDestinos.getContentPane().setLayout(FrameEliminarDestinosLayout);
        FrameEliminarDestinosLayout.setHorizontalGroup(
            FrameEliminarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarDestinosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel120)
                .addGap(28, 28, 28)
                .addComponent(ComboDestino3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Go4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        FrameEliminarDestinosLayout.setVerticalGroup(
            FrameEliminarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarDestinosLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(FrameEliminarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(ComboDestino3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Go4))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jLabel117.setText("Id_Destino");

        Go3.setText("Go");
        Go3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Go3MousePressed(evt);
            }
        });

        jLabel118.setText("ID. Destino: ");

        id_destino3.setEditable(false);

        jLabel119.setText("Nombre:");

        nombre_destino3.setEditable(false);

        javax.swing.GroupLayout FrameConsultarDestinosLayout = new javax.swing.GroupLayout(FrameConsultarDestinos.getContentPane());
        FrameConsultarDestinos.getContentPane().setLayout(FrameConsultarDestinosLayout);
        FrameConsultarDestinosLayout.setHorizontalGroup(
            FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarDestinosLayout.createSequentialGroup()
                .addGroup(FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameConsultarDestinosLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel117)
                        .addGap(18, 18, 18)
                        .addComponent(ComboDestino2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Go3))
                    .addGroup(FrameConsultarDestinosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FrameConsultarDestinosLayout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addGap(18, 18, 18)
                                .addComponent(id_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarDestinosLayout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombre_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        FrameConsultarDestinosLayout.setVerticalGroup(
            FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarDestinosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(ComboDestino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Go3))
                .addGap(64, 64, 64)
                .addGroup(FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(id_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarDestinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(nombre_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jLabel121.setText("Id_Partida:");

        jLabel122.setText("Nom_Partida:");

        insertarbuton.setText("Insertar");
        insertarbuton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertarbutonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarPartidasLayout = new javax.swing.GroupLayout(FrameInsertarPartidas.getContentPane());
        FrameInsertarPartidas.getContentPane().setLayout(FrameInsertarPartidasLayout);
        FrameInsertarPartidasLayout.setHorizontalGroup(
            FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                .addGroup(FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_partida3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(18, 18, 18)
                                .addComponent(id_partida3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(insertarbuton)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        FrameInsertarPartidasLayout.setVerticalGroup(
            FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarPartidasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(id_partida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(nom_partida3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(insertarbuton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel123.setText("Id_Partida:");

        id_partida4.setEditable(false);

        jLabel124.setText("Nom_Partida:");

        insertarbuton1.setText("Actualizar");
        insertarbuton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertarbuton1MousePressed(evt);
            }
        });

        jLabel127.setText("Id_Partida:");

        jButton3.setText("Go");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarPartidasLayout = new javax.swing.GroupLayout(FrameModificarPartidas.getContentPane());
        FrameModificarPartidas.getContentPane().setLayout(FrameModificarPartidasLayout);
        FrameModificarPartidasLayout.setHorizontalGroup(
            FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                        .addGroup(FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                                .addComponent(jLabel124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_partida4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                                .addComponent(jLabel123)
                                .addGap(18, 18, 18)
                                .addComponent(id_partida4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(insertarbuton1)))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(FrameModificarPartidasLayout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addGap(29, 29, 29)
                        .addComponent(ComboPartidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(80, 80, 80))))
        );
        FrameModificarPartidasLayout.setVerticalGroup(
            FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarPartidasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(ComboPartidas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(id_partida4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(nom_partida4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(insertarbuton1)
                .addGap(60, 60, 60))
        );

        jLabel129.setText("Id_Partida:");

        jButton5.setText("Eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarPartidasLayout = new javax.swing.GroupLayout(FrameEliminarPartidas.getContentPane());
        FrameEliminarPartidas.getContentPane().setLayout(FrameEliminarPartidasLayout);
        FrameEliminarPartidasLayout.setHorizontalGroup(
            FrameEliminarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarPartidasLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel129)
                .addGap(29, 29, 29)
                .addComponent(ComboPartidas3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        FrameEliminarPartidasLayout.setVerticalGroup(
            FrameEliminarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarPartidasLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(FrameEliminarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(ComboPartidas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel125.setText("Id_Partida:");

        id_partida5.setEditable(false);

        jLabel126.setText("Nom_Partida:");

        nom_partida5.setEditable(false);

        jLabel128.setText("Id_Partida:");

        jButton4.setText("Go");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameConsultarPartidasLayout = new javax.swing.GroupLayout(FrameConsultarPartidas.getContentPane());
        FrameConsultarPartidas.getContentPane().setLayout(FrameConsultarPartidasLayout);
        FrameConsultarPartidasLayout.setHorizontalGroup(
            FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarPartidasLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameConsultarPartidasLayout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addGap(29, 29, 29)
                        .addComponent(ComboPartidas2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(FrameConsultarPartidasLayout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nom_partida5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameConsultarPartidasLayout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addGap(18, 18, 18)
                        .addComponent(id_partida5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        FrameConsultarPartidasLayout.setVerticalGroup(
            FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarPartidasLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(ComboPartidas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(42, 42, 42)
                .addGroup(FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(id_partida5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(nom_partida5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        jLabel130.setText("Id. Personal:");

        jLabel131.setText("Puesto:");

        jLabel132.setText("Nombre:");

        jLabel133.setText("Area Asig:");

        jLabel134.setText("Nombre Jefe:");

        Insertar_ip.setText("Agregar");
        Insertar_ip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Insertar_ipMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarPersonalLayout = new javax.swing.GroupLayout(FrameInsertarPersonal.getContentPane());
        FrameInsertarPersonal.getContentPane().setLayout(FrameInsertarPersonalLayout);
        FrameInsertarPersonalLayout.setHorizontalGroup(
            FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarPersonalLayout.createSequentialGroup()
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInsertarPersonalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel130)
                                .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel134))
                        .addGap(18, 18, 18)
                        .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_jefe_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puesto_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_personal_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area_asig_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrameInsertarPersonalLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Insertar_ip)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        FrameInsertarPersonalLayout.setVerticalGroup(
            FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarPersonalLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(id_personal_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(nombre_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(puesto_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_asig_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addGap(11, 11, 11)
                .addGroup(FrameInsertarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jefe_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addGap(18, 18, 18)
                .addComponent(Insertar_ip)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel135.setText("Id. Personal:");

        id_personal_ip1.setEditable(false);

        jLabel136.setText("Nombre:");

        jLabel137.setText("Puesto:");

        jLabel138.setText("Area Asig:");

        jLabel139.setText("Nombre Jefe:");

        jLabel113.setText("Id. Personal:");

        go_ip.setText("Go");
        go_ip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_ipMousePressed(evt);
            }
        });

        Modificar_ip.setText("Modificar");
        Modificar_ip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Modificar_ipMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarPersonalLayout = new javax.swing.GroupLayout(FrameModificarPersonal.getContentPane());
        FrameModificarPersonal.getContentPane().setLayout(FrameModificarPersonalLayout);
        FrameModificarPersonalLayout.setHorizontalGroup(
            FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarPersonalLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameModificarPersonalLayout.createSequentialGroup()
                        .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel135)
                                .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel139))
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_jede_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puesto_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_personal_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area_asig_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrameModificarPersonalLayout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificar_ip)
                .addGap(147, 147, 147))
        );
        FrameModificarPersonalLayout.setVerticalGroup(
            FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarPersonalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(Combo_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_ip))
                .addGap(18, 18, 18)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(id_personal_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(nombre_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(puesto_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_asig_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138))
                .addGap(11, 11, 11)
                .addGroup(FrameModificarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jede_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139))
                .addGap(18, 18, 18)
                .addComponent(Modificar_ip)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel114.setText("Id. Personal:");

        go_ip1.setText("Eliminar");
        go_ip1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_ip1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarPersonalLayout = new javax.swing.GroupLayout(FrameEliminarPersonal.getContentPane());
        FrameEliminarPersonal.getContentPane().setLayout(FrameEliminarPersonalLayout);
        FrameEliminarPersonalLayout.setHorizontalGroup(
            FrameEliminarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarPersonalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel114)
                .addGap(18, 18, 18)
                .addComponent(Combo_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_ip1)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        FrameEliminarPersonalLayout.setVerticalGroup(
            FrameEliminarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarPersonalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(FrameEliminarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(Combo_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_ip1))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jLabel140.setText("Id. Personal:");

        id_personal_ip2.setEditable(false);

        jLabel141.setText("Nombre:");

        nombre_ip2.setEditable(false);

        jLabel142.setText("Puesto:");

        puesto_ip2.setEditable(false);

        jLabel143.setText("Area Asig:");

        area_asig_ip2.setEditable(false);

        jLabel144.setText("Nombre Jefe:");

        nombre_jede_ip2.setEditable(false);

        jLabel145.setText("Id. Personal:");

        go_ip2.setText("Go");
        go_ip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_ip2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameConsultarPersonalLayout = new javax.swing.GroupLayout(FrameConsultarPersonal.getContentPane());
        FrameConsultarPersonal.getContentPane().setLayout(FrameConsultarPersonalLayout);
        FrameConsultarPersonalLayout.setHorizontalGroup(
            FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarPersonalLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel140)
                        .addComponent(jLabel143, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel142, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel141, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel144))
                .addGap(18, 18, 18)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_jede_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puesto_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_personal_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area_asig_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarPersonalLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel145)
                .addGap(18, 18, 18)
                .addComponent(Combo_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        FrameConsultarPersonalLayout.setVerticalGroup(
            FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarPersonalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(Combo_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_ip2))
                .addGap(18, 18, 18)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(id_personal_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(nombre_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(puesto_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_asig_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143))
                .addGap(11, 11, 11)
                .addGroup(FrameConsultarPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_jede_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel144))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel146.setText("Cla. Recurso:");

        cla_recurso_ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cla_recurso_irActionPerformed(evt);
            }
        });

        jLabel147.setText("Nombre:");

        nombre_ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_irActionPerformed(evt);
            }
        });

        Insertar_ir.setText("Agregar");
        Insertar_ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Insertar_irMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarRecursoLayout = new javax.swing.GroupLayout(FrameInsertarRecurso.getContentPane());
        FrameInsertarRecurso.getContentPane().setLayout(FrameInsertarRecursoLayout);
        FrameInsertarRecursoLayout.setHorizontalGroup(
            FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarRecursoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameInsertarRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel146)
                        .addGap(18, 18, 18)
                        .addComponent(cla_recurso_ir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameInsertarRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel147)
                        .addGap(18, 18, 18)
                        .addGroup(FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Insertar_ir)
                            .addComponent(nombre_ir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        FrameInsertarRecursoLayout.setVerticalGroup(
            FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarRecursoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146)
                    .addComponent(cla_recurso_ir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(nombre_ir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Insertar_ir)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jLabel148.setText("Cla. Recurso:");

        cla_recurso_ir1.setEditable(false);
        cla_recurso_ir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cla_recurso_ir1ActionPerformed(evt);
            }
        });

        jLabel149.setText("Nombre:");

        nombre_ir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_ir1ActionPerformed(evt);
            }
        });

        Modificar_ir.setText("Modificar");
        Modificar_ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Modificar_irMousePressed(evt);
            }
        });

        jLabel150.setText("Cla. Recurso");

        go_recurso.setText("Go");
        go_recurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_recursoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameModificarRecursoLayout = new javax.swing.GroupLayout(FrameModificarRecurso.getContentPane());
        FrameModificarRecurso.getContentPane().setLayout(FrameModificarRecursoLayout);
        FrameModificarRecursoLayout.setHorizontalGroup(
            FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarRecursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificar_ir)
                .addGap(148, 148, 148))
            .addGroup(FrameModificarRecursoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameModificarRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel149)
                        .addGap(18, 18, 18)
                        .addComponent(nombre_ir1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameModificarRecursoLayout.createSequentialGroup()
                        .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarRecursoLayout.createSequentialGroup()
                                .addComponent(jLabel148)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarRecursoLayout.createSequentialGroup()
                                .addComponent(jLabel150)
                                .addGap(37, 37, 37)))
                        .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cla_recurso_ir1)
                            .addComponent(Combo_Recurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_recurso)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        FrameModificarRecursoLayout.setVerticalGroup(
            FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarRecursoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(Combo_Recurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_recurso))
                .addGap(26, 26, 26)
                .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel148)
                    .addComponent(cla_recurso_ir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(nombre_ir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Modificar_ir)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jLabel154.setText("Cla. Recurso");

        go_recurso2.setText("Eliminar");
        go_recurso2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_recurso2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarRecursoLayout = new javax.swing.GroupLayout(FrameEliminarRecurso.getContentPane());
        FrameEliminarRecurso.getContentPane().setLayout(FrameEliminarRecursoLayout);
        FrameEliminarRecursoLayout.setHorizontalGroup(
            FrameEliminarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarRecursoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel154)
                .addGap(37, 37, 37)
                .addComponent(Combo_Recurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_recurso2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        FrameEliminarRecursoLayout.setVerticalGroup(
            FrameEliminarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarRecursoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(FrameEliminarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(Combo_Recurso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_recurso2))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jLabel151.setText("Cla. Recurso");

        go_recurso1.setText("Go");
        go_recurso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_recurso1MousePressed(evt);
            }
        });

        jLabel152.setText("Cla. Recurso:");

        cla_recurso_ir2.setEditable(false);
        cla_recurso_ir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cla_recurso_ir2ActionPerformed(evt);
            }
        });

        jLabel153.setText("Nombre:");

        nombre_ir2.setEditable(false);
        nombre_ir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_ir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameConsultarRecursoLayout = new javax.swing.GroupLayout(FrameConsultarRecurso.getContentPane());
        FrameConsultarRecurso.getContentPane().setLayout(FrameConsultarRecursoLayout);
        FrameConsultarRecursoLayout.setHorizontalGroup(
            FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarRecursoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameConsultarRecursoLayout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addGap(18, 18, 18)
                        .addComponent(nombre_ir2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameConsultarRecursoLayout.createSequentialGroup()
                        .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarRecursoLayout.createSequentialGroup()
                                .addComponent(jLabel152)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarRecursoLayout.createSequentialGroup()
                                .addComponent(jLabel151)
                                .addGap(37, 37, 37)))
                        .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cla_recurso_ir2)
                            .addComponent(Combo_Recurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(go_recurso1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        FrameConsultarRecursoLayout.setVerticalGroup(
            FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarRecursoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(Combo_Recurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_recurso1))
                .addGap(26, 26, 26)
                .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(cla_recurso_ir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarRecursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(nombre_ir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jLabel155.setText("Id. Resguardo:");

        id_resguardo_irr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_resguardo_irrActionPerformed(evt);
            }
        });

        jLabel156.setText("No. Serie:");

        jLabel157.setText("Id. Personal:");

        jLabel158.setText("Fecha:");

        fecha_irr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_irrActionPerformed(evt);
            }
        });

        jLabel159.setText("Ubicación:");

        ubicacion_irr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacion_irrActionPerformed(evt);
            }
        });

        jLabel160.setText("Sub. Responsable:");

        sub_responsable_irr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_responsable_irrActionPerformed(evt);
            }
        });

        Anadir_irr.setText("Añadir");
        Anadir_irr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Anadir_irrMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameInsertarResguardosLayout = new javax.swing.GroupLayout(FrameInsertarResguardos.getContentPane());
        FrameInsertarResguardos.getContentPane().setLayout(FrameInsertarResguardosLayout);
        FrameInsertarResguardosLayout.setHorizontalGroup(
            FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel160)
                        .addGap(18, 18, 18)
                        .addComponent(sub_responsable_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addGap(18, 18, 18)
                        .addComponent(ubicacion_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel158)
                            .addGap(18, 18, 18)
                            .addComponent(fecha_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel157)
                                .addGap(18, 18, 18)
                                .addComponent(id_personal_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel156)
                                .addGap(18, 18, 18)
                                .addComponent(no_serie_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addGap(18, 18, 18)
                                .addComponent(id_resguardo_irr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameInsertarResguardosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Anadir_irr)
                .addGap(161, 161, 161))
        );
        FrameInsertarResguardosLayout.setVerticalGroup(
            FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(id_resguardo_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel156)
                    .addComponent(no_serie_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameInsertarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel158)
                            .addComponent(fecha_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel159)
                            .addComponent(ubicacion_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FrameInsertarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel160)
                            .addComponent(sub_responsable_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Anadir_irr))
                    .addComponent(id_personal_irr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel161.setText("Id. Resguardo:");

        id_resguardo_irr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_resguardo_irr1ActionPerformed(evt);
            }
        });

        jLabel164.setText("Fecha:");

        fecha_irr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_irr1ActionPerformed(evt);
            }
        });

        jLabel165.setText("Ubicación:");

        ubicacion_irr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacion_irr1ActionPerformed(evt);
            }
        });

        jLabel166.setText("Sub. Responsable:");

        sub_responsable_irr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_responsable_irr1ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jLabel167.setText("Id. Resguardo:");

        id_resg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_resgActionPerformed(evt);
            }
        });

        go_irr.setText("Go");
        go_irr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                go_irrMousePressed(evt);
            }
        });

        jLabel176.setText("No. Serie:");

        jLabel177.setText("Id. Personal:");

        javax.swing.GroupLayout FrameModificarResguardosLayout = new javax.swing.GroupLayout(FrameModificarResguardos.getContentPane());
        FrameModificarResguardos.getContentPane().setLayout(FrameModificarResguardosLayout);
        FrameModificarResguardosLayout.setHorizontalGroup(
            FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addGap(18, 18, 18)
                        .addComponent(id_personal_irr3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel176)
                        .addGap(18, 18, 18)
                        .addComponent(no_serie_irr3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel165)
                        .addGap(18, 18, 18)
                        .addComponent(ubicacion_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel164)
                            .addGap(18, 18, 18)
                            .addComponent(fecha_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel161)
                            .addGap(18, 18, 18)
                            .addComponent(id_resguardo_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel167)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(id_resg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(FrameModificarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel166)
                        .addGap(18, 18, 18)
                        .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(sub_responsable_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(go_irr)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        FrameModificarResguardosLayout.setVerticalGroup(
            FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameModificarResguardosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(id_resg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_irr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel161)
                    .addComponent(id_resguardo_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel176)
                    .addComponent(no_serie_irr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel177)
                    .addComponent(id_personal_irr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164)
                    .addComponent(fecha_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel165)
                    .addComponent(ubicacion_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameModificarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel166)
                    .addComponent(sub_responsable_irr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(23, 23, 23))
        );

        jLabel175.setText("Id. Resguardo:");

        Eliminar_resg.setText("Go");
        Eliminar_resg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Eliminar_resgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FrameEliminarResguardosLayout = new javax.swing.GroupLayout(FrameEliminarResguardos.getContentPane());
        FrameEliminarResguardos.getContentPane().setLayout(FrameEliminarResguardosLayout);
        FrameEliminarResguardosLayout.setHorizontalGroup(
            FrameEliminarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarResguardosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_resg2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminar_resg)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        FrameEliminarResguardosLayout.setVerticalGroup(
            FrameEliminarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameEliminarResguardosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(FrameEliminarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(id_resg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar_resg))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jLabel168.setText("Id. Resguardo:");

        jButton8.setText("Go");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        jLabel169.setText("Id. Resguardo:");

        id_resguardo_irr2.setEditable(false);
        id_resguardo_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_resguardo_irr2ActionPerformed(evt);
            }
        });

        jLabel170.setText("No. Serie:");

        no_serie_irr2.setEditable(false);
        no_serie_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_serie_irr2ActionPerformed(evt);
            }
        });

        jLabel171.setText("Id. Personal:");

        id_personal_irr2.setEditable(false);
        id_personal_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_personal_irr2ActionPerformed(evt);
            }
        });

        jLabel172.setText("Fecha:");

        fecha_irr2.setEditable(false);
        fecha_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_irr2ActionPerformed(evt);
            }
        });

        jLabel173.setText("Ubicación:");

        ubicacion_irr2.setEditable(false);
        ubicacion_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacion_irr2ActionPerformed(evt);
            }
        });

        jLabel174.setText("Sub. Responsable:");

        sub_responsable_irr2.setEditable(false);
        sub_responsable_irr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_responsable_irr2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameConsultarResguardosLayout = new javax.swing.GroupLayout(FrameConsultarResguardos.getContentPane());
        FrameConsultarResguardos.getContentPane().setLayout(FrameConsultarResguardosLayout);
        FrameConsultarResguardosLayout.setHorizontalGroup(
            FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel173)
                        .addGap(18, 18, 18)
                        .addComponent(ubicacion_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameConsultarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel172)
                            .addGap(18, 18, 18)
                            .addComponent(fecha_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel171)
                                .addGap(18, 18, 18)
                                .addComponent(id_personal_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel170)
                                .addGap(18, 18, 18)
                                .addComponent(no_serie_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                                .addComponent(jLabel169)
                                .addGap(18, 18, 18)
                                .addComponent(id_resguardo_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                            .addComponent(jLabel168)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(id_resg3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                        .addComponent(jLabel174)
                        .addGap(18, 18, 18)
                        .addComponent(sub_responsable_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        FrameConsultarResguardosLayout.setVerticalGroup(
            FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameConsultarResguardosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel168)
                    .addComponent(id_resg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel169)
                    .addComponent(id_resguardo_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel170)
                    .addComponent(no_serie_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(id_personal_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(fecha_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel173)
                    .addComponent(ubicacion_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameConsultarResguardosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel174)
                    .addComponent(sub_responsable_irr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout FrameInsertarUsuariosLayout = new javax.swing.GroupLayout(FrameInsertarUsuarios.getContentPane());
        FrameInsertarUsuarios.getContentPane().setLayout(FrameInsertarUsuariosLayout);
        FrameInsertarUsuariosLayout.setHorizontalGroup(
            FrameInsertarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameInsertarUsuariosLayout.setVerticalGroup(
            FrameInsertarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FrameModificarUsuariosLayout = new javax.swing.GroupLayout(FrameModificarUsuarios.getContentPane());
        FrameModificarUsuarios.getContentPane().setLayout(FrameModificarUsuariosLayout);
        FrameModificarUsuariosLayout.setHorizontalGroup(
            FrameModificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameModificarUsuariosLayout.setVerticalGroup(
            FrameModificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FrameEliminarUsuariosLayout = new javax.swing.GroupLayout(FrameEliminarUsuarios.getContentPane());
        FrameEliminarUsuarios.getContentPane().setLayout(FrameEliminarUsuariosLayout);
        FrameEliminarUsuariosLayout.setHorizontalGroup(
            FrameEliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameEliminarUsuariosLayout.setVerticalGroup(
            FrameEliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FrameConsultarUsuariosLayout = new javax.swing.GroupLayout(FrameConsultarUsuarios.getContentPane());
        FrameConsultarUsuarios.getContentPane().setLayout(FrameConsultarUsuariosLayout);
        FrameConsultarUsuariosLayout.setHorizontalGroup(
            FrameConsultarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameConsultarUsuariosLayout.setVerticalGroup(
            FrameConsultarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArticulos.setText("Articulos");
        MenuArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuArticulosMousePressed(evt);
            }
        });

        MenuInsertarArticulo.setText("Insertar Articulo");
        MenuInsertarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarArticuloMousePressed(evt);
            }
        });
        MenuArticulos.add(MenuInsertarArticulo);

        MenuModificarArticulo.setText("Modificar Artiulo");
        MenuModificarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarArticuloMousePressed(evt);
            }
        });
        MenuArticulos.add(MenuModificarArticulo);

        MenuEliminarArticulo.setText("Eliminar Articulo");
        MenuEliminarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarArticuloMousePressed(evt);
            }
        });
        MenuArticulos.add(MenuEliminarArticulo);

        MenuMostrarArticulo.setText("Consultar");
        MenuMostrarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarArticuloMousePressed(evt);
            }
        });
        MenuMostrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarArticuloActionPerformed(evt);
            }
        });
        MenuArticulos.add(MenuMostrarArticulo);

        MenuBar.add(MenuArticulos);

        jMenuItem21.setText("Insertar Articulo");
        MenuArticulos5.add(jMenuItem21);

        jMenuItem22.setText("Modificar Artiulo");
        MenuArticulos5.add(jMenuItem22);

        jMenuItem23.setText("Eliminar Articulo");
        MenuArticulos5.add(jMenuItem23);

        jMenuItem24.setText("Mostrar Todos");
        MenuArticulos5.add(jMenuItem24);

        MenuBar.add(MenuArticulos5);

        MenuBajas.setText("Bajas");

        MenuInsertarBajas.setText("Insertar");
        MenuInsertarBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarBajasMousePressed(evt);
            }
        });
        MenuBajas.add(MenuInsertarBajas);

        MenuModificarBajas.setText("Modificar");
        MenuModificarBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarBajasMousePressed(evt);
            }
        });
        MenuBajas.add(MenuModificarBajas);

        MenuEliminarBajas.setText("Eliminar");
        MenuEliminarBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarBajasMousePressed(evt);
            }
        });
        MenuBajas.add(MenuEliminarBajas);

        MenuMostrarBajas.setText("Consultar");
        MenuMostrarBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarBajasMousePressed(evt);
            }
        });
        MenuBajas.add(MenuMostrarBajas);

        MenuBar.add(MenuBajas);

        MenuDestinos.setText("Destinos");

        MenuInsertarDestinos.setText("Insertar");
        MenuInsertarDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarDestinosMousePressed(evt);
            }
        });
        MenuDestinos.add(MenuInsertarDestinos);

        MenuModificarDestinos.setText("Modificar");
        MenuModificarDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarDestinosMousePressed(evt);
            }
        });
        MenuDestinos.add(MenuModificarDestinos);

        MenuEliminarDestinos.setText("Eliminar");
        MenuEliminarDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarDestinosMousePressed(evt);
            }
        });
        MenuDestinos.add(MenuEliminarDestinos);

        MenuMostrarDestinos.setText("Consultar");
        MenuMostrarDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarDestinosMousePressed(evt);
            }
        });
        MenuMostrarDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarDestinosActionPerformed(evt);
            }
        });
        MenuDestinos.add(MenuMostrarDestinos);

        MenuBar.add(MenuDestinos);

        MenuPartidas.setText("Partidas");

        MenuInsertarPartidas.setText("Insertar");
        MenuInsertarPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarPartidasMousePressed(evt);
            }
        });
        MenuPartidas.add(MenuInsertarPartidas);

        MenuModificarPartidas.setText("Modificar");
        MenuModificarPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarPartidasMousePressed(evt);
            }
        });
        MenuPartidas.add(MenuModificarPartidas);

        MenuEliminarPartidas.setText("Eliminar");
        MenuEliminarPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarPartidasMousePressed(evt);
            }
        });
        MenuPartidas.add(MenuEliminarPartidas);

        MenuMostrarPartidas.setText("Consultar");
        MenuMostrarPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarPartidasMousePressed(evt);
            }
        });
        MenuPartidas.add(MenuMostrarPartidas);

        MenuBar.add(MenuPartidas);

        MenuPersonal.setText("Personal");

        MenuInsertarPersonal.setText("Insertar");
        MenuInsertarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarPersonalMousePressed(evt);
            }
        });
        MenuPersonal.add(MenuInsertarPersonal);

        MenuModificarPersonal.setText("Modificar");
        MenuModificarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarPersonalMousePressed(evt);
            }
        });
        MenuPersonal.add(MenuModificarPersonal);

        MenuEliminarPersonal.setText("Eliminar");
        MenuEliminarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarPersonalMousePressed(evt);
            }
        });
        MenuEliminarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarPersonalActionPerformed(evt);
            }
        });
        MenuPersonal.add(MenuEliminarPersonal);

        MenuMostrarPersonal.setText("Consultar");
        MenuMostrarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarPersonalMousePressed(evt);
            }
        });
        MenuPersonal.add(MenuMostrarPersonal);

        MenuBar.add(MenuPersonal);

        MenuRecursos.setText("Recursos");

        MenuInsertarRecursos.setText("Insertar");
        MenuInsertarRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarRecursosMousePressed(evt);
            }
        });
        MenuRecursos.add(MenuInsertarRecursos);

        MenuModificarRecursos.setText("Modificar");
        MenuModificarRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarRecursosMousePressed(evt);
            }
        });
        MenuRecursos.add(MenuModificarRecursos);

        MenuEliminarRecursos.setText("Eliminar");
        MenuEliminarRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarRecursosMousePressed(evt);
            }
        });
        MenuRecursos.add(MenuEliminarRecursos);

        MenuMostrarRecursos.setText("Consultar");
        MenuMostrarRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarRecursosMousePressed(evt);
            }
        });
        MenuRecursos.add(MenuMostrarRecursos);

        MenuBar.add(MenuRecursos);

        MenuResguardos.setText("Resguardos");

        MenuInsertarResguardos.setText("Insertar");
        MenuInsertarResguardos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuInsertarResguardosMousePressed(evt);
            }
        });
        MenuResguardos.add(MenuInsertarResguardos);

        MenuModificarResguardos.setText("Modificar");
        MenuModificarResguardos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuModificarResguardosMousePressed(evt);
            }
        });
        MenuResguardos.add(MenuModificarResguardos);

        MenuEliminarResguardos.setText("Eliminar");
        MenuEliminarResguardos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuEliminarResguardosMousePressed(evt);
            }
        });
        MenuResguardos.add(MenuEliminarResguardos);

        MenuMostrarResguardos.setText("Consultar");
        MenuMostrarResguardos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMostrarResguardosMousePressed(evt);
            }
        });
        MenuResguardos.add(MenuMostrarResguardos);

        MenuBar.add(MenuResguardos);

        MenuUsuarios.setText("Usuarios");

        MenuInsertarUsuarios.setText("Insertar");
        MenuUsuarios.add(MenuInsertarUsuarios);

        MenuModificarUsuarios.setText("Modificar");
        MenuUsuarios.add(MenuModificarUsuarios);

        MenuEliminarUsuarios.setText("Eliminar");
        MenuUsuarios.add(MenuEliminarUsuarios);

        MenuMostrarUsuarios.setText("Consultar");
        MenuUsuarios.add(MenuMostrarUsuarios);

        MenuBar.add(MenuUsuarios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMostrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMostrarArticuloActionPerformed

    private void MenuMostrarDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarDestinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMostrarDestinosActionPerformed

    private void MenuEliminarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuEliminarPersonalActionPerformed

    private void MenuInsertarArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarArticuloMousePressed
        InsertarArticulo art = new InsertarArticulo();
        art.setVisible(true);
    }//GEN-LAST:event_MenuInsertarArticuloMousePressed

    private void FieldNo_SerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNo_SerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNo_SerieActionPerformed

    private void FieldCostoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCostoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCostoActualActionPerformed

    private void FieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldStatusActionPerformed

    private void FieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMarcaActionPerformed

    private void FieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldModeloActionPerformed

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldAVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAVidaActionPerformed

    private void FieldResguardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldResguardoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldResguardoActionPerformed

    private void FieldPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPatrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPatrimonioActionPerformed

    private void FieldCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCaracteristicasActionPerformed

    private void FieldClaveRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldClaveRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldClaveRecursoActionPerformed

    private void FieldNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNotaActionPerformed

    private void FieldACompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldACompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldACompraActionPerformed

    private void FieldProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProveedorActionPerformed

    private void FieldFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldFacturaActionPerformed

    private void FieldPrecio_FacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPrecio_FacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPrecio_FacActionPerformed

    private void FieldPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPartidaActionPerformed

    private void FieldBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBienActionPerformed

    private void MenuModificarArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarArticuloMousePressed
        LlenarModelo("no_serie", "inventario_articulos", Combo);

        FrameModificarArticulos.setVisible(true);
        FrameModificarArticulos.setSize(800, 600);
    }//GEN-LAST:event_MenuModificarArticuloMousePressed

    private void BotonSeleccionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSeleccionarMousePressed

        getElementos();
    }//GEN-LAST:event_BotonSeleccionarMousePressed

    private void FieldPrecio_Fac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPrecio_Fac1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPrecio_Fac1ActionPerformed

    private void FieldFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldFactura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldFactura1ActionPerformed

    private void FieldACompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldACompra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldACompra1ActionPerformed

    private void FieldNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNota1ActionPerformed

    private void FieldPatrimonio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPatrimonio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPatrimonio1ActionPerformed

    private void FieldResguardo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldResguardo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldResguardo1ActionPerformed

    private void FieldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombre1ActionPerformed

    private void FieldModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldModelo1ActionPerformed

    private void FieldMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMarca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMarca1ActionPerformed

    private void FieldNo_Serie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNo_Serie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNo_Serie1ActionPerformed

    private void BotonSeleccionar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSeleccionar1MousePressed

        getElementos1();

    }//GEN-LAST:event_BotonSeleccionar1MousePressed

    private void FieldCostoActual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCostoActual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCostoActual1ActionPerformed

    private void FieldStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldStatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldStatus1ActionPerformed

    private void FieldAVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAVida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldAVida1ActionPerformed

    private void FieldCaracteristicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCaracteristicas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCaracteristicas1ActionPerformed

    private void FieldClaveRecurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldClaveRecurso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldClaveRecurso1ActionPerformed

    private void FieldProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProveedor1ActionPerformed

    private void FieldPartida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPartida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPartida1ActionPerformed

    private void FieldBien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBien1ActionPerformed

    private void MenuMostrarArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarArticuloMousePressed
        LlenarModelo("no_serie", "inventario_articulos", Combo1);
        FrameSeleccionar.setVisible(true);
        FrameSeleccionar.setSize(600, 750);

    }//GEN-LAST:event_MenuMostrarArticuloMousePressed

    private void MenuArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuArticulosMousePressed

    }//GEN-LAST:event_MenuArticulosMousePressed

    private void BotonActualizarArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarArticulosMousePressed
        updateArticulos();
    }//GEN-LAST:event_BotonActualizarArticulosMousePressed

    private void BotonSeleccionar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSeleccionar2MousePressed
        eliminarArticulo();
    }//GEN-LAST:event_BotonSeleccionar2MousePressed

    private void MenuEliminarArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarArticuloMousePressed
        LlenarModelo("no_serie", "inventario_articulos", Combo2);
        FrameEliminarArticulos.setVisible(true);
        FrameEliminarArticulos.setSize(750, 200);

    }//GEN-LAST:event_MenuEliminarArticuloMousePressed

    private void notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaActionPerformed

    private void id_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_bajaActionPerformed

    private void motivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motivoActionPerformed

    private void fecha_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_bajaActionPerformed

    private void a_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_compraActionPerformed

    private void no_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_facturaActionPerformed

    private void observacion_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacion_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacion_bajaActionPerformed

    private void no_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_serieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_serieActionPerformed

    private void precio_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_facActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_facActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloActionPerformed

    private void costo_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costo_actActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costo_actActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void no_resguardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_resguardoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_resguardoActionPerformed

    private void a_vidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_vidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_vidaActionPerformed

    private void no_patrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_patrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_patrimonioActionPerformed

    private void caracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caracteristicasActionPerformed

    private void id_partidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_partidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_partidaActionPerformed

    private void cla_recurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cla_recurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cla_recurActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

    private void tipo_bienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_bienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_bienActionPerformed

    private void cla_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cla_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cla_destinoActionPerformed

    private void MenuModificarBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarBajasMousePressed
        LlenarModelo("id_baja", "inventario_bajas", ComboBajas1);
        FrameModificarBajas.setVisible(true);
        FrameModificarBajas.setSize(550, 650);

    }//GEN-LAST:event_MenuModificarBajasMousePressed

    private void BotonBajas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBajas1MousePressed
        getElementosBajas1();
    }//GEN-LAST:event_BotonBajas1MousePressed

    private void BotonMoficiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMoficiarMousePressed
        modificarBajas();
    }//GEN-LAST:event_BotonMoficiarMousePressed

    private void BotonBajas2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBajas2MousePressed
        getElementosBajas2();
    }//GEN-LAST:event_BotonBajas2MousePressed

    private void MenuMostrarBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarBajasMousePressed
        LlenarModelo("id_baja", "inventario_bajas", ComboBajas2);
        FrameSeleccionarBajas.setVisible(true);
        FrameSeleccionarBajas.setSize(550, 650);
    }//GEN-LAST:event_MenuMostrarBajasMousePressed

    private void MenuEliminarBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarBajasMousePressed
        LlenarModelo("id_baja", "inventario_bajas", ComboEliminarBajas);
        FrameEliminarBajas.setVisible(true);
        FrameEliminarBajas.setSize(550, 200);
    }//GEN-LAST:event_MenuEliminarBajasMousePressed

    private void BotonEliminarBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarBajasMousePressed
        eliminarBajas();
    }//GEN-LAST:event_BotonEliminarBajasMousePressed

    private void MenuInsertarBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarBajasMousePressed

        FrameInsertarBajas.setVisible(true);
        FrameInsertarBajas.setSize(550, 650);
    }//GEN-LAST:event_MenuInsertarBajasMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        insertarBajas();
    }//GEN-LAST:event_jButton1MousePressed

    private void BotonInsertarDestinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarDestinoMousePressed
        insertarDestinos();
    }//GEN-LAST:event_BotonInsertarDestinoMousePressed

    private void MenuInsertarDestinosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarDestinosMousePressed
        FrameInsertarDestinos.setVisible(true);
        FrameInsertarDestinos.setSize(350, 150);
    }//GEN-LAST:event_MenuInsertarDestinosMousePressed

    private void MenuModificarDestinosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarDestinosMousePressed
        LlenarModelo("cla_destino", "inventario_destinos", ComboDestino1);
        FrameModificarDestinos.setVisible(true);
        FrameModificarDestinos.setSize(350, 150);
    }//GEN-LAST:event_MenuModificarDestinosMousePressed

    private void MenuEliminarDestinosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarDestinosMousePressed
        LlenarModelo("cla_destino", "inventario_destinos", ComboDestino3);
        FrameEliminarDestinos.setVisible(true);
        FrameEliminarDestinos.setSize(350, 150);
    }//GEN-LAST:event_MenuEliminarDestinosMousePressed

    private void MenuMostrarDestinosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarDestinosMousePressed
        LlenarModelo("cla_destino", "inventario_destinos", ComboDestino2);
        FrameConsultarDestinos.setVisible(true);
        FrameConsultarDestinos.setSize(350, 150);
    }//GEN-LAST:event_MenuMostrarDestinosMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        getDestinos1();
    }//GEN-LAST:event_jButton2MousePressed

    private void BotonModificarDestinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarDestinoMousePressed
        modificarDestinos();
    }//GEN-LAST:event_BotonModificarDestinoMousePressed

    private void Go3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Go3MousePressed
        getDestinos2();
    }//GEN-LAST:event_Go3MousePressed

    private void Go4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Go4MousePressed
        eliminarDestinos();
    }//GEN-LAST:event_Go4MousePressed

    private void insertarbutonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarbutonMousePressed
        insertarPartidas();
    }//GEN-LAST:event_insertarbutonMousePressed

    private void insertarbuton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarbuton1MousePressed
        modificarPartidas();
    }//GEN-LAST:event_insertarbuton1MousePressed

    private void MenuInsertarPartidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarPartidasMousePressed
        FrameInsertarPartidas.setVisible(true);
        FrameInsertarPartidas.setSize(500, 500);
    }//GEN-LAST:event_MenuInsertarPartidasMousePressed

    private void MenuModificarPartidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarPartidasMousePressed
        LlenarModelo("id_partida", "inventario_partidas", ComboPartidas1);
        FrameModificarPartidas.setVisible(true);
        FrameModificarPartidas.setSize(500, 500);
    }//GEN-LAST:event_MenuModificarPartidasMousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        getPartidas1();
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        getPartidas2();
    }//GEN-LAST:event_jButton4MousePressed

    private void MenuMostrarPartidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarPartidasMousePressed
        LlenarModelo("id_partida", "inventario_partidas", ComboPartidas2);
        FrameConsultarPartidas.setVisible(true);
        FrameConsultarPartidas.setSize(500, 500);
    }//GEN-LAST:event_MenuMostrarPartidasMousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        eliminarPartidas();
    }//GEN-LAST:event_jButton5MousePressed

    private void MenuEliminarPartidasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarPartidasMousePressed
        LlenarModelo("id_partida", "inventario_partidas", ComboPartidas3);
        FrameEliminarPartidas.setVisible(true);
        FrameEliminarPartidas.setSize(250, 120);
    }//GEN-LAST:event_MenuEliminarPartidasMousePressed

    private void MenuInsertarPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarPersonalMousePressed
        FrameInsertarPersonal.setVisible(true);
        FrameInsertarPersonal.setSize(400, 500);
    }//GEN-LAST:event_MenuInsertarPersonalMousePressed

    private void MenuModificarPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarPersonalMousePressed
        LlenarModelo("id_personal", "inventario_personal", Combo_ip);
        FrameModificarPersonal.setVisible(true);
        FrameModificarPersonal.setSize(400, 500);
    }//GEN-LAST:event_MenuModificarPersonalMousePressed

    private void MenuEliminarPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarPersonalMousePressed
        LlenarModelo("id_personal", "inventario_personal", Combo_ip1);
        FrameEliminarPersonal.setVisible(true);
        FrameEliminarPersonal.setSize(380, 250);
    }//GEN-LAST:event_MenuEliminarPersonalMousePressed

    private void MenuMostrarPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarPersonalMousePressed
        LlenarModelo("id_personal", "inventario_personal", Combo_ip2);
        FrameConsultarPersonal.setVisible(true);
        FrameConsultarPersonal.setSize(400, 500);
    }//GEN-LAST:event_MenuMostrarPersonalMousePressed

    private void Insertar_ipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_ipMousePressed
        insertarPersonal();
    }//GEN-LAST:event_Insertar_ipMousePressed

    private void go_ipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_ipMousePressed
        getPersonal1();
    }//GEN-LAST:event_go_ipMousePressed

    private void Modificar_ipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_ipMousePressed
        modificarPersonal();
    }//GEN-LAST:event_Modificar_ipMousePressed

    private void go_ip1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_ip1MousePressed
        eliminarPersonal();
    }//GEN-LAST:event_go_ip1MousePressed

    private void go_ip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_ip2MousePressed
        getPersonal2();
    }//GEN-LAST:event_go_ip2MousePressed

    private void cla_recurso_irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cla_recurso_irActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cla_recurso_irActionPerformed

    private void nombre_irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_irActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_irActionPerformed

    private void cla_recurso_ir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cla_recurso_ir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cla_recurso_ir1ActionPerformed

    private void nombre_ir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_ir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_ir1ActionPerformed

    private void cla_recurso_ir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cla_recurso_ir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cla_recurso_ir2ActionPerformed

    private void nombre_ir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_ir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_ir2ActionPerformed

    private void MenuInsertarRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarRecursosMousePressed
        FrameInsertarRecurso.setVisible(true);
        FrameInsertarRecurso.setSize(300, 300);
    }//GEN-LAST:event_MenuInsertarRecursosMousePressed

    private void MenuModificarRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarRecursosMousePressed
        LlenarModelo("cla_recurso", "inventario_recurso", Combo_Recurso);
        FrameModificarRecurso.setVisible(true);
        FrameModificarRecurso.setSize(300, 300);
    }//GEN-LAST:event_MenuModificarRecursosMousePressed

    private void MenuEliminarRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarRecursosMousePressed
        LlenarModelo("cla_recurso", "inventario_recurso", Combo_Recurso2);
        FrameEliminarRecurso.setVisible(true);
        FrameEliminarRecurso.setSize(300, 300);
    }//GEN-LAST:event_MenuEliminarRecursosMousePressed

    private void MenuMostrarRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarRecursosMousePressed
        LlenarModelo("cla_recurso", "inventario_recurso", Combo_Recurso1);
        FrameConsultarRecurso.setVisible(true);
        FrameConsultarRecurso.setSize(300, 300);
    }//GEN-LAST:event_MenuMostrarRecursosMousePressed

    private void Insertar_irMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insertar_irMousePressed
        insertarRecurso();
    }//GEN-LAST:event_Insertar_irMousePressed

    private void go_recursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_recursoMousePressed
        getRecurso1();
    }//GEN-LAST:event_go_recursoMousePressed

    private void Modificar_irMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_irMousePressed
        modificarRecurso();
    }//GEN-LAST:event_Modificar_irMousePressed

    private void go_recurso2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_recurso2MousePressed
        eliminarRecurso();
    }//GEN-LAST:event_go_recurso2MousePressed

    private void go_recurso1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_recurso1MousePressed
       getRecurso2();
    }//GEN-LAST:event_go_recurso1MousePressed

    private void id_resguardo_irrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_resguardo_irrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_resguardo_irrActionPerformed

    private void fecha_irrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_irrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_irrActionPerformed

    private void ubicacion_irrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacion_irrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacion_irrActionPerformed

    private void sub_responsable_irrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_responsable_irrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_responsable_irrActionPerformed

    private void id_resguardo_irr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_resguardo_irr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_resguardo_irr1ActionPerformed

    private void fecha_irr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_irr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_irr1ActionPerformed

    private void ubicacion_irr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacion_irr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacion_irr1ActionPerformed

    private void sub_responsable_irr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_responsable_irr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_responsable_irr1ActionPerformed

    private void id_resguardo_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_resguardo_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_resguardo_irr2ActionPerformed

    private void fecha_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_irr2ActionPerformed

    private void ubicacion_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacion_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacion_irr2ActionPerformed

    private void sub_responsable_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_responsable_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_responsable_irr2ActionPerformed

    private void Anadir_irrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anadir_irrMousePressed
       insertarResguardo();
    }//GEN-LAST:event_Anadir_irrMousePressed

    private void id_personal_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_personal_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_personal_irr2ActionPerformed

    private void no_serie_irr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_serie_irr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_serie_irr2ActionPerformed

    private void MenuInsertarResguardosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInsertarResguardosMousePressed
        LlenarModelo("id_personal", "inventario_personal", id_personal_irr);
        LlenarModelo("no_serie", "inventario_articulos", no_serie_irr);
        FrameInsertarResguardos.setVisible(true);
        FrameInsertarResguardos.setSize(300, 550);
    }//GEN-LAST:event_MenuInsertarResguardosMousePressed

    private void MenuModificarResguardosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuModificarResguardosMousePressed
        LlenarModelo("id_personal", "inventario_personal", id_personal_irr3);
        LlenarModelo("no_serie", "inventario_articulos", no_serie_irr3);
        LlenarModelo("id_resg", "inventario_resguardos", id_resg);
        FrameModificarResguardos.setVisible(true);
        FrameModificarResguardos.setSize(300,500);
    }//GEN-LAST:event_MenuModificarResguardosMousePressed

    private void id_resgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_resgActionPerformed
       
    }//GEN-LAST:event_id_resgActionPerformed

    private void MenuEliminarResguardosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEliminarResguardosMousePressed
       LlenarModelo("id_resg", "inventario_resguardos", id_resg2);
       FrameEliminarResguardos.setVisible(true);
       FrameEliminarResguardos.setSize(250, 250);
    }//GEN-LAST:event_MenuEliminarResguardosMousePressed

    private void MenuMostrarResguardosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMostrarResguardosMousePressed
        LlenarModelo("id_resg", "inventario_resguardos", id_resg3);
        FrameConsultarResguardos.setVisible(true);
        FrameConsultarResguardos.setSize(300,500);
    }//GEN-LAST:event_MenuMostrarResguardosMousePressed

    private void go_irrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_irrMousePressed
       getResguardo1();
    }//GEN-LAST:event_go_irrMousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
         modificarResguardo();
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
       getResguardo2();
    }//GEN-LAST:event_jButton8MousePressed

    private void Eliminar_resgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminar_resgMousePressed
       eliminarResguardo();
    }//GEN-LAST:event_Eliminar_resgMousePressed
    public void eliminarResguardo(){
        String id = id_resg2.getSelectedItem().toString();
        String sql = "delete from inventario_resguardos where id_resg = '"+id+"'";
        
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }
    
    public void getResguardo2(){
        String id = id_resg3.getSelectedItem().toString();
        
        String sql = "select * from inventario_resguardos where id_resg = '"+id+"'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_resguardo_irr2.setText(hoja.getObject("id_resg").toString());
            no_serie_irr2.setText(hoja.getObject("no_serie").toString());
            id_personal_irr2.setText(hoja.getObject("id_personal").toString());
            fecha_irr2.setText(hoja.getObject("fecha").toString());
            ubicacion_irr2.setText(hoja.getObject("ubicacion").toString());
            sub_responsable_irr2.setText(hoja.getObject("sub_resp").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 4694: "+ex);
        }
        
        driver.close();
    }
    
    public void modificarResguardo(){
         String id = id_resg.getSelectedItem().toString();
        //String id_resg32 = id_resguardo_irr1.getText();
        String no_serie32 = no_serie_irr3.getSelectedItem().toString();
        String id_personal = id_personal_irr3.getSelectedItem().toString();
        String fecha = fecha_irr1.getText();
        String ubicacion = ubicacion_irr1.getText();
        String sub_resp = sub_responsable_irr1.getText();
        
        String sql = "update inventario_resguardos set no_serie = '"+no_serie32+"', id_personal = '"+id_personal+"', fecha = '"+fecha+"', ubicacion = '"+ubicacion+"', sub_resp = '"+sub_resp+"' where id_resg = '"+id+"'";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }
    
    public void getResguardo1(){
        String id = id_resg.getSelectedItem().toString();
        
        String sql = "select * from inventario_resguardos where id_resg = '"+id+"'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_resguardo_irr1.setText(hoja.getObject("id_resg").toString());
            no_serie_irr3.setSelectedItem(hoja.getObject("no_serie").toString());
            id_personal_irr3.setSelectedItem(hoja.getObject("id_personal").toString());
            fecha_irr1.setText(hoja.getObject("fecha").toString());
            ubicacion_irr1.setText(hoja.getObject("ubicacion").toString());
            sub_responsable_irr1.setText(hoja.getObject("sub_resp").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 4694: "+ex);
        }
        
        driver.close();
        
        
    }
    public void insertarResguardo(){
        String id_resg32 = id_resguardo_irr.getText();
        String no_serie32 = no_serie_irr.getSelectedItem().toString();
        String id_personal = id_personal_irr.getSelectedItem().toString();
        String fecha = fecha_irr.getText();
        String ubicacion = ubicacion_irr.getText();
        String sub_resp = sub_responsable_irr.getText();
        
        String sql = "insert into inventario_resguardos (id_resg, no_serie, id_personal, fecha, ubicacion, sub_resp) values ('"+id_resg32+"', '"+no_serie32+"', '"+id_personal+"', '"+fecha+"', '"+ubicacion+"', '"+sub_resp+"')";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }
    public void getRecurso2() {
        String id = Combo_Recurso1.getSelectedItem().toString();
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query("select * from inventario_recurso where cla_recurso = '" + id + "'");
        try {
            hoja.next();
            cla_recurso_ir2.setText(hoja.getObject("cla_recurso").toString());
            nombre_ir2.setText(hoja.getObject("nombre").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 4041: " + ex);
        }

        driver.close();

    }
    
    public void eliminarRecurso(){
        String sql = "delete from inventario_recurso where cla_recurso = '"+Combo_Recurso2.getSelectedItem().toString()+"'";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }
    
    public void modificarRecurso() {
        String sql = "update inventario_recurso set nombre = '"+nombre_ir1.getText()+"' where cla_recurso = '"+cla_recurso_ir1.getText()+"'";
        
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void getRecurso1() {
        String id = Combo_Recurso.getSelectedItem().toString();
        System.out.println("ID: "+id);
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query("select * from inventario_recurso where cla_recurso = '" + id + "'");
        try {
            hoja.next();
            cla_recurso_ir1.setText(hoja.getObject("cla_recurso").toString());
            nombre_ir1.setText(hoja.getObject("nombre").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 4041: " + ex);
        }

        driver.close();

    }

    public void insertarRecurso() {
        String sql = "insert into inventario_recurso (cla_recurso, nombre) values ('" + cla_recurso_ir.getText() + "', '" + nombre_ir.getText() + "')";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void getPersonal2() {
        String sql = "select * from inventario_personal where id_personal = '" + Combo_ip2.getSelectedItem().toString() + "'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_personal_ip2.setText(hoja.getObject("id_personal").toString());
            nombre_ip2.setText(hoja.getObject("nombre").toString());
            puesto_ip2.setText(hoja.getObject("puesto").toString());
            area_asig_ip2.setText(hoja.getObject("area_asig").toString());
            nombre_jede_ip2.setText(hoja.getObject("nombre_jefe").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 3678: " + ex);
        }
        driver.close();

    }

    public void eliminarPersonal() {
        String sql = "delete from inventario_personal where id_personal = '" + Combo_ip1.getSelectedItem().toString() + "'";

        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void modificarPersonal() {
        String sql = "update inventario_personal set id_personal = '" + id_personal_ip1.getText() + "', nombre = '" + nombre_ip1.getText() + "', puesto = '" + puesto_ip1.getText() + "', area_asig = '" + area_asig_ip1.getText() + "', nombre_jefe = '" + nombre_jede_ip1.getText() + "' where id_personal = '" + id_personal_ip1.getText() + "'";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void getPersonal1() {
        String sql = "select * from inventario_personal where id_personal = '" + Combo_ip.getSelectedItem().toString() + "'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_personal_ip1.setText(hoja.getObject("id_personal").toString());
            nombre_ip1.setText(hoja.getObject("nombre").toString());
            puesto_ip1.setText(hoja.getObject("puesto").toString());
            area_asig_ip1.setText(hoja.getObject("area_asig").toString());
            nombre_jede_ip1.setText(hoja.getObject("nombre_jefe").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 3678: " + ex);
        }
        driver.close();

    }

    public void insertarPersonal() {
        String id_personal, nombre, puesto, area_asig, nombre_jefe;
        id_personal = id_personal_ip.getText();
        nombre = nombre_ip.getText();
        puesto = puesto_ip.getText();
        area_asig = area_asig_ip.getText();
        nombre_jefe = nombre_jefe_ip.getText();
        String sql = "insert into inventario_personal (id_personal, nombre, puesto, area_asig, nombre_jefe) values ('" + id_personal + "', '" + nombre + "', '" + puesto + "', '" + area_asig + "', '" + nombre_jefe + "')";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void modificarPartidas() {
        String sql = "update inventario_partidas set nom_partida = '" + nom_partida4.getText() + "' where id_partida = '" + id_partida4.getText() + "'";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void eliminarPartidas() {
        String item = ComboPartidas3.getSelectedItem().toString();
        String sql = "delete from inventario_partidas where id_partida = '" + item + "'";
        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void getPartidas1() {
        String sql = "select * from inventario_partidas where id_partida = '" + ComboPartidas1.getSelectedItem().toString() + "'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_partida4.setText(hoja.getObject("id_partida").toString());
            nom_partida4.setText(hoja.getObject("nom_partida").toString());
        } catch (SQLException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.close();
    }

    public void getPartidas2() {
        String sql = "select * from inventario_partidas where id_partida = '" + ComboPartidas2.getSelectedItem().toString() + "'";
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query(sql);
        try {
            hoja.next();
            id_partida5.setText(hoja.getObject("id_partida").toString());
            nom_partida5.setText(hoja.getObject("nom_partida").toString());
        } catch (SQLException ex) {
            Logger.getLogger(Gestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.close();
    }

    public void insertarPartidas() {
        String id = id_partida3.getText();
        String nom = nom_partida3.getText();
        String sql = "insert into inventario_partidas (id_partida, nom_partida) values ('" + id + "', '" + nom + "')";

        driver.init();
        driver.createStatement();
        driver.update(sql);
        driver.close();
    }

    public void eliminarDestinos() {
        String item = ComboDestino3.getSelectedItem().toString();
        driver.init();
        driver.createStatement();
        driver.update("delete from inventario_destinos where cla_destino = '" + item + "'");
        driver.close();
    }

    public void modificarDestinos() {
        driver.init();
        driver.createStatement();
        String sqlO = "update inventario_destinos set nombre = '" + nombre_destino2.getText() + "' where cla_destino = '" + id_destino2.getText() + "'";
        driver.update(sqlO);
        driver.close();
    }

    public void getDestinos1() {
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query("select * from inventario_destinos where Cla_Destino = '" + ComboDestino1.getSelectedItem().toString() + "'");
        try {
            hoja.next();
            id_destino2.setText(hoja.getString("cla_destino"));
            nombre_destino2.setText(hoja.getString("nombre"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code: 2903 " + ex);
        }

        driver.close();

    }

    public void getDestinos2() {
        driver.init();
        driver.createStatement();
        ResultSet hoja = driver.query("select * from inventario_destinos where Cla_Destino = '" + ComboDestino2.getSelectedItem().toString() + "'");
        try {
            hoja.next();
            id_destino3.setText(hoja.getString("cla_destino"));
            nombre_destino3.setText(hoja.getString("nombre"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code: 2903 " + ex);
        }

        driver.close();

    }

    public void eliminarBajas() {
        String id = ComboEliminarBajas.getSelectedItem().toString();
        driver.init();
        driver.createStatement();
        driver.update("delete from inventario_bajas where id_baja = '" + id + "'");
        driver.close();

    }

    public void insertarDestinos() {
        String id_do = id_destino.getText();
        String nom_d = nombre_destino.getText();

        driver.init();
        driver.createStatement();
        driver.update("insert into inventario_destinos (cla_destino, nombre) values ('" + id_do + "', '" + nom_d + "')");
        driver.close();

    }

    public void modificarBajas() {
        driver.init();
        driver.createStatement();
        String nombre_recurso, nom_partida;

        int opt = JOptionPane.showConfirmDialog(null, "La clave destino se encuentra registrada?");
        switch (opt) {

            case 1:
                nombre_recurso = JOptionPane.showInputDialog(null, "Ingresa nombre del destino");
                driver.update("insert into inventario_destinos (cla_destino, nombre) values ('" + cla_destino1.getText() + "', '" + nombre_recurso + "')");
                break;
            default:
                break;

        }
        String consulta = "update inventario_bajas set id_baja = '" + id_baja1.getText() + "', motivo = '" + motivo1.getText() + "',"
                + " fecha_baja = '" + fecha_baja1.getText() + "', observacion_baja = '" + observacion_baja1.getText() + "',"
                + " no_serie = '" + no_serie1.getText() + "', marca = '" + marca1.getText() + "', modelo = '" + modelo1.getText() + "', nombre = '" + nombre1.getText() + "',"
                + " no_resguardo = '" + no_resguardo1.getText() + "', no_patrimonio = '" + no_patrimonio1.getText() + "',"
                + " nota = '" + nota1.getText() + "', a_compra = '" + a_compra1.getText() + "', no_factura = '" + no_factura1.getText() + "',"
                + " precio_fac = '" + precio_fac1.getText() + "', costo_act = '" + costo_act1.getText() + "',"
                + " status = '" + status1.getText() + "', a_vida = '" + a_vida1.getText() + "', caracteristicas = '" + caracteristicas1.getText() + "',"
                + " cla_recur = '" + cla_recur1.getText() + "', proveedor = '" + proveedor1.getText() + "', id_partida = '" + id_partida1.getText() + "',"
                + " tipo_bien = '" + tipo_bien1.getText() + "', cla_destino = '" + cla_destino1.getText() + "' "
                + "where id_baja = '" + ComboBajas1.getSelectedItem().toString() + "' ";

        driver.update(consulta);
        driver.close();
    }

    public void getElementosBajas1() {
        driver.init();
        driver.createStatement();
        String orden = "select * from inventario_bajas where id_baja = '" + ComboBajas1.getSelectedItem().toString() + "'";
        ResultSet resp = driver.query(orden);
        try {
            resp.next();
            id_baja1.setText(resp.getObject("id_baja").toString());
            motivo1.setText(resp.getObject("motivo").toString());
            fecha_baja1.setText(resp.getObject("fecha_baja").toString());
            observacion_baja1.setText(resp.getObject("observacion_baja").toString());
            no_serie1.setText(resp.getObject("no_serie").toString());
            marca1.setText(resp.getObject("marca").toString());
            modelo1.setText(resp.getObject("modelo").toString());
            nombre1.setText(resp.getObject("nombre").toString());
            no_resguardo1.setText(resp.getObject("no_resguardo").toString());
            no_patrimonio1.setText(resp.getObject("no_patrimonio").toString());
            nota1.setText(resp.getObject("nota").toString());
            a_compra1.setText(resp.getObject("a_compra").toString());
            no_factura1.setText(resp.getObject("no_factura").toString());
            precio_fac1.setText(resp.getObject("precio_fac").toString());
            costo_act1.setText(resp.getObject("costo_act").toString());
            status1.setText(resp.getObject("status").toString());
            a_vida1.setText(resp.getObject("a_vida").toString());
            caracteristicas1.setText(resp.getObject("caracteristicas").toString());
            cla_recur1.setText(resp.getObject("cla_recur").toString());
            proveedor1.setText(resp.getObject("proveedor").toString());
            id_partida1.setText(resp.getObject("id_partida").toString());
            tipo_bien1.setText(resp.getObject("tipo_bien").toString());
            cla_destino1.setText(resp.getObject("cla_destino").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 2253: Error al obtener elementos");
        }
        driver.close();
    }

    public void getElementosBajas2() {
        driver.init();
        driver.createStatement();
        String orden = "select * from inventario_bajas where id_baja = '" + ComboBajas2.getSelectedItem().toString() + "'";
        ResultSet resp = driver.query(orden);
        try {
            resp.next();
            id_baja2.setText(resp.getObject("id_baja").toString());
            motivo2.setText(resp.getObject("motivo").toString());
            fecha_baja2.setText(resp.getObject("fecha_baja").toString());
            observacion_baja2.setText(resp.getObject("observacion_baja").toString());
            no_serie2.setText(resp.getObject("no_serie").toString());
            marca2.setText(resp.getObject("marca").toString());
            modelo2.setText(resp.getObject("modelo").toString());
            nombre2.setText(resp.getObject("nombre").toString());
            no_resguardo2.setText(resp.getObject("no_resguardo").toString());
            no_patrimonio2.setText(resp.getObject("no_patrimonio").toString());
            nota2.setText(resp.getObject("nota").toString());
            a_compra2.setText(resp.getObject("a_compra").toString());
            no_factura2.setText(resp.getObject("no_factura").toString());
            precio_fac2.setText(resp.getObject("precio_fac").toString());
            costo_act2.setText(resp.getObject("costo_act").toString());
            status2.setText(resp.getObject("status").toString());
            a_vida2.setText(resp.getObject("a_vida").toString());
            caracteristicas2.setText(resp.getObject("caracteristicas").toString());
            cla_recur2.setText(resp.getObject("cla_recur").toString());
            proveedor2.setText(resp.getObject("proveedor").toString());
            id_partida2.setText(resp.getObject("id_partida").toString());
            tipo_bien2.setText(resp.getObject("tipo_bien").toString());
            cla_destino2.setText(resp.getObject("cla_destino").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 2253: Error al obtener elementos");
        }
        driver.close();
    }

    public void insertarBajas() {
        driver.init();

        int id_bajav = Integer.parseInt(id_baja.getText());
        String motivov = motivo.getText();
        String fecha_bajav = fecha_baja.getText();
        String observacion_bajav = observacion_baja.getText();
        String no_seriev = no_serie.getText();
        String marcav = marca.getText();
        String modelov = modelo.getText();
        String nombrev = nombre.getText();
        String no_resguardov = no_resguardo.getText();
        String no_patrimoniov = no_patrimonio.getText();
        String notav = nota.getText();
        int a_comprav = Integer.parseInt(a_compra.getText());
        String no_facturav = no_factura.getText();
        int precio_facv = Integer.parseInt(precio_fac.getText());
        int costo_actv = Integer.parseInt(costo_act.getText());
        String statusv = status.getText();
        int a_vidav = Integer.parseInt(a_vida.getText());
        String caracteristicasv = caracteristicas.getText();
        int cla_recurv = Integer.parseInt(cla_recur.getText());
        String proveedorv = proveedor.getText();
        int id_partidav = Integer.parseInt(id_partida.getText());
        String tipo_bienv = tipo_bien.getText();
        int cla_destinov = Integer.parseInt(cla_destino.getText());

        String nombre_recurso, nom_partida;
        driver.createStatement();
        int opt = JOptionPane.showConfirmDialog(null, "La clave del destino se encuentra registrada?");
        switch (opt) {

            case 1:
                nombre_recurso = JOptionPane.showInputDialog(null, "Ingresa nombre del destino");
                driver.update("insert into inventario_destinos (cla_destino, nombre) values ('" + cla_destinov + "', '" + nombre_recurso + "')");
                break;
            default:
                break;

        }

        String sqlOrder = "insert into inventario_bajas (id_baja, motivo, fecha_baja, observacion_baja, no_serie, marca, modelo, nombre, no_resguardo, no_patrimonio, nota, a_compra, no_factura, precio_fac, costo_act, status, a_vida, caracteristicas, cla_recur, proveedor, id_partida, tipo_bien, cla_destino) values ("
                + "'" + id_bajav + "', '" + motivov + "', '" + fecha_bajav + "', '" + observacion_bajav + "', '" + no_seriev + "', '" + marcav + "', '" + modelov + "', '" + nombrev + "', '" + no_resguardov + "', '" + no_patrimoniov + "', '" + notav + "', '" + a_comprav + "', '" + no_facturav + "', '" + precio_facv + "', '" + costo_actv + "', '" + statusv + "', '" + a_vidav + "', '" + caracteristicasv + "', '" + cla_recurv + "', '" + proveedorv + "', '" + id_partidav + "', '" + tipo_bienv + "', '" + cla_destinov + "')";
        System.out.println(sqlOrder);
        driver.update(sqlOrder);

        driver.close();

    }

    public void eliminarArticulo() {
        driver.init();
        driver.createStatement();
        String ide = Combo2.getSelectedItem().toString();
        driver.update("delete from inventario_articulos where no_serie = '" + ide + "'");
        driver.close();
    }

    public void updateArticulos() {
        String no_serie2 = FieldNo_Serie.getText();
        String marca2 = FieldMarca.getText();
        String modelo2 = FieldModelo.getText();
        String nombre2 = FieldNombre.getText();
        String no_resguardo2 = FieldResguardo.getText();
        String no_patrimonio2 = FieldPatrimonio.getText();
        String nota2 = FieldNota.getText();

        int a_compra2 = Integer.parseInt(FieldACompra.getText());

        String no_factura2 = FieldFactura.getText();
        int precio_fac2 = Integer.parseInt(FieldPrecio_Fac.getText());
        int costo_act2 = Integer.parseInt(FieldCostoActual.getText());
        String status2 = FieldStatus.getText();
        int a_vida2 = Integer.parseInt(FieldAVida.getText());
        String caracteristicas2 = FieldCaracteristicas.getText();
        int cla_recurso2 = Integer.parseInt(FieldClaveRecurso.getText());
        String proveedor2 = FieldProveedor.getText();
        int id_partida2 = Integer.parseInt(FieldPartida.getText());
        String tipo_bien2 = FieldBien.getText();

        driver.init();
        String nombre_recurso, nom_partida;
        driver.createStatement();
        int opt = JOptionPane.showConfirmDialog(null, "La clave de recurso se encuentra registrada?");
        switch (opt) {

            case 1:
                nombre_recurso = JOptionPane.showInputDialog(null, "Ingresa nombre del recurso");
                driver.update("insert into inventario_recurso (cla_recurso, nombre) values ('" + FieldClaveRecurso.getText() + "', '" + nombre_recurso + "')");
                break;
            default:
                break;

        }
        opt = JOptionPane.showConfirmDialog(null, "El ID de partida se encuentra registrado?");
        switch (opt) {

            case 1:
                nom_partida = JOptionPane.showInputDialog(null, "Ingresa el nombre de partida");
                driver.update("insert into inventario_partidas (id_partida, nom_partida) values ('" + FieldPartida1.getText() + "', '" + nom_partida + "')");
                break;
            default:
                break;

        }
        String sqlOrder = "update inventario_articulos set cla_recurso = '" + cla_recurso2 + "',"
                + " id_partida = '" + id_partida2 + "', no_serie = '" + no_serie2 + "', marca = '" + marca2 + "', modelo = '" + modelo2 + "', nombre = '" + nombre2 + "', "
                + "no_resguardo = '" + no_resguardo2 + "', no_patrimonio = '" + no_patrimonio2 + "', nota = '" + nota2 + "', a_compra = '" + a_compra2 + "', "
                + "no_fatura = '" + no_factura2 + "', precio_fac = '" + precio_fac2 + "', costo_act = '" + costo_act2 + "', status = '" + status2 + "', a_vida = '" + a_vida2 + "', "
                + "caracteristicas = '" + caracteristicas2 + "', proveedor = '" + proveedor2 + "', tipo_bien = '" + tipo_bien2 + "' where no_serie = '" + Combo.getSelectedItem().toString() + "'";

        System.out.println(sqlOrder);
        driver.update(sqlOrder);
        driver.close();
    }

    public void LlenarModelo(String id, String tabla, JComboBox caja) {
        caja.removeAllItems();
        driver.init();
        driver.createStatement();
        ResultSet res = driver.query("select " + id + " from " + tabla);
        try {
            while (res.next()) {
                caja.addItem(res.getObject(id).toString());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 775: Error al llenar Modelo");
        }
        driver.close();

    }

    public void getElementos() {
        String id = Combo.getSelectedItem().toString();
        driver.init();
        driver.createStatement();
        String se = "select * from inventario_articulos where no_serie = '" + id + "'";
        System.out.println(se);
        ResultSet res = driver.query(se);
        try {
            res.next();
            FieldNo_Serie.setText(res.getObject("no_serie").toString());
            FieldACompra.setText(res.getObject("a_compra").toString());
            FieldAVida.setText(res.getObject("a_vida").toString());
            FieldBien.setText(res.getObject("tipo_bien").toString());
            FieldCaracteristicas.setText(res.getObject("caracteristicas").toString());
            FieldClaveRecurso.setText(res.getObject("cla_recurso").toString());
            FieldCostoActual.setText(res.getObject("costo_act").toString());
            FieldFactura.setText(res.getObject("no_fatura").toString());
            FieldMarca.setText(res.getObject("marca").toString());
            FieldModelo.setText(res.getObject("modelo").toString());
            FieldNombre.setText(res.getObject("nombre").toString());
            FieldNota.setText(res.getObject("nota").toString());
            FieldPartida.setText(res.getObject("id_partida").toString());
            FieldPatrimonio.setText(res.getObject("no_patrimonio").toString());
            FieldPrecio_Fac.setText(res.getObject("precio_fac").toString());
            FieldProveedor.setText(res.getObject("proveedor").toString());
            FieldResguardo.setText(res.getObject("no_resguardo").toString());
            FieldStatus.setText(res.getObject("status").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 789  " + ex);
        }
        driver.close();
    }

    public void getElementos1() {
        String id = Combo1.getSelectedItem().toString();
        driver.init();
        driver.createStatement();
        String se = "select * from inventario_articulos where no_serie = '" + id + "'";
        System.out.println(se);
        ResultSet res = driver.query(se);
        try {
            res.next();
            FieldNo_Serie1.setText(res.getObject("no_serie").toString());
            FieldACompra1.setText(res.getObject("a_compra").toString());
            FieldAVida1.setText(res.getObject("a_vida").toString());
            FieldBien1.setText(res.getObject("tipo_bien").toString());
            FieldCaracteristicas1.setText(res.getObject("caracteristicas").toString());
            FieldClaveRecurso1.setText(res.getObject("cla_recurso").toString());
            FieldCostoActual1.setText(res.getObject("costo_act").toString());
            FieldFactura1.setText(res.getObject("no_fatura").toString());
            FieldMarca1.setText(res.getObject("marca").toString());
            FieldModelo1.setText(res.getObject("modelo").toString());
            FieldNombre1.setText(res.getObject("nombre").toString());
            FieldNota1.setText(res.getObject("nota").toString());
            FieldPartida1.setText(res.getObject("id_partida").toString());
            FieldPatrimonio1.setText(res.getObject("no_patrimonio").toString());
            FieldPrecio_Fac1.setText(res.getObject("precio_fac").toString());
            FieldProveedor1.setText(res.getObject("proveedor").toString());
            FieldResguardo1.setText(res.getObject("no_resguardo").toString());
            FieldStatus1.setText(res.getObject("status").toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Code 789  " + ex);
        }
        driver.close();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir_irr;
    private javax.swing.JButton BotonActualizarArticulos;
    private javax.swing.JButton BotonBajas1;
    private javax.swing.JButton BotonBajas2;
    private javax.swing.JButton BotonEliminarBajas;
    private javax.swing.JButton BotonInsertarDestino;
    private javax.swing.JButton BotonModificarDestino;
    private javax.swing.JButton BotonMoficiar;
    private javax.swing.JButton BotonSeleccionar;
    private javax.swing.JButton BotonSeleccionar1;
    private javax.swing.JButton BotonSeleccionar2;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JComboBox<String> ComboBajas1;
    private javax.swing.JComboBox<String> ComboBajas2;
    private javax.swing.JComboBox<String> ComboDestino1;
    private javax.swing.JComboBox<String> ComboDestino2;
    private javax.swing.JComboBox<String> ComboDestino3;
    private javax.swing.JComboBox<String> ComboEliminarBajas;
    private javax.swing.JComboBox<String> ComboPartidas1;
    private javax.swing.JComboBox<String> ComboPartidas2;
    private javax.swing.JComboBox<String> ComboPartidas3;
    private javax.swing.JComboBox<String> Combo_Recurso;
    private javax.swing.JComboBox<String> Combo_Recurso1;
    private javax.swing.JComboBox<String> Combo_Recurso2;
    private javax.swing.JComboBox<String> Combo_ip;
    private javax.swing.JComboBox<String> Combo_ip1;
    private javax.swing.JComboBox<String> Combo_ip2;
    private javax.swing.JButton Eliminar_resg;
    private javax.swing.JTextField FieldACompra;
    private javax.swing.JTextField FieldACompra1;
    private javax.swing.JTextField FieldAVida;
    private javax.swing.JTextField FieldAVida1;
    private javax.swing.JTextField FieldBien;
    private javax.swing.JTextField FieldBien1;
    private javax.swing.JTextField FieldCaracteristicas;
    private javax.swing.JTextField FieldCaracteristicas1;
    private javax.swing.JTextField FieldClaveRecurso;
    private javax.swing.JTextField FieldClaveRecurso1;
    private javax.swing.JTextField FieldCostoActual;
    private javax.swing.JTextField FieldCostoActual1;
    private javax.swing.JTextField FieldFactura;
    private javax.swing.JTextField FieldFactura1;
    private javax.swing.JTextField FieldMarca;
    private javax.swing.JTextField FieldMarca1;
    private javax.swing.JTextField FieldModelo;
    private javax.swing.JTextField FieldModelo1;
    private javax.swing.JTextField FieldNo_Serie;
    private javax.swing.JTextField FieldNo_Serie1;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldNombre1;
    private javax.swing.JTextField FieldNota;
    private javax.swing.JTextField FieldNota1;
    private javax.swing.JTextField FieldPartida;
    private javax.swing.JTextField FieldPartida1;
    private javax.swing.JTextField FieldPatrimonio;
    private javax.swing.JTextField FieldPatrimonio1;
    private javax.swing.JTextField FieldPrecio_Fac;
    private javax.swing.JTextField FieldPrecio_Fac1;
    private javax.swing.JTextField FieldProveedor;
    private javax.swing.JTextField FieldProveedor1;
    private javax.swing.JTextField FieldResguardo;
    private javax.swing.JTextField FieldResguardo1;
    private javax.swing.JTextField FieldStatus;
    private javax.swing.JTextField FieldStatus1;
    private javax.swing.JFrame FrameConsultarDestinos;
    private javax.swing.JFrame FrameConsultarPartidas;
    private javax.swing.JFrame FrameConsultarPersonal;
    private javax.swing.JFrame FrameConsultarRecurso;
    private javax.swing.JFrame FrameConsultarResguardos;
    private javax.swing.JFrame FrameConsultarUsuarios;
    private javax.swing.JFrame FrameEliminarArticulos;
    private javax.swing.JFrame FrameEliminarBajas;
    private javax.swing.JFrame FrameEliminarDestinos;
    private javax.swing.JFrame FrameEliminarPartidas;
    private javax.swing.JFrame FrameEliminarPersonal;
    private javax.swing.JFrame FrameEliminarRecurso;
    private javax.swing.JFrame FrameEliminarResguardos;
    private javax.swing.JFrame FrameEliminarUsuarios;
    private javax.swing.JFrame FrameInsertarBajas;
    private javax.swing.JFrame FrameInsertarDestinos;
    private javax.swing.JFrame FrameInsertarPartidas;
    private javax.swing.JFrame FrameInsertarPersonal;
    private javax.swing.JFrame FrameInsertarRecurso;
    private javax.swing.JFrame FrameInsertarResguardos;
    private javax.swing.JFrame FrameInsertarUsuarios;
    private javax.swing.JFrame FrameModificarArticulos;
    private javax.swing.JFrame FrameModificarBajas;
    private javax.swing.JFrame FrameModificarDestinos;
    private javax.swing.JFrame FrameModificarPartidas;
    private javax.swing.JFrame FrameModificarPersonal;
    private javax.swing.JFrame FrameModificarRecurso;
    private javax.swing.JFrame FrameModificarResguardos;
    private javax.swing.JFrame FrameModificarUsuarios;
    private javax.swing.JFrame FrameSeleccionar;
    private javax.swing.JFrame FrameSeleccionarBajas;
    private javax.swing.JButton Go3;
    private javax.swing.JButton Go4;
    private javax.swing.JButton Insertar_ip;
    private javax.swing.JButton Insertar_ir;
    private javax.swing.JMenu MenuArticulos;
    private javax.swing.JMenu MenuArticulos5;
    private javax.swing.JMenu MenuBajas;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuDestinos;
    private javax.swing.JMenuItem MenuEliminarArticulo;
    private javax.swing.JMenuItem MenuEliminarBajas;
    private javax.swing.JMenuItem MenuEliminarDestinos;
    private javax.swing.JMenuItem MenuEliminarPartidas;
    private javax.swing.JMenuItem MenuEliminarPersonal;
    private javax.swing.JMenuItem MenuEliminarRecursos;
    private javax.swing.JMenuItem MenuEliminarResguardos;
    private javax.swing.JMenuItem MenuEliminarUsuarios;
    private javax.swing.JMenuItem MenuInsertarArticulo;
    private javax.swing.JMenuItem MenuInsertarBajas;
    private javax.swing.JMenuItem MenuInsertarDestinos;
    private javax.swing.JMenuItem MenuInsertarPartidas;
    private javax.swing.JMenuItem MenuInsertarPersonal;
    private javax.swing.JMenuItem MenuInsertarRecursos;
    private javax.swing.JMenuItem MenuInsertarResguardos;
    private javax.swing.JMenuItem MenuInsertarUsuarios;
    private javax.swing.JMenuItem MenuModificarArticulo;
    private javax.swing.JMenuItem MenuModificarBajas;
    private javax.swing.JMenuItem MenuModificarDestinos;
    private javax.swing.JMenuItem MenuModificarPartidas;
    private javax.swing.JMenuItem MenuModificarPersonal;
    private javax.swing.JMenuItem MenuModificarRecursos;
    private javax.swing.JMenuItem MenuModificarResguardos;
    private javax.swing.JMenuItem MenuModificarUsuarios;
    private javax.swing.JMenuItem MenuMostrarArticulo;
    private javax.swing.JMenuItem MenuMostrarBajas;
    private javax.swing.JMenuItem MenuMostrarDestinos;
    private javax.swing.JMenuItem MenuMostrarPartidas;
    private javax.swing.JMenuItem MenuMostrarPersonal;
    private javax.swing.JMenuItem MenuMostrarRecursos;
    private javax.swing.JMenuItem MenuMostrarResguardos;
    private javax.swing.JMenuItem MenuMostrarUsuarios;
    private javax.swing.JMenu MenuPartidas;
    private javax.swing.JMenu MenuPersonal;
    private javax.swing.JMenu MenuRecursos;
    private javax.swing.JMenu MenuResguardos;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JButton Modificar_ip;
    private javax.swing.JButton Modificar_ir;
    private javax.swing.JTextField a_compra;
    private javax.swing.JTextField a_compra1;
    private javax.swing.JTextField a_compra2;
    private javax.swing.JTextField a_vida;
    private javax.swing.JTextField a_vida1;
    private javax.swing.JTextField a_vida2;
    private javax.swing.JTextField area_asig_ip;
    private javax.swing.JTextField area_asig_ip1;
    private javax.swing.JTextField area_asig_ip2;
    private javax.swing.JTextField caracteristicas;
    private javax.swing.JTextField caracteristicas1;
    private javax.swing.JTextField caracteristicas2;
    private javax.swing.JTextField cla_destino;
    private javax.swing.JTextField cla_destino1;
    private javax.swing.JTextField cla_destino2;
    private javax.swing.JTextField cla_recur;
    private javax.swing.JTextField cla_recur1;
    private javax.swing.JTextField cla_recur2;
    private javax.swing.JTextField cla_recurso_ir;
    private javax.swing.JTextField cla_recurso_ir1;
    private javax.swing.JTextField cla_recurso_ir2;
    private javax.swing.JTextField costo_act;
    private javax.swing.JTextField costo_act1;
    private javax.swing.JTextField costo_act2;
    private javax.swing.JTextField fecha_baja;
    private javax.swing.JTextField fecha_baja1;
    private javax.swing.JTextField fecha_baja2;
    private javax.swing.JTextField fecha_irr;
    private javax.swing.JTextField fecha_irr1;
    private javax.swing.JTextField fecha_irr2;
    private javax.swing.JButton go_ip;
    private javax.swing.JButton go_ip1;
    private javax.swing.JButton go_ip2;
    private javax.swing.JButton go_irr;
    private javax.swing.JButton go_recurso;
    private javax.swing.JButton go_recurso1;
    private javax.swing.JButton go_recurso2;
    private javax.swing.JTextField id_baja;
    private javax.swing.JTextField id_baja1;
    private javax.swing.JTextField id_baja2;
    private javax.swing.JTextField id_destino;
    private javax.swing.JTextField id_destino2;
    private javax.swing.JTextField id_destino3;
    private javax.swing.JTextField id_partida;
    private javax.swing.JTextField id_partida1;
    private javax.swing.JTextField id_partida2;
    private javax.swing.JTextField id_partida3;
    private javax.swing.JTextField id_partida4;
    private javax.swing.JTextField id_partida5;
    private javax.swing.JTextField id_personal_ip;
    private javax.swing.JTextField id_personal_ip1;
    private javax.swing.JTextField id_personal_ip2;
    private javax.swing.JComboBox<String> id_personal_irr;
    private javax.swing.JTextField id_personal_irr2;
    private javax.swing.JComboBox<String> id_personal_irr3;
    private javax.swing.JComboBox<String> id_resg;
    private javax.swing.JComboBox<String> id_resg2;
    private javax.swing.JComboBox<String> id_resg3;
    private javax.swing.JTextField id_resguardo_irr;
    private javax.swing.JTextField id_resguardo_irr1;
    private javax.swing.JTextField id_resguardo_irr2;
    private javax.swing.JButton insertarbuton;
    private javax.swing.JButton insertarbuton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JLabel labelde3;
    private javax.swing.JLabel laneld;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField marca1;
    private javax.swing.JTextField marca2;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField modelo1;
    private javax.swing.JTextField modelo2;
    private javax.swing.JTextField motivo;
    private javax.swing.JTextField motivo1;
    private javax.swing.JTextField motivo2;
    private javax.swing.JTextField no_factura;
    private javax.swing.JTextField no_factura1;
    private javax.swing.JTextField no_factura2;
    private javax.swing.JTextField no_patrimonio;
    private javax.swing.JTextField no_patrimonio1;
    private javax.swing.JTextField no_patrimonio2;
    private javax.swing.JTextField no_resguardo;
    private javax.swing.JTextField no_resguardo1;
    private javax.swing.JTextField no_resguardo2;
    private javax.swing.JTextField no_serie;
    private javax.swing.JTextField no_serie1;
    private javax.swing.JTextField no_serie2;
    private javax.swing.JComboBox<String> no_serie_irr;
    private javax.swing.JTextField no_serie_irr2;
    private javax.swing.JComboBox<String> no_serie_irr3;
    private javax.swing.JTextField nom_partida3;
    private javax.swing.JTextField nom_partida4;
    private javax.swing.JTextField nom_partida5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre_destino;
    private javax.swing.JTextField nombre_destino2;
    private javax.swing.JTextField nombre_destino3;
    private javax.swing.JTextField nombre_ip;
    private javax.swing.JTextField nombre_ip1;
    private javax.swing.JTextField nombre_ip2;
    private javax.swing.JTextField nombre_ir;
    private javax.swing.JTextField nombre_ir1;
    private javax.swing.JTextField nombre_ir2;
    private javax.swing.JTextField nombre_jede_ip1;
    private javax.swing.JTextField nombre_jede_ip2;
    private javax.swing.JTextField nombre_jefe_ip;
    private javax.swing.JTextField nota;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField observacion_baja;
    private javax.swing.JTextField observacion_baja1;
    private javax.swing.JTextField observacion_baja2;
    private javax.swing.JTextField precio_fac;
    private javax.swing.JTextField precio_fac1;
    private javax.swing.JTextField precio_fac2;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField proveedor1;
    private javax.swing.JTextField proveedor2;
    private javax.swing.JTextField puesto_ip;
    private javax.swing.JTextField puesto_ip1;
    private javax.swing.JTextField puesto_ip2;
    private javax.swing.JTextField status;
    private javax.swing.JTextField status1;
    private javax.swing.JTextField status2;
    private javax.swing.JTextField sub_responsable_irr;
    private javax.swing.JTextField sub_responsable_irr1;
    private javax.swing.JTextField sub_responsable_irr2;
    private javax.swing.JTextField tipo_bien;
    private javax.swing.JTextField tipo_bien1;
    private javax.swing.JTextField tipo_bien2;
    private javax.swing.JTextField ubicacion_irr;
    private javax.swing.JTextField ubicacion_irr1;
    private javax.swing.JTextField ubicacion_irr2;
    // End of variables declaration//GEN-END:variables
}
