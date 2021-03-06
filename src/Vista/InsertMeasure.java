/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Operaciones;
import Modelo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author ANDRES ARCINIEGAS
 */
public class InsertMeasure extends javax.swing.JFrame {

    Operaciones operaciones;
    
    
    public InsertMeasure() {
        initComponents();
        operaciones = new Operaciones(this);
    }
    
    public JTextField getTextField_insertedMeasures(){
        return TextField_insertedMeasures;
    }
    public JTextField getTextField_insertedMeasurements(){
        return TextField_insertedMeasurements;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        MeasurePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextField_value = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextField_id_quantity = new javax.swing.JTextField();
        btn_insertMeasure = new javax.swing.JButton();
        PanelSingleLoop = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TextField_numMeasurements = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextField_numMeasures = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextField_tolerance = new javax.swing.JTextField();
        TextField_valueLoop = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MeasurementPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_id_meter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextField_phase = new javax.swing.JTextField();
        cb_phase1 = new javax.swing.JCheckBox();
        cb_phase2 = new javax.swing.JCheckBox();
        cb_phase3 = new javax.swing.JCheckBox();
        PanelEndlessLoop = new javax.swing.JPanel();
        TextField_current = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        TextField_voltage = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TextField_powerFactor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TextField_period = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextField_frequency = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        TextField_phaseValue = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TextField_insertedMeasurements = new javax.swing.JTextField();
        TextField_insertedMeasures = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel7.setText("ID de Measurement");

        jLabel8.setText("Valor");

        TextField_value.setText("10");

        jLabel5.setText("Por defecto se añade ");

        jLabel9.setText("ID Cantidad");

        TextField_id_quantity.setText("1");

        btn_insertMeasure.setText("Insertar Medida");
        btn_insertMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertMeasureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MeasurePanelLayout = new javax.swing.GroupLayout(MeasurePanel);
        MeasurePanel.setLayout(MeasurePanelLayout);
        MeasurePanelLayout.setHorizontalGroup(
            MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeasurePanelLayout.createSequentialGroup()
                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MeasurePanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MeasurePanelLayout.createSequentialGroup()
                                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TextField_value, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MeasurePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(38, 38, 38)
                                .addComponent(TextField_id_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(MeasurePanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_insertMeasure)))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        MeasurePanelLayout.setVerticalGroup(
            MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeasurePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextField_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MeasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextField_id_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_insertMeasure)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Measure", MeasurePanel);

        jLabel6.setText("Number of Measurements");

        TextField_numMeasurements.setText("10");

        jLabel10.setText("Number of Measures");

        TextField_numMeasures.setText("7");

        jLabel11.setText("Value");

        jLabel12.setText("Tolerance (%)");

        TextField_tolerance.setText("10");

        TextField_valueLoop.setText("120");

        jButton1.setText("GO!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSingleLoopLayout = new javax.swing.GroupLayout(PanelSingleLoop);
        PanelSingleLoop.setLayout(PanelSingleLoopLayout);
        PanelSingleLoopLayout.setHorizontalGroup(
            PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(57, 57, 57)
                                .addComponent(TextField_numMeasurements, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(57, 57, 57)
                                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextField_numMeasures, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_tolerance, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_valueLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton1)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        PanelSingleLoopLayout.setVerticalGroup(
            PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSingleLoopLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField_numMeasurements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextField_numMeasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextField_valueLoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelSingleLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextField_tolerance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SingleLoop", PanelSingleLoop);

        jLabel1.setText("Hora");

        jLabel2.setText("Por defecto se inserta la hora actual");

        jLabel3.setText("ID de Medidor");

        TextField_id_meter.setText("1");

        jLabel4.setText("Fase");

        TextField_phase.setText("0");

        cb_phase1.setText("Fase 1");

        cb_phase2.setText("Fase 2");

        cb_phase3.setText("Fase 3");

        javax.swing.GroupLayout MeasurementPanelLayout = new javax.swing.GroupLayout(MeasurementPanel);
        MeasurementPanel.setLayout(MeasurementPanelLayout);
        MeasurementPanelLayout.setHorizontalGroup(
            MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeasurementPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MeasurementPanelLayout.createSequentialGroup()
                        .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TextField_id_meter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MeasurementPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_phase1)
                            .addComponent(TextField_phase, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_phase2)
                            .addComponent(cb_phase3))
                        .addGap(113, 113, 113)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        MeasurementPanelLayout.setVerticalGroup(
            MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeasurementPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_id_meter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MeasurementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextField_phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cb_phase1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_phase2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_phase3)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Measurement", MeasurementPanel);

        TextField_current.setText("30");

        jButton2.setText("GO!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Voltage");

        TextField_voltage.setText("120");

        jLabel16.setText("Current");

        jLabel17.setText("The number of Measurements and Measure for each Loop is in the SingleLoop Tab");

        jLabel18.setText("PowerFactor");

        TextField_powerFactor.setText("0.5");

        jLabel19.setText("Period");

        TextField_period.setText("1");

        jLabel21.setText("Frequency");

        TextField_frequency.setText("10");

        jButton3.setText("Stop!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel22.setText("Phase");

        TextField_phaseValue.setText("120");

        jLabel20.setText("Inserted Measurements");

        jLabel23.setText("Inserted Measures");

        TextField_insertedMeasurements.setEditable(false);
        TextField_insertedMeasurements.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField_insertedMeasures.setEditable(false);
        TextField_insertedMeasures.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout PanelEndlessLoopLayout = new javax.swing.GroupLayout(PanelEndlessLoop);
        PanelEndlessLoop.setLayout(PanelEndlessLoopLayout);
        PanelEndlessLoopLayout.setHorizontalGroup(
            PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel23))
                                    .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(57, 57, 57)
                                            .addComponent(TextField_period, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addGap(56, 56, 56)
                                            .addComponent(jButton3)))))
                            .addComponent(jLabel17)
                            .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(57, 57, 57)
                                    .addComponent(TextField_voltage, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(57, 57, 57)
                                    .addComponent(TextField_current, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(57, 57, 57)
                                    .addComponent(TextField_powerFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEndlessLoopLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(57, 57, 57)
                                        .addComponent(TextField_phaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(57, 57, 57)
                                        .addComponent(TextField_frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                                .addComponent(TextField_insertedMeasurements, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_insertedMeasures, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        PanelEndlessLoopLayout.setVerticalGroup(
            PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndlessLoopLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TextField_voltage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TextField_current, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TextField_powerFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TextField_frequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TextField_phaseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TextField_period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(32, 32, 32)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_insertedMeasures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_insertedMeasurements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndlessLoopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("While(1)", PanelEndlessLoop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertMeasureActionPerformed
        Meter meter = new Meter();
        meter.setId(Integer.parseInt(TextField_id_meter.getText()));
        Measurement measurement = new Measurement(meter, new Date(), Integer.parseInt(TextField_phase.getText()));
        List<Measure> Measures = new ArrayList<Measure>();
        Quantity quantity = new Quantity();
        quantity.setId(Integer.parseInt(TextField_id_quantity.getText()));
        
        Measures.add(new Measure(measurement, quantity, Integer.parseInt(TextField_value.getText())));
        
        operaciones.insertMeasureNow(measurement, Measures);
       
    }//GEN-LAST:event_btn_insertMeasureActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Meter meter = new Meter();
        meter.setId(Integer.parseInt(TextField_id_meter.getText()));
        Measurement measurement = new Measurement(meter, new Date(), Integer.parseInt(TextField_phase.getText()));
        operaciones.loopInsertMeasures(measurement, Integer.parseInt(TextField_numMeasurements.getText()), Integer.parseInt(TextField_numMeasures.getText()), Double.parseDouble(TextField_valueLoop.getText()), Double.parseDouble(TextField_tolerance.getText()));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean[] phases = new boolean[]{cb_phase1.isSelected(), cb_phase2.isSelected(), cb_phase3.isSelected()};
                
        operaciones.loopInfinite(Double.parseDouble(TextField_voltage.getText()),
                Double.parseDouble(TextField_current.getText()),
                Double.parseDouble(TextField_powerFactor.getText()),
                Double.parseDouble(TextField_frequency.getText()),
                Double.parseDouble(TextField_phaseValue.getText()),
                Long.parseLong(TextField_period.getText()),
                Integer.parseInt(TextField_id_meter.getText()),
                phases,
                Integer.parseInt(TextField_numMeasurements.getText()),
                Integer.parseInt(TextField_numMeasures.getText()),
                Integer.parseInt(TextField_tolerance.getText())                   
                );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        operaciones.stopInfiniteLoop();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InsertMeasure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertMeasure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertMeasure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertMeasure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertMeasure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MeasurePanel;
    private javax.swing.JPanel MeasurementPanel;
    private javax.swing.JPanel PanelEndlessLoop;
    private javax.swing.JPanel PanelSingleLoop;
    private javax.swing.JTextField TextField_current;
    private javax.swing.JTextField TextField_frequency;
    private javax.swing.JTextField TextField_id_meter;
    private javax.swing.JTextField TextField_id_quantity;
    private javax.swing.JTextField TextField_insertedMeasurements;
    private javax.swing.JTextField TextField_insertedMeasures;
    private javax.swing.JTextField TextField_numMeasurements;
    private javax.swing.JTextField TextField_numMeasures;
    private javax.swing.JTextField TextField_period;
    private javax.swing.JTextField TextField_phase;
    private javax.swing.JTextField TextField_phaseValue;
    private javax.swing.JTextField TextField_powerFactor;
    private javax.swing.JTextField TextField_tolerance;
    private javax.swing.JTextField TextField_value;
    private javax.swing.JTextField TextField_valueLoop;
    private javax.swing.JTextField TextField_voltage;
    private javax.swing.JButton btn_insertMeasure;
    private javax.swing.JCheckBox cb_phase1;
    private javax.swing.JCheckBox cb_phase2;
    private javax.swing.JCheckBox cb_phase3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
