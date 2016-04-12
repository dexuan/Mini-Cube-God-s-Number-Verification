package CubePackage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Window extends JFrame implements ActionListener
{
	/* * */
	private static final long serialVersionUID = 1L;
	private JTextField myTextField = new JTextField(15);
	private JButton myButton = new JButton("��ʼ����");
	private JLabel myLabel = new JLabel("����������1-11֮�����������",JLabel.CENTER);
	private JLabel Information = new JLabel("author��blog.dexollie.cn",JLabel.CENTER);
	private JLabel Title = new JLabel("����ħ�����ϵ�֮��������֤",JLabel.CENTER);
	private JLabel Time = new JLabel("������������������",JLabel.CENTER);
	private JLabel aboutTime = new JLabel("(9����Լ12�룬֮��ÿ��x6��",JLabel.CENTER);

	
	public Window()
	{
		setTitle("Mini Cube God's Number Verification");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(230,210);
		setLocation(400,300);
		add(Title);
		add(myTextField);
		add(myButton);
		add(myLabel);
		add(Time);
		add(aboutTime);
		add(Information);
		myButton.addActionListener(this);
		setVisible(true);			
		setResizable(false);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(screenSize.width/2 - 115, screenSize.height/2-105);

	}
	public void actionPerformed(ActionEvent e)
	{
		Work myWork = new Work();
		int result=0;
		String myText;
		myText = myTextField.getText();
		double temp = Double.parseDouble(myText);
		int temp2 = (int)temp;
		if(temp2>=1&&temp<=11)
		{
			myWork.setnStep(temp2);
			long startTime=System.currentTimeMillis(); 		
			result = myWork.mainWork();
			long endTime=System.currentTimeMillis();
			Time.setText("����ʱ�䣺" + (endTime-startTime) + "ms");
			myLabel.setText("���� "+(int)temp+" ��������: " + result + " �����");
		}
		else
		{
			myLabel.setText("���������벻�Ϸ���������");
			
			String arg1 = new String();
			arg1 = "";
			myTextField.setText(arg1);
		}
		

	}
	
}
