/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphiques;

import modeles.ModelComboPilote;
import modeles.RenduComboPilote;
import entity.Pilote;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import modeles.ModelTableAvion;
import modeles.ModelTablePilote;
import modeles.RenduCheck;
import modeles.RenduTableAvion;
import modeles.RenduTablePilote;
/**
 *
 * @author mayer
 */
public class FenPilote extends javax.swing.JFrame {

    /**
     * Creates new form FenPilote
     */
    public FenPilote() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        comboPilote = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePilote = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAvion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboPilote.setModel(new ModelComboPilote());
        comboPilote.setRenderer(new RenduComboPilote());

        tablePilote.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablePilote.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablePilote);
        tablePilote.setRowHeight(22);

        ModelTablePilote mp = new ModelTablePilote();
        mp.addColumn("Viré");
        mp.addColumn("Virer");
        tablePilote.setModel(mp);
        tablePilote.setDefaultRenderer(Object.class, new RenduTablePilote());
        tablePilote.setDefaultRenderer(Boolean.class, new RenduCheck());
        tablePilote.getColumn("Virer").setCellEditor(new EditeurBoutonTable(new JCheckBox()));

        jScrollPane2.setViewportView(tableAvion);
        ModelTableAvion mta = new ModelTableAvion();
        mta.addColumn("Vendu");
        tableAvion.setModel(mta);
        tableAvion.setDefaultRenderer(Object.class, new RenduTableAvion());

        //tableAvion.addColumn(new TableColumn("Vendu"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPilote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboPilote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Pilote> comboPilote;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAvion;
    private javax.swing.JTable tablePilote;
    // End of variables declaration//GEN-END:variables
}
