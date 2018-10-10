import java.util.Random;

public class Vault {
int secretCode;
Vault(){
Random r= new Random();
secretCode=r.nextInt(1000001);
}
boolean tryCode(int code) {
	if (code==secretCode) {
	return true;
	}
	else {
		return false;
	}
}
}
