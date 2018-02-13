package Cal;

public class Controller {
View v1;
Model m;
double value; 
boolean flags = false;
public void test (double x, double y,String opr)

{ 
	String o=opr;
	m=new Model();
	v1=new View();
    switch(o){
	 case "+":
		 value=m.fadd1(x,y);
		 System.out.print(value);
		break;
		
	 case "-":
		 value=m.sub(x,y);
		 System.out.print(value);
		 
			break;
	 case "/":
		 value=m.Div(x,y);
		 System.out.print(value);
		 flags = m.flag ;
			break;
	 case "*":
		 value=m.mul(x,y);
		 System.out.print(value);
			break;
			
	 case "%":
		 value=m.mod(x,y);
		 System.out.print(value);
          flags = m.flag ;
			break;
			
	 case "sqrt":
		 value=m.sqr(x);
		 System.out.println(value);
			break;
			
		 
}
}
}