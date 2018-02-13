package Cal;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class Model {
View v=new View();
double radd;
double r = 1.0;
boolean flag = false ;
public double  fadd1 (double x, double y) 	
{
radd = x+y;
return radd;
}
public double  sub(double x, double y) 	
{
radd = x-y;
return radd;
}

public double mul(double x, double y) 	
{
radd = x*y;
return radd;
}

public double Div(double x, double y) 	
{
	if(y==0){
		flag = true ;
		radd=1.0;
		System.out.println("cant Divided on Zero" );
	}
	else {
		radd = x/y;
	}
     return radd;
}

public double mod(double x, double y) 	
{
	if(y==0){
		flag = true ;

		radd = 1.0 ;
		System.out.println("cant Divided on Zero" );	
	}
	else {
		radd = x%y;
	}
    return radd;
}

public double sqr(double x) 	
{
	if(x<0) {
		radd=1.0;
		System.out.println("cant take value negitive" );
	}
	else { 
		radd = Math.sqrt(x);
	}
     return radd;
}

	
	
	
	

}