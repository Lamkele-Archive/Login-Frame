
package za.ac.tut.ui;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class LoginFrame extends JFrame{
    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel usernamePasswordCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    private JTextField usernameTxtFld;
    
    private JPasswordField passwordFld;
    
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public LoginFrame(){
        setTitle("LOGIN");
        setSize(500,500);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernamePasswordCombinedPnl = new JPanel(new GridLayout(2,1,1,1));
        usernamePasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2), "Login detains"));
        
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD + Font.ITALIC,30));
        headingLbl.setForeground(Color.RED);
        
        usernameLbl = new JLabel("Username:");
        passwordLbl = new JLabel("Password:");
        
        usernameTxtFld = new JTextField(10);
        usernameTxtFld.setFocusable(true);
        passwordFld = new JPasswordField(10);
        
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);
        
        usernamePasswordCombinedPnl.add(usernamePnl);
        usernamePasswordCombinedPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(usernamePasswordCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
    }
}
