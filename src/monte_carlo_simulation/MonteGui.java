package monte_carlo_simulation;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MonteGui extends javax.swing.JFrame {
    static ArrayList<Integer> frequency;
    static ArrayList<Integer> dailydemand;
    static ArrayList<Integer> res;
    static int numberofdays ;
    public MonteGui() {
        initComponents();
        frequency=new ArrayList<Integer>() ;
        dailydemand=new ArrayList<Integer>() ;
        res=new ArrayList<Integer>() ;
        numberofdays=0 ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mytable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputfrequecy = new javax.swing.JTextField();
        inputdaysnumber = new javax.swing.JTextField();
        inputdaily = new javax.swing.JTextField();
        Insertfordemand = new javax.swing.JButton();
        Resultbtn = new javax.swing.JButton();
        insertforfrequency = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        averagedaily = new javax.swing.JLabel();
        expecteddaily = new javax.swing.JLabel();
        Result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(29, 28, 28));

        mytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Probability", "Cumulative", "Random Numbers", "Simulated Daily demand"
            }
        ));
        jScrollPane1.setViewportView(mytable);

        jLabel1.setText("Frequency");

        jLabel2.setText("Daily demand");

        jLabel3.setText("Number Of Days");

        Insertfordemand.setText("Insert");
        Insertfordemand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertfordemandActionPerformed(evt);
            }
        });

        Resultbtn.setText("set Number Of Days");
        Resultbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultbtnActionPerformed(evt);
            }
        });

        insertforfrequency.setText("Insert");
        insertforfrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertforfrequencyActionPerformed(evt);
            }
        });

        jLabel4.setText("Average Daily demand");

        jLabel5.setText("Expected Daily demand");

        averagedaily.setText("0.0");

        expecteddaily.setText("0.0");

        Result.setText("Show Result");
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 173, Short.MAX_VALUE)
                        .addComponent(insertforfrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputdaysnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputfrequecy, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputdaily, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Insertfordemand, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Resultbtn)
                                .addGap(75, 75, 75)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(averagedaily, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expecteddaily, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputfrequecy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(insertforfrequency)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputdaily, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Insertfordemand)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputdaysnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Resultbtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averagedaily)
                    .addComponent(jLabel5)
                    .addComponent(expecteddaily))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertforfrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertforfrequencyActionPerformed
        try{
            if(Integer.parseInt(inputfrequecy.getText())<0){
                JOptionPane.showMessageDialog(this,"Frequency Must be Positive Number","Error",JOptionPane.ERROR_MESSAGE);
                return ;
            }else{
                frequency.add(Integer.parseInt(inputfrequecy.getText()));
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Only Integer Numbers Can be Added To This Field","Error",JOptionPane.ERROR_MESSAGE);
            return ;
        }
        inputfrequecy.setText("");
        JOptionPane.showMessageDialog(this,"Added Succesfully \nYour Current Frequencies is \n"+frequency,"Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_insertforfrequencyActionPerformed

    private void ResultbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultbtnActionPerformed
        try{
            if(Integer.parseInt(inputdaysnumber.getText())<0){
                JOptionPane.showMessageDialog(this,"Days Must be Positive Number","Error",JOptionPane.ERROR_MESSAGE);
                return ;
            }else{
                numberofdays=Integer.parseInt(inputdaysnumber.getText());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Only Integer Numbers Can be Added To This Field","Error",JOptionPane.ERROR_MESSAGE);
            return ;
        }
        inputdaysnumber.setText("");
        JOptionPane.showMessageDialog(this,"Added Succesfully \nThe Number Of days Is \n"+numberofdays,"Information",JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_ResultbtnActionPerformed

    private void InsertfordemandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertfordemandActionPerformed
        try{
            if(Integer.parseInt(inputdaily.getText())<0){
                JOptionPane.showMessageDialog(this,"Demand Must be Positive Number","Error",JOptionPane.ERROR_MESSAGE);
                return ;
            }else{
                dailydemand.add(Integer.parseInt(inputdaily.getText()));
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Only Integer Numbers Can be Added To This Field","Error",JOptionPane.ERROR_MESSAGE);
            return ;
        }
        inputdaily.setText("");
        JOptionPane.showMessageDialog(this,"Added Succesfully \nYour Current DailyDemand is \n"+dailydemand,"Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_InsertfordemandActionPerformed

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        if(frequency.size()==0||dailydemand.size()==0||numberofdays==0){
            JOptionPane.showMessageDialog(this,"Days,Frequences and demands must not be empty","Error",JOptionPane.ERROR_MESSAGE);
        }else if(frequency.size()!=dailydemand.size()){
            JOptionPane.showMessageDialog(this,"Number of frequnces must be equal to number of dailydemand","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            int[] da =Monte_Carlo_Simulation.convertIntegers(dailydemand);
            int[] fre =Monte_Carlo_Simulation.convertIntegers(frequency);
            res=Monte_Carlo_Simulation.getSimulatedDailyDemand(da,fre,numberofdays);
            averagedaily.setText(String.valueOf(Monte_Carlo_Simulation.avrge(res)));
            expecteddaily.setText(String.valueOf(Monte_Carlo_Simulation.EXpected(da, fre)));
        }
    }//GEN-LAST:event_ResultActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonteGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insertfordemand;
    private javax.swing.JButton Result;
    private javax.swing.JButton Resultbtn;
    private javax.swing.JLabel averagedaily;
    private javax.swing.JLabel expecteddaily;
    private javax.swing.JTextField inputdaily;
    private javax.swing.JTextField inputdaysnumber;
    private javax.swing.JTextField inputfrequecy;
    private javax.swing.JButton insertforfrequency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mytable;
    // End of variables declaration//GEN-END:variables
}
