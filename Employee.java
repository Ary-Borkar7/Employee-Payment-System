import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Employee.class" width="1000" height="1000">
</applet>
*/
public class Employee extends Applet implements ActionListener
{
Label a,b,c,d,e,f,g,h,i,j,k,m;
TextField l,n,o,p,q,r,z,t,u,v,w;
Button x,y;
public void init()
{
setLayout(null);
setBackground(Color.magenta);
m=new Label("Employee Payment System");
add(m);
m.setBounds(400,50,250,30);

a=new Label("Employee ID");
l=new TextField(10);
add(a);
add(l);
a.setBounds(350,100,90,30);
l.setBounds(450,100,90,30);

b=new Label("Employee Name");
n=new TextField(25);
add(b);
add(n);
b.setBounds(350,150,90,30);
n.setBounds(450,150,90,30);

c=new Label("Designation");
o=new TextField(40);
add(c);
add(o);
c.setBounds(350,200,90,30);
o.setBounds(450,200,90,30);

d=new Label("Basic Salary");
p=new TextField(10);
add(d);
add(p);
d.setBounds(350,250,90,30);
p.setBounds(450,250,90,30);

e=new Label("DA");
q=new TextField(15);
add(e);
add(q);
e.setBounds(350,300,90,30);
q.setBounds(450,300,90,30);

f=new Label("HRA");
r=new TextField(10);
add(f);
add(r);
f.setBounds(350,350,90,30);
r.setBounds(450,350,90,30);

g=new Label("MA");
z=new TextField(10);
add(g);
add(z);
g.setBounds(350,400,90,30);
z.setBounds(450,400,90,30);

h=new Label("CA");
t=new TextField(10);
add(h);
add(t);
h.setBounds(350,450,90,30);
t.setBounds(450,450,90,30);

i=new Label("Gross Salary");
u=new TextField(10);
add(i);
add(u);
i.setBounds(350,500,90,30);
u.setBounds(450,500,90,30);

j=new Label("Deduction");
v=new TextField(10);
add(j);
add(v);
j.setBounds(350,550,90,30);
v.setBounds(450,550,90,30);

k=new Label("Net Salary");
w=new TextField(10);
add(k);
add(w);
k.setBounds(350,600,90,30);
w.setBounds(450,600,90,30);

x=new Button("Calculate");
y=new Button("Reset");
add(x);
add(y);


x.setBounds(350,650,90,30);
y.setBounds(450,650,90,30);
x.addActionListener(this);
y.addActionListener(this);


}
public void actionPerformed(ActionEvent e1)
{
String s=e1.getActionCommand();
if(s.equals("Calculate"))
{
String s1=o.getText();
if(s1.equals("Tester"))
{
p.setText("100000");
double B=Double.parseDouble(p.getText());
double da=B*0.4;	
q.setText(" "+da);	
double hra=B*0.1;
r.setText(" "+hra);
double ma=B*0.05;
z.setText(" "+ma);
double ca=B*0.05;
t.setText(" "+ca);
double gs=B+da+hra+ma+ca;
u.setText(" "+gs);
double d=gs*0.18;
v.setText(" "+d);
double net=gs-d;
w.setText(" "+net);

}
if(s1.equals("Reset"))
{
p.setText("");
q.setText("");
r.setText("");
z.setText("");
t.setText("");
u.setText("");
v.setText("");
w.setText("");
}
String s2=o.getText();
if(s2.equals("Manager"))
{
p.setText("200000");
double B=Double.parseDouble(p.getText());
double da=B*0.4;	
q.setText(" "+da);	
double hra=B*0.1;
r.setText(" "+hra);
double ma=B*0.05;
z.setText(" "+ma);
double ca=B*0.05;
t.setText(" "+ca);
double gs=B+da+hra+ma+ca;
u.setText(" "+gs);
double d=gs*0.18;
v.setText(" "+d);
double net=gs-d;
w.setText(" "+net);

}	
if(s2.equals("Reset"))
{
p.setText("");
q.setText("");
r.setText("");
z.setText("");
t.setText("");
u.setText("");
v.setText("");
w.setText("");
}
String s3=o.getText();
if(s3.equals("Developer"))
{
p.setText("250000");
double B=Double.parseDouble(p.getText());
double da=B*0.4;	
q.setText(" "+da);	
double hra=B*0.1;
r.setText(" "+hra);
double ma=B*0.05;
z.setText(" "+ma);
double ca=B*0.05;
t.setText(" "+ca);
double gs=B+da+hra+ma+ca;
u.setText(" "+gs);
double d=gs*0.18;
v.setText(" "+d);
double net=gs-d;
w.setText(" "+net);

}
if(s3.equals("Reset"))
{
p.setText("");
q.setText("");
r.setText("");
z.setText("");
t.setText("");
u.setText("");
v.setText("");
w.setText("");
}
}
if(s.equals("Reset"))
{
o.setText("");
p.setText("");
q.setText("");
r.setText("");
z.setText("");
t.setText("");
u.setText("");
v.setText("");
w.setText("");
}
}
}
