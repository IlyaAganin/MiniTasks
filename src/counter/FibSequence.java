package counter;
import javax.swing.*;  

//Последовательность Фибоначчи
public class FibSequence {  
	public static void main(String[] args) {  
		/*JFrame f=new JFrame();//creating instance of JFrame  
		          
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  */
		
		//for (int i = 1; i < 11; i++)
			//System.out.println(genFib(i) + " при " + " i = " + i);\
		
		Integer[] x = genFibArr(10);
		
		for	(int i : x) 
			System.out.println(i);
	}  
	
	public static Integer genFib(int num) {
		if (num > 0) {
			Integer a = 1;
			Integer b = 2;
			for(int i = 2; i < num; i++) {
				b += a;
				a = b-a;
			}
			return num == 1 ? a : b;
			}
		else
			return null;
	}
	
	public static Integer[] genFibArr(int num) {
		if (num > 0) {
			Integer[] res = new Integer[num];
			res[0] = 1;
			if (num > 1)
				res[1] = 2;
			for(int i = 2; i < num; i++) {
				res[i] = res[i-1] + res[i-2];
			}
			return res;
		}
		else
			return null;
	}
}  
