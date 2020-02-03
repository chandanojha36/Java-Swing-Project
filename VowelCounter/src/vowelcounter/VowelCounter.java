
package vowelcounter;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VowelCounter extends JFrame {
    private Container c;
    private JLabel promptLabel,vowelLabel,aLabel,eLabel,iLabel,oLabel,uLabel;
    private JTextArea inputTextArea;
    private JScrollPane scroll;
    
    int totalVowel=0;
    int Letter_a=0;
    int Letter_e=0;
    int Letter_i=0;
    int Letter_o=0;
    int Letter_u=0;
    
    
    VowelCounter(){
        
        initComponents();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Counting vowel app");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        
       promptLabel=new  JLabel("Enter the Text : ");
       promptLabel.setBounds(10, 20, 100, 30);
       c.add(promptLabel);
       
       inputTextArea=new JTextArea();
       inputTextArea.setLineWrap(true);
       inputTextArea.setWrapStyleWord(true);
       
        scroll=new JScrollPane ( inputTextArea);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);
        
        
        vowelLabel=new JLabel();
        vowelLabel.setBounds(110, 150,250, 30);
        c.add(vowelLabel);
         
         
         aLabel=new JLabel();
         aLabel.setBounds(110, 190,150, 30);
         c.add(aLabel);
         
         
        eLabel=new JLabel();
        eLabel.setBounds(110, 230,150, 30);
        c.add(eLabel);
         
         
        iLabel=new JLabel();
        iLabel.setBounds(110, 270,250, 30);
        c.add(iLabel);
         
         
        oLabel=new JLabel();
        oLabel.setBounds(110, 310,250, 30);
        c.add(oLabel);
         
         
        uLabel=new JLabel();
        uLabel.setBounds(110, 350,250, 30);
        c.add(uLabel);
        
        
        inputTextArea.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
                if(ke.getSource()== inputTextArea){
                    
                    if(ke.VK_A==ke.getKeyCode()){
                        
                        Letter_a++;
                        
                        totalVowel++;
                    }
                    
                    if(ke.VK_E==ke.getKeyCode()){
                        
                        Letter_e++;
                        
                        totalVowel++;
                    }
                    
                    if(ke.VK_I==ke.getKeyCode()){
                        
                        Letter_i++;
                        
                        totalVowel++;
                    }
                    
                    if(ke.VK_O==ke.getKeyCode()){
                        
                        Letter_o++;
                        
                        totalVowel++;
                    }
                    
                    if(ke.VK_U==ke.getKeyCode()){
                        
                        Letter_u++;
                        
                        totalVowel++;
                    }
                    
                    
                }
                 
               vowelLabel.setText("Total number of vowels:  "+ totalVowel);
               aLabel.setText("Total number of a:  "+  Letter_a);
               eLabel.setText("Total number of e:  "+  Letter_e);
               iLabel.setText("Total number of i:  "+  Letter_i);
               oLabel.setText("Total number of o:  "+  Letter_o);
               uLabel.setText("Total number of u:  "+  Letter_u);
                       
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
                
            }
        
        
        
        
        } );
    }

   
    public static void main(String[] args) {
        
       VowelCounter frame=new VowelCounter();
          frame.setVisible(true);
    }
    
}
