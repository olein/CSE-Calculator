import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class calculator extends JFrame
{


		private JLabel l1;
		private JLabel l2;
		private JLabel l3;
		private JLabel l4;
		private JLabel l5;
		private JLabel l6;
		private JLabel l7;
		private JLabel l8;
		private JLabel l9;
		private JLabel l10;


		private JTextField t1;
		private JTextField t2;


		private JButton add;
		private JButton sub;
		private JButton mul;
		private JButton div;
		private JButton reset;
		private JButton exit;

		private JButton d2b;
		private JButton b2h;
		private JButton d2h;
		private JButton d2o;
		private JButton h2d;
		private JButton b2d;
		private JButton o2d;

		private JButton sqrt;
		private JButton pow;
		private JButton log;
		private JButton ln;
		private JButton sin;
		private JButton cos;
		private JButton tan;



		public calculator(){


			l1 = new JLabel("First", SwingConstants.LEFT);
            l2 = new JLabel("Second ", SwingConstants.LEFT);
            l3 = new JLabel(" Number ", SwingConstants.LEFT);
            l4 = new JLabel(" Number ", SwingConstants.LEFT);
            l5 = new JLabel(" ", SwingConstants.LEFT);
            l6 = new JLabel(" ", SwingConstants.LEFT);
            l7 = new JLabel(" ", SwingConstants.LEFT);
            l8 = new JLabel(" ", SwingConstants.LEFT);
            l9 = new JLabel(" ", SwingConstants.LEFT);
            l10 = new JLabel(" ", SwingConstants.LEFT);

			t1 = new JTextField(8);
            t2 = new JTextField(8);


            add = new JButton("Add");
            addButtonHandler abh = new addButtonHandler();
            add.addActionListener(abh);

            sub = new JButton("Sub");
            subButtonHandler s = new subButtonHandler();
            sub.addActionListener(s);

            mul = new JButton("Mul");
            mulButtonHandler m = new mulButtonHandler();
            mul.addActionListener(m);

            div = new JButton("Div");
            divButtonHandler d = new divButtonHandler();
            div.addActionListener(d);


            reset = new JButton("Reset");
            resetButtonHandler r = new resetButtonHandler();
            reset.addActionListener(r);

            exit = new JButton("Exit");
            exitButtonHandler e = new exitButtonHandler();
            exit.addActionListener(e);

            d2b = new JButton("D2B");
            d2bButtonHandler c1 = new d2bButtonHandler();
            d2b.addActionListener(c1);

            b2h = new JButton("B2H");
            b2hButtonHandler c2 = new b2hButtonHandler();
            b2h.addActionListener(c2);

            d2o = new JButton("D2O");
            d2oButtonHandler c3 = new d2oButtonHandler();
            d2o.addActionListener(c3);

            d2h = new JButton("D2H");
            d2hButtonHandler c4 = new d2hButtonHandler();
            d2h.addActionListener(c4);

            h2d = new JButton("H2D");
            h2dButtonHandler c5 = new h2dButtonHandler();
            h2d.addActionListener(c5);

            b2d = new JButton("B2D");
            b2dButtonHandler c6 = new b2dButtonHandler();
            b2d.addActionListener(c6);

            sqrt = new JButton("Sqrt");
            sqrtButtonHandler f1 = new sqrtButtonHandler();
            sqrt.addActionListener(f1);

            pow = new JButton("Pow");
            powButtonHandler f2 = new powButtonHandler();
            pow.addActionListener(f2);

            o2d = new JButton("O2D");
            o2dButtonHandler f3 = new o2dButtonHandler();
            o2d.addActionListener(f3);

            log = new JButton("log");
            logButtonHandler f4 = new logButtonHandler();
            log.addActionListener(f4);

            ln = new JButton("ln");
            lnButtonHandler f5 = new lnButtonHandler();
            ln.addActionListener(f5);

            sin = new JButton("Sin");
            sinButtonHandler f6 = new sinButtonHandler();
            sin.addActionListener(f6);

            cos = new JButton("Cos");
            cosButtonHandler f7 = new cosButtonHandler();
            cos.addActionListener(f7);

            tan = new JButton("tan");
            tanButtonHandler f8 = new tanButtonHandler();
            tan.addActionListener(f8);

            setTitle("CSE Calculator");

			Container pane = getContentPane();
    		pane.setLayout(new GridLayout (7,4));

    		pane.add(l1);
    		pane.add(l3);
    		pane.add(t1);
    		pane.add(l5);

    		pane.add(l2);
    		pane.add(l4);
    		pane.add(t2);
    		pane.add(l6);

    		pane.add(d2b);
    		pane.add(sqrt);
    		pane.add(sin);
    		pane.add(add);

    		pane.add(b2h);
    		pane.add(pow);
    		pane.add(cos);
    		pane.add(sub);

    		pane.add(d2h);
    		pane.add(log);
    		pane.add(tan);
    		pane.add(mul);

    		pane.add(d2o);
    		pane.add(o2d);
    		pane.add(ln);
    		pane.add(div);

    		pane.add(h2d);
    		pane.add(b2d);

    		pane.add(reset);
			pane.add(exit);





    		setDefaultCloseOperation(EXIT_ON_CLOSE);

}


private class addButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());
                       i2 = Double.parseDouble(t2.getText());

                       i3=i1+i2;

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class subButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());
                       i2 = Double.parseDouble(t2.getText());

                       i3=i1-i2;

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class mulButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());
                       i2 = Double.parseDouble(t2.getText());

                       i3=i1*i2;

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class divButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());
                       i2 = Double.parseDouble(t2.getText());

                       i3=i1/i2;

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class sinButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=Math.sin(i1);


                       t1.setText(""+i3);
                       t2.setText("");
		  }
}

private class resetButtonHandler implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
						t1.setText("");
						t2.setText("");

	}
}
private class exitButtonHandler implements ActionListener
{
      public void actionPerformed(ActionEvent e)
      {
                        System.exit(0);
      }
}

private class cosButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=Math.cos(i1);

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class tanButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=Math.tan(i1);

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}
private class sqrtButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=Math.sqrt(i1);

                       t1.setText(""+i3);
                       t2.setText(" ");
		  }
}

private class powButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					int i1,i2;
					double i3;


                       i1 = Integer.parseInt(t1.getText());
                       i2 = Integer.parseInt(t2.getText());

                       i3=(double)(Math.pow(i1,i2));

                       t1.setText(""+i3);
                       t2.setText("");
		  }
}

private class o2dButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					String oct = t1.getText();
  					int i = Integer.parseInt(oct,8);
  					t1.setText(""+i);
		  }
}

private class logButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=Math.log(i1)/2.3;

                       t1.setText(""+i3);
		  }
}

private class lnButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					double i1,i2,i3;

                       i1 = Double.parseDouble(t1.getText());


                       i3=(Math.log(i1));

                       t1.setText(""+i3);
		  }
}

private class b2dButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					String str = t1.getText();
					int i= Integer.parseInt(str,2);
					t1.setText(""+i);


		  }
}

private class b2hButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					String hex = t1.getText();
					int i= Integer.parseInt(hex,2);
  					String hexString = Integer.toHexString(i);
  					t1.setText(""+hexString);



		  }
}

private class d2bButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					String hex = t1.getText();
					int i = Integer.parseInt(hex);
  					String by = Integer.toBinaryString(i);
  					t1.setText(by);



		  }
}

private class d2hButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					String hex = t1.getText();
					int i = Integer.parseInt(hex);
  					String hex1 = Integer.toHexString(i);
  					t1.setText(hex1);



		  }
}

private class d2oButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					 String deci = t1.getText();
					 int value = Integer.parseInt(deci);
  					 String str = Integer.toString(value,8);
  					 t1.setText(str);



		  }
}

private class h2dButtonHandler implements ActionListener
{
              public void actionPerformed(ActionEvent e)
              {

					 String str= t1.getText();
  					 int i= Integer.parseInt(str,16);

  					t1.setText(""+i);



		  }
}





public static void main(String[] args)
{
        calculator ac = new calculator();
        ac.getContentPane().setBackground(Color.LIGHT_GRAY);

		ac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ac.setBounds(300,300,300,300);
		ac.setVisible(true);



}
}





