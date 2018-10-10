
public class JamesBond {
	public static void main(String[] args) {
 JamesBond u= new JamesBond();

	Vault k= new Vault();

	int q=u.findCode(k);
	System.out.println(q);

	}
 int findCode(Vault v) {
	 for (int i = 0; i < 1000001; i++) {
	boolean b=v.tryCode(i);
	if (b==true) {
		
		return i;
		
		}
	
		}
 
			return -1;
		
	}
	}
 



