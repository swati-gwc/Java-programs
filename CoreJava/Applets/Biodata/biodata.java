import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;  
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.lang.*;
/**
 *
 * @author swati
 */
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Myapplet extends Applet implements ActionListener {
  
    String valid_ans;
    TextField email_inp, contact_inp ;
    Label email_valid_ans, form_submit_notice,contact_valid_ans  ;
    public void init() {
        
        //LAYOUT SETTINGS
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setLayout(gridbag);
        
        //HEADING BIO DATA
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.anchor = GridBagConstraints.WEST;
        Font f= new Font("Arial",Font.BOLD,20);
        Label heading = new Label("BIO DATA ");
        heading .setFont(f);
        gridbag.setConstraints(heading , c);
        add(heading);
        
        //ADDING BREAK LINE
        c.gridwidth = GridBagConstraints.REMAINDER;
        Label line = new Label("________________________________");
        line.setFont(f);
        add(line);
        
        gridbag.setConstraints(line, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        Label ge3 = new Label(" ");
        gridbag.setConstraints(ge3, c);
        add(ge3);
        
        //NAME TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label Fname = new Label("1. Name: ");
        gridbag.setConstraints(Fname, c);
        add(Fname);
        
        //NAME INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        TextField tfname = new TextField(10);
        gridbag.setConstraints(tfname,c);
        add(tfname);
        
        //ENROLLMENT NO TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label Enroll_no = new Label("2. Enrollment No: ");
        gridbag.setConstraints(Enroll_no, c);
        add(Enroll_no);
        
        //ENROLLMENT NO INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        TextField Enroll_no_inp = new TextField(10);
        gridbag.setConstraints(Enroll_no_inp,c);
        add(Enroll_no_inp );
        
        //DOB NO TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label dob = new Label("3. DOB: ");
        gridbag.setConstraints(dob, c);
         add(dob);
        
        //DOB NO INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        Panel p = new Panel();
        p.setLayout(new GridBagLayout());
        TextField d = new TextField(10);
        TextField o = new TextField(10);
        TextField b = new TextField(10);
        gridbag.setConstraints(p, c);
         add(p);
         p.add(d);
        p.add(o);
        p.add(b);
        
         //STREAM TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label stream = new Label("4. Stream: ");
        gridbag.setConstraints(stream , c);
        add(stream);
        
        //STREAM INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        Choice stream_in = new Choice(); 
        stream_in.addItem("Select your stream"); 
        stream_in.addItem("CSE"); 
        stream_in.addItem("IT"); 
        stream_in.addItem("M.E."); 
        stream_in.addItem("ECE");
        stream_in.addItem("EEE"); 
        gridbag.setConstraints(stream_in,c);
        add(stream_in);
     
       // Component add = add(stream); 
        
        //AREA OF INTEREST TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label Interest = new Label("5. Area Of Interest: ");
        gridbag.setConstraints(Interest, c);
        add(Interest);
        
        //AREA OF INTEREST INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        TextField Interest_inp = new TextField(10);
        gridbag.setConstraints(Interest_inp,c);
        add(Interest_inp );
        
        //EXPERIENCE TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label experience= new Label("6. Experience: ");
        gridbag.setConstraints( experience, c);
        add( experience);
        
        //EXPERIENCE INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        Choice experience_in = new Choice(); 
        experience_in.addItem("Select your experience yrs"); 
        experience_in.addItem("0-1 year"); 
        experience_in.addItem("2-5 year"); 
        experience_in.addItem("6-15 year"); 
        experience_in.addItem(" > 15year"); 
        gridbag.setConstraints(experience_in,c);
        add(experience_in);
        
        
        //EMAIL TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label email = new Label("7. Email ID: ");
        gridbag.setConstraints(email, c);
        add(email);
        
        //EMAIL INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        email_inp = new TextField(10);
        gridbag.setConstraints(email_inp,c);
        add(email_inp );
        
        //FOR EMAIL ACTION LISTENER
        email_inp.addActionListener(this);
        
        //CONTACT TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label contact = new Label("8. Contact: ");
        gridbag.setConstraints(contact, c);
        add(contact);
        
        //CONTACT INPUT
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        contact_inp = new TextField(10);
        gridbag.setConstraints(contact_inp,c);
        add(contact_inp );
        contact_inp.addActionListener(this);
        
        
        //HOBBIES TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label gender = new Label("9.Hobbies ");
        gridbag.setConstraints(gender, c);
         add(gender);
        
         //HOBBIES RADIO BUTTONS
        c.gridwidth = GridBagConstraints.REMAINDER;
        CheckboxGroup cb = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Music",cb,false);
        Checkbox cb2 = new Checkbox("Reading",cb,false);
        Checkbox cb3 = new Checkbox("Travelling",cb,false);
        gridbag.setConstraints(cb1, c);
         add(cb1);
        
        //EMPTY SPACE TO ORDER SECOND RADIO BUTTON
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label ge = new Label(" ");
        gridbag.setConstraints(ge, c);
         add(ge);
        
        //SECOND RADIO BUTTON
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(cb2, c);
         add(cb2);
         
        //EMPTY SPACE TO ORDER THIRD RADIO BUTTON
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label gee = new Label(" ");
        gridbag.setConstraints(gee, c);
         add(gee);
        
        //THIRD RADIO BUTTON
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(cb3, c);
        add(cb3);
        
        //EMPTY SAVE TO ORDER BUTTON
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label space = new Label(" ");
        gridbag.setConstraints(space, c);
        add(space);
         
        //SAVE AND SUBMIT BUTTON
        c.gridwidth = GridBagConstraints.REMAINDER;
        Panel p1 = new Panel();
        p.setLayout(new GridBagLayout());
        Button submit = new Button("  SAVE AND SUBMIT  ");
        gridbag.setConstraints(p1, c);
        add(p1);
        p1.add(submit);
        submit.addActionListener(this);
        
        //FOR VALIDATION MESSAGES
        //DISPLAY INFO FOR VALIDITY
        c.gridwidth = GridBagConstraints.REMAINDER;
        Label display_message = new Label("PLEASE NOTE BEFORE SUBMITTING YOUR FORM");
        gridbag.setConstraints(display_message , c);
        add(display_message );
        
       
       
        //VALID EMAIL TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label email_valid = new Label("Email Format: ");
        gridbag.setConstraints(email_valid, c);
        add(email_valid);
        
        //VALID EMAIL
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        valid_ans = " ";
        email_valid_ans = new Label(valid_ans);
        gridbag.setConstraints(email_valid_ans,c);
        add(email_valid_ans);
        
        //VALID CONTACT NO TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label contact_valid = new Label("Valid Contact No: ");
        gridbag.setConstraints(contact_valid, c);
        add(contact_valid);
        
        //VALID  CONTACT NO
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        valid_ans = " ";
        contact_valid_ans = new Label(valid_ans);
        gridbag.setConstraints(contact_valid_ans ,c);
        add(contact_valid_ans );
        
        //FOR CONFIRMING FORM SUBMISSION
        //FOR VALIDATION MESSAGES
        //DISPLAY INFO FOR SUBMITTING FORM
        c.gridwidth = GridBagConstraints.REMAINDER;
        Label submit_message = new Label("BIO-DATA FORM SUBMISSION STATUS");
        gridbag.setConstraints(submit_message , c);
        add(submit_message);
        
       
       
        //FORM SUBMISSION TEXT
        c.gridwidth = GridBagConstraints.RELATIVE;
        Label submit_message_txt= new Label("Form Status: ");
        gridbag.setConstraints(submit_message_txt, c);
        add(submit_message_txt);
        
        //FORM SUBMISSION RESULT/VALUE
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill=GridBagConstraints.HORIZONTAL;
        form_submit_notice = new Label("Details Not Submitted Yet!");
        gridbag.setConstraints( form_submit_notice ,c);
        add( form_submit_notice );
        
      // end of code    
    }

    //EMAIL TEXT FIELD ACTION LISTENER
    public void actionPerformed(ActionEvent e){  
 
             
        //CHECK VALIDITY OF EMAIL ENTERED
        String check = email_inp.getText();
        if (isValid(check)) 
        {
            email_valid_ans.setText("Correct, Valid email!");
            System.out.print("Yes"); 
        }
        else{
            email_valid_ans.setText("Incorrect, Invalid email, Please enter again!");
            System.out.print("No"); 
        }  
        
        //CHECK IF CONTACT NO ONLY CONATINS NUMBER OR NOT?
        String check1 = contact_inp.getText();
        if (checkno(check1)&& check1.length()==10)
        {
            contact_valid_ans.setText("Correct, Valid Contact No!"); 
            System.out.print("Yes C"); 
        }
        else{
            contact_valid_ans.setText("Incorrect, Invalid Contact No!"); 
            System.out.print("No C"); 
        }
        
        String buttonlabel = e.getActionCommand();
        if(buttonlabel.equals("  SAVE AND SUBMIT  ") && isValid(check) && checkno(check1)&& check1.length()==10 )
        {
          form_submit_notice .setText("Details Submitted Successfully!");
        }
        else{
            form_submit_notice .setText("Details not submitted! ");
        }
         
        
    }  
    //CHECK STRING IS PHONE-NUMBER OR NOT
     public static boolean checkno(String input)
    {
        try
        {
            Long.parseLong(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    //CHECK EMAIL VALIDITY USING REGEX CONCEPT
     public static boolean isValid(String email) 
    { 
       /* String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); */
        try {
        InternetAddress emailAddr = new InternetAddress(email);                    
        emailAddr.validate();                        
        }
        catch (AddressException ex) {
       // System.out.println(email + " is not a valid E-Mail Address.");
        return false;
        }
        return true;
    } 
  
}
