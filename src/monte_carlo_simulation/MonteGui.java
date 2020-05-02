package monte_carlo_simulation;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MonteGui extends javax.swing.JFrame {
    static ArrayList<Integer> frequency;
    static ArrayList<Integer> dailydemand;
    static ArrayList<Integer> res;
    static int numberofdays ;
    static int x=0,y=0,z=0,w=0 ;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        cumulative = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        prob = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        sdd = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        rn = new javax.swing.JTable();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(29, 28, 28));

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

        cumulative.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cumulative"
            }
        ));
        jScrollPane2.setViewportView(cumulative);

        prob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Probability"
            }
        ));
        jScrollPane3.setViewportView(prob);

        sdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Simulated Daily Demand"
            }
        ));
        jScrollPane4.setViewportView(sdd);

        rn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Random Numbers"
            }
        ));
        jScrollPane5.setViewportView(rn);

        reset.setText("Reset All Values");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                            .addComponent(inputdaily, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(123, 123, 123)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Insertfordemand, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(insertforfrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Resultbtn)
                                        .addGap(39, 39, 39)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(averagedaily, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(expecteddaily, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
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
                        .addComponent(Resultbtn)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(averagedaily)
                    .addComponent(jLabel5)
                    .addComponent(expecteddaily)
                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    
    
    
     private void sim(String tablename,ArrayList<Integer> list)
    {
        DefaultTableModel model = (DefaultTableModel) sdd.getModel();
        if(y==0){
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }

           // sdd.setModel(model);
            y++ ;
        }else{
            
            model.setRowCount(0);
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }
            
            sdd.setModel(model);
        }
                
    }
     private void Cum(String tablename,ArrayList<Double> list)
    {
        DefaultTableModel model = (DefaultTableModel) cumulative.getModel();
        if(z==0){
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }

            //cumulative.setModel(model);
            z++ ;
        }else{
            model.setRowCount(0);
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }

            cumulative.setModel(model);
        }        
    } 
     private void rand(String tablename,ArrayList<Integer> list)
    {
         DefaultTableModel model = (DefaultTableModel) rn.getModel();
        if(w==0){
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }

           // rn.setModel(model);
            w++ ;
        }else{
           model.setRowCount(0);
           Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }

            rn.setModel(model);
        }
                
    } 
      private void Prob(String tablename,ArrayList<Double> list)
    {
        DefaultTableModel model= (DefaultTableModel) prob.getModel() ;
        if(x==0){
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }
       
            //prob.setModel(model);
            x++;
        }else{
            model.setRowCount(0);
            Object[] objArray = list.toArray();
            for (int i = 0; i <list.size(); i++) {
                String lines=objArray[i].toString();
                String[] datarow=lines.split("@");
                model.addRow(datarow);
            }
       
            prob.setModel(model);
        }
    } 
    
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
            int[] random=Monte_Carlo_Simulation.getRandomNumbers(numberofdays);
            double[] cum=Monte_Carlo_Simulation.getCumulative(fre);
            double[] prob=Monte_Carlo_Simulation.getProbability(fre);
            /**/
            sim("Dailysim",res);
            /**/
            Cum("demand", Monte_Carlo_Simulation.convertArrayD(cum));
            /**/
            rand("rn", Monte_Carlo_Simulation.convertArray(random));
            /**/
            Prob("demand",Monte_Carlo_Simulation.convertArrayD(prob));
             
        }
    }//GEN-LAST:event_ResultActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        frequency.clear();
        dailydemand.clear();
        res.clear();
        numberofdays=0 ;
        
        DefaultTableModel model1 = (DefaultTableModel) sdd.getModel();
        DefaultTableModel model2 = (DefaultTableModel) cumulative.getModel();
        DefaultTableModel model3 = (DefaultTableModel) rn.getModel();
        DefaultTableModel model4= (DefaultTableModel) prob.getModel() ;
        
        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);
        
    }//GEN-LAST:event_resetActionPerformed

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
    private javax.swing.JTable cumulative;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable prob;
    private javax.swing.JButton reset;
    private javax.swing.JTable rn;
    private javax.swing.JTable sdd;
    // End of variables declaration//GEN-END:variables
}
