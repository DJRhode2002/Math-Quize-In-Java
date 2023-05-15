
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author deowi
 */
public class MathQuize extends javax.swing.JFrame {
String Name;
String[] Levels = {"1","2","3","4","5","6","7"};
JComboBox lvl = new JComboBox(Levels);
String function;
Random rand = new Random();
int num1,num2,num3,num4,num5,num6,num8,num9;
Double num7;
double Ans;
double ANS;
int ran,count,cou;
Timer timer,timers;
int cor,inc,tot;
int que = 1 ;
int ac;

    /**
     * Creates new form MathQuize
     */
    public MathQuize() {
        start();
    }
    public final void start(){
        initComponents();statTimer();
        setlevel();
        asktime();
        timer();     
        geName();
        reset.setVisible(false);
    }
    public final void asktime(){
        
        count = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter time Limit"));
        cou = count;
    }
    public final void geName(){
        Name = JOptionPane.showInputDialog(null,"Enter Name");
        Names.setText(Names.getText() + " " + Name);
    }
    public final void timer(){
        this.timer = new Timer(1000, (ActionEvent e) -> {
            count--;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            if (count > -1){
                Time.setText(Integer.toString(count));
                if (count == cou-1){
                    Time.setForeground(Color.GREEN);
                }
                if (count < cou/2){
                    Time.setForeground(Color.YELLOW);
                }
                if (count < cou/4){
                    Time.setForeground(Color.RED);
                }
            }

            else{
                ((Timer) (e.getSource())).stop();
                JOptionPane.showMessageDialog(null,"Your out of time");
                reset.setVisible(true);
                if (ENG.isSelected()){
                    STR.setText("Reset");
                    reset.setText("Reset");
                }
                else if(AFR.isSelected()){
                    STR.setText("Stel terug");
                    reset.setText("Stel terug");
                }
                Time.setText("");
            }
        });
    }
    public final void setlevel(){
        if (ENG.isSelected()){
            JOptionPane.showMessageDialog(null, lvl, "Select Level", JOptionPane.QUESTION_MESSAGE);
            level = lvl.getSelectedItem().toString();
            if (Integer.parseInt(level) > 0){
                levels.setText("Level - " + level);
            }
            else{
                levels.setText(levels.getText() + " " + level);
            }
        }
        else if (AFR.isSelected()){
            JOptionPane.showMessageDialog(null, lvl, "Kies Vlak", JOptionPane.QUESTION_MESSAGE);
            level = lvl.getSelectedItem().toString();
            if (Integer.parseInt(level) > 0){
                levels.setText("Vlak - " + level);
            }
            else{
                levels.setText(levels.getText() + " " + level);
            }
        }
    }
    public final void level1(){
        //add,sub;
        ran = rand.nextInt(2)+1;
        num1 = rand.nextInt(16); 
        num2 = rand.nextInt(16);
        if (ran == 1){
           Ans = num1 + num2;
           TEST.setText(num1 + " + " + num2 + " = ");
        }
        else if(ran == 2){
            if (num1<num2){
                Ans = num2 - num1;
                TEST.setText(num2 + " - " + num1 + " = ");
            }
            else if (num1>num2){
                Ans = num1 - num2;
                TEST.setText(num1 + " - " + num2 + " = ");
            } 
        }
    }
    public final void level2(){
        ran = rand.nextInt(3)+1;
        num1 = rand.nextInt(100); 
        num2 = rand.nextInt(100);
        num3 = rand.nextInt(10);
        num4 = rand.nextInt(10);
        switch (ran) {
            case 1 -> {
                Ans = num1 + num2;
                TEST.setText(num1 + " + " + num2 + " = ");
            }
            case 2 -> {
                if (num1<num2){
                    Ans = num2 - num1;
                    TEST.setText(num2 + " - " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 - num2;
                    TEST.setText(num1 + " - " + num2 + " = ");
                }
            }
            case 3 -> {
                Ans = num3*num4;
                TEST.setText(num3 + " X " + num4 + " = ");
            }
            default -> {
            }
        }
    }
    public final void level3(){
        ran = rand.nextInt(4)+1;
        num1 = rand.nextInt(100); 
        num2 = rand.nextInt(100);
        num3 = rand.nextInt(100);
        num4 = rand.nextInt(10);
        switch (ran) {
            case 1 -> {
                Ans = num1 + num2;
                TEST.setText(num1 + " + " + num2 + " = ");
            }
            case 2 -> {
                if (num1<num2){
                    Ans = num2 - num1;
                    TEST.setText(num2 + " - " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 - num2;
                    TEST.setText(num1 + " - " + num2 + " = ");
                }
            }
            case 3 -> {
                Ans = num3*num4;
                TEST.setText(num3 + " X " + num4 + " = ");
            }
            case 4 -> {
                if (num1<num2){
                    Ans = num2 / num1;
                    TEST.setText(num2 + " / " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 / num2;
                    TEST.setText(num1 + " / " + num2 + " = ");
                }
            }
            default -> {
            }
        }
    }
    public final void level4(){
        ran = rand.nextInt(4)+1;
        num1 = rand.nextInt(10000); 
        num2 = rand.nextInt(10000);
        num3 = rand.nextInt(1000);
        num4 = rand.nextInt(10);
        num5 = rand.nextInt(1000);
        switch (ran) {
            case 1 -> {
                Ans = num1 + num2;
                Math.round((Ans)*100.00/100.00);
                TEST.setText(num1 + " + " + num2 + " = ");
            }
            case 2 -> {
                if (num1<num2){
                    Ans = num2 - num1;
                    TEST.setText(num2 + " - " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 - num2;
                    TEST.setText(num1 + " - " + num2 + " = ");
                }
            }
            case 3 -> {
                Ans = num3*num4;
                TEST.setText(num3 + " X " + num4 + " = ");
            }
            case 4 -> {
                if (num5%num4==0){
                    Ans = num5 / num4;
                    Ans = Math.round(Ans*100.00/100.00);
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
                else {
                    num4 = rand.nextInt(10);
                    num5 = rand.nextInt(1000);
                    Ans = num5 / num4;
                    Ans = Math.round(Ans*100.00/100.00);
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
            }
            default -> {
            }
        }
    } 
    public final void level5(){
        ran = rand.nextInt(4)+1;
        num1 = rand.nextInt(1000000); 
        num2 = rand.nextInt(1000000);
        num3 = (int) rand.nextDouble(10);
        num3 = (int) (Math.round(num3/100.00)*100.00);
        num4 = rand.nextInt(10);
        num5 = rand.nextInt(1000);
        int y[] = {10,100,1000};
        int t = rand.nextInt(2);
        num6 = y[t];
        num7 = rand.nextDouble(10);
        switch (ran) {
            case 1 -> {
                Ans = num1 + num2;
                Math.round((Ans)*100.00/100.00);
                TEST.setText(num1 + " + " + num2 + " = ");
            }
            case 2 -> {
                if (num1<num2){
                    Ans = num2 - num1;
                    TEST.setText(num2 + " - " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 - num2;
                    TEST.setText(num1 + " - " + num2 + " = ");
                }
            }
            case 3 -> {
                Ans = num7*num6;
                    Ans = Math.round(Ans*100.00/100.00);
                TEST.setText(num7 + " X " + num6 + " = ");
            }
            case 4 -> {
                if (num5%num4==0){
                    Ans = num5 / num4;
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
                else {
                    num4 = rand.nextInt(10);
                    num5 = rand.nextInt(1000);
                    Ans = num5 / num4;
                    Ans = Math.round(Ans*100.00/100.00);
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
            }
            default -> {
            }
        }
    }  
    public final void level6(){
        ran = rand.nextInt(4)+1;
        num1 = rand.nextInt(10000); 
        num2 = rand.nextInt(10000);
        num8 = rand.nextInt(10000); 
        num9 = rand.nextInt(10000);
        num3 = (int) rand.nextDouble(1000);
        num3 = (int) (Math.round(num3/100.00)*100.00);
        num4 = rand.nextInt(100);
        num5 = rand.nextInt(1000);
        num3 = rand.nextInt(10000);
        num6 = rand.nextInt(100);
        switch (ran) {
            case 1 -> {
                int e = rand.nextInt(3);
                switch (e) {
                    case 1 -> {
                        Ans = num1 + num2;
                        TEST.setText(num1 + " + " + num2 + " = ");
                    }
                    case 2 -> {
                        Ans = num1 + num2 + num8;
                        TEST.setText(num1 + " + " + num2 + "\n+"+ num8+  " = ");
                    }
                    case 3 -> {
                        Ans = num1 + num2 + num8 + num9;
                        TEST.setText(num1 + " + " + num2 + "\n+"+ num8 + " + " + num9 +  " = ");
                    }
                    default -> {
                    }
                }
            }
            case 2 -> {
                if (num1<num2){
                    Ans = num2 - num1;
                    TEST.setText(num2 + " - " + num1 + " = ");
                }
                else if (num1>num2){
                    Ans = num1 - num2;
                    TEST.setText(num1 + " - " + num2 + " = ");
                }
            }
            case 3 -> {
                Ans = num3*num6;
                    Ans = Math.round(Ans*100.00/100.00);
                TEST.setText(num3 + " X " + num6 + " = ");
            }
            case 4 -> {
                if (num5%num4==0){
                    Ans = num5 / num4;
                    Ans = Math.round(Ans*100.00/100.00);
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
                else {
                    num4 = rand.nextInt(10);
                    num5 = rand.nextInt(1000);
                    Ans = num5 / num4;
                    Ans = Math.round(Ans*100.00/100.00);
                    TEST.setText(num5 + " / " + num4 + " = ");
                }
            }
            default -> {
            }
        }
    }  
    public final void level7(){
        ran = rand.nextInt(4)+1;
        num1 = rand.nextInt(100000); 
        num2 = rand.nextInt(100000);
        num8 = rand.nextInt(100000); 
        num9 = rand.nextInt(100000);
        num3 = (int) rand.nextDouble(1000);
        num3 = (int) (Math.round(num3/100.00)*100.00);
        num4 = rand.nextInt(100);
        num5 = rand.nextInt(1000);
        num3 = rand.nextInt(1000);
        num6 = rand.nextInt(1000);
        switch (ran) {
            case 1 -> {
                int e = rand.nextInt(3);
                switch (e) {
                    case 1 -> {
                        Ans = num1 + num2;
                        Math.round(Ans*100.00/100.00);
                        TEST.setText(num1 + " + " + num2 + " = ");
                    }
                    case 2 -> {
                        Ans = num1 + num2 + num8;
                        Math.round(Ans*100.00/100.00);
                        TEST.setText(num1 + " + " + num2 + "\n"+ num8+  " = ");
                    }
                    case 3 -> {
                        Ans = num1 + num2 + num8 + num9;
                        Math.round(Ans*100.00/100.00);
                        TEST.setText(num1 + " + " + num2 + "\n+"+ num8 + " + " + num9 +  " = ");
                    }
                    default -> {
                    }
                }
            }
            case 2 -> {
                Ans = num2 - num1;
                TEST.setText(num2 + " - " + num1 + " = ");
                
            }
            case 3 -> {
                Ans = num3*num6;
                Ans = Math.round(Ans*100.00/100.00);
                TEST.setText(num3 + " X " + num6 + " = ");
            }
            case 4 -> {
                num4 = rand.nextInt(100);
                num5 = rand.nextInt(100000);
                Ans = num5 / num4;
                TEST.setText(num5 + " / " + num4 + " = ");
            }
            default -> {
            }
        }
    } 
    public final void levels(){
        switch (level) {
            case "1" -> level1();
            case "2" -> level2();
            case "3" -> level3();
            case "4" -> level4();
            case "5" -> level5();
            case "6" -> level6();
            case "7" -> level7();
            default -> {
                    }
        }
    }
    public final void statTimer(){
        timers = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac++;
                if (ac==10){
                    ac=0;
                    genstats();
                }
                
            }
        });
        timers.setInitialDelay(0);
        timers.start();
    }
    public final void genstats(){
        tot = cor + inc;
        if (ENG.isSelected()){
            STSTS.setText("Stats of  " + Name
                        + "\nLevel - " + level 
                        + "\nTotal Questions - " + tot 
                        + "\nCorrect - " + cor
                        + "\nIncorrect - " + inc);
        }
        else if(AFR.isSelected()){
            STSTS.setText("Statistieke van " + Name
                        + "\nVlak - " + level 
                        + "\nTotale vrae - " + tot 
                        + "\nKorrek - " + cor
                        + "\nVerkeerd - " + inc);
        }
    }
    public final void game(){
        if (ENG.isSelected()){
            switch (STR.getText()) {
                case "Main" -> {
                    TAB.setSelectedIndex(0);
                    if (TEST.getText().isEmpty()){
                        STR.setText("Start");
                    }
                    else if (!TEST.getText().isEmpty()){
                        STR.setText("Check");
                    }
                }
                case "Start" -> {
                    levels();
                    STR.setText("Check");
                    timer.setInitialDelay(0);
                    timer.start();
                    Ans = Ans;
                    reset.setVisible(true);
                }
                case "Check" -> {
                    ANS = Double.parseDouble(ANSWER.getText());
                    if (ANS == Ans){
                        cor++;
                        JOptionPane.showMessageDialog(null,"Correct");
                        if (RESULT.getText().isEmpty()){
                            RESULT.setText(que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        else if(!RESULT.getText().isEmpty()){
                            que++;
                            RESULT.setText(RESULT.getText() + "\n\n" + que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        levels();
                        ANSWER.setText("");
                        
                        
                    }
                    else if(ANSWER.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Please fill in a number");
                    }
                    else if(ANS != Ans){
                        inc++;
                        JOptionPane.showMessageDialog(null,"Incorrect");
                        if (RESULT.getText().isEmpty()){
                            RESULT.setText(que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        else if(!RESULT.getText().isEmpty()){
                            que++;
                            RESULT.setText(RESULT.getText() + "\n\n" + que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        levels();
                        ANSWER.setText("");
                    }
                }
                default -> {
                }
            }
        }
        else if (AFR.isSelected()){
            switch (STR.getText()) {
                case "Hoof" -> {
                    TAB.setSelectedIndex(0);
                    if (TEST.getText().isEmpty()){
                        STR.setText("Begin");
                    }
                    else if (!TEST.getText().isEmpty()){
                        STR.setText("Kontroleer");
                    }
                }
                case "Begin" -> {
                    levels();
                    STR.setText("Kontroleer");
                    timer.setInitialDelay(0);
                    timer.start();
                    Ans = Ans;
                    
                }
                case "Kontroleer" -> {
                    ANS = Double.parseDouble(ANSWER.getText());
                    if (ANS == Ans){
                        cor++;
                        JOptionPane.showMessageDialog(null,"Korrek");
                        if (RESULT.getText().isEmpty()){
                            RESULT.setText(que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        else if(!RESULT.getText().isEmpty()){
                            que++;
                            RESULT.setText(RESULT.getText() + "\n\n" + que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        levels();
                        ANSWER.setText("");
                        
                    }
                    else if(ANSWER.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Vul asseblief 'n nommer in");
                    }
                    else if(ANS != Ans){
                        inc++;
                        JOptionPane.showMessageDialog(null,"Verkeerd");
                        if (RESULT.getText().isEmpty()){
                            RESULT.setText(que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }
                        else if(!RESULT.getText().isEmpty()){
                            que++;
                            RESULT.setText(RESULT.getText() + "\n\n" + que + ".\n" + TEST.getText() + Ans 
                                    + "\n" +  Name + " - " +ANSWER.getText());
                        }levels();
                        ANSWER.setText("");
                    }
                }
                default -> {
                }
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Settings1 = new javax.swing.JPanel();
        ENG = new javax.swing.JRadioButton();
        AFR = new javax.swing.JRadioButton();
        levels = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        RES = new javax.swing.JButton();
        STR = new javax.swing.JButton();
        STS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Names = new javax.swing.JLabel();
        TAB = new javax.swing.JTabbedPane();
        Game = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TEST = new javax.swing.JLabel();
        ANSWER = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Time = new javax.swing.JLabel();
        TP = new javax.swing.JButton();
        Results = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        res = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RESULT = new javax.swing.JTextArea();
        Stats = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        STATS = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        STSTS = new javax.swing.JTextArea();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(ENG);
        ENG.setSelected(true);
        ENG.setText("English");
        ENG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENGActionPerformed(evt);
            }
        });

        buttonGroup1.add(AFR);
        AFR.setText("Afrikaans");
        AFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFRActionPerformed(evt);
            }
        });

        levels.setText("Level : ");
        levels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                levelsMouseClicked(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Settings1Layout = new javax.swing.GroupLayout(Settings1);
        Settings1.setLayout(Settings1Layout);
        Settings1Layout.setHorizontalGroup(
            Settings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Settings1Layout.createSequentialGroup()
                .addComponent(ENG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AFR)
                .addGap(18, 18, 18)
                .addComponent(levels, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset))
        );
        Settings1Layout.setVerticalGroup(
            Settings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Settings1Layout.createSequentialGroup()
                .addGroup(Settings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Settings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ENG)
                        .addComponent(AFR)
                        .addComponent(levels, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        RES.setText("Results");
        RES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESActionPerformed(evt);
            }
        });

        STR.setText("Start");
        STR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STRActionPerformed(evt);
            }
        });

        STS.setText("Stats");
        STS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(RES, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(STR, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(STS, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RES, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STR, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Names.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Names.setText("Name - ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Names, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Names, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Game.setBackground(new java.awt.Color(255, 255, 255));
        Game.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        TEST.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TEST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ANSWER.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ANSWER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ANSWER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANSWERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEST, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANSWER, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ANSWER, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Time.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TP.setText("Pause");
        TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GameLayout = new javax.swing.GroupLayout(Game);
        Game.setLayout(GameLayout);
        GameLayout.setHorizontalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GameLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TP))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        GameLayout.setVerticalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameLayout.createSequentialGroup()
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(GameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        TAB.addTab("Main", Game);

        Results.setBackground(new java.awt.Color(204, 204, 255));
        Results.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        res.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        res.setText("Results");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        RESULT.setColumns(20);
        RESULT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RESULT.setRows(5);
        RESULT.setEnabled(false);
        jScrollPane2.setViewportView(RESULT);

        javax.swing.GroupLayout ResultsLayout = new javax.swing.GroupLayout(Results);
        Results.setLayout(ResultsLayout);
        ResultsLayout.setHorizontalGroup(
            ResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        ResultsLayout.setVerticalGroup(
            ResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultsLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );

        TAB.addTab("Result", Results);

        Stats.setBackground(new java.awt.Color(204, 204, 255));
        Stats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        STATS.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        STATS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STATS.setText("Statistics");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STATS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STATS, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        STSTS.setColumns(20);
        STSTS.setRows(5);
        jScrollPane3.setViewportView(STSTS);

        javax.swing.GroupLayout StatsLayout = new javax.swing.GroupLayout(Stats);
        Stats.setLayout(StatsLayout);
        StatsLayout.setHorizontalGroup(
            StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        StatsLayout.setVerticalGroup(
            StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Stats", Stats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Settings1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TAB))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Settings1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(TAB, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ENGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENGActionPerformed
        // TODO add your handling code here:
        RES.setText("Results");
        res.setText("Results");
        STS.setText("Stats");
        STATS.setText("Statistics");
        reset.setText("Reset");
        switch (STR.getText()) {
            case "Begin" -> STR.setText("Start");
            case "Kontroleer" -> STR.setText("Check");
            case "Hoof" -> STR.setText("Main");
            default -> {
                    }
        }
        Names.setText("Name - " + Name);
        if (TP.getText().equals("Pouse")){
            TP.setText("Pause");
        }
        else if(TP.getText().equals("Speel")){
            TP.setText("Play");
        }
        levels.setText("Level - " + level);
    }//GEN-LAST:event_ENGActionPerformed
    String level;
    private void levelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelsMouseClicked
        // TODO add your handling code here:
        if (AFR.isSelected()){
            if (STR.getText().equals("Begin")){
                setlevel();
            }
        }
        else if(ENG.isSelected()){
            if (STR.getText().equals("Start")){
                setlevel();
            }
        }
    }//GEN-LAST:event_levelsMouseClicked

    private void AFRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFRActionPerformed
        // TODO add your handling code here:
        STATS.setText("Statistiek");
        RES.setText("Resultate");
        res.setText("Resultate");
        STS.setText("Statistieke");
        reset.setText("Stel teru");
        switch (STR.getText()) {
            case "Start" -> STR.setText("Begin");
            case "Check" -> STR.setText("Kontroleer");
            case "Main" -> STR.setText("Hoof");
            default -> {
                    }
        }
        Names.setText("Naam - " + Name);
        levels.setText("Vlak - " + level);
        if (TP.getText().equals("Pause")){
            TP.setText("Pouse");
        }
        else if(TP.getText().equals("Play")){
            TP.setText("Speel");
        }
    }//GEN-LAST:event_AFRActionPerformed

    private void RESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESActionPerformed
        // TODO add your handling code here:
        TAB.setSelectedIndex(1);
        if (ENG.isSelected()){
            STR.setText("Main");
        }
        else if (AFR.isSelected()){
            STR.setText("Hoof");
        }
    }//GEN-LAST:event_RESActionPerformed

    private void STSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STSActionPerformed
        // TODO add your handling code here:
        TAB.setSelectedIndex(2);
        if (ENG.isSelected()){
            STR.setText("Main");
        }
        else if (AFR.isSelected()){
            STR.setText("Hoof");
        }
    }//GEN-LAST:event_STSActionPerformed

    private void STRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STRActionPerformed
        // TODO add your handling code here:
        game();
    }//GEN-LAST:event_STRActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        if (ENG.isSelected()){
            STR.setText("Start");
        }
        else if (AFR.isSelected()){
            STR.setText("Begin");
        }
        TEST.setText("");
        ANSWER.setText("");
        timer.stop();
        Time.setText("");
        reset.setVisible(false);
        asktime();
    }//GEN-LAST:event_resetActionPerformed

    private void ANSWERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANSWERActionPerformed
        // TODO add your handling code here:
        game();
    }//GEN-LAST:event_ANSWERActionPerformed

    private void TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPActionPerformed
        // TODO add your handling code here:
        if (ENG.isSelected()){
            if (STR.getText().equals("Start")){
                
            }
            else if (STR.getText().equals("Reset")){
                
            }
            else{
                if (TP.getText().equals("Pause")){
                    timer.stop();
                    TP.setText("Play");
                }
                else if(TP.getText().equals("Play")){
                    timer.start();
                    TP.setText("Pause");
                }
            }
        }
        else if (AFR.isSelected()){
            if (STR.getText().equals("Start")){
                
            }
            else if (STR.getText().equals("Reset")){
                
            }
            else{
                if (TP.getText().equals("Pouse")){
                timer.stop();
                TP.setText("Speel");
                }
                else if(TP.getText().equals("Speel")){
                    timer.start();
                    TP.setText("Pouse");
                }
            }
            
        }
        
    }//GEN-LAST:event_TPActionPerformed

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
            java.util.logging.Logger.getLogger(MathQuize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathQuize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathQuize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathQuize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathQuize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AFR;
    private javax.swing.JTextField ANSWER;
    private javax.swing.JRadioButton ENG;
    private javax.swing.JPanel Game;
    private javax.swing.JLabel Names;
    private javax.swing.JButton RES;
    private javax.swing.JTextArea RESULT;
    private javax.swing.JPanel Results;
    private javax.swing.JLabel STATS;
    private javax.swing.JButton STR;
    private javax.swing.JButton STS;
    private javax.swing.JTextArea STSTS;
    private javax.swing.JPanel Settings1;
    private javax.swing.JPanel Stats;
    private javax.swing.JTabbedPane TAB;
    private javax.swing.JLabel TEST;
    private javax.swing.JButton TP;
    private javax.swing.JLabel Time;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel levels;
    private javax.swing.JLabel res;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

}
