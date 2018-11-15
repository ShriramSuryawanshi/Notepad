
package notepad;

import javax.swing.*;
import java.io.*;
import java.util.Date;



public class Pad extends javax.swing.JFrame {
    int flag=1,saved=0;                                           // flag=1 if file is saved
    String temp;                                                  // temp holds the name of file    
    JFileChooser fc = new JFileChooser();
    
    public Pad() {
        initComponents();        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file1 = new javax.swing.JMenu();
        new1 = new javax.swing.JMenuItem();
        open1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        save1 = new javax.swing.JMenuItem();
        saveas1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit1 = new javax.swing.JMenuItem();
        edit1 = new javax.swing.JMenu();
        undo1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cut1 = new javax.swing.JMenuItem();
        copy1 = new javax.swing.JMenuItem();
        paste1 = new javax.swing.JMenuItem();
        delete1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        replace1 = new javax.swing.JMenuItem();
        selectall1 = new javax.swing.JMenuItem();
        time1 = new javax.swing.JMenuItem();
        view1 = new javax.swing.JMenu();
        about1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad_Shree");

        Text.setColumns(20);
        Text.setRows(5);
        Text.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TextCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(Text);

        file1.setText("File");

        new1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new1.setText("New");
        new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new1ActionPerformed(evt);
            }
        });
        file1.add(new1);

        open1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open1.setText("Open");
        open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open1ActionPerformed(evt);
            }
        });
        file1.add(open1);
        file1.add(jSeparator1);

        save1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        file1.add(save1);

        saveas1.setText("Save As");
        saveas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveas1ActionPerformed(evt);
            }
        });
        file1.add(saveas1);
        file1.add(jSeparator2);

        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        file1.add(exit1);

        jMenuBar1.add(file1);

        edit1.setText("Edit");

        undo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo1.setText("Undo");
        undo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undo1ActionPerformed(evt);
            }
        });
        edit1.add(undo1);
        edit1.add(jSeparator3);

        cut1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut1.setText("Cut");
        cut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cut1ActionPerformed(evt);
            }
        });
        edit1.add(cut1);

        copy1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy1.setText("Copy");
        copy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy1ActionPerformed(evt);
            }
        });
        edit1.add(copy1);

        paste1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste1.setText("Paste");
        paste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paste1ActionPerformed(evt);
            }
        });
        edit1.add(paste1);

        delete1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        edit1.add(delete1);
        edit1.add(jSeparator4);

        replace1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        replace1.setText("Replace");
        replace1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replace1ActionPerformed(evt);
            }
        });
        edit1.add(replace1);

        selectall1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectall1.setText("Select All");
        selectall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectall1ActionPerformed(evt);
            }
        });
        edit1.add(selectall1);

        time1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        time1.setText("Time & Date");
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });
        edit1.add(time1);

        jMenuBar1.add(edit1);

        view1.setText("View");

        about1.setText("About...");
        about1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about1ActionPerformed(evt);
            }
        });
        view1.add(about1);

        jMenuBar1.add(view1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void save()
    {   
        int x;
        
        if(saved==0)
        {    
            x = fc.showSaveDialog((Pad)null);                       
        
            if(x==0)
            {    
                try
                {    
                    Writer w = null;                
                    File f = fc.getSelectedFile();
                    this.setTitle("NotePad_Shree : " + f.getName());
                    temp = Text.getText();
                    w = new BufferedWriter(new FileWriter(f));
                    w.write(temp);
                    w.close(); 
                    flag=1;
                    saved=1;
                }
                catch(IOException e){}        
            }
        }
        else
        {
            try
            {    
                Writer w = null;                
                File f = fc.getSelectedFile();
                this.setTitle("NotePad_Shree : " + f.getName());
                temp = Text.getText();
                w = new BufferedWriter(new FileWriter(f));
                w.write(temp);
                w.close(); 
                flag=1;
            }
            catch(IOException e){}   
        }       
    }
    
    
    
    private void new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new1ActionPerformed
        int n=1;
        
        if(flag==0)
            n = JOptionPane.showConfirmDialog((Pad)null, "Do you want to save file..?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null);

        if(n==0)     
        {    
            save();                                 
            this.setVisible(false);
            new Pad().setVisible(true);
        }    
        else if(n==1)
        {
            this.setVisible(false);
            new Pad().setVisible(true);
        }    
    }//GEN-LAST:event_new1ActionPerformed

    
    
    private void open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open1ActionPerformed
        int x;
        x = fc.showOpenDialog((Pad)null);
        
        if(x==0)
        {   
            Text.setText("");
            try
            {  
              FileInputStream fstream = new FileInputStream(fc.getSelectedFile());
              File f = fc.getSelectedFile();
              this.setTitle("NotePad_Shree : " + f.getName());
              DataInputStream in = new DataInputStream(fstream);
              BufferedReader br = new BufferedReader(new InputStreamReader(in));          

              while ((temp = br.readLine()) != null) 
              {    
                  temp = Text.getText() + temp + "\n";
                  Text.setText(temp);                    
              }    

              in.close();      
              saved=1;
              flag=1;
            }
            catch (Exception e){}
        }
        
    }//GEN-LAST:event_open1ActionPerformed



private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        if(flag==0)
            save();    
}//GEN-LAST:event_save1ActionPerformed



private void TextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TextCaretUpdate
        flag=0;               
}//GEN-LAST:event_TextCaretUpdate



private void saveas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveas1ActionPerformed
        flag=0;
        saved=0;
        save();
}//GEN-LAST:event_saveas1ActionPerformed



private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        int n=1;
        
        if(flag==0)
            n = JOptionPane.showConfirmDialog((Pad)null, "Do you want to save file..?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null);

        if(n==0)     
        {    
            save();                                             
            System.exit(0);
        }    
        else if(n==1)        
            System.exit(0);           
}//GEN-LAST:event_exit1ActionPerformed



private void undo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undo1ActionPerformed
        Text.setText("");
        
        try
        {             
          FileInputStream fstream = new FileInputStream(fc.getSelectedFile());
          File f = fc.getSelectedFile();
          this.setTitle("NotePad_Shree : " + f.getName());
          DataInputStream in = new DataInputStream(fstream);
          BufferedReader br = new BufferedReader(new InputStreamReader(in));          

          while ((temp = br.readLine()) != null) 
          {    
              temp = Text.getText() + temp + "\n";
              Text.setText(temp);                    
          }    

          in.close();      
          saved=1;
          flag=1;
        }
        catch (Exception e){}
}//GEN-LAST:event_undo1ActionPerformed



private void cut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cut1ActionPerformed
        Text.cut();
}//GEN-LAST:event_cut1ActionPerformed



private void copy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copy1ActionPerformed
        Text.copy();
}//GEN-LAST:event_copy1ActionPerformed



private void paste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paste1ActionPerformed
        Text.paste();   
}//GEN-LAST:event_paste1ActionPerformed



private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        String cpy = Text.getSelectedText();
        String all = Text.getText();
        all.replaceAll(cpy, "");        
}//GEN-LAST:event_delete1ActionPerformed



private void replace1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replace1ActionPerformed
        String all = Text.getText();        
        temp = JOptionPane.showInputDialog((Pad)null, "The text to replace..: ", "Find", JOptionPane.INFORMATION_MESSAGE);
        String add = JOptionPane.showInputDialog((Pad)null, "Replace with..: ", "Replace", JOptionPane.INFORMATION_MESSAGE);
        
        all = all.replaceAll(temp, add);
        Text.setText(all);        
}//GEN-LAST:event_replace1ActionPerformed



private void selectall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectall1ActionPerformed
        Text.selectAll();
}//GEN-LAST:event_selectall1ActionPerformed



private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        String all = Text.getText();       
        Date date = new Date();
        all = all + "\n" + date;
        Text.setText(all);        
}//GEN-LAST:event_time1ActionPerformed



private void about1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about1ActionPerformed
        Text.setText("Name\t: Mr. Shriram A. Suryawanshi\nRoll\t: 20080661\nCourse\t: Final Year B.Tech - Computer Engg.\nCollege\t: Dr. B.A.T.University, Lonere, Raigad");
        Text.setEnabled(false);        
        flag=1;
        saved=1;
}//GEN-LAST:event_about1ActionPerformed

       
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() { @Override
            public void run() {
                new Pad().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Text;
    private javax.swing.JMenuItem about1;
    private javax.swing.JMenuItem copy1;
    private javax.swing.JMenuItem cut1;
    private javax.swing.JMenuItem delete1;
    private javax.swing.JMenu edit1;
    private javax.swing.JMenuItem exit1;
    private javax.swing.JMenu file1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem new1;
    private javax.swing.JMenuItem open1;
    private javax.swing.JMenuItem paste1;
    private javax.swing.JMenuItem replace1;
    private javax.swing.JMenuItem save1;
    private javax.swing.JMenuItem saveas1;
    private javax.swing.JMenuItem selectall1;
    private javax.swing.JMenuItem time1;
    private javax.swing.JMenuItem undo1;
    private javax.swing.JMenu view1;
    // End of variables declaration//GEN-END:variables
}